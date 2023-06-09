package fr.tuto.jpa.repo.interfaces;

import fr.tuto.jpa.model.Address;
import fr.tuto.jpa.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApartmentRepo extends JpaRepository<Apartment, Address> {
}
