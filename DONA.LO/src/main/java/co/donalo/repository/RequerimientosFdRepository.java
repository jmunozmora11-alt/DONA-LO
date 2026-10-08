package co.donalo.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.donalo.entity.RequerimientosFd;
import co.donalo.jpa.JpaRequerimientosFd;

@Repository
public class RequerimientosFdRepository implements RequerimientosFdRepositoryI {
    
    @Autowired
    JpaRequerimientosFd jpa;

    @Override
    public RequerimientosFd insertRequerimientosFd(RequerimientosFd requerimientosFd) {
        return jpa.save(requerimientosFd);
    }

    @Override
    public RequerimientosFd updateRequerimientosFd(RequerimientosFd requerimientosFd) {
        return jpa.save(requerimientosFd);
    }

    @Override
    public int deleteRequerimientosFd(RequerimientosFd requerimientosFd) {
        jpa.delete(requerimientosFd);
        return 1;
    }

    @Override
    public List<RequerimientosFd> listRequerimientosFd() {
        return jpa.findAll();
    }

    @Override
    public RequerimientosFd findByIdRequerimiento(Long idRequerimiento) {
        return jpa.findById(idRequerimiento).orElse(null);
    }
}