package fr.tuto.jpa.service;

import fr.tuto.jpa.dto.ApartmentDTO;
import fr.tuto.jpa.model.Address;
import fr.tuto.jpa.model.Apartment;
import fr.tuto.jpa.repo.interfaces.IApartmentRepo;
import fr.tuto.jpa.service.interfaces.IApartmentService;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService extends BaseService<Apartment, ApartmentDTO, Address> implements IApartmentService {
    public ApartmentService(IApartmentRepo repo) {
        super(repo);
    }
}
