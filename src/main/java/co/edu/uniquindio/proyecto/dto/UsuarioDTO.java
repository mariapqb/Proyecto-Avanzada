package co.edu.uniquindio.proyecto.dto;

public record UsuarioDTO(
        String nombre,
        String cedula,
        String direccion,
        String telefono,
        String email,
        String password) {

}