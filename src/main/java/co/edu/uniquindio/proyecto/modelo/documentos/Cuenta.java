package co.edu.uniquindio.proyecto.modelo.documentos;

import co.edu.uniquindio.proyecto.modelo.enums.EstadoCuenta;
import co.edu.uniquindio.proyecto.modelo.enums.Rol;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document("cuentas")
public class Cuenta {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    private String email;
    private String password;
    private LocalDateTime fechaRegistro;
    private EstadoCuenta estado;
    private Usuario usuario;
    private Rol rol;

    @Builder
    public Cuenta(String id, String email, String password, LocalDateTime fechaRegistro, EstadoCuenta estado, Usuario usuario, Rol rol) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.usuario = usuario;
        this.rol = rol;
    }
}
