package fr.tuto.jpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
@DiscriminatorValue("passport")
public class Passport extends IdForm {
    @ElementCollection
    private List<String> travels;

    public List<String> getTravels() {
        return travels;
    }

    public void setTravels(List<String> travels) {
        this.travels = travels;
    }


}
