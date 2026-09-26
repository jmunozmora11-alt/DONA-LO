package co.donalo_lo.api.repositories;

import co.donalo_lo.api.entities.PerfilDonador;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PerfilDonadorRepository extends JpaRepository<PerfilDonador, Long> {
    Optional<PerfilDonador> findByEmail(String email);
}