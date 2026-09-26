package co.donalo_lo.api.controllers;

import co.donalo_lo.api.entities.Usuario;
import co.donalo_lo.api.repositories.UsuarioRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*") // 
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // 
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // 
    @PostMapping
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        usuario.setFechaCreacion(LocalDateTime.now());
        return usuarioRepository.save(usuario);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioRepository.findById(id)
                .map(usuario -> ResponseEntity.ok().body(usuario))
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
    

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetalles) {
        return usuarioRepository.findById(id)
                .map(usuarioExistente -> {
                    
                    usuarioExistente.setEmail(usuarioDetalles.getEmail());
                    usuarioExistente.setPassword(usuarioDetalles.getPassword());
                    usuarioExistente.setRol(usuarioDetalles.getRol());
                    
                   
                    Usuario usuarioActualizado = usuarioRepository.save(usuarioExistente);
                    return ResponseEntity.ok(usuarioActualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}