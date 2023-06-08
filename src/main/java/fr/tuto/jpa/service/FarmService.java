package fr.tuto.jpa.service;

import fr.tuto.jpa.dto.FarmDTO;
import fr.tuto.jpa.model.Address;
import fr.tuto.jpa.model.Farm;
import fr.tuto.jpa.repo.interfaces.IFarmRepo;
import fr.tuto.jpa.service.interfaces.IFarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmService extends BaseService<Farm, FarmDTO, Address> implements IFarmService {

    @Autowired
    public FarmService(IFarmRepo repo) {
        super(repo);
    }
}
