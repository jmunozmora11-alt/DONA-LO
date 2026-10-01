package co.donalo_lo.api.services;

import java.util.List;

import co.donalo_lo.api.entities.Usuario;

public interface UsuarioServiceI {

	
	Usuario InsertUsuario(Usuario Usuario);
    Usuario UpdateUsuario(Usuario Usuario);
    int deleteUsuario(Usuario Usuario);
    Usuario findIdUsuario(Usuario id_usuario);
    List<Usuario> listUsuario();
    Usuario findEmail (String email);
    Usuario FindId_usuario (String Usuario);
	Usuario findIdUsuario(Integer id_usuario);
    

}
