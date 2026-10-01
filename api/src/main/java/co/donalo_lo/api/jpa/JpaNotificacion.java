package co.donalo_lo.api.jpa;

import co.donalo_lo.api.entities.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaNotificacion extends JpaRepository<Notificacion, Long> {
}