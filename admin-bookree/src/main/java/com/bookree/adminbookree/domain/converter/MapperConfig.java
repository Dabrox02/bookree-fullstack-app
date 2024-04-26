package com.bookree.adminbookree.domain.converter;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bookree.adminbookree.domain.converter.impl.MapperImpl;
import com.bookree.adminbookree.persistence.dto.impl.ColorProductoDTO;
import com.bookree.adminbookree.persistence.dto.impl.FormaPagoDTO;
import com.bookree.adminbookree.persistence.dto.impl.InventarioDTO;
import com.bookree.adminbookree.persistence.dto.impl.ProductoDTO;
import com.bookree.adminbookree.persistence.dto.impl.TallaProductoDTO;
import com.bookree.adminbookree.persistence.dto.impl.TipoProductoDTO;
import com.bookree.adminbookree.persistence.dto.impl.UsuarioDTO;
import com.bookree.adminbookree.persistence.entity.impl.ColorProducto;
import com.bookree.adminbookree.persistence.entity.impl.FormaPago;
import com.bookree.adminbookree.persistence.entity.impl.Inventario;
import com.bookree.adminbookree.persistence.entity.impl.Producto;
import com.bookree.adminbookree.persistence.entity.impl.TallaProducto;
import com.bookree.adminbookree.persistence.entity.impl.TipoProducto;
import com.bookree.adminbookree.persistence.entity.impl.Usuario;

@Configuration
public class MapperConfig {

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    MapperImpl<ColorProductoDTO, ColorProducto> colorMapper(ModelMapper mapper) {
        return new MapperImpl<>(mapper, ColorProducto.class, ColorProductoDTO.class);
    }

    @Bean
    MapperImpl<TallaProductoDTO, TallaProducto> tallaMapper(ModelMapper mapper) {
        return new MapperImpl<>(mapper, TallaProducto.class, TallaProductoDTO.class);
    }

    @Bean
    MapperImpl<FormaPagoDTO, FormaPago> formaPagoMapper(ModelMapper mapper) {
        return new MapperImpl<>(mapper, FormaPago.class, FormaPagoDTO.class);
    }

    @Bean
    MapperImpl<UsuarioDTO, Usuario> usuarioMapper(ModelMapper mapper) {
        return new MapperImpl<>(mapper, Usuario.class, UsuarioDTO.class);
    }

    @Bean
    MapperImpl<TipoProductoDTO, TipoProducto> tipoProductoMapper(ModelMapper mapper) {
        return new MapperImpl<>(mapper, TipoProducto.class, TipoProductoDTO.class);
    }

    @Bean
    MapperImpl<InventarioDTO, Inventario> inventarioMapper(ModelMapper mapper) {
        return new MapperImpl<>(mapper, Inventario.class, InventarioDTO.class);
    }

    @Bean
    MapperImpl<ProductoDTO, Producto> productoMapper(ModelMapper mapper) {
        return new MapperImpl<>(mapper, Producto.class, ProductoDTO.class);
    }

}
