package fr.tuto.jpa.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "identity")
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class IdForm implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate issued_at;

    public String getUuid() {
        return uuid;
    }

    public void setPassport_uuid(String uuid) {
        this.uuid = uuid;
    }


    public LocalDate getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(LocalDate issued_at) {
        this.issued_at = issued_at;
    }

}
