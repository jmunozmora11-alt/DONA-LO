package co.donalo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.donalo.entity.Usuario;
import co.donalo.repository.UsuarioRepositoryI;

@Service
public class UsuarioService implements UsuarioServiceI {

    @Autowired
    UsuarioRepositoryI usr;

    @Override
    public Usuario insertUsuario(Usuario usuario) {
        if (usuario.getIdUsuario() == null || usr.findIdUsuario(usuario.getIdUsuario()) == null) {
            return usr.insertUsuario(usuario);
        }
        return null;
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return usr.updateUsuario(usuario);
    }

    @Override
    public int deleteUsuario(Usuario usuario) {
        return usr.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> listUsuario() {
        return usr.listUsuario();
    }

    @Override
    public Usuario findIdUsuario(Long idUsuario) {
        return usr.findIdUsuario(idUsuario);
    }

    @Override
    public Usuario findEmail(String email) {
        return usr.findEmail(email);
    }
}