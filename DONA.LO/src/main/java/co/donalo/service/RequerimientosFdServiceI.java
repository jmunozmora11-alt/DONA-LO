package co.donalo.service;

import java.util.List;
import co.donalo.entity.RequerimientosFd;

public interface RequerimientosFdServiceI {
    RequerimientosFd insertRequerimientosFd(RequerimientosFd requerimientosFd);
    RequerimientosFd updateRequerimientosFd(RequerimientosFd requerimientosFd);
    int deleteRequerimientosFd(RequerimientosFd requerimientosFd);
    List<RequerimientosFd> listRequerimientosFd();
    
    RequerimientosFd findByIdRequerimiento(Long idRequerimiento);
}