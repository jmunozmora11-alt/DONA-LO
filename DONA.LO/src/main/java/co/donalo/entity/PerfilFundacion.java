package co.donalo.entity;

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
	
	@Column(name="address")
	private String address;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="horarios")
	private String horarios;
	

	@Column(name="id_user")
	private Long idUser;

	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private String phone;

	@Column(name="tipo_servicio")
	private String tipoServicio;

	//bi-directional one-to-one association to RequerimientosFd
	@OneToOne
@JoinColumn(name="id_fundacion", referencedColumnName="id_fundacion")
	private RequerimientosFd requerimientosFd;

	public Long getIdFundacion() {
		return idFundacion;
	}

	public void setIdFundacion(Long idFundacion) {
		this.idFundacion = idFundacion;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
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

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public RequerimientosFd getRequerimientosFd() {
		return requerimientosFd;
	}

	public void setRequerimientosFd(RequerimientosFd requerimientosFd) {
		this.requerimientosFd = requerimientosFd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}