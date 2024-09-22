package co.edu.uniquindio.proyecto.dto;

public record InformacionEventoDTO(
        String nombre,
        String descripcion,
        String fecha,
        String tipoEvento,
        String direccion,
        String ciudad,
        String imagenPortada,
        String imagenLocalidades
) {
}
