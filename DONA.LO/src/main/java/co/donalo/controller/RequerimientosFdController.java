package co.donalo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.donalo.entity.RequerimientosFd;
import co.donalo.service.RequerimientosFdServiceI;

@RestController
@RequestMapping(value = "api/requerimientos-fd")
public class RequerimientosFdController {
    
    @Autowired
    RequerimientosFdServiceI service;
    
    
    @GetMapping(value = "/listar")
    public List<RequerimientosFd> getAll(){
        return service.listRequerimientosFd();
    }
    
   
    @GetMapping(value = "/id/{id}")
    public RequerimientosFd getById(@PathVariable Long id){
        return service.findByIdRequerimiento(id);
    }

    
    @PostMapping(value = "/crear")
    public RequerimientosFd crear(@RequestBody RequerimientosFd requerimientosFd){
        return service.insertRequerimientosFd(requerimientosFd);
    }

   
    @PutMapping(value = "/actualizar")
    public RequerimientosFd actualizar(@RequestBody RequerimientosFd requerimientosFd){
        return service.updateRequerimientosFd(requerimientosFd);
    }

   
    @DeleteMapping(value = "/eliminar")
    public int eliminar(@RequestBody RequerimientosFd requerimientosFd){
        return service.deleteRequerimientosFd(requerimientosFd);
    }
}