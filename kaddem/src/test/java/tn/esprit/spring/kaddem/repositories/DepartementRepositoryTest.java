package tn.esprit.spring.kaddem.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.kaddem.entities.Departement;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
 class DepartementRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private DepartementRepository departementRepository;

    @Test
     void testSaveAndFindById() {
        // Create a sample Departement entity
        Departement departement = new Departement("Sample Department");

        // Save the entity to the in-memory database
        entityManager.persistAndFlush(departement);

        // Retrieve the entity from the repository
        Departement foundDepartement = departementRepository.findById(departement.getIdDepart()).orElse(null);

        // Assert that the retrieved entity is not null
        assertNotNull(foundDepartement);

        // Assert that the name matches the original
        assertEquals(departement.getNomDepart(), foundDepartement.getNomDepart());
    }
}
