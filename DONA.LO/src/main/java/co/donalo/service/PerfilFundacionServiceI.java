package co.donalo.service;

import java.util.List;
import co.donalo.entity.PerfilFundacion;

public interface PerfilFundacionServiceI {
    PerfilFundacion insertPerfilFundacion(PerfilFundacion perfilFundacion);
    PerfilFundacion updatePerfilFundacion(PerfilFundacion perfilFundacion);
    int deletePerfilFundacion(PerfilFundacion perfilFundacion);
    List<PerfilFundacion> listPerfilFundacion();
    
    PerfilFundacion findByIdFundacion(Long idFundacion);
}