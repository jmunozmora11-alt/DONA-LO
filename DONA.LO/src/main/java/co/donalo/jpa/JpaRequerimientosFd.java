package co.donalo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.donalo.entity.RequerimientosFd;

@Repository
public interface JpaRequerimientosFd extends JpaRepository<RequerimientosFd, Long> {
}