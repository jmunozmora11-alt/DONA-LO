package co.donalo_lo.api.controllers;

import co.donalo_lo.api.entities.PerfilDonador;
import co.donalo_lo.api.services.PerfilDonadorService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donadores")
@CrossOrigin(origins = "*")
public class PerfilDonadorController {

    private final PerfilDonadorService donadorService;

    PerfilDonadorController(PerfilDonadorService donadorService) {
        this.donadorService = donadorService;
    }

    @GetMapping
    public List<PerfilDonador> listarDonadores() {
        return donadorService.listarDonadores();
    }

    @PostMapping
    public PerfilDonador crearDonador(@RequestBody PerfilDonador donador) {
        return donadorService.guardarDonador(donador);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<PerfilDonador> actualizarDonador(@PathVariable Long id, @RequestBody PerfilDonador donadorDetalles) {
        try {
            PerfilDonador donadorActualizado = donadorService.actualizarDonador(id, donadorDetalles);
            return ResponseEntity.ok(donadorActualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDonador(@PathVariable Long id) {
        try {
            donadorService.eliminarDonador(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
