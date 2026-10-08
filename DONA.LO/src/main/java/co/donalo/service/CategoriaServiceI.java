package co.donalo.service;

import java.util.List;
import co.donalo.entity.Categoria;

public interface CategoriaServiceI {
    Categoria insertCategoria(Categoria categoria);
    Categoria updateCategoria(Categoria categoria);
    int deleteCategoria(Categoria categoria);
    List<Categoria> listCategoria();
    
    Categoria findByIdCategoria(Long idCategoria);
}