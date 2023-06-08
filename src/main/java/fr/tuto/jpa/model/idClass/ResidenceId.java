package fr.tuto.jpa.model.idClass;

import fr.tuto.jpa.model.House;
import fr.tuto.jpa.model.Person;

import java.io.Serializable;

public class ResidenceId implements Serializable {
    private House house;

    private Person resident;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Person getResident() {
        return resident;
    }

    public void setResident(Person resident) {
        this.resident = resident;
    }


}
