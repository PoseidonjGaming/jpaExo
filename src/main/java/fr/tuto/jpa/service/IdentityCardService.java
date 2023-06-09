package fr.tuto.jpa.service;

import fr.tuto.jpa.dto.IdentityCardDTO;
import fr.tuto.jpa.model.IdentityCard;
import fr.tuto.jpa.repo.interfaces.IIdentityCardRepo;
import fr.tuto.jpa.service.interfaces.IIdentityCardService;
import fr.tuto.jpa.tools.DtoTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentityCardService extends BaseServiceCustom<IdentityCard, IdentityCardDTO, String> implements IIdentityCardService {

    @Autowired
    public IdentityCardService(IIdentityCardRepo repo) {
        super(repo);
    }

}
