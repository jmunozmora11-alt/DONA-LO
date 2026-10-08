package co.donalo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.donalo.entity.PerfilDonador;
import co.donalo.service.PerfilDonadorServiceI;

@RestController
@RequestMapping(value = "api/perfil-donador")
public class PerfilDonadorController {
    
    @Autowired
    PerfilDonadorServiceI service;
    
    
    @GetMapping(value = "/listar")
    public List<PerfilDonador> getAll(){
        return service.listPerfilDonador();
    }
    
   
    @GetMapping(value = "/id/{id}")
    public PerfilDonador getById(@PathVariable Long id){
        return service.findByIdUser(id);
    }

   
    @PostMapping(value = "/crear")
    public PerfilDonador crear(@RequestBody PerfilDonador perfil){
        return service.insertPerfilDonador(perfil);
    }

 
    @PutMapping(value = "/actualizar")
    public PerfilDonador actualizar(@RequestBody PerfilDonador perfil){
        return service.updatePerfilDonador(perfil);
    }

    
    @DeleteMapping(value = "/eliminar")
    public int eliminar(@RequestBody PerfilDonador perfil){
        return service.deletePerfilDonador(perfil);
    }
}