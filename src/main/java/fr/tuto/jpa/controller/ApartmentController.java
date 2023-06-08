package fr.tuto.jpa.controller;

import fr.tuto.jpa.dto.ApartmentDTO;
import fr.tuto.jpa.model.Address;
import fr.tuto.jpa.model.Apartment;
import fr.tuto.jpa.service.interfaces.IApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/apartment")
public class ApartmentController extends GenericController<Apartment, ApartmentDTO, Address> {

    @Autowired
    public ApartmentController(IApartmentService service) {
        super(service, ApartmentDTO.class, Apartment.class);
    }
}
