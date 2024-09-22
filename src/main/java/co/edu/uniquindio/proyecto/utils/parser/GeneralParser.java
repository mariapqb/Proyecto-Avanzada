package co.edu.uniquindio.proyecto.utils.parser;

import co.edu.uniquindio.proyecto.dto.InformacionEventoDTO;
import co.edu.uniquindio.proyecto.modelo.documentos.Evento;

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
}
