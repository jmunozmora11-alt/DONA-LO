package co.donalo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.donalo.entity.PerfilFundacion;

@Repository
public interface JpaPerfilFundacion extends JpaRepository<PerfilFundacion, Long> {
}