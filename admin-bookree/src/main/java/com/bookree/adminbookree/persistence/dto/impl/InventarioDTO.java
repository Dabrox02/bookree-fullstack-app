package com.bookree.adminbookree.persistence.dto.impl;

import com.bookree.adminbookree.persistence.dto.BaseDTO;
import com.bookree.adminbookree.persistence.entity.impl.Producto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class InventarioDTO extends BaseDTO {
    private Integer cantidad;
    private Producto idProductoFk;


    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getIdProductoFk() {
        return this.idProductoFk;
    }

    public void setIdProductoFk(Producto idProductoFk) {
        this.idProductoFk = idProductoFk;
    }

}
