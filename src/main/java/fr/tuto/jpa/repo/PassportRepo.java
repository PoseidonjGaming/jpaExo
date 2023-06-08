package fr.tuto.jpa.repo;

import fr.tuto.jpa.model.Passport;
import fr.tuto.jpa.repo.interfaces.IPassportRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PassportRepo extends BaseRepo<Passport> implements IPassportRepo {
    public PassportRepo() {
        super(Passport.class);
    }
}
