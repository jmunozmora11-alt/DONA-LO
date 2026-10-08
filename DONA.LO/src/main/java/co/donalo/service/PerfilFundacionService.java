package co.donalo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.donalo.entity.PerfilFundacion;
import co.donalo.repository.PerfilFundacionRepositoryI;

@Service
public class PerfilFundacionService implements PerfilFundacionServiceI {

    @Autowired
    PerfilFundacionRepositoryI repo;

    @Override
    public PerfilFundacion insertPerfilFundacion(PerfilFundacion perfilFundacion) {
        if (perfilFundacion.getIdFundacion() == null || repo.findByIdFundacion(perfilFundacion.getIdFundacion()) == null) {
            return repo.insertPerfilFundacion(perfilFundacion);
        }
        return null;
    }

    @Override
    public PerfilFundacion updatePerfilFundacion(PerfilFundacion perfilFundacion) {
        return repo.updatePerfilFundacion(perfilFundacion);
    }

    @Override
    public int deletePerfilFundacion(PerfilFundacion perfilFundacion) {
        return repo.deletePerfilFundacion(perfilFundacion);
    }

    @Override
    public List<PerfilFundacion> listPerfilFundacion() {
        return repo.listPerfilFundacion();
    }

    @Override
    public PerfilFundacion findByIdFundacion(Long idFundacion) {
        return repo.findByIdFundacion(idFundacion);
    }
}