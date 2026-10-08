package co.donalo.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "perfil_donador")
@NamedQuery(name = "PerfilDonador.findAll", query = "SELECT p FROM PerfilDonador p")
public class PerfilDonador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long idUser;

	@Column(name = "address")
	private String address;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private String phone;

	@Column(name = "puntos")
	private Integer puntos;

	
	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;


	@OneToOne
	@JoinColumn(name = "id_articulo")
	private PerfilArticulo perfilArticulo;

	@OneToOne
	@JoinColumn(name = "id_notificacion")
	private Notificacion notificacion;



	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PerfilArticulo getPerfilArticulo() {
		return perfilArticulo;
	}

	public void setPerfilArticulo(PerfilArticulo perfilArticulo) {
		this.perfilArticulo = perfilArticulo;
	}

	public Notificacion getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}