package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the detalles_entrega database table.
 * 
 */
@Entity
@Table(name="detalles_entrega")
@NamedQuery(name="DetallesEntrega.findAll", query="SELECT d FROM DetallesEntrega d")
public class DetallesEntrega implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_entrega")
	private Long idEntrega;

	@Column(name="estado_entrega")
	private String estadoEntrega;

	@Column(name="fecha_actualizacion")
	private Timestamp fechaActualizacion;

	@Column(name="id_donacion")
	private Long idDonacion;

	@Column(name="metodo_entrega")
	private String metodoEntrega;

	public DetallesEntrega() {
	}

	public Long getIdEntrega() {
		return this.idEntrega;
	}

	public void setIdEntrega(Long idEntrega) {
		this.idEntrega = idEntrega;
	}

	public String getEstadoEntrega() {
		return this.estadoEntrega;
	}

	public void setEstadoEntrega(String estadoEntrega) {
		this.estadoEntrega = estadoEntrega;
	}

	public Timestamp getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Timestamp fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Long getIdDonacion() {
		return this.idDonacion;
	}

	public void setIdDonacion(Long idDonacion) {
		this.idDonacion = idDonacion;
	}

	public String getMetodoEntrega() {
		return this.metodoEntrega;
	}

	public void setMetodoEntrega(String metodoEntrega) {
		this.metodoEntrega = metodoEntrega;
	}

}