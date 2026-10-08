package co.donalo.repository;

import java.util.List;
import co.donalo.entity.PerfilDonador;

public interface PerfilDonadorRepositoryI {
    PerfilDonador insertPerfilDonador(PerfilDonador perfil);
    PerfilDonador updatePerfilDonador(PerfilDonador perfil);
    int deletePerfilDonador(PerfilDonador perfil);
    List<PerfilDonador> listPerfilDonador();
    
    PerfilDonador findByIdUser(Long idUser);
}