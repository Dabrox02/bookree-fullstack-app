package com.bookree.adminbookree.domain.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.persistence.dto.impl.TallaProductoDTO;
import com.bookree.adminbookree.persistence.entity.impl.TallaProducto;

@Service
public class TallaProductoServiceImpl extends BaseServiceImpl<TallaProductoDTO, TallaProducto> {

    public TallaProductoServiceImpl(JpaRepository<TallaProducto, Integer> repository,
            IMapper<TallaProductoDTO, TallaProducto> mapper) {
        super(repository, mapper);
    }

}
