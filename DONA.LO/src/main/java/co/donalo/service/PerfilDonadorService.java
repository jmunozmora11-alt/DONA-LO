package co.donalo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.donalo.entity.PerfilDonador;
import co.donalo.repository.PerfilDonadorRepositoryI;

@Service
public class PerfilDonadorService implements PerfilDonadorServiceI {

    @Autowired
    PerfilDonadorRepositoryI repo;

    @Override
    public PerfilDonador insertPerfilDonador(PerfilDonador perfil) {
        if (perfil.getIdUser() == null || repo.findByIdUser(perfil.getIdUser()) == null) {
            return repo.insertPerfilDonador(perfil);
        }
        return null;
    }

    @Override
    public PerfilDonador updatePerfilDonador(PerfilDonador perfil) {
        return repo.updatePerfilDonador(perfil);
    }

    @Override
    public int deletePerfilDonador(PerfilDonador perfil) {
        return repo.deletePerfilDonador(perfil);
    }

    @Override
    public List<PerfilDonador> listPerfilDonador() {
        return repo.listPerfilDonador();
    }

    @Override
    public PerfilDonador findByIdUser(Long idUser) {
        return repo.findByIdUser(idUser);
    }
}