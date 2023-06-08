package fr.tuto.jpa.model;

import fr.tuto.jpa.model.idClass.ResidenceId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(ResidenceId.class)
public class Residence {
    private boolean main;

    @ManyToOne
    @Id
    private Person resident;

    @Id
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
