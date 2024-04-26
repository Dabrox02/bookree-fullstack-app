package com.bookree.adminbookree.persistence.entity.impl;

import java.io.Serializable;

import com.bookree.adminbookree.persistence.entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario extends BaseEntity implements Serializable {

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_producto_fk", nullable = false)
    private Producto idProductoFk;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getIdProductoFk() {
        return idProductoFk;
    }

    public void setIdProductoFk(Producto idProductoFk) {
        this.idProductoFk = idProductoFk;
    }

}