package fr.tuto.jpa.model;

import jakarta.persistence.Entity;

@Entity
public class Farm extends House {
    private int livestock;

    public int getLivestock() {
        return livestock;
    }

    public void setLivestock(int livestock) {
        this.livestock = livestock;
    }
}
