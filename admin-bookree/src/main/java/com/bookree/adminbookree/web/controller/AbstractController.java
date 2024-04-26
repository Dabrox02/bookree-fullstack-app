package com.bookree.adminbookree.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bookree.adminbookree.domain.exception.NotFoundException;
import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.BaseDTO;

public abstract class AbstractController<DTO extends BaseDTO> {

    protected final BaseService<DTO> service;

    protected AbstractController(BaseService<DTO> service) {
        this.service = service;
    }

    @GetMapping
    public List<DTO> list() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public DTO get(@PathVariable(value = "id") Integer id) throws NotFoundException {
        return service.find(id)
                .orElseThrow(() -> new NotFoundException(String.format("No puede obtener item id: %s", id)));
    }

    @PostMapping()
    public Map<String, String> create(@RequestBody DTO dto) {
        return service.create(dto);
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody DTO dto) {
        service.edit(id, dto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        service.delete(id);
    }

}
