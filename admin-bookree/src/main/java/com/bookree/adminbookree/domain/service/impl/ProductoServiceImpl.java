package com.bookree.adminbookree.domain.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.persistence.dto.impl.ProductoDTO;
import com.bookree.adminbookree.persistence.entity.impl.Producto;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<ProductoDTO, Producto> {

    public ProductoServiceImpl(JpaRepository<Producto, Integer> repository, IMapper<ProductoDTO, Producto> mapper) {
        super(repository, mapper);
    }

}
