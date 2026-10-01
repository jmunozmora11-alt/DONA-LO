package co.donalo_lo.api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the perfil_fundacion database table.
 * 
 */
@Entity
@Table(name="perfil_fundacion")
@NamedQuery(name="PerfilFundacion.findAll", query="SELECT p FROM PerfilFundacion p")
public class PerfilFundacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_fundacion")
	private Long idFundacion;

	private String address;

	private String descripcion;

	private String email;

	private String horarios;

	@Column(name="id_user")
	private Long idUser;

	private String name;

	private String phone;

	@Column(name="tipo_servicio")
	private String tipoServicio;

	public PerfilFundacion() {
	}

	public Long getIdFundacion() {
		return this.idFundacion;
	}

	public void setIdFundacion(Long idFundacion) {
		this.idFundacion = idFundacion;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHorarios() {
		return this.horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public Long getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
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

	public String getTipoServicio() {
		return this.tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

}