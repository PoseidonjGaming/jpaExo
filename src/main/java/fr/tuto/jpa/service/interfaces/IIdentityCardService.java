package fr.tuto.jpa.service.interfaces;

import fr.tuto.jpa.dto.IdentityCardDTO;
import fr.tuto.jpa.model.IdentityCard;

import java.util.List;

public interface IIdentityCardService extends IBaseService<IdentityCard, IdentityCardDTO, String> {
    List<IdentityCardDTO> getAllPaged(int page, int size);
}
