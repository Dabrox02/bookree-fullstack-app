package com.bookree.adminbookree.domain.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.persistence.dto.impl.TipoProductoDTO;
import com.bookree.adminbookree.persistence.entity.impl.TipoProducto;

@Service
public class TipoProductoServiceImpl  extends BaseServiceImpl<TipoProductoDTO, TipoProducto> {

    public TipoProductoServiceImpl(JpaRepository<TipoProducto, Integer> repository,
            IMapper<TipoProductoDTO, TipoProducto> mapper) {
        super(repository, mapper);
    }
    
}
