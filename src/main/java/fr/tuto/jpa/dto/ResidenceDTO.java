package fr.tuto.jpa.dto;

import fr.tuto.jpa.model.House;
import fr.tuto.jpa.model.Person;

public class ResidenceDTO {
    private boolean main;

    private Person resident;

    private House house;

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public Person getResident() {
        return resident;
    }

    public void setResident(Person resident) {
        this.resident = resident;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
