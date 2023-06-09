package fr.tuto.jpa.repo;

import fr.tuto.jpa.model.IdentityCard;
import fr.tuto.jpa.repo.interfaces.IIdentityCardRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class IdentityCardRepo extends BaseRepo<IdentityCard, String> implements IIdentityCardRepo {

    public IdentityCardRepo() {
        super(IdentityCard.class);
    }
}
