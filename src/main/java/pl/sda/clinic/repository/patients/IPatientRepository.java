package pl.sda.clinic.repository.patients;

import pl.sda.clinic.model.Patient;

import java.util.List;

public interface IPatientRepository {

    //Boolean existsByLogin(String login);
    //Boolean existsByLoginIgnoreCase(String login);

    Patient createPatient(Patient patient) throws PatientAlreadyExistsException;

    Patient findPatientById(Long id) throws PatientNotFoundException;

    Patient findPatientByLogin(String login) throws PatientNotFoundException;
    Patient findPatientByLoginIgnoreCase(String login) throws PatientNotFoundException;

    Patient findPatientByLoginAndPassword(String login, String password);

    //Patient updatePatient(Patient patient) throws PatientNotFoundException;

    void deletePatient(String login) throws PatientNotFoundException;

    List<Patient> findAll();

}
