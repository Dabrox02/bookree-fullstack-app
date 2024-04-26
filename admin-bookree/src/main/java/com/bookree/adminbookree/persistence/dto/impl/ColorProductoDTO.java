package com.bookree.adminbookree.persistence.dto.impl;

import com.bookree.adminbookree.persistence.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ColorProductoDTO extends BaseDTO {

    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
