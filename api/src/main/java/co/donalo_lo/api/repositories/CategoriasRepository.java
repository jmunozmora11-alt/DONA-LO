package co.donalo_lo.api.repositories;

import co.donalo_lo.api.entities.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
}