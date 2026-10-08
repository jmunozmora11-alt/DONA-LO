package co.donalo.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.donalo.entity.Usuario;
import co.donalo.jpa.JpaUsuario;

@Repository
public class UsuarioRepository implements UsuarioRepositoryI {
    
    @Autowired
    JpaUsuario jpaUsuario;

    @Override
    public Usuario insertUsuario(Usuario usuario) {
        return jpaUsuario.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return jpaUsuario.save(usuario);
    }

    @Override
    public int deleteUsuario(Usuario usuario) {
        jpaUsuario.delete(usuario); 
        return 1;
    }

    @Override
    public List<Usuario> listUsuario() {
        return jpaUsuario.findAll();
    }

    @Override
    public Usuario findIdUsuario(Long idUsuario) {
        return jpaUsuario.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuario findEmail(String email) {
        return jpaUsuario.findByEmail(email).orElse(null);
    }
}