package fr.tuto.jpa.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Embeddable
public class Identity {

    @ManyToMany
    private List<IdForm> idForms;

    public List<IdForm> getIdForms() {
        return idForms;
    }

    public void setIdForms(List<IdForm> idForms) {
        this.idForms = idForms;
    }


}
