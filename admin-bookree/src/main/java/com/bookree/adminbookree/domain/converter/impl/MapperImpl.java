package com.bookree.adminbookree.domain.converter.impl;

import org.modelmapper.ModelMapper;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.persistence.dto.BaseDTO;
import com.bookree.adminbookree.persistence.entity.BaseEntity;

public class MapperImpl<DTO extends BaseDTO, Entity extends BaseEntity> implements IMapper<DTO, Entity> {

    private final ModelMapper modelMapper;
    private final Class<Entity> entityClass;
    private final Class<DTO> dtoClass;

    public MapperImpl(ModelMapper modelMapper, Class<Entity> entityClass, Class<DTO> dtoClass) {
        this.modelMapper = modelMapper;
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    @Override
    public Entity toEntity(DTO dto) {
        return modelMapper.map(dto, entityClass);
    }

    @Override
    public DTO toDTO(Entity entity) {
        return modelMapper.map(entity, dtoClass);
    }

}
