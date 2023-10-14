package tn.esprit.spring.kaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Departement implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idDepart;
    private String nomDepart;
    @OneToMany(mappedBy="departement")
    @JsonIgnore
    private Set<Etudiant> etudiants;
    public Departement() {
        // TODO Auto-generated constructor stub
    }

    public Departement(String nomDepart) {
        super();
        this.nomDepart = nomDepart;
    }

    public Departement(Integer idDepart, String nomDepart) {
        super();
        this.idDepart = idDepart;
        this.nomDepart = nomDepart;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Integer getIdDepart() {
        return idDepart;
    }
    public void setIdDepart(Integer idDepart) {
        this.idDepart = idDepart;
    }
    public String getNomDepart() {
        return nomDepart;
    }
    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }

}
