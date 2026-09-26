package co.donalo_lo.api.services;

import co.donalo_lo.api.entities.PerfilFundacion;
import co.donalo_lo.api.repositories.PerfilFundacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilFundacionService {

    private final PerfilFundacionRepository fundacionRepository;

    PerfilFundacionService(PerfilFundacionRepository fundacionRepository) {
        this.fundacionRepository = fundacionRepository;
    }

    public List<PerfilFundacion> listarFundaciones() {
        return fundacionRepository.findAll();
    }

    public Optional<PerfilFundacion> obtenerFundacionPorId(Long id) {
        return fundacionRepository.findById(id);
    }

    public PerfilFundacion guardarFundacion(PerfilFundacion fundacion) {
        return fundacionRepository.save(fundacion);
    }

    public PerfilFundacion actualizarFundacion(Long id, PerfilFundacion fundacionDetalles) {
        PerfilFundacion fundacion = fundacionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fundación no encontrada con el id: " + id));

        fundacion.setName(fundacionDetalles.getName());
        fundacion.setEmail(fundacionDetalles.getEmail());
        fundacion.setPhone(fundacionDetalles.getPhone());
        fundacion.setAddress(fundacionDetalles.getAddress());
        fundacion.setDescripcion(fundacionDetalles.getDescripcion());
        fundacion.setHorarios(fundacionDetalles.getHorarios());
        fundacion.setTipoServicio(fundacionDetalles.getTipoServicio());

        return fundacionRepository.save(fundacion);
    }
    public void eliminarFundacion(Long id) {
        fundacionRepository.deleteById(id);
    }
    
}