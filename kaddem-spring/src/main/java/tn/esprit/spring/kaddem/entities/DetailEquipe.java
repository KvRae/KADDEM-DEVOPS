package tn.esprit.spring.kaddem.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class DetailEquipe implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idDetailEquipe;
    private Integer salle;
    private String thematique;
    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe;
    public DetailEquipe() {
        // TODO Auto-generated constructor stub
    }

    public DetailEquipe(Integer salle, String thematique) {
        super();
        this.salle = salle;
        this.thematique = thematique;
    }

    public DetailEquipe(Integer idDetailEquipe, Integer salle, String thematique) {
        super();
        this.idDetailEquipe = idDetailEquipe;
        this.salle = salle;
        this.thematique = thematique;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Integer getIdDetailEquipe() {
        return idDetailEquipe;
    }
    public void setIdDetailEquipe(Integer idDetailEquipe) {
        this.idDetailEquipe = idDetailEquipe;
    }
    public Integer getSalle() {
        return salle;
    }
    public void setSalle(Integer salle) {
        this.salle = salle;
    }
    public String getThematique() {
        return thematique;
    }
    public void setThematique(String thematique) {
        this.thematique = thematique;
    }

}
