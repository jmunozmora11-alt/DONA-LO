package co.donalo_lo.api.jpa;

import co.donalo_lo.api.entities.DetallesEntrega;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDetallesEntrega extends JpaRepository<DetallesEntrega, Long> {
}