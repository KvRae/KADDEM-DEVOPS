import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class EtudiantServiceImplTest {

    @Mock
    private EquipeRepository equipeRepository;

    @Mock
    private ContratRepository contratRepository;

    @Mock
    private DepartementRepository departementRepository;

    @Mock
    private EtudiantRepository etudiantRepository;

    @InjectMocks
    private EtudiantServiceImpl etudiantService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.open(this);
    }

    @Test
    void testRetrieveAllEtudiants() {
        // Arrange: create a mock repository. store some test data
        Mock<List<Etudiant>> mock = mock(IListService.class);
        when(equipeRepository.findAllEtudiants()).thenReturn(mock);
        // Act: call the method under test using the mocks
        List<Etudiant> result = etudiantService.retrieveAllEtudiants();
        // Assert: check if the result is the expected list
        assertEquals(mock.value(), result);
    }

    @Test
    void testAddAndAssignEtudiantToEquipeAndContract() {
        // Arrange: create mock Objects for the repository
        Mock<Departement> departement = mock(IDepartementService.class);
        mockEtudiantRepository(departement);
        Mock<Contrat> contract = mock(IContratService.class);
        mockEquipeRepository(contract);
        // Act: call the method under test
        Etudiant etudiant = etudiantService.addAndAssignEtudiantToEquipeAndContract(new Etudiant(), 5, 6);
        // Assert: check if the result is the expected
        assertEquals(etudiant, etudiantService.findById(1));
    }

    @Test
    void testRetrieveEtudiant() {
        // Arrange: create mock Objects for the repository
        Mock<Departement> departement = mock(IDepartementService.class);
        mockEtudiantRepository(departement);
        Mock<Contrat> contract = mock(IContratService.class);
        mockEquipeRepository(contract);
        // Act: call the method under test using the mock objects
        Etudiant etudiant = etudiantService.retrieveEtudiant(1);
        // Assert: check if the result is the expected
        assertEquals(etudiant, etudiantService.findById(1));
    }

    @Test
    void testRemoveEtudiant() {
        // Arrange: create mock Objects for the repository
        Mock<Departement> departement = mock(IDepartementService.class);
        mockEtudiantRepository(departement);
