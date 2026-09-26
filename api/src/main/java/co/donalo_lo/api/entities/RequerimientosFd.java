package co.donalo_lo.api.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "requerimientos_fd")
public class RequerimientosFd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_requerimiento")
    private Long idRequerimiento;

    @Column(name = "id_fundacion")
    private Long idFundacion;

    @Column(name = "categoria", length = 30)
    private String categoria;

    @Column(name = "talla", length = 20)
    private String talla;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "tipo", length = 30)
    private String tipo;

    @Column(name = "dimension", length = 100)
    private String dimension;

    @Column(name = "cant_solicitada")
    private Integer cantSolicitada;

    @Column(name = "cantidad_conseguida")
    private Integer cantidadConseguida;

    @Column(name = "estado", length = 30)
    private String estado;

    @Column(name = "fecha_solicitud")
    private LocalDate fechaSolicitud;

    public RequerimientosFd() {}

    // --- Getters y Setters ---
    public Long getIdRequerimiento() { return idRequerimiento; }
    public void setIdRequerimiento(Long idRequerimiento) { this.idRequerimiento = idRequerimiento; }

    public Long getIdFundacion() { return idFundacion; }
    public void setIdFundacion(Long idFundacion) { this.idFundacion = idFundacion; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDimension() { return dimension; }
    public void setDimension(String dimension) { this.dimension = dimension; }

    public Integer getCantSolicitada() { return cantSolicitada; }
    public void setCantSolicitada(Integer cantSolicitada) { this.cantSolicitada = cantSolicitada; }

    public Integer getCantidadConseguida() { return cantidadConseguida; }
    public void setCantidadConseguida(Integer cantidadConseguida) { this.cantidadConseguida = cantidadConseguida; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public LocalDate getFechaSolicitud() { return fechaSolicitud; }
    public void setFechaSolicitud(LocalDate fechaSolicitud) { this.fechaSolicitud = fechaSolicitud; }
}