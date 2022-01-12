package com.everis.productos.dto.product;

import lombok.Data;

@Data
public class RequestDto {
    private String nombre;

    private String descripcion;

    private Double precio;
}
