package tn.esprit.spring.kaddem.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(properties = "spring.config.name=application-test")
public class DepartementServiceImplTest {

    @Mock
    private DepartementRepository departementRepository;

    @InjectMocks
    private DepartementServiceImpl departementService;
    @Test
    public void testRetrieveAllDepartements() {
        // Arrange
        List<Departement> departements = Arrays.asList(new Departement(), new Departement());
        when(departementRepository.findAll()).thenReturn(departements);

        // Act
        List<Departement> result = departementService.retrieveAllDepartements();

        // Assert
        assertEquals(2, result.size());
        verify(departementRepository, times(1)).findAll();
    }

    @Test
    public void testAddDepartement() {
        // Arrange
        Departement departement = new Departement();
        when(departementRepository.save(departement)).thenReturn(departement);

        // Act
        Departement result = departementService.addDepartement(departement);

        // Assert
        assertEquals(departement, result);
        verify(departementRepository, times(1)).save(departement);
    }

    @Test
    public void testUpdateDepartement() {
        // Arrange
        Departement departement = new Departement();
        when(departementRepository.save(departement)).thenReturn(departement);

        // Act
        Departement result = departementService.updateDepartement(departement);

        // Assert
        assertEquals(departement, result);
        verify(departementRepository, times(1)).save(departement);
    }

    @Test
    public void testRetrieveDepartement() {
        // Arrange
        Integer idDepart = 1;
        Departement departement = new Departement();
        when(departementRepository.findById(idDepart)).thenReturn(Optional.of(departement));

        // Act
        Departement result = departementService.retrieveDepartement(idDepart);

        // Assert
        assertEquals(departement, result);
        verify(departementRepository, times(1)).findById(idDepart);
    }

    @Test
    public void testDeleteDepartement() {
        // Arrange
        Integer idDepartement = 1;
        Departement departement = new Departement();
        when(departementRepository.findById(idDepartement)).thenReturn(Optional.of(departement));

        // Act
        departementService.deleteDepartement(idDepartement);

        // Assert
        verify(departementRepository, times(1)).delete(departement);
    }
}
