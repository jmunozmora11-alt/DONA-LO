package co.donalo_lo.api.repositories;

import co.donalo_lo.api.entities.NDonacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NDonacionRepository extends JpaRepository<NDonacion, Long> {
}