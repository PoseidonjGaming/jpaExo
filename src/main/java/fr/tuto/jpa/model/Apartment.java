package fr.tuto.jpa.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Apartment extends House {

    @ElementCollection
    private List<Integer> piecesSurface;

    public List<Integer> getPiecesSurface() {
        return piecesSurface;
    }

    public void setPiecesSurface(List<Integer> piecesSurface) {
        this.piecesSurface = piecesSurface;
    }
}
