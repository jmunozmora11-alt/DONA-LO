package co.donalo_lo.api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the n_donacion database table.
 * 
 */
@Entity
@Table(name="n_donacion")
@NamedQuery(name="NDonacion.findAll", query="SELECT n FROM NDonacion n")
public class NDonacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_donacion")
	private Long idDonacion;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_donacion")
	private Date fechaDonacion;

	@Column(name="id_articulo")
	private Long idArticulo;

	@Column(name="id_fundacion")
	private Long idFundacion;

	@Column(name="id_user")
	private Long idUser;

	public NDonacion() {
	}

	public Long getIdDonacion() {
		return this.idDonacion;
	}

	public void setIdDonacion(Long idDonacion) {
		this.idDonacion = idDonacion;
	}

	public Date getFechaDonacion() {
		return this.fechaDonacion;
	}

	public void setFechaDonacion(Date fechaDonacion) {
		this.fechaDonacion = fechaDonacion;
	}

	public Long getIdArticulo() {
		return this.idArticulo;
	}

	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}

	public Long getIdFundacion() {
		return this.idFundacion;
	}

	public void setIdFundacion(Long idFundacion) {
		this.idFundacion = idFundacion;
	}

	public Long getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

}