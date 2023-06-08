package fr.tuto.jpa.dto;

import java.util.List;

public class ApartmentDTO {
    private int cp;

    private String line1;

    private String line2;
    private List<Integer> piecesSurface;

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

    public List<Integer> getPiecesSurface() {
        return piecesSurface;
    }

    public void setPiecesSurface(List<Integer> piecesSurface) {
        this.piecesSurface = piecesSurface;
    }
}
