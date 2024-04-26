package com.bookree.adminbookree.persistence.entity.impl;

import com.bookree.adminbookree.persistence.entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "color_producto")
public class ColorProducto extends BaseEntity {

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}