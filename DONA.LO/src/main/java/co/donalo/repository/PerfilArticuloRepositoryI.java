package co.donalo.repository;

import java.util.List;
import co.donalo.entity.PerfilArticulo;

public interface PerfilArticuloRepositoryI {
    PerfilArticulo insertPerfilArticulo(PerfilArticulo perfilArticulo);
    PerfilArticulo updatePerfilArticulo(PerfilArticulo perfilArticulo);
    int deletePerfilArticulo(PerfilArticulo perfilArticulo);
    List<PerfilArticulo> listPerfilArticulo();
    
    PerfilArticulo findByIdArticulo(Long idArticulo);
}