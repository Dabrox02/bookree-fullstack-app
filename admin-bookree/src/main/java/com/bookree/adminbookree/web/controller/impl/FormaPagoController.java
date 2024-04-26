package com.bookree.adminbookree.web.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookree.adminbookree.domain.service.BaseService;
import com.bookree.adminbookree.persistence.dto.impl.FormaPagoDTO;
import com.bookree.adminbookree.web.controller.AbstractController;

@RestController
@RequestMapping("/forma_pago")
public class FormaPagoController extends AbstractController<FormaPagoDTO> {

    protected FormaPagoController(BaseService<FormaPagoDTO> service) {
        super(service);
    }

}
