package co.donalo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.donalo.entity.Categoria;
import co.donalo.service.CategoriaServiceI;

@RestController
@RequestMapping(value = "api/categoria")
public class CategoriaController {
    
    @Autowired
    CategoriaServiceI service;
    
    
    @GetMapping(value = "/listar")
    public List<Categoria> getAll(){
        return service.listCategoria();
    }
    
    
    @GetMapping(value = "/id/{id}")
    public Categoria getById(@PathVariable Long id){
        return service.findByIdCategoria(id);
    }

   
    @PostMapping(value = "/crear")
    public Categoria crear(@RequestBody Categoria categoria){
        return service.insertCategoria(categoria);
    }

    
    @PutMapping(value = "/actualizar")
    public Categoria actualizar(@RequestBody Categoria categoria){
        return service.updateCategoria(categoria);
    }

    
    @DeleteMapping(value = "/eliminar")
    public int eliminar(@RequestBody Categoria categoria){
        return service.deleteCategoria(categoria);
    }
}