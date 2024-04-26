package com.bookree.adminbookree.domain.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.persistence.dto.impl.ColorProductoDTO;
import com.bookree.adminbookree.persistence.entity.impl.ColorProducto;

@Service
public class ColorProductoServiceImpl extends BaseServiceImpl<ColorProductoDTO, ColorProducto> {

    public ColorProductoServiceImpl(JpaRepository<ColorProducto, Integer> repository,
            IMapper<ColorProductoDTO, ColorProducto> mapper) {
        super(repository, mapper);
    }

}
