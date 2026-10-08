package co.donalo.entity;

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

	@Column(name="id_fundacion")
	private Long idFundacion;

	@Column(name="id_user")
	private Long idUser;

	//bi-directional one-to-one association to PerfilArticulo
	@OneToOne(mappedBy="NDonacion")
	private PerfilArticulo perfilArticulo;

	//bi-directional one-to-one association to DetallesEntrega
	@OneToOne
@JoinColumn(name="id_donacion", referencedColumnName="id_donacion")
	private DetallesEntrega detallesEntrega;

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

	public PerfilArticulo getPerfilArticulo() {
		return this.perfilArticulo;
	}

	public void setPerfilArticulo(PerfilArticulo perfilArticulo) {
		this.perfilArticulo = perfilArticulo;
	}

	public DetallesEntrega getDetallesEntrega() {
		return this.detallesEntrega;
	}

	public void setDetallesEntrega(DetallesEntrega detallesEntrega) {
		this.detallesEntrega = detallesEntrega;
	}

}