package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


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
	@Column(name="id_requerimiento")
	private Long idRequerimiento;

	@Column(name="cant_solicitada")
	private Integer cantSolicitada;

	@Column(name="cantidad_conseguida")
	private Integer cantidadConseguida;

	private String categoria;

	private String color;

	private String dimension;

	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_solicitud")
	private Date fechaSolicitud;

	@Column(name="id_fundacion")
	private Long idFundacion;

	private String talla;

	private String tipo;

	public RequerimientosFd() {
	}

	public Long getIdRequerimiento() {
		return this.idRequerimiento;
	}

	public void setIdRequerimiento(Long idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}

	public Integer getCantSolicitada() {
		return this.cantSolicitada;
	}

	public void setCantSolicitada(Integer cantSolicitada) {
		this.cantSolicitada = cantSolicitada;
	}

	public Integer getCantidadConseguida() {
		return this.cantidadConseguida;
	}

	public void setCantidadConseguida(Integer cantidadConseguida) {
		this.cantidadConseguida = cantidadConseguida;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Long getIdFundacion() {
		return this.idFundacion;
	}

	public void setIdFundacion(Long idFundacion) {
		this.idFundacion = idFundacion;
	}

	public String getTalla() {
		return this.talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}