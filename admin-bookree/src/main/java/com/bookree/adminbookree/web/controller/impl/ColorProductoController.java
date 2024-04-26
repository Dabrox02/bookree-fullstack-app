package com.bookree.adminbookree.web.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.impl.ColorProductoDTO;
import com.bookree.adminbookree.web.controller.AbstractController;

@RestController
@RequestMapping("/color")
public class ColorProductoController extends AbstractController<ColorProductoDTO> {

    protected ColorProductoController(BaseService<ColorProductoDTO> service) {
        super(service);
    }

}
