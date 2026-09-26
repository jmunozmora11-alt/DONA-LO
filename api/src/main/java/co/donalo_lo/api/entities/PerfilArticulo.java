package co.donalo_lo.api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "perfil_articulo")
public class PerfilArticulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Long idArticulo;

    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "id_categoria")
    private Long idCategoria;

    @Column(name = "titulo", length = 100)
    private String titulo;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "estado", length = 30)
    private String estado;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "talla", length = 20)
    private String talla;

    @Column(name = "material", length = 50)
    private String material;

    @Column(name = "color", length = 30)
    private String color;

    @Column(name = "dimension", length = 50)
    private String dimension;

    @Column(name = "disponibilidad")
    private Boolean disponibilidad;

    public PerfilArticulo() {}

    public Long getIdArticulo() { return idArticulo; }
    public void setIdArticulo(Long idArticulo) { this.idArticulo = idArticulo; }

    public Long getIdUser() { return idUser; }
    public void setIdUser(Long idUser) { this.idUser = idUser; }

    public Long getIdCategoria() { return idCategoria; }
    public void setIdCategoria(Long idCategoria) { this.idCategoria = idCategoria; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getDimension() { return dimension; }
    public void setDimension(String dimension) { this.dimension = dimension; }

    public Boolean getDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(Boolean disponibilidad) { this.disponibilidad = disponibilidad; }

	public Object getNombre() {
		
		return null;
	}

	public void setNombre(Object nombre) {
		
	}
}