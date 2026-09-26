package co.donalo_lo.api.controllers;

import co.donalo_lo.api.entities.PerfilArticulo;
import co.donalo_lo.api.services.PerfilArticuloService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/perfil-articulos")
@CrossOrigin(origins = "*")
public class PerfilArticuloController {

    private final PerfilArticuloService perfilArticuloService;

    public PerfilArticuloController(PerfilArticuloService perfilArticuloService) {
        this.perfilArticuloService = perfilArticuloService;
    }

 
    @GetMapping
    public List<PerfilArticulo> listarPerfilArticulos() {
        return perfilArticuloService.listarPerfilArticulos();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<PerfilArticulo> obtenerPerfilArticuloPorId(@PathVariable Long id) {
        Optional<PerfilArticulo> perfilArticulo = perfilArticuloService.obtenerPerfilArticuloPorId(id);
        return perfilArticulo.map(ResponseEntity::ok)
                             .orElse(ResponseEntity.notFound().build());
    }

    
    @PostMapping
    public PerfilArticulo crearPerfilArticulo(@RequestBody PerfilArticulo perfilArticulo) {
        return perfilArticuloService.guardarPerfilArticulo(perfilArticulo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PerfilArticulo> actualizarPerfilArticulo(@PathVariable Long id, @RequestBody PerfilArticulo perfilArticuloDetalles) {
        try {
            PerfilArticulo perfilArticuloActualizado = perfilArticuloService.actualizarPerfilArticulo(id, perfilArticuloDetalles);
            return ResponseEntity.ok(perfilArticuloActualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPerfilArticulo(@PathVariable Long id) {
        try {
            perfilArticuloService.eliminarPerfilArticulo(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}