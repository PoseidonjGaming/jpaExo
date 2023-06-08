package fr.tuto.jpa.service;

import fr.tuto.jpa.dto.PersonDTO;
import fr.tuto.jpa.model.Person;
import fr.tuto.jpa.repo.interfaces.IPersonRepo;
import fr.tuto.jpa.service.interfaces.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends BaseService<Person, PersonDTO, Integer> implements IPersonService {
    public PersonService(IPersonRepo repo) {
        super(repo);
    }
}
