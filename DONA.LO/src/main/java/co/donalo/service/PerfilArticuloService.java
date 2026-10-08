package co.donalo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.donalo.entity.PerfilArticulo;
import co.donalo.repository.PerfilArticuloRepositoryI;

@Service
public class PerfilArticuloService implements PerfilArticuloServiceI {

    @Autowired
    PerfilArticuloRepositoryI repo;

    @Override
    public PerfilArticulo insertPerfilArticulo(PerfilArticulo perfilArticulo) {
        if (perfilArticulo.getIdArticulo() == null || repo.findByIdArticulo(perfilArticulo.getIdArticulo()) == null) {
            return repo.insertPerfilArticulo(perfilArticulo);
        }
        return null;
    }

    @Override
    public PerfilArticulo updatePerfilArticulo(PerfilArticulo perfilArticulo) {
        return repo.updatePerfilArticulo(perfilArticulo);
    }

    @Override
    public int deletePerfilArticulo(PerfilArticulo perfilArticulo) {
        return repo.deletePerfilArticulo(perfilArticulo);
    }

    @Override
    public List<PerfilArticulo> listPerfilArticulo() {
        return repo.listPerfilArticulo();
    }

    @Override
    public PerfilArticulo findByIdArticulo(Long idArticulo) {
        return repo.findByIdArticulo(idArticulo);
    }
}