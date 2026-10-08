package co.donalo.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.donalo.entity.PerfilArticulo;
import co.donalo.jpa.JpaPerfilArticulo;

@Repository
public class PerfilArticuloRepository implements PerfilArticuloRepositoryI {
    
    @Autowired
    JpaPerfilArticulo jpa;

    @Override
    public PerfilArticulo insertPerfilArticulo(PerfilArticulo perfilArticulo) {
        return jpa.save(perfilArticulo);
    }

    @Override
    public PerfilArticulo updatePerfilArticulo(PerfilArticulo perfilArticulo) {
        return jpa.save(perfilArticulo);
    }

    @Override
    public int deletePerfilArticulo(PerfilArticulo perfilArticulo) {
        jpa.delete(perfilArticulo);
        return 1;
    }

    @Override
    public List<PerfilArticulo> listPerfilArticulo() {
        return jpa.findAll();
    }

    @Override
    public PerfilArticulo findByIdArticulo(Long idArticulo) {
        return jpa.findById(idArticulo).orElse(null);
    }
}