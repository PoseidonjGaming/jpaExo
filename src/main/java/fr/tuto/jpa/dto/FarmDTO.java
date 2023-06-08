package fr.tuto.jpa.dto;

public class FarmDTO {
    private int cp;

    private String line1;

    private String line2;

    private int livestock;

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

    public int getLivestock() {
        return livestock;
    }

    public void setLivestock(int livestock) {
        this.livestock = livestock;
    }
}
