package co.donalo_lo.api.controllers;

import co.donalo_lo.api.entities.Categorias;
import co.donalo_lo.api.services.CategoriasService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*")
public class CategoriasController {

    private final CategoriasService categoriasService;

    public CategoriasController(CategoriasService categoriasService) {
        this.categoriasService = categoriasService;
    }

   
    @GetMapping
    public List<Categorias> listarCategorias() {
        return categoriasService.listarCategorias();
    }

   
    @GetMapping("/{id}")
    public ResponseEntity<Categorias> obtenerCategoriaPorId(@PathVariable Long id) {
        Optional<Categorias> categoria = categoriasService.obtenerCategoriaPorId(id);
        return categoria.map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }

  
    @PostMapping
    public Categorias crearCategoria(@RequestBody Categorias categoria) {
        return categoriasService.guardarCategoria(categoria);
    }

   
    @PutMapping("/{id}")
    public ResponseEntity<Categorias> actualizarCategoria(@PathVariable Long id, @RequestBody Categorias categoriaDetalles) {
        try {
            Categorias categoriaActualizada = categoriasService.actualizarCategoria(id, categoriaDetalles);
            return ResponseEntity.ok(categoriaActualizada);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCategoria(@PathVariable Long id) {
        try {
            categoriasService.eliminarCategoria(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}