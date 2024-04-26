package com.bookree.adminbookree.web.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.impl.TallaProductoDTO;
import com.bookree.adminbookree.web.controller.AbstractController;

@RestController
@RequestMapping("/talla")
public class TallaProductoController extends AbstractController<TallaProductoDTO> {

    protected TallaProductoController(BaseService<TallaProductoDTO> service) {
        super(service);
    }

}
