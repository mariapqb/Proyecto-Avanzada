package co.edu.uniquindio.proyecto.controladores;

import co.edu.uniquindio.proyecto.dto.InformacionEventoDTO;
import co.edu.uniquindio.proyecto.dto.MensajeDTO;
import co.edu.uniquindio.proyecto.servicios.interfaces.EventoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/evento")
@RequiredArgsConstructor
public class EventoControlador {

    private final EventoServicio eventoServicio;

    @GetMapping("/listar-todos")
    public ResponseEntity<MensajeDTO<List<InformacionEventoDTO>>> listarEventos() {
        return ResponseEntity.ok().body(new MensajeDTO<>(false, eventoServicio.listarEventos()));
    }
}