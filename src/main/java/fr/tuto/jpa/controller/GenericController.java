package fr.tuto.jpa.controller;

import fr.tuto.jpa.service.interfaces.IBaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController<Entity, DTO, ID> {

    protected final IBaseService<Entity, DTO, ID> service;


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

    @PostMapping(value = {"/{id}", ""})
    public ResponseEntity<DTO> createOrUpdate(@RequestBody DTO dto, @PathVariable(required = false) ID id) {
        service.createOrUpdate(dto, id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(ID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
