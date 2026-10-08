package co.donalo.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the perfil_articulo database table.
 * 
 */
@Entity
@Table(name="perfil_articulo")
@NamedQuery(name="PerfilArticulo.findAll", query="SELECT p FROM PerfilArticulo p")
public class PerfilArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_articulo")
	private Long idArticulo;
	
	@Column(name="color")
	private String color;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="dimension")
	private String dimension;

	@Column(name="disponibilidad")
	private Boolean disponibilidad;
	
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="material")
	private String material;

	@Column(name="talla")
	private String talla;
	
	
	@Column(name="titulo")
	private String titulo;

	//bi-directional one-to-one association to PerfilDonador
	@OneToOne(mappedBy="perfilArticulo")
	private PerfilDonador perfilDonador;

	//bi-directional one-to-one association to Categoria
	@OneToOne(mappedBy="perfilArticulo")
	private Categoria categoria;

	//bi-directional one-to-one association to NDonacion
	@OneToOne
@JoinColumn(name="id_articulo", referencedColumnName="id_articulo")
	private NDonacion NDonacion;

	public Long getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public PerfilDonador getPerfilDonador() {
		return perfilDonador;
	}

	public void setPerfilDonador(PerfilDonador perfilDonador) {
		this.perfilDonador = perfilDonador;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public NDonacion getNDonacion() {
		return NDonacion;
	}

	public void setNDonacion(NDonacion nDonacion) {
		NDonacion = nDonacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}