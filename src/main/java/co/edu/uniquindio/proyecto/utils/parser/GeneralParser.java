package co.edu.uniquindio.proyecto.utils.parser;

import co.edu.uniquindio.proyecto.dto.CuentaDTO;
import co.edu.uniquindio.proyecto.dto.InformacionEventoDTO;
import co.edu.uniquindio.proyecto.dto.UsuarioDTO;
import co.edu.uniquindio.proyecto.modelo.documentos.Cuenta;
import co.edu.uniquindio.proyecto.modelo.documentos.Evento;
import co.edu.uniquindio.proyecto.modelo.documentos.Usuario;

import java.util.LinkedList;
import java.util.List;

public class GeneralParser {

    public List<InformacionEventoDTO> toInformacionEventoDTO(List<Evento> eventos) {
        List<InformacionEventoDTO> dtos = new LinkedList<>();

        for (Evento evento : eventos)
            dtos.add(
                    new InformacionEventoDTO(
                            evento.getNombre(),
                            evento.getDescripcion(),
                            evento.getFecha().toString(),
                            evento.getTipo().toString(),
                            evento.getDireccion(),
                            evento.getCiudad(),
                            evento.getImagenPortada(),
                            evento.getImagenLocalidades()
                    )
            );

        return dtos;
    }

    public List<CuentaDTO> toCuentaDTO(List<Cuenta> cuentas) {
        List<CuentaDTO> dtos = new LinkedList<>();

        for (Cuenta cuenta : cuentas)
            dtos.add(
                    new CuentaDTO(
                            cuenta.getId(),
                            cuenta.getPassword(),
                            cuenta.getFechaRegistro().toString(),
                            cuenta.getRol().toString(),
                            cuenta.getEstado().toString(),
                            cuenta.getUsuario().toString()
                    )
            );

        return dtos;
    }

    public List<UsuarioDTO> toUsuarioDTO(List<Usuario> usuarios) {
        List<UsuarioDTO> dtos = new LinkedList<>();

        for (Usuario usuario : usuarios)
            dtos.add(
                    new UsuarioDTO(
                            usuario.getId(),
                            usuario.getCedula(),
                            usuario.getNombre(),
                            usuario.getDireccion()
                    )
            );

        return dtos;
    }
}
