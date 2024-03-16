package ma.enset.gestionhospital.repository;

import ma.enset.gestionhospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
