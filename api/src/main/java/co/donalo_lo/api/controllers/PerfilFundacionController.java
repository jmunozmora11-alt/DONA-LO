package co.donalo_lo.api.controllers;

import co.donalo_lo.api.entities.PerfilFundacion;
import co.donalo_lo.api.services.PerfilFundacionService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fundaciones")
@CrossOrigin(origins = "*")
public class PerfilFundacionController {

    private final PerfilFundacionService fundacionService;

    public PerfilFundacionController(PerfilFundacionService fundacionService) {
        this.fundacionService = fundacionService;
    }

   
    @GetMapping
    public List<PerfilFundacion> listarFundaciones() {
        return fundacionService.listarFundaciones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerfilFundacion> obtenerFundacionPorId(@PathVariable Long id) {
        Optional<PerfilFundacion> fundacion = fundacionService.obtenerFundacionPorId(id);
        return fundacion.map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }

    
    @PostMapping
    public PerfilFundacion crearFundacion(@RequestBody PerfilFundacion fundacion) {
        return fundacionService.guardarFundacion(fundacion);
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<PerfilFundacion> actualizarFundacion(@PathVariable Long id, @RequestBody PerfilFundacion fundacionDetalles) {
        try {
            PerfilFundacion fundacionActualizada = fundacionService.actualizarFundacion(id, fundacionDetalles);
            return ResponseEntity.ok(fundacionActualizada);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFundacion(@PathVariable Long id) {
        try {
            fundacionService.eliminarFundacion(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}