package co.donalo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the requerimientos_fd database table.
 * 
 */
@Entity
@Table(name="requerimientos_fd")
@NamedQuery(name="RequerimientosFd.findAll", query="SELECT r FROM RequerimientosFd r")
public class RequerimientosFd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_requerimiento")
	private Long idRequerimiento;

	@Column(name="cant_solicitada")
	private Integer cantSolicitada;

	@Column(name="cantidad_conseguida")
	private Integer cantidadConseguida;
	
	@Column(name="categoria")
	private Long categoria;
	
	@Column(name="color")
	private String color;
	
	@Column(name="dimension")
	private String dimension;

	@Column(name="estado")
	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_solicitud")
	private Date fechaSolicitud;

	@Column(name="talla")
	private String talla;
	
	@Column(name="tipo")
	private String tipo;

	@JsonIgnore
	@OneToOne(mappedBy="requerimientosFd")
	private PerfilFundacion perfilFundacion;

	public Long getIdRequerimiento() {
		return idRequerimiento;
	}

	public void setIdRequerimiento(Long idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}

	public Integer getCantSolicitada() {
		return cantSolicitada;
	}

	public void setCantSolicitada(Integer cantSolicitada) {
		this.cantSolicitada = cantSolicitada;
	}

	public Integer getCantidadConseguida() {
		return cantidadConseguida;
	}

	public void setCantidadConseguida(Integer cantidadConseguida) {
		this.cantidadConseguida = cantidadConseguida;
	}

	public Long getCategoria() {
		return categoria;
	}

	public void setCategoria(Long categoria) {
		this.categoria = categoria;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public PerfilFundacion getPerfilFundacion() {
		return perfilFundacion;
	}

	public void setPerfilFundacion(PerfilFundacion perfilFundacion) {
		this.perfilFundacion = perfilFundacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}