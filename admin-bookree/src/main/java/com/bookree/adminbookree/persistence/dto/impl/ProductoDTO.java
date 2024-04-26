package com.bookree.adminbookree.persistence.dto.impl;

import com.bookree.adminbookree.persistence.dto.BaseDTO;
import com.bookree.adminbookree.persistence.entity.impl.ColorProducto;
import com.bookree.adminbookree.persistence.entity.impl.TallaProducto;
import com.bookree.adminbookree.persistence.entity.impl.TipoProducto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ProductoDTO extends BaseDTO {
    private String nombre;
    private String precio;
    private TipoProducto idTipoFk;
    private ColorProducto idColorFk;
    private TallaProducto idTallaFk;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return this.precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public TipoProducto getIdTipoFk() {
        return this.idTipoFk;
    }

    public void setIdTipoFk(TipoProducto idTipoFk) {
        this.idTipoFk = idTipoFk;
    }

    public ColorProducto getIdColorFk() {
        return this.idColorFk;
    }

    public void setIdColorFk(ColorProducto idColorFk) {
        this.idColorFk = idColorFk;
    }

    public TallaProducto getIdTallaFk() {
        return this.idTallaFk;
    }

    public void setIdTallaFk(TallaProducto idTallaFk) {
        this.idTallaFk = idTallaFk;
    }

}
