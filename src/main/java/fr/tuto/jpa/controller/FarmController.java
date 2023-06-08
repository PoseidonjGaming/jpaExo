package fr.tuto.jpa.controller;

import fr.tuto.jpa.dto.FarmDTO;
import fr.tuto.jpa.model.Address;
import fr.tuto.jpa.model.Farm;
import fr.tuto.jpa.service.interfaces.IFarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/farm")
public class FarmController extends GenericController<Farm, FarmDTO, Address> {

    @Autowired
    public FarmController(IFarmService service) {
        super(service, FarmDTO.class, Farm.class);
    }
}
