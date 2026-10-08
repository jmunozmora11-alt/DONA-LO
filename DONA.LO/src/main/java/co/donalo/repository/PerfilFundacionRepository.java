package co.donalo.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.donalo.entity.PerfilFundacion;
import co.donalo.jpa.JpaPerfilFundacion;

@Repository
public class PerfilFundacionRepository implements PerfilFundacionRepositoryI {
    
    @Autowired
    JpaPerfilFundacion jpa;

    @Override
    public PerfilFundacion insertPerfilFundacion(PerfilFundacion perfilFundacion) {
        return jpa.save(perfilFundacion);
    }

    @Override
    public PerfilFundacion updatePerfilFundacion(PerfilFundacion perfilFundacion) {
        return jpa.save(perfilFundacion);
    }

    @Override
    public int deletePerfilFundacion(PerfilFundacion perfilFundacion) {
        jpa.delete(perfilFundacion);
        return 1;
    }

    @Override
    public List<PerfilFundacion> listPerfilFundacion() {
        return jpa.findAll();
    }

    @Override
    public PerfilFundacion findByIdFundacion(Long idFundacion) {
        return jpa.findById(idFundacion).orElse(null);
    }
}