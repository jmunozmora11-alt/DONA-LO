package co.donalo_lo.api.repositories;

import co.donalo_lo.api.entities.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
}