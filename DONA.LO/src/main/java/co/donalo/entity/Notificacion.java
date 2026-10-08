package co.donalo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the notificacion database table.
 * 
 */
@Entity
@NamedQuery(name="Notificacion.findAll", query="SELECT n FROM Notificacion n")
public class Notificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_notificacion")
	private Long idNotificacion;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;
	
	@Column(name="leido")
	private Boolean leido;
		
	@Column(name="mensaje")
	private String mensaje;

	//bi-directional one-to-one association to PerfilDonador
	@OneToOne(mappedBy="notificacion")
	private PerfilDonador perfilDonador;

	public Long getIdNotificacion() {
		return idNotificacion;
	}

	public void setIdNotificacion(Long idNotificacion) {
		this.idNotificacion = idNotificacion;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Boolean getLeido() {
		return leido;
	}

	public void setLeido(Boolean leido) {
		this.leido = leido;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public PerfilDonador getPerfilDonador() {
		return perfilDonador;
	}

	public void setPerfilDonador(PerfilDonador perfilDonador) {
		this.perfilDonador = perfilDonador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}