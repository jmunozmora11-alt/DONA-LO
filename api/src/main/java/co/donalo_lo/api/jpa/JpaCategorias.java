package co.donalo_lo.api.jpa;

import co.donalo_lo.api.entities.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCategorias extends JpaRepository<Categorias, Long> {
}