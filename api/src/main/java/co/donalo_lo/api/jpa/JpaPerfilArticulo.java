package co.donalo_lo.api.jpa;

import co.donalo_lo.api.entities.PerfilArticulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPerfilArticulo extends JpaRepository<PerfilArticulo, Long> {
}