package fr.tuto.jpa.dto;

import fr.tuto.jpa.model.IdForm;
import fr.tuto.jpa.model.Residence;

import java.time.LocalDateTime;
import java.util.List;

public class PersonDTO {
    private LocalDateTime birthDate;
    private String firstname;

    private List<Residence> residences;

    private List<IdForm> idForms;

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<Residence> getResidences() {
        return residences;
    }

    public void setResidences(List<Residence> residences) {
        this.residences = residences;
    }

    public List<IdForm> getIdForms() {
        return idForms;
    }

    public void setIdForms(List<IdForm> idForms) {
        this.idForms = idForms;
    }
}
