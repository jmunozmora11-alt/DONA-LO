package co.donalo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.donalo.entity.Usuario;
import java.util.Optional;

@Repository
public interface JpaUsuario extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}