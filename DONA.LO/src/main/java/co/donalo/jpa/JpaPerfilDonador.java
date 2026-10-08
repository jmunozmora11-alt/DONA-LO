package co.donalo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.donalo.entity.PerfilDonador;

@Repository
public interface JpaPerfilDonador extends JpaRepository<PerfilDonador, Long> {
   
}