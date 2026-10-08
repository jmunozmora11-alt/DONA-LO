package co.donalo.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


/**
 * The persistent class for the categorias database table.
 * 
 */
@Entity
@Table(name="categorias")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_categoria")
	private Long idCategoria;
	
	
	@Column(name="nombre")
	private String nombre;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name="id_categoria", referencedColumnName="id_categoria")
	private PerfilArticulo perfilArticulo;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PerfilArticulo getPerfilArticulo() {
		return perfilArticulo;
	}

	public void setPerfilArticulo(PerfilArticulo perfilArticulo) {
		this.perfilArticulo = perfilArticulo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}