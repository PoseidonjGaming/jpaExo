package fr.tuto.jpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("card")
public class IdentityCard extends IdForm {
    private String puceId;

    public String getPuceId() {
        return puceId;
    }

    public void setPuceId(String puceId) {
        this.puceId = puceId;
    }
}
