package tn.esprit.spring.kaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Equipe implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    //@ManyToMany(mappedBy="equipes")
    @ManyToMany(cascade =CascadeType.ALL)

    @JsonIgnore
    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;

    public Equipe() {
        // TODO Auto-generated constructor stub
    }

    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Equipe(String nomEquipe, Niveau niveau) {
        super();
        this.nomEquipe = nomEquipe;
        this.niveau = niveau;
    }

    public Equipe(Integer idEquipe, String nomEquipe, Niveau niveau) {
        super();
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
        this.niveau = niveau;
    }

    public Equipe(String nomEquipe, Niveau niveau, Set<Etudiant> etudiants, DetailEquipe detailEquipe) {
        this.nomEquipe = nomEquipe;
        this.niveau = niveau;
        this.etudiants = etudiants;
        this.detailEquipe = detailEquipe;
    }

    public Equipe(Integer idEquipe, String nomEquipe, Niveau niveau, Set<Etudiant> etudiants, DetailEquipe detailEquipe) {
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
        this.niveau = niveau;
        this.etudiants = etudiants;
        this.detailEquipe = detailEquipe;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public DetailEquipe getDetailEquipe() {
        return detailEquipe;
    }

    public void setDetailEquipe(DetailEquipe detailEquipe) {
        this.detailEquipe = detailEquipe;
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }
    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }
    public String getNomEquipe() {
        return nomEquipe;
    }
    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }
    public Niveau getNiveau() {
        return niveau;
    }
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

}
