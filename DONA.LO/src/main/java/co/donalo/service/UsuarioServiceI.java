package co.donalo.service;

import java.util.List;
import co.donalo.entity.Usuario;

public interface UsuarioServiceI {
    Usuario insertUsuario(Usuario usuario);
    Usuario updateUsuario(Usuario usuario);
    int deleteUsuario(Usuario usuario);
    List<Usuario> listUsuario();
    
    Usuario findIdUsuario(Long idUsuario);
    Usuario findEmail(String email);
}