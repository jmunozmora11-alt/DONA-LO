package co.donalo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.donalo.entity.PerfilArticulo;
import co.donalo.service.PerfilArticuloServiceI;

@RestController
@RequestMapping(value = "api/perfil-articulo")
public class PerfilArticuloController {
    
    @Autowired
    PerfilArticuloServiceI service;
    
    
    @GetMapping(value = "/listar")
    public List<PerfilArticulo> getAll(){
        return service.listPerfilArticulo();
    }
    
    
    @GetMapping(value = "/id/{id}")
    public PerfilArticulo getById(@PathVariable Long id){
        return service.findByIdArticulo(id);
    }

    
    @PostMapping(value = "/crear")
    public PerfilArticulo crear(@RequestBody PerfilArticulo perfilArticulo){
        return service.insertPerfilArticulo(perfilArticulo);
    }

    
    @PutMapping(value = "/actualizar")
    public PerfilArticulo actualizar(@RequestBody PerfilArticulo perfilArticulo){
        return service.updatePerfilArticulo(perfilArticulo);
    }

   
    @DeleteMapping(value = "/eliminar")
    public int eliminar(@RequestBody PerfilArticulo perfilArticulo){
        return service.deletePerfilArticulo(perfilArticulo);
    }
}