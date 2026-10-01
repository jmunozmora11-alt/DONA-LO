package co.donalo_lo.api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.donalo_lo.api.entities.Usuario;
import co.donalo_lo.api.jpa.JpaUsuario;

@Repository
public class UsuarioRepository implements UsuarioRepositoryI {

	private static final String String = null;
	@Autowired
	JpaUsuario jpaUsuario;

	@Override
	public Usuario InsertUsuario(Usuario Usuario) {

		return jpaUsuario.save(Usuario);
	}

	@Override
	public Usuario UpdateUsuario(Usuario Usuario) {

		return jpaUsuario.save(Usuario);
	}

	@Override
	public int deleteUsuario(Usuario Usuario) {
		if (!jpaUsuario.save(Usuario).equals(null))
			return 1;
		return 0;
	}

	@Override
	public Usuario findIdUsuario(Integer id_usuario) {

		return jpaUsuario.findById(id_usuario).orElse(null);
	}

	@Override
	public List<Usuario> listUsuario() {

		return jpaUsuario.findAll();
	}

	@Override
	public Usuario findEmail(String email) {

		return jpaUsuario.findByEmail(email);
	}

	@Override
	public Usuario FindId_usuario(String Usuario) {

		return jpaUsuario.findByUsuario(Usuario);
	}

	@Override
	public Usuario findIdUsuario(Usuario id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
