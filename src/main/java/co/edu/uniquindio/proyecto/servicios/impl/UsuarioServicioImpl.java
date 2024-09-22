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

    @Override
    public List<UsuarioDTO> listarUsuarios() {

        List<Usuario> usuarios = usuarioRepo.findAll();
        GeneralParser gp = new GeneralParser();
        return gp.toUsuarioDTO(usuarios);
    }
}
