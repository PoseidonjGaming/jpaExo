package fr.tuto.jpa.controller;

import fr.tuto.jpa.service.interfaces.IBaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController<Entity, DTO, ID> {

    private final IBaseService<Entity, DTO, ID> service;


    public GenericController(IBaseService<Entity, DTO, ID> service, Class<DTO> dtoClass, Class<Entity> entityClass) {
        this.service = service;
        service.initService(entityClass, dtoClass);
    }

    @GetMapping("/list")
    public ResponseEntity<List<DTO>> getAll() {
        List<DTO> list = service.getAll();
        return (list.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(list));
    }


    @GetMapping("/{id}")
    public ResponseEntity<DTO> getById(@PathVariable ID id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<DTO> createOrUpdate(@RequestBody DTO dto) {
        service.createOrUpdate(dto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(ID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
