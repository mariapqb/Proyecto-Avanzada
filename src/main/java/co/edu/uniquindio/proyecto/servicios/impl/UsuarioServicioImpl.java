package co.edu.uniquindio.proyecto.servicios.impl;

import co.edu.uniquindio.proyecto.dto.UsuarioDTO;
import co.edu.uniquindio.proyecto.modelo.documentos.Usuario;
import co.edu.uniquindio.proyecto.repositorios.UsuarioRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.EventoServicio;
import co.edu.uniquindio.proyecto.servicios.interfaces.UsuarioServicio;
import co.edu.uniquindio.proyecto.utils.parser.GeneralParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsuarioServicioImpl implements UsuarioServicio {
    private final UsuarioRepo usuarioRepo;

    /*@Override
    public UsuarioDTO registrarUsuario(UsuarioDTO usuarioDTO) {
        // Registra un nuevo usuario en la base de datos y retorna su DTO.
        Usuario usuario = new Usuario();
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(usuarioDTO.getPassword());
        Usuario usuarioGuardado = usuarioRepo.save(usuario);
        return new UsuarioDTO(usuarioGuardado);
    }

    @Override
    public UsuarioDTO loginUsuario(String email, String password) {
        // Verifica las credenciales del usuario y retorna su DTO si son correctas.
        Usuario usuario = usuarioRepo.findByEmailAndPassword(email, password);
        if (usuario == null) {
            throw new IllegalArgumentException("Credenciales incorrectas");
        }
        return new UsuarioDTO(usuario);
    } 
*/
    @Override
    public List<UsuarioDTO> listarUsuarios() {

        List<Usuario> usuarios = usuarioRepo.findAll();
        GeneralParser gp = new GeneralParser();
        return gp.toUsuarioDTO(usuarios);
    }
}
