/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author 52332
 */
@Entity
@Table(name = "alumnos")
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a"),
    @NamedQuery(name = "Alumnos.findById", query = "SELECT a FROM Alumnos a WHERE a.id = :id"),
    @NamedQuery(name = "Alumnos.findByNombre", query = "SELECT a FROM Alumnos a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumnos.findByCarrera", query = "SELECT a FROM Alumnos a WHERE a.carrera = :carrera"),
    @NamedQuery(name = "Alumnos.findByEmail", query = "SELECT a FROM Alumnos a WHERE a.email = :email"),
    @NamedQuery(name = "Alumnos.findBySemestre", query = "SELECT a FROM Alumnos a WHERE a.semestre = :semestre"),
    @NamedQuery(name = "Alumnos.findByNocontrol", query = "SELECT a FROM Alumnos a WHERE a.nocontrol = :nocontrol"),
    @NamedQuery(name = "Alumnos.findByTurno", query = "SELECT a FROM Alumnos a WHERE a.turno = :turno"),
    @NamedQuery(name = "Alumnos.findByLugardeprocedencia", query = "SELECT a FROM Alumnos a WHERE a.lugardeprocedencia = :lugardeprocedencia"),
    @NamedQuery(name = "Alumnos.findByDependencia", query = "SELECT a FROM Alumnos a WHERE a.dependencia = :dependencia"),
    @NamedQuery(name = "Alumnos.findByTitulardeladependencia", query = "SELECT a FROM Alumnos a WHERE a.titulardeladependencia = :titulardeladependencia"),
    @NamedQuery(name = "Alumnos.findByNombreypuestodeljefe", query = "SELECT a FROM Alumnos a WHERE a.nombreypuestodeljefe = :nombreypuestodeljefe"),
    @NamedQuery(name = "Alumnos.findByNumerodecontacto", query = "SELECT a FROM Alumnos a WHERE a.numerodecontacto = :numerodecontacto"),
    @NamedQuery(name = "Alumnos.findByNombredeprograma", query = "SELECT a FROM Alumnos a WHERE a.nombredeprograma = :nombredeprograma"),
    @NamedQuery(name = "Alumnos.findBySolicituddeserviciosocial", query = "SELECT a FROM Alumnos a WHERE a.solicituddeserviciosocial = :solicituddeserviciosocial"),
    @NamedQuery(name = "Alumnos.findByPlandetrabajo", query = "SELECT a FROM Alumnos a WHERE a.plandetrabajo = :plandetrabajo"),
    @NamedQuery(name = "Alumnos.findByKardex", query = "SELECT a FROM Alumnos a WHERE a.kardex = :kardex"),
    @NamedQuery(name = "Alumnos.findByCartacompromiso", query = "SELECT a FROM Alumnos a WHERE a.cartacompromiso = :cartacompromiso"),
    @NamedQuery(name = "Alumnos.findByPorcentajedecreditos", query = "SELECT a FROM Alumnos a WHERE a.porcentajedecreditos = :porcentajedecreditos")})
public class Alumnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Carrera")
    private String carrera;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Semestre")
    private String semestre;
    @Basic(optional = false)
    @Column(name = "nocontrol")
    private String nocontrol;
    @Basic(optional = false)
    @Column(name = "turno")
    private String turno;
    @Basic(optional = false)
    @Column(name = "lugardeprocedencia")
    private String lugardeprocedencia;
    @Basic(optional = false)
    @Column(name = "dependencia")
    private String dependencia;
    @Basic(optional = false)
    @Column(name = "titulardeladependencia")
    private String titulardeladependencia;
    @Basic(optional = false)
    @Column(name = "nombreypuestodeljefe")
    private String nombreypuestodeljefe;
    @Basic(optional = false)
    @Column(name = "numerodecontacto")
    private String numerodecontacto;
    @Basic(optional = false)
    @Column(name = "nombredeprograma")
    private String nombredeprograma;
    @Basic(optional = false)
    @Column(name = "solicituddeserviciosocial")
    private String solicituddeserviciosocial;
    @Basic(optional = false)
    @Column(name = "plandetrabajo")
    private String plandetrabajo;
    @Basic(optional = false)
    @Column(name = "Kardex")
    private String kardex;
    @Basic(optional = false)
    @Column(name = "cartacompromiso")
    private String cartacompromiso;
    @Basic(optional = false)
    @Column(name = "porcentajedecreditos")
    private String porcentajedecreditos;

    public Alumnos() {
    }

    public Alumnos(Integer id) {
        this.id = id;
    }

    public Alumnos(Integer id, String nombre, String carrera, String email, String semestre, String nocontrol, String turno, String lugardeprocedencia, String dependencia, String titulardeladependencia, String nombreypuestodeljefe, String numerodecontacto, String nombredeprograma, String solicituddeserviciosocial, String plandetrabajo, String kardex, String cartacompromiso, String porcentajedecreditos) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.email = email;
        this.semestre = semestre;
        this.nocontrol = nocontrol;
        this.turno = turno;
        this.lugardeprocedencia = lugardeprocedencia;
        this.dependencia = dependencia;
        this.titulardeladependencia = titulardeladependencia;
        this.nombreypuestodeljefe = nombreypuestodeljefe;
        this.numerodecontacto = numerodecontacto;
        this.nombredeprograma = nombredeprograma;
        this.solicituddeserviciosocial = solicituddeserviciosocial;
        this.plandetrabajo = plandetrabajo;
        this.kardex = kardex;
        this.cartacompromiso = cartacompromiso;
        this.porcentajedecreditos = porcentajedecreditos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getLugardeprocedencia() {
        return lugardeprocedencia;
    }

    public void setLugardeprocedencia(String lugardeprocedencia) {
        this.lugardeprocedencia = lugardeprocedencia;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getTitulardeladependencia() {
        return titulardeladependencia;
    }

    public void setTitulardeladependencia(String titulardeladependencia) {
        this.titulardeladependencia = titulardeladependencia;
    }

    public String getNombreypuestodeljefe() {
        return nombreypuestodeljefe;
    }

    public void setNombreypuestodeljefe(String nombreypuestodeljefe) {
        this.nombreypuestodeljefe = nombreypuestodeljefe;
    }

    public String getNumerodecontacto() {
        return numerodecontacto;
    }

    public void setNumerodecontacto(String numerodecontacto) {
        this.numerodecontacto = numerodecontacto;
    }

    public String getNombredeprograma() {
        return nombredeprograma;
    }

    public void setNombredeprograma(String nombredeprograma) {
        this.nombredeprograma = nombredeprograma;
    }

    public String getSolicituddeserviciosocial() {
        return solicituddeserviciosocial;
    }

    public void setSolicituddeserviciosocial(String solicituddeserviciosocial) {
        this.solicituddeserviciosocial = solicituddeserviciosocial;
    }

    public String getPlandetrabajo() {
        return plandetrabajo;
    }

    public void setPlandetrabajo(String plandetrabajo) {
        this.plandetrabajo = plandetrabajo;
    }

    public String getKardex() {
        return kardex;
    }

    public void setKardex(String kardex) {
        this.kardex = kardex;
    }

    public String getCartacompromiso() {
        return cartacompromiso;
    }

    public void setCartacompromiso(String cartacompromiso) {
        this.cartacompromiso = cartacompromiso;
    }

    public String getPorcentajedecreditos() {
        return porcentajedecreditos;
    }

    public void setPorcentajedecreditos(String porcentajedecreditos) {
        this.porcentajedecreditos = porcentajedecreditos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Alumnos[ id=" + id + " ]";
    }
    
}
