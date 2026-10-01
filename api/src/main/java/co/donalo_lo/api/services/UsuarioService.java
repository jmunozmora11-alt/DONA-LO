package co.donalo_lo.api.services;

import co.donalo_lo.api.entities.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements  UsuarioServiceI{

   @Autowired
   

	@Override
	public Usuario InsertUsuario(Usuario Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario UpdateUsuario(Usuario Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteUsuario(Usuario Usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario findIdUsuario(Usuario id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario FindId_usuario(String Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findIdUsuario(Integer id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}
}