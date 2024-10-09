package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.dto.CuentaDTO;

import java.util.List;

public interface CuentaServicio {
    CuentaDTO registrarCuenta(CuentaDTO cuentaDTO); // Método para registrar una cuenta
    List<CuentaDTO> listarCuentas();
}
