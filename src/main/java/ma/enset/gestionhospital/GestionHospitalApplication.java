package ma.enset.gestionhospital;
import ma.enset.gestionhospital.entities.Patient;
import ma.enset.gestionhospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GestionHospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionHospitalApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"khaoula",new Date(),false,120));
        patientRepository.save(new Patient(null,"mohamed",new Date(),true,118));
        patientRepository.save(new Patient(null,"Omaima",new Date(),false,170));

        }

    }


