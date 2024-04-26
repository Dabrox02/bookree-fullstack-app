package com.bookree.adminbookree.domain.service.impl;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.domain.exception.NotFoundException;
import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.BaseDTO;
import com.bookree.adminbookree.persistence.entity.BaseEntity;

public class BaseServiceImpl<DTO extends BaseDTO, Entity extends BaseEntity> implements BaseService<DTO> {

    public final JpaRepository<Entity, Integer> repository;
    public final IMapper<DTO, Entity> mapper;

    public BaseServiceImpl(JpaRepository<Entity, Integer> repository, IMapper<DTO, Entity> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<DTO> find(Integer id) {
        Optional<Entity> entity = repository.findById(id);
        return entity.map(mapper::toDTO);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DTO> findAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, String> create(DTO dto) {
        Entity entity = mapper.toEntity(dto);
        repository.save(entity);
        Map<String, String> resp = new HashMap<>();
        resp.put("id", String.valueOf(entity.getId()));
        return resp;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void edit(Integer id, DTO dto) {
        Optional<Entity> entity = repository.findById(id);
        if (entity.isPresent()) {
            Entity toEntity = mapper.toEntity(dto);
            toEntity.setId(id);
            repository.save(toEntity);
        } else {
            throw new NotFoundException(String.format("El item con id: %s no fue encontrado", id));
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
