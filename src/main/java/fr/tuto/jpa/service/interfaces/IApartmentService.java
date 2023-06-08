package fr.tuto.jpa.service.interfaces;

import fr.tuto.jpa.dto.ApartmentDTO;
import fr.tuto.jpa.model.Address;
import fr.tuto.jpa.model.Apartment;

public interface IApartmentService extends IBaseService<Apartment, ApartmentDTO, Address> {
}
