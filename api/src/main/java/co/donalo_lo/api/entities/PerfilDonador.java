package co.donalo_lo.api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the perfil_donador database table.
 * 
 */
@Entity
@Table(name="perfil_donador")
@NamedQuery(name="PerfilDonador.findAll", query="SELECT p FROM PerfilDonador p")
public class PerfilDonador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_user")
	private Long idUser;

	private String address;

	private String email;

	@Column(name="last_name")
	private String lastName;

	private String name;

	private String phone;

	private Integer puntos;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
@JoinColumn(name="id_user")
	private Usuario usuario;

	public PerfilDonador() {
	}

	public Long getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getPuntos() {
		return this.puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}