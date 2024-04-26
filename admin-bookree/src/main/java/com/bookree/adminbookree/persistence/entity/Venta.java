package com.bookree.adminbookree.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.bookree.adminbookree.persistence.entity.impl.FormaPago;
import com.bookree.adminbookree.persistence.entity.impl.Usuario;

@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_producto_fk", nullable = false)
    private Producto idProductoFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cliente_fk", nullable = false)
    private Usuario idClienteFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_forma_pago_fk", nullable = false)
    private FormaPago idFormaPagoFk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Producto getIdProductoFk() {
        return idProductoFk;
    }

    public void setIdProductoFk(Producto idProductoFk) {
        this.idProductoFk = idProductoFk;
    }

    public Usuario getIdClienteFk() {
        return idClienteFk;
    }

    public void setIdClienteFk(Usuario idClienteFk) {
        this.idClienteFk = idClienteFk;
    }

    public FormaPago getIdFormaPagoFk() {
        return idFormaPagoFk;
    }

    public void setIdFormaPagoFk(FormaPago idFormaPagoFk) {
        this.idFormaPagoFk = idFormaPagoFk;
    }

}