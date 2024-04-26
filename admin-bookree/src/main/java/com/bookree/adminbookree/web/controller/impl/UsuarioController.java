package com.bookree.adminbookree.web.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.impl.UsuarioDTO;
import com.bookree.adminbookree.web.controller.AbstractController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends AbstractController<UsuarioDTO> {

    protected UsuarioController(BaseService<UsuarioDTO> service) {
        super(service);
    }

}
