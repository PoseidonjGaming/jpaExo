package fr.tuto.jpa.dto;

import java.time.LocalDate;
import java.util.List;


public class PassportDTO {

    private LocalDate issued_at;

    private List<String> travels;


    public List<String> getTravels() {
        return travels;
    }

    public void setTravels(List<String> travels) {
        this.travels = travels;
    }

    public LocalDate getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(LocalDate issued_at) {
        this.issued_at = issued_at;
    }

}
