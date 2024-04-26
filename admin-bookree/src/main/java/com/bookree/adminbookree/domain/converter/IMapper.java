package com.bookree.adminbookree.domain.converter;

import org.springframework.data.repository.NoRepositoryBean;

import com.bookree.adminbookree.persistence.dto.BaseDTO;
import com.bookree.adminbookree.persistence.entity.BaseEntity;

@NoRepositoryBean
public interface IMapper<DTO extends BaseDTO, Entity extends BaseEntity> {
    Entity toEntity(DTO dto);

    DTO toDTO(Entity entity);
}
