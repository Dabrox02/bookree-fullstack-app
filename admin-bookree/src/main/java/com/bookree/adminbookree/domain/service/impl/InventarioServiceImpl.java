package com.bookree.adminbookree.domain.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.persistence.dto.impl.InventarioDTO;
import com.bookree.adminbookree.persistence.entity.impl.Inventario;

@Service
public class InventarioServiceImpl extends BaseServiceImpl<InventarioDTO, Inventario> {

    public InventarioServiceImpl(JpaRepository<Inventario, Integer> repository,
            IMapper<InventarioDTO, Inventario> mapper) {
        super(repository, mapper);
    }

}
