package co.donalo_lo.api.jpa;

import co.donalo_lo.api.entities.PerfilDonador;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface JpaPerfilDonador extends JpaRepository<PerfilDonador, Long> {
    Optional<PerfilDonador> findByEmail(String email);
}