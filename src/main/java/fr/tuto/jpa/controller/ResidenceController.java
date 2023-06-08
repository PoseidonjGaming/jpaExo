package fr.tuto.jpa.controller;

import fr.tuto.jpa.dto.ResidenceDTO;
import fr.tuto.jpa.model.Residence;
import fr.tuto.jpa.model.idClass.ResidenceId;
import fr.tuto.jpa.service.interfaces.IResidenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/residence")
public class ResidenceController extends GenericController<Residence, ResidenceDTO, ResidenceId> {

    @Autowired
    public ResidenceController(IResidenceService service) {
        super(service, ResidenceDTO.class, Residence.class);
    }
}
