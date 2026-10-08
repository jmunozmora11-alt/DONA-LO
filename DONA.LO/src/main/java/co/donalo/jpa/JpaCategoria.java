package co.donalo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.donalo.entity.Categoria;

@Repository
public interface JpaCategoria extends JpaRepository<Categoria, Long> {
}