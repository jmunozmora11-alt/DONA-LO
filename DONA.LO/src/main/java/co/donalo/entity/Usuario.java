package co.donalo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long idUsuario;

	@Column(name = "email")
	private String email;

	@Column(name = "fecha_creacion")
	private Timestamp fechaCreacion;

	@Column(name = "password")
	private String password;

	@Column(name = "rol")
	private String rol;

	@JsonIgnore
    @OneToOne(mappedBy="usuario", cascade=CascadeType.ALL)
    private PerfilDonador perfilDonador;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
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

	public PerfilDonador getPerfilDonador() {
		return perfilDonador;
	}

	public void setPerfilDonador(PerfilDonador perfilDonador) {
		this.perfilDonador = perfilDonador;
	}
}