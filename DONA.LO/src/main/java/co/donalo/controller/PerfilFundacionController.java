package co.donalo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.donalo.entity.PerfilFundacion;
import co.donalo.service.PerfilFundacionServiceI;

@RestController
@RequestMapping(value = "api/perfil-fundacion")
public class PerfilFundacionController {
    
    @Autowired
    PerfilFundacionServiceI service;
    
 
    @GetMapping(value = "/listar")
    public List<PerfilFundacion> getAll(){
        return service.listPerfilFundacion();
    }
    
   
    @GetMapping(value = "/id/{id}")
    public PerfilFundacion getById(@PathVariable Long id){
        return service.findByIdFundacion(id);
    }

   
    @PostMapping(value = "/crear")
    public PerfilFundacion crear(@RequestBody PerfilFundacion perfilFundacion){
        return service.insertPerfilFundacion(perfilFundacion);
    }

    
    @PutMapping(value = "/actualizar")
    public PerfilFundacion actualizar(@RequestBody PerfilFundacion perfilFundacion){
        return service.updatePerfilFundacion(perfilFundacion);
    }

   
    @DeleteMapping(value = "/eliminar")
    public int eliminar(@RequestBody PerfilFundacion perfilFundacion){
        return service.deletePerfilFundacion(perfilFundacion);
    }
}