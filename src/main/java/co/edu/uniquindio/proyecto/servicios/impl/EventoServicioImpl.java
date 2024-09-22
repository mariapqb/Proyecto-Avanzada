package co.edu.uniquindio.proyecto.servicios.impl;

import co.edu.uniquindio.proyecto.dto.InformacionEventoDTO;
import co.edu.uniquindio.proyecto.modelo.documentos.Evento;
import co.edu.uniquindio.proyecto.repositorios.EventoRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.EventoServicio;
import co.edu.uniquindio.proyecto.utils.parser.GeneralParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EventoServicioImpl implements EventoServicio {

    private final EventoRepo eventoRepo;

    @Override
    public List<InformacionEventoDTO> listarEventos() {

        List<Evento> eventos = eventoRepo.findAll();
        GeneralParser gp = new GeneralParser();
        return gp.toInformacionEventoDTO(eventos);
    }
}
