package fr.tuto.jpa.controller;

import fr.tuto.jpa.dto.IdentityCardDTO;
import fr.tuto.jpa.dto.PassportDTO;
import fr.tuto.jpa.model.Passport;
import fr.tuto.jpa.service.interfaces.IPassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/passport")
public class PassportController extends GenericController<Passport, PassportDTO, String> {
    @Autowired
    public PassportController(IPassportService service) {
        super(service, PassportDTO.class, Passport.class);
    }

    @GetMapping("/paged")
    public ResponseEntity<List<PassportDTO>> getAllPaged(int page, int size){
        return ResponseEntity.ok(service.getAllPaged(page, size));
    }
}

