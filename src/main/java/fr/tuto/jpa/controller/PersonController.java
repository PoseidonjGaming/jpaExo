package fr.tuto.jpa.controller;

import fr.tuto.jpa.dto.PersonDTO;
import fr.tuto.jpa.model.Person;
import fr.tuto.jpa.service.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController extends GenericController<Person, PersonDTO, Integer> {
    @Autowired
    public PersonController(IPersonService service) {
        super(service, PersonDTO.class, Person.class);
    }
}
