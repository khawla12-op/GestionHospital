package ma.enset.gestionhospital.repository;

import ma.enset.gestionhospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    //Premiere methose pour retourner une pagination
    Page<Patient> findByNomContains(String keyword, Pageable pageable);
    //Deuxieme methode pour retourner une pagination
    @Query("select p from Patient p where p.nom like :x")
    Page<Patient> chercher(@Param("x") String keyword ,Pageable peagable);
}
