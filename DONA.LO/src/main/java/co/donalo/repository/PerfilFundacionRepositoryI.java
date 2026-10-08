package co.donalo.repository;

import java.util.List;
import co.donalo.entity.PerfilFundacion;

public interface PerfilFundacionRepositoryI {
    PerfilFundacion insertPerfilFundacion(PerfilFundacion perfilFundacion);
    PerfilFundacion updatePerfilFundacion(PerfilFundacion perfilFundacion);
    int deletePerfilFundacion(PerfilFundacion perfilFundacion);
    List<PerfilFundacion> listPerfilFundacion();
    
    PerfilFundacion findByIdFundacion(Long idFundacion);
}