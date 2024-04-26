package com.bookree.adminbookree.web.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.impl.TipoProductoDTO;
import com.bookree.adminbookree.web.controller.AbstractController;

@RestController
@RequestMapping("/tipo_producto")
public class TipoProductoController extends AbstractController<TipoProductoDTO> {

    protected TipoProductoController(BaseService<TipoProductoDTO> service) {
        super(service);
    }

}
