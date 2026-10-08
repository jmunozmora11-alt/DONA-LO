package co.donalo.repository;

import java.util.List;
import co.donalo.entity.RequerimientosFd;

public interface RequerimientosFdRepositoryI {
    RequerimientosFd insertRequerimientosFd(RequerimientosFd requerimientosFd);
    RequerimientosFd updateRequerimientosFd(RequerimientosFd requerimientosFd);
    int deleteRequerimientosFd(RequerimientosFd requerimientosFd);
    List<RequerimientosFd> listRequerimientosFd();
    
    RequerimientosFd findByIdRequerimiento(Long idRequerimiento);
}