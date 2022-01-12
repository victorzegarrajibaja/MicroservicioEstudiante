package com.everis.productos.dto.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
public class ResponseDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long codigo;

    private String nombre;

    private String descripcion;

    private Double precio;

    private Boolean activo;
}
