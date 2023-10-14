package tn.esprit.spring.kaddem.services;

import tn.esprit.spring.kaddem.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    public List<Equipe> retrieveAllEquipes();
    public Equipe addEquipe(Equipe e);
    public  void deleteEquipe(Integer idEquipe);
    public Equipe updateEquipe(Equipe e);
    public Equipe retrieveEquipe(Integer equipeId);
    public void evoluerEquipes();
}
