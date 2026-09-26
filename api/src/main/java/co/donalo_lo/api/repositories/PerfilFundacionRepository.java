package co.donalo_lo.api.repositories;

import co.donalo_lo.api.entities.PerfilFundacion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PerfilFundacionRepository extends JpaRepository<PerfilFundacion, Long> {
    Optional<PerfilFundacion> findByEmail(String email);
}