package fr.tuto.jpa.controller;

import fr.tuto.jpa.dto.IdentityCardDTO;
import fr.tuto.jpa.model.IdentityCard;
import fr.tuto.jpa.service.interfaces.IIdentityCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/card")
public class IdentityCardController extends GenericController<IdentityCard, IdentityCardDTO, String> {

    @Autowired
    public IdentityCardController(IIdentityCardService service) {
        super(service, IdentityCardDTO.class, IdentityCard.class);
    }

    @GetMapping("/paged")
    public ResponseEntity<List<IdentityCardDTO>> getAllPaged(int page, int size){
        return ResponseEntity.ok(service.getAllPaged(page, size));
    }
}
