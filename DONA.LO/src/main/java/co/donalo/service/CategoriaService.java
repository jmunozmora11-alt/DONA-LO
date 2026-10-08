package co.donalo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.donalo.entity.Categoria;
import co.donalo.repository.CategoriaRepositoryI;

@Service
public class CategoriaService implements CategoriaServiceI {

    @Autowired
    CategoriaRepositoryI repo;

    @Override
    public Categoria insertCategoria(Categoria categoria) {
        if (categoria.getIdCategoria() == null || repo.findByIdCategoria(categoria.getIdCategoria()) == null) {
            return repo.insertCategoria(categoria);
        }
        return null;
    }

    @Override
    public Categoria updateCategoria(Categoria categoria) {
        return repo.updateCategoria(categoria);
    }

    @Override
    public int deleteCategoria(Categoria categoria) {
        return repo.deleteCategoria(categoria);
    }

    @Override
    public List<Categoria> listCategoria() {
        return repo.listCategoria();
    }

    @Override
    public Categoria findByIdCategoria(Long idCategoria) {
        return repo.findByIdCategoria(idCategoria);
    }
}