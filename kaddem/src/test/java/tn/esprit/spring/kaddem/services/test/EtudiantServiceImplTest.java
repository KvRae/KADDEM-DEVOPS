package tn.esprit.spring.kaddem.services.test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.repositories.EtudiantRepository;
import tn.esprit.spring.kaddem.services.EtudiantServiceImpl;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class EtudiantServiceImplTest {

    @Mock
    private EtudiantRepository etudiantRepository;

    @InjectMocks
    private EtudiantServiceImpl etudiantService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testRetrieveAllEtudiants() {
        // Arrange
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant());
        etudiants.add(new Etudiant());
        when(etudiantRepository.findAll()).thenReturn(etudiants);

        // Act
        List<Etudiant> result = etudiantService.retrieveAllEtudiants();

        // Assert
        verify(etudiantRepository, times(1)).findAll();
        assertSame(etudiants, result);
    }

    @Test
    public void testAddEtudiant() {
        // Arrange
        Etudiant etudiant = new Etudiant();
        when(etudiantRepository.save(etudiant)).thenReturn(etudiant);

        // Act
        Etudiant result = etudiantService.addEtudiant(etudiant);

        // Assert
        verify(etudiantRepository, times(1)).save(etudiant);
        assertSame(etudiant, result);
    }

    @Test
    public void testUpdateEtudiant() {
        // Arrange
        Etudiant etudiant = new Etudiant();
        when(etudiantRepository.save(etudiant)).thenReturn(etudiant);

        // Act
        Etudiant result = etudiantService.updateEtudiant(etudiant);

        // Assert
        verify(etudiantRepository, times(1)).save(etudiant);
        assertSame(etudiant, result);
    }

    @Test
    public void testRemoveEtudiant() {
        // Arrange
        Integer etudiantId = 1;
        Etudiant etudiant = new Etudiant();
        when(etudiantRepository.findById(etudiantId)).thenReturn(java.util.Optional.of(etudiant));

        // Act
        etudiantService.removeEtudiant(etudiantId);

        // Assert
        verify(etudiantRepository, times(1)).delete(etudiant);
    }}