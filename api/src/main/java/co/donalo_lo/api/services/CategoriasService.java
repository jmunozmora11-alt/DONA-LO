package co.donalo_lo.api.services;

import co.donalo_lo.api.entities.Categorias;
import co.donalo_lo.api.jpa.JpaCategorias;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriasService {

    private final JpaCategorias categoriasRepository;

    CategoriasService(JpaCategorias categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }

    public List<Categorias> listarCategorias() {
        return categoriasRepository.findAll();
    }

    public Optional<Categorias> obtenerCategoriaPorId(Long id) {
        return categoriasRepository.findById(id);
    }

    public Categorias guardarCategoria(Categorias categoria) {
        return categoriasRepository.save(categoria);
    }

    public void eliminarCategoria(Long id) {
        categoriasRepository.deleteById(id);
    }
    public Categorias actualizarCategoria(Long id, Categorias categoriaDetalles) {
        return categoriasRepository.findById(id).map(categoriaExistente -> {
            categoriaExistente.setNombre(categoriaDetalles.getNombre());
            return categoriasRepository.save(categoriaExistente);
        }).orElseThrow(() -> new RuntimeException("Categoría no encontrada con el id: " + id));
    }
}