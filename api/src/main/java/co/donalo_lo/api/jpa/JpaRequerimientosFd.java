package co.donalo_lo.api.jpa;

import co.donalo_lo.api.entities.RequerimientosFd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRequerimientosFd extends JpaRepository<RequerimientosFd, Long> {
}