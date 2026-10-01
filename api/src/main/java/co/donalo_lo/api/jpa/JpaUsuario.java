package co.donalo_lo.api.jpa;

import co.donalo_lo.api.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUsuario extends JpaRepository<Usuario, Integer> {
	
	
	Usuario findByEmail(String email);

	Usuario findByUsuario(String usuario);
	
 
}

