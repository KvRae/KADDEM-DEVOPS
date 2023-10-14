package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.kaddem.entities.Contrat;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface ContratRepository extends CrudRepository<Contrat, Integer> {

    @Query("SELECT count(c) FROM Contrat c where ((c.archive=true) and  ((c.dateDebutContrat BETWEEN :startDate AND :endDate)) or(c.dateFinContrat BETWEEN :startDate AND :endDate))")
public Integer getnbContratsValides(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

public List<Contrat> findAll();
public Contrat findByIdContrat(Integer idContrat);
}
