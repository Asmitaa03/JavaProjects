package com.asmita.trade.model;
import com.asmita.trade.domain.VerificationType;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Embeddable
public class TwoFactorAuth {
    @JsonInclude(JsonInclude.Include.ALWAYS) // Always include this field, even if null
    private boolean isEnabled = false;
    @JsonInclude(JsonInclude.Include.ALWAYS) // Always include this field, even if null
    private VerificationType sendTo;

    public TwoFactorAuth(){}
    }

