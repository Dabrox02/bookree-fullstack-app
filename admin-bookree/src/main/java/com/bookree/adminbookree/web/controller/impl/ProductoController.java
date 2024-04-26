package com.bookree.adminbookree.web.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.impl.ProductoDTO;
import com.bookree.adminbookree.web.controller.AbstractController;

@RestController
@RequestMapping("/producto")
public class ProductoController extends AbstractController<ProductoDTO> {

    protected ProductoController(BaseService<ProductoDTO> service) {
        super(service);
    }

}
