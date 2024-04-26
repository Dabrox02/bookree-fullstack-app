package com.bookree.adminbookree.persistence.entity.impl;

import java.io.Serializable;

import com.bookree.adminbookree.persistence.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto extends BaseEntity implements Serializable {

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "precio", nullable = false, length = 100)
    private String precio;

    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_fk", nullable = false)
    private TipoProducto idTipoFk;

    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_color_fk", nullable = false)
    private ColorProducto idColorFk;

    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_talla_fk", nullable = false)
    private TallaProducto idTallaFk;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public TipoProducto getIdTipoFk() {
        return idTipoFk;
    }

    public void setIdTipoFk(TipoProducto idTipoFk) {
        this.idTipoFk = idTipoFk;
    }

    public ColorProducto getIdColorFk() {
        return idColorFk;
    }

    public void setIdColorFk(ColorProducto idColorFk) {
        this.idColorFk = idColorFk;
    }

    public TallaProducto getIdTallaFk() {
        return idTallaFk;
    }

    public void setIdTallaFk(TallaProducto idTallaFk) {
        this.idTallaFk = idTallaFk;
    }

}