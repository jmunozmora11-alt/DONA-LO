package co.donalo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.donalo.entity.PerfilArticulo;

@Repository
public interface JpaPerfilArticulo extends JpaRepository<PerfilArticulo, Long> {
}