package co.edu.uniquindio.proyecto.controladores;

import co.edu.uniquindio.proyecto.dto.MensajeDTO;
import co.edu.uniquindio.proyecto.dto.CuentaDTO;
import co.edu.uniquindio.proyecto.servicios.interfaces.CuentaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cuenta")
@RequiredArgsConstructor
public class CuentaControlador {

    private final CuentaServicio cuentaServicio;

    // Registrar una nueva cuenta
    @PostMapping("/registrar")
    public ResponseEntity<MensajeDTO<CuentaDTO>> registrarCuenta(@RequestBody CuentaDTO cuentaDTO) {
        CuentaDTO nuevaCuenta = cuentaServicio.registrarCuenta(cuentaDTO);
        return ResponseEntity.ok().body(new MensajeDTO<>(false, nuevaCuenta));
    }

    // Listar todas las cuentas
    @GetMapping("/listar-todas")
    public ResponseEntity<MensajeDTO<List<CuentaDTO>>> listarCuentas() {
        List<CuentaDTO> cuentas = cuentaServicio.listarCuentas();
        return ResponseEntity.ok().body(new MensajeDTO<>(false, cuentas));
    }
    
    // Otros métodos (actualizar, eliminar, etc.) pueden ser añadidos aquí.
}
