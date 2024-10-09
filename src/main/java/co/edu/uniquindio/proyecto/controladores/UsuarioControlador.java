/*package co.edu.uniquindio.proyecto.controladores;

import co.edu.uniquindio.proyecto.dto.UsuarioDTO;
import co.edu.uniquindio.proyecto.dto.MensajeDTO;
import co.edu.uniquindio.proyecto.servicios.interfaces.UsuarioServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
public class UsuarioControlador {

    private final UsuarioServicio usuarioServicio;

    // Registrar un nuevo usuario
    @PostMapping("/registrar")
    public ResponseEntity<MensajeDTO<UsuarioDTO>> registrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO nuevoUsuario = usuarioServicio.registrarUsuario(usuarioDTO);
        return ResponseEntity.ok(new MensajeDTO<>(false, nuevoUsuario));
    }

    // Autenticar usuario (inicio de sesión)
    @PostMapping("/login")
    public ResponseEntity<MensajeDTO<UsuarioDTO>> loginUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO usuarioAutenticado = usuarioServicio.loginUsuario(usuarioDTO.getEmail(), usuarioDTO.getPassword());
        return ResponseEntity.ok(new MensajeDTO<>(false, usuarioAutenticado));
    }

    // Listar todos los usuarios
    @GetMapping("/listar-todos")
    public ResponseEntity<MensajeDTO<List<UsuarioDTO>>> listarUsuarios() {
        List<UsuarioDTO> usuarios = usuarioServicio.listarUsuarios();
        return ResponseEntity.ok(new MensajeDTO<>(false, usuarios));
    }
}
*/