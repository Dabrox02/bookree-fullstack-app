package com.bookree.adminbookree.web.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.impl.InventarioDTO;
import com.bookree.adminbookree.web.controller.AbstractController;

@RestController
@RequestMapping("/inventario")
public class InventarioController extends AbstractController<InventarioDTO> {

    protected InventarioController(BaseService<InventarioDTO> service) {
        super(service);
    }

}
