package co.donalo.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.donalo.entity.PerfilDonador;
import co.donalo.jpa.JpaPerfilDonador;

@Repository
public class PerfilDonadorRepository implements PerfilDonadorRepositoryI {
    
    @Autowired
    JpaPerfilDonador jpa;

    @Override
    public PerfilDonador insertPerfilDonador(PerfilDonador perfil) {
        return jpa.save(perfil);
    }

    @Override
    public PerfilDonador updatePerfilDonador(PerfilDonador perfil) {
        return jpa.save(perfil);
    }

    @Override
    public int deletePerfilDonador(PerfilDonador perfil) {
        jpa.delete(perfil);
        return 1;
    }

    @Override
    public List<PerfilDonador> listPerfilDonador() {
        return jpa.findAll();
    }

    @Override
    public PerfilDonador findByIdUser(Long idUser) {
        return jpa.findById(idUser).orElse(null);
    }
}