package co.edu.uniquindio.proyecto.servicios.impl;

import co.edu.uniquindio.proyecto.dto.CuentaDTO;
import co.edu.uniquindio.proyecto.modelo.documentos.Cuenta;
import co.edu.uniquindio.proyecto.repositorios.CuentaRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.CuentaServicio;
import co.edu.uniquindio.proyecto.utils.parser.GeneralParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CuentaServicioImpl implements CuentaServicio {
    private final CuentaRepo cuentaRepo;

    /*@Override
    public CuentaDTO registrarCuenta(CuentaDTO cuentaDTO) {
        // Registra una nueva cuenta en la base de datos y retorna su DTO.
        Cuenta cuenta = new Cuenta();
        cuenta.setNumero(cuentaDTO.getNumero());
        cuenta.setSaldo(cuentaDTO.getSaldo());
        // Agrega otros campos según sea necesario
        Cuenta cuentaGuardada = cuentaRepo.save(cuenta);
        return new CuentaDTO(cuentaGuardada);
    }*/

    @Override
    public List<CuentaDTO> listarCuentas() {

        List<Cuenta> cuentas = cuentaRepo.findAll();
        GeneralParser gp = new GeneralParser();
        return gp.toCuentaDTO(cuentas);
    }
}
