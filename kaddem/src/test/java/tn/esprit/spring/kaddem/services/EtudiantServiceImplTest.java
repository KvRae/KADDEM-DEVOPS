package tn.esprit.spring.kaddem.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.repositories.EtudiantRepository;

import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;

import tn.esprit.spring.kaddem.entities.Equipe;
import tn.esprit.spring.kaddem.repositories.EquipeRepository;

import tn.esprit.spring.kaddem.entities.Contrat;
import tn.esprit.spring.kaddem.repositories.ContratRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class EtudiantServiceImplTest {

    @Mock
    private EtudiantRepository etudiantRepository;

    @Mock
    private ContratRepository contratRepository;

    @Mock
    private EquipeRepository equipeRepository;

    @Mock
    private DepartementRepository departementRepository;

    @InjectMocks
    private EtudiantServiceImpl etudiantService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRetrieveAllEtudiants() {
        // Mocking data
        List<Etudiant> etudiants = new ArrayList<>();
        when(etudiantRepository.findAll()).thenReturn(etudiants);

        // Test
        List<Etudiant> result = etudiantService.retrieveAllEtudiants();

        // Verify
        assertEquals(etudiants, result);
        verify(etudiantRepository, times(1)).findAll();
    }

    @Test
    void testAddEtudiant() {
        // Mocking data
        Etudiant etudiant = new Etudiant();
        when(etudiantRepository.save(etudiant)).thenReturn(etudiant);

        // Test
        Etudiant result = etudiantService.addEtudiant(etudiant);

        // Verify
        assertEquals(etudiant, result);
        verify(etudiantRepository, times(1)).save(etudiant);
    }

    @Test
    void testUpdateEtudiant() {
        // Mocking data
        Etudiant etudiant = new Etudiant();
        when(etudiantRepository.save(etudiant)).thenReturn(etudiant);

        // Test
        Etudiant result = etudiantService.updateEtudiant(etudiant);

        // Verify
        assertEquals(etudiant, result);
        verify(etudiantRepository, times(1)).save(etudiant);
    }

    @Test
    void testRetrieveEtudiant() {
        // Mocking data
        Integer id = 1;
        Etudiant etudiant = new Etudiant();
        when(etudiantRepository.findById(id)).thenReturn(Optional.of(etudiant));

        // Test
        Etudiant result = etudiantService.retrieveEtudiant(id);

        // Verify
        assertEquals(etudiant, result);
        verify(etudiantRepository, times(1)).findById(id);
    }

    @Test
    void testRemoveEtudiant() {
        // Mocking data
        Integer id = 1;
        Etudiant etudiant = new Etudiant();
        when(etudiantRepository.findById(id)).thenReturn(Optional.of(etudiant));

        // Test
        etudiantService.removeEtudiant(id);

        // Verify
        verify(etudiantRepository, times(1)).delete(etudiant);
    }

    @Test
    void testAssignEtudiantToDepartement() {
        // Mocking data
        Integer etudiantId = 1;
        Integer departementId = 2;

        Etudiant etudiant = new Etudiant();
        when(etudiantRepository.findById(etudiantId)).thenReturn(Optional.of(etudiant));

        Departement departement = new Departement();
        when(departementRepository.findById(departementId)).thenReturn(Optional.of(departement));

        // Test
        etudiantService.assignEtudiantToDepartement(etudiantId, departementId);

        // Verify
        assertEquals(departement, etudiant.getDepartement());
        verify(etudiantRepository, times(1)).save(etudiant);
    }

    @Test
    void testAddAndAssignEtudiantToEquipeAndContract() {
        // Mocking data
        Etudiant etudiant = new Etudiant();
        Integer idContrat = 1;
        Integer idEquipe = 2;
        Contrat contrat = new Contrat();
        Equipe equipe = new Equipe();

        when(contratRepository.findById(idContrat)).thenReturn(Optional.of(contrat));
        when(equipeRepository.findById(idEquipe)).thenReturn(Optional.of(equipe));

        // Test
        Etudiant result = etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant, idContrat, idEquipe);

        // Verify
        assertEquals(etudiant, result);
        assertEquals(etudiant, contrat.getEtudiant());
        assertTrue(equipe.getEtudiants().contains(etudiant));
        verify(contratRepository, times(1)).save(contrat);
        verify(equipeRepository, times(1)).save(equipe);
    }

    @Test
    void testGetEtudiantsByDepartement() {
        // Mocking data
        Integer idDepartement = 1;
        List<Etudiant> etudiants = new ArrayList<>();
        when(etudiantRepository.findEtudiantsByDepartement_IdDepart(idDepartement)).thenReturn(etudiants);

        // Test
        List<Etudiant> result = etudiantService.getEtudiantsByDepartement(idDepartement);

        // Verify
        assertEquals(etudiants, result);
        verify(etudiantRepository, times(1)).findEtudiantsByDepartement_IdDepart(idDepartement);
    }
}
