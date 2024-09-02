package co.edu.uniquindio.proyecto.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Document("usuarios")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class usuario {

    @Id
    private String codigo;

    private String cedula;
    private String nombre;
    private String email;
    private String telefono;
}
