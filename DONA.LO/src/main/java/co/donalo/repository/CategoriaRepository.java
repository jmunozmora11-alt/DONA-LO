package co.donalo.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.donalo.entity.Categoria;
import co.donalo.jpa.JpaCategoria;

@Repository
public class CategoriaRepository implements CategoriaRepositoryI {
    
    @Autowired
    JpaCategoria jpa;

    @Override
    public Categoria insertCategoria(Categoria categoria) {
        return jpa.save(categoria);
    }

    @Override
    public Categoria updateCategoria(Categoria categoria) {
        return jpa.save(categoria);
    }

    @Override
    public int deleteCategoria(Categoria categoria) {
        jpa.delete(categoria);
        return 1;
    }

    @Override
    public List<Categoria> listCategoria() {
        return jpa.findAll();
    }

    @Override
    public Categoria findByIdCategoria(Long idCategoria) {
        return jpa.findById(idCategoria).orElse(null);
    }
}