package fr.tuto.jpa.dto;

import java.time.LocalDate;


public class IdentityCardDTO {
    private String puceId;

    private LocalDate issued_at;

    public LocalDate getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(LocalDate issued_at) {
        this.issued_at = issued_at;
    }

    public String getPuceId() {
        return puceId;
    }

    public void setPuceId(String puceId) {
        this.puceId = puceId;
    }
}
