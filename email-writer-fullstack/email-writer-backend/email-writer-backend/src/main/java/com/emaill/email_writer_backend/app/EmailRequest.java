package com.emaill.email_writer_backend.app;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;


}

