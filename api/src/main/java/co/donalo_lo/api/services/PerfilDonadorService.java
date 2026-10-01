package co.donalo_lo.api.services;

import co.donalo_lo.api.entities.PerfilDonador;
import co.donalo_lo.api.jpa.JpaPerfilDonador;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilDonadorService {

    private final JpaPerfilDonador donadorRepository;

    public PerfilDonadorService(JpaPerfilDonador donadorRepository) {
        this.donadorRepository = donadorRepository;
    }

    public List<PerfilDonador> listarDonadores() {
        return donadorRepository.findAll();
    }

    public Optional<PerfilDonador> obtenerDonadorPorId(Long id) {
        return donadorRepository.findById(id);
    }

    public PerfilDonador guardarDonador(PerfilDonador donador) {
        return donadorRepository.save(donador);
    }

    public PerfilDonador actualizarDonador(Long id, PerfilDonador donadorDetalles) {
        return donadorRepository.findById(id).map(donadorExistente -> {
            donadorExistente.setName(donadorDetalles.getName());
            donadorExistente.setLastName(donadorDetalles.getLastName());
            donadorExistente.setEmail(donadorDetalles.getEmail());
            donadorExistente.setPhone(donadorDetalles.getPhone());
            donadorExistente.setAddress(donadorDetalles.getAddress());
            donadorExistente.setIdUser(donadorDetalles.getIdUser());
            return donadorRepository.save(donadorExistente);
        }).orElseThrow(() -> new RuntimeException("Donador no encontrado con el id: " + id));
    }

    public void eliminarDonador(Long id) {
        donadorRepository.deleteById(id);
    }
}