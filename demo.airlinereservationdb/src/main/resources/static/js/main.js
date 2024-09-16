document.addEventListener('DOMContentLoaded', () => {
  const flightListContainer = document.getElementById('flight-list');
  const flightDetailContainer = document.getElementById('flight-detail');
   const reservationForm = document.getElementById('reservation-form');
  // Fetch flight list
  if (flightListContainer) {
    fetch('/api/flights')
      .then(response => response.json())
      .then(data => {
        flightListContainer.innerHTML = ''; // Clear loading message

        if (data.length === 0) {
          flightListContainer.innerHTML = '<p>No flights available at the moment.</p>';
          return;
        }

        data.forEach(flight => {
          const flightItem = document.createElement('div');
          flightItem.className = 'flight-item';
          flightItem.innerHTML = `
            <h3>${flight.destination}</h3>
            <p>Departure: ${flight.departureTime}</p>
            <p>Price: $${flight.price}</p>
            <a href="flight-detail.html?flightId=${flight.id}">View Details</a>
          `;
          flightListContainer.appendChild(flightItem);
        });
      })
      .catch(error => {
        console.error('Error fetching flight data:', error);
        flightListContainer.innerHTML = '<p>Unable to load flight data. Please try again later.</p>';
      });
  }

  // Fetch flight details
   if (flightDetailContainer) {
      const params = new URLSearchParams(window.location.search);
      const flightId = params.get('flightId');

      if (flightId) {
        fetch(`/api/flights/${flightId}`)
          .then(response => response.json())
          .then(flight => {
            flightDetailContainer.innerHTML = `
              <h2>${flight.destination}</h2>
              <p>Departure: ${flight.departureTime}</p>
              <p>Arrival: ${flight.arrivalTime}</p>
              <p>Price: $${flight.price}</p>
              <p>Description: ${flight.description}</p>
            `;
          })
          .catch(error => {
            console.error('Error fetching flight details:', error);
            flightDetailContainer.innerHTML = '<p>Unable to load flight details. Please try again later.</p>';
          });
      } else {
        flightDetailContainer.innerHTML = '<p>No flight selected.</p>';
      }
    }
  });
   if (reservationForm) {
      reservationForm.addEventListener('submit', (event) => {
        event.preventDefault();

        const formData = new FormData(reservationForm);
        const reservationData = {};
        formData.forEach((value, key) => {
          reservationData[key] = value;
        });

        fetch('/api/reservations', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(reservationData)
        })
        .then(response => response.json())
        .then(result => {
          alert('Reservation successful!');
          reservationForm.reset();
        })
        .catch(error => {
          console.error('Error making reservation:', error);
          alert('Reservation failed. Please try again.');
        });
      });
    }