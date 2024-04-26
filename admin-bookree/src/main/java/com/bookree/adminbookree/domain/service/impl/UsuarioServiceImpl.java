package com.bookree.adminbookree.domain.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.bookree.adminbookree.domain.converter.IMapper;
import com.bookree.adminbookree.persistence.dto.impl.UsuarioDTO;
import com.bookree.adminbookree.persistence.entity.impl.Usuario;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<UsuarioDTO, Usuario> {

    public UsuarioServiceImpl(JpaRepository<Usuario, Integer> repository, IMapper<UsuarioDTO, Usuario> mapper) {
        super(repository, mapper);
    }

}
