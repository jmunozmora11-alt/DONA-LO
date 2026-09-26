package co.donalo_lo.api.repositories;

import co.donalo_lo.api.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Método útil para buscar por correo al momento de hacer el login
    Optional<Usuario> findByEmail(String email);
}