package co.donalo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.donalo.entity.RequerimientosFd;
import co.donalo.repository.RequerimientosFdRepositoryI;

@Service
public class RequerimientosFdService implements RequerimientosFdServiceI {

    @Autowired
    RequerimientosFdRepositoryI repo;

    @Override
    public RequerimientosFd insertRequerimientosFd(RequerimientosFd requerimientosFd) {
        if (requerimientosFd.getIdRequerimiento() == null || repo.findByIdRequerimiento(requerimientosFd.getIdRequerimiento()) == null) {
            return repo.insertRequerimientosFd(requerimientosFd);
        }
        return null;
    }

    @Override
    public RequerimientosFd updateRequerimientosFd(RequerimientosFd requerimientosFd) {
        return repo.updateRequerimientosFd(requerimientosFd);
    }

    @Override
    public int deleteRequerimientosFd(RequerimientosFd requerimientosFd) {
        return repo.deleteRequerimientosFd(requerimientosFd);
    }

    @Override
    public List<RequerimientosFd> listRequerimientosFd() {
        return repo.listRequerimientosFd();
    }

    @Override
    public RequerimientosFd findByIdRequerimiento(Long idRequerimiento) {
        return repo.findByIdRequerimiento(idRequerimiento);
    }
}