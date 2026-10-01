package co.donalo_lo.api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Long idUsuario;

	@Column(name="email")
	private String email;
	
	

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;
	
	@Column(name="password")
	private String password;
	
	@Column(name="rol")
	private String rol;

	//bi-directional many-to-one association to PerfilDonador
	@OneToMany(mappedBy="usuario")
	private List<PerfilDonador> perfilDonadors;

	public Usuario() {
	}

	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return this.email;
	}

	


	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<PerfilDonador> getPerfilDonadors() {
		return this.perfilDonadors;
	}

	public void setPerfilDonadors(List<PerfilDonador> perfilDonadors) {
		this.perfilDonadors = perfilDonadors;
	}

	public PerfilDonador addPerfilDonador(PerfilDonador perfilDonador) {
		getPerfilDonadors().add(perfilDonador);
		perfilDonador.setUsuario(this);

		return perfilDonador;
	}

	public PerfilDonador removePerfilDonador(PerfilDonador perfilDonador) {
		getPerfilDonadors().remove(perfilDonador);
		perfilDonador.setUsuario(null);

		return perfilDonador;
	}

}