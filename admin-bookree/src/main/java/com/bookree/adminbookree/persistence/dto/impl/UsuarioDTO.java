package com.bookree.adminbookree.persistence.dto.impl;

import com.bookree.adminbookree.persistence.dto.BaseDTO;
import com.bookree.adminbookree.persistence.entity.impl.TipoUsuarioEnum;

public class UsuarioDTO extends BaseDTO {
    private String nombre;
    private String correo;
    private String clave;
    private TipoUsuarioEnum tipoUsuario;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public TipoUsuarioEnum getTipoUsuario() {
        return this.tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
