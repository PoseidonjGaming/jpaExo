package fr.tuto.jpa.service;

import fr.tuto.jpa.dto.IdentityCardDTO;
import fr.tuto.jpa.model.IdentityCard;
import fr.tuto.jpa.repo.interfaces.IIdentityCardRepo;
import fr.tuto.jpa.service.interfaces.IIdentityCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityCardService extends BaseServiceCustom<IdentityCard, IdentityCardDTO> implements IIdentityCardService {

    @Autowired
    public IdentityCardService(IIdentityCardRepo repo) {
        super(repo);
    }
}
