package fr.tuto.jpa.repo.interfaces;

import fr.tuto.jpa.model.Residence;
import fr.tuto.jpa.model.idClass.ResidenceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResidenceRepo extends JpaRepository<Residence, ResidenceId> {
}
