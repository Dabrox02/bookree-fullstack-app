package com.bookree.adminbookree.domain.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.persistence.dto.impl.FormaPagoDTO;
import com.bookree.adminbookree.persistence.entity.impl.FormaPago;

@Service
public class FormaPagoServiceImpl extends BaseServiceImpl<FormaPagoDTO, FormaPago> {

    public FormaPagoServiceImpl(JpaRepository<FormaPago, Integer> repository, IMapper<FormaPagoDTO, FormaPago> mapper) {
        super(repository, mapper);
    }

}
