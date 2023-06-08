package fr.tuto.jpa.service;

import fr.tuto.jpa.dto.PassportDTO;
import fr.tuto.jpa.model.Passport;
import fr.tuto.jpa.repo.interfaces.IPassportRepo;
import fr.tuto.jpa.service.interfaces.IPassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportService extends BaseServiceCustom<Passport, PassportDTO> implements IPassportService {

    @Autowired
    public PassportService(IPassportRepo repo) {
        super(repo);
    }
}
