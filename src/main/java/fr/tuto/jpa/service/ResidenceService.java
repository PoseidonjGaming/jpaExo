package fr.tuto.jpa.service;

import fr.tuto.jpa.dto.ResidenceDTO;
import fr.tuto.jpa.model.Residence;
import fr.tuto.jpa.model.idClass.ResidenceId;
import fr.tuto.jpa.repo.interfaces.IResidenceRepo;
import fr.tuto.jpa.service.interfaces.IResidenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResidenceService extends BaseService<Residence, ResidenceDTO, ResidenceId> implements IResidenceService {
    @Autowired
    public ResidenceService(IResidenceRepo repo) {
        super(repo);
    }
}
