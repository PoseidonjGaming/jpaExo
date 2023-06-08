package fr.tuto.jpa.controller;

import fr.tuto.jpa.dto.IdentityCardDTO;
import fr.tuto.jpa.model.IdentityCard;
import fr.tuto.jpa.service.interfaces.IIdentityCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/card")
public class IdentityCardController extends GenericController<IdentityCard, IdentityCardDTO, String> {

    @Autowired
    public IdentityCardController(IIdentityCardService service) {
        super(service, IdentityCardDTO.class, IdentityCard.class);
    }
}
