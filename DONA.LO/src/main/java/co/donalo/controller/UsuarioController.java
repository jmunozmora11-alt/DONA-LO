package co.donalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.donalo.entity.Usuario;
import co.donalo.service.UsuarioServiceI;

@RestController
@RequestMapping(value="conuse")
public class UsuarioController {
	
	@Autowired
	UsuarioServiceI service;
	
	@GetMapping(value="Usuario")
	public List<Usuario> getallUsuarios(){
		return service.listUsuario();
	}
	
	@GetMapping(value="Usuario/email/{email}")
	public Usuario getUsuarioByEmail(@PathVariable String email){
	   
	    return service.findEmail(email);
	}

	
	@GetMapping(value="Usuario/id/{id}")
	public Usuario getUsuarioById(@PathVariable Long id){
	    return service.findIdUsuario(id);
	}
	
	@PostMapping(value="Usuario/crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return service.insertUsuario(usuario);
    }
	
	@PutMapping(value="Usuario/actualizar")
    public Usuario actualizarUsuario(@RequestBody Usuario usuario){
        return service.updateUsuario(usuario);
    }
	
	@DeleteMapping(value="Usuario/eliminar")
    public int eliminarUsuario(@RequestBody Usuario usuario){
        return service.deleteUsuario(usuario);
}
	
}