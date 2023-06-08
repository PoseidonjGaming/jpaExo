package fr.tuto.jpa.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Address implements Serializable {
    private int cp;

    private String line1;

    private String line2;


    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }


}
