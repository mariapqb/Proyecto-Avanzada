package co.edu.uniquindio.proyecto;

import co.edu.uniquindio.proyecto.modelo.documentos.Evento;
import co.edu.uniquindio.proyecto.modelo.enums.EstadoEvento;
import co.edu.uniquindio.proyecto.modelo.enums.TipoEvento;
import co.edu.uniquindio.proyecto.modelo.vo.Localidad;
import co.edu.uniquindio.proyecto.repositorios.EventoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class EventoTest {

    @Autowired
    private EventoRepo eventoRepo;

    @Test
    public void registrarEventoTest() {

        List<Localidad> localidades = List.of(
                Localidad.builder()
                        .nombre("Graderias")
                        .precio(500000)
                        .capacidadMaxima(300).build(),
                Localidad.builder()
                        .nombre("Platea")
                        .precio(1000000)
                        .capacidadMaxima(100).build()
        );

        Evento evento = Evento.builder()
                .nombre("Taylor Swift Miami Arena")
                .descripcion("Lleno de energía y explosión este show te va encantar.")
                .fecha(LocalDateTime.of(2024, 12, 1, 19, 0))
                .ciudad("Miami")
                .tipo(TipoEvento.CONCIERTO)
                .direccion("Miami Arena")
                .imagenPortada("")
                .imagenLocalidades("")
                .estado(EstadoEvento.ACTIVO)
                .localidades(localidades)
                .build();

        Evento eventoCreado = eventoRepo.save(evento);
        assertNotNull(eventoCreado);
    }
}
