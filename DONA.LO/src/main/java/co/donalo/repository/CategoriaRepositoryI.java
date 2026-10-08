package co.donalo.repository;

import java.util.List;
import co.donalo.entity.Categoria;

public interface CategoriaRepositoryI {
    Categoria insertCategoria(Categoria categoria);
    Categoria updateCategoria(Categoria categoria);
    int deleteCategoria(Categoria categoria);
    List<Categoria> listCategoria();
    
    Categoria findByIdCategoria(Long idCategoria);
}