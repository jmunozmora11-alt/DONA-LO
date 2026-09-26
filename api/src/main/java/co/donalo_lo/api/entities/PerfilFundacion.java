package co.donalo_lo.api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "perfil_fundacion")
public class PerfilFundacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fundacion")
    private Long idFundacion;

    @Column(name = "id_user") 
    private Long idUser;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "tipo_servicio", length = 100)
    private String tipoServicio;

    @Column(name = "horarios", length = 100)
    private String horarios;

    
    public PerfilFundacion() {}

   
    public Long getIdFundacion() {
        return idFundacion;
    }

    public void setIdFundacion(Long idFundacion) {
        this.idFundacion = idFundacion;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
}