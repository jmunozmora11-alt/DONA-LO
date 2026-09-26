package co.donalo_lo.api.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "n_donacion")
public class NDonacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_donacion")
    private Long idDonacion;

    @Column(name = "id_articulo")
    private Long idArticulo;

    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "id_fundacion")
    private Long idFundacion;

    @Column(name = "fecha_donacion")
    private LocalDate fechaDonacion;

    public NDonacion() {}

    public Long getIdDonacion() { return idDonacion; }
    public void setIdDonacion(Long idDonacion) { this.idDonacion = idDonacion; }

    public Long getIdArticulo() { return idArticulo; }
    public void setIdArticulo(Long idArticulo) { this.idArticulo = idArticulo; }

    public Long getIdUser() { return idUser; }
    public void setIdUser(Long idUser) { this.idUser = idUser; }

    public Long getIdFundacion() { return idFundacion; }
    public void setIdFundacion(Long idFundacion) { this.idFundacion = idFundacion; }

    public LocalDate getFechaDonacion() { return fechaDonacion; }
    public void setFechaDonacion(LocalDate fechaDonacion) { this.fechaDonacion = fechaDonacion; }
}