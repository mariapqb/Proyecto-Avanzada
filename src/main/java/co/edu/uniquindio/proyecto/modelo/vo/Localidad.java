package co.edu.uniquindio.proyecto.modelo.vo;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Localidad {

    @EqualsAndHashCode.Include
    private String nombre;

    private float precio;
    private int capacidadMaxima;
    private int entradasVendidas;

    @Builder
    public Localidad(String nombre, float precio, int capacidadMaxima) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidadMaxima = capacidadMaxima;
        this.entradasVendidas = 0;
    }
}

