package pl.sda.clinic;

import org.springframework.data.repository.CrudRepository;
import pl.sda.clinic.model.Patient;

public interface PatientJpaRepository extends CrudRepository<Patient, Long> {

    Patient findByLogin(String login);

    Boolean deleteByLogin(String login);
}
