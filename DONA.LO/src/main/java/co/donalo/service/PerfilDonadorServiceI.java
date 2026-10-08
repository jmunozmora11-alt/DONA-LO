package co.donalo.service;

import java.util.List;
import co.donalo.entity.PerfilDonador;

public interface PerfilDonadorServiceI {
    PerfilDonador insertPerfilDonador(PerfilDonador perfil);
    PerfilDonador updatePerfilDonador(PerfilDonador perfil);
    int deletePerfilDonador(PerfilDonador perfil);
    List<PerfilDonador> listPerfilDonador();
    
    PerfilDonador findByIdUser(Long idUser);
}