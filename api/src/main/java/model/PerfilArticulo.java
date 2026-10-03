package model;

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
	@Column(name="id_articulo")
	private Long idArticulo;

	private String color;

	private String descripcion;

	private String dimension;

	private Boolean disponibilidad;

	private String estado;

	@Column(name="id_categoria")
	private Long idCategoria;

	@Column(name="id_user")
	private Long idUser;

	private String imagen;

	private String material;

	private String talla;

	private String titulo;

	public PerfilArticulo() {
	}

	public Long getIdArticulo() {
		return this.idArticulo;
	}

	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Boolean getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Long getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTalla() {
		return this.talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}