package fr.tuto.jpa.repo.interfaces;

import fr.tuto.jpa.model.Address;
import fr.tuto.jpa.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFarmRepo extends JpaRepository<Farm, Address> {
}
