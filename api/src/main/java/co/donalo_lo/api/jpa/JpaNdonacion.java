package co.donalo_lo.api.jpa;

import co.donalo_lo.api.entities.NDonacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaNdonacion extends JpaRepository<NDonacion, Long> {
}