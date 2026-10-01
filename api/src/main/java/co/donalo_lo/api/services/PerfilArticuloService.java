package co.donalo_lo.api.services;

import co.donalo_lo.api.entities.PerfilArticulo;
import co.donalo_lo.api.jpa.JpaPerfilArticulo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilArticuloService {

    private final JpaPerfilArticulo perfilArticuloRepository;

    public PerfilArticuloService(JpaPerfilArticulo perfilArticuloRepository) {
        this.perfilArticuloRepository = perfilArticuloRepository;
    }

    public List<PerfilArticulo> listarPerfilArticulos() {
        return perfilArticuloRepository.findAll();
    }

    public Optional<PerfilArticulo> obtenerPerfilArticuloPorId(Long id) {
        return perfilArticuloRepository.findById(id);
    }

    public PerfilArticulo guardarPerfilArticulo(PerfilArticulo perfilArticulo) {
        return perfilArticuloRepository.save(perfilArticulo);
    }

    public PerfilArticulo actualizarPerfilArticulo(Long id, PerfilArticulo perfilArticuloDetalles) {
        return perfilArticuloRepository.findById(id).map(perfilArticuloExistente -> {
          
            perfilArticuloExistente.setNombre(perfilArticuloDetalles.getNombre());
            perfilArticuloExistente.setDescripcion(perfilArticuloDetalles.getDescripcion());
            return perfilArticuloRepository.save(perfilArticuloExistente);
        }).orElseThrow(() -> new RuntimeException("Perfil de artículo no encontrado con el id: " + id));
    }

    public void eliminarPerfilArticulo(Long id) {
        perfilArticuloRepository.deleteById(id);
    }
}