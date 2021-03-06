package pl.sda.clinic.services;

import org.springframework.stereotype.Service;
import pl.sda.clinic.repository.patients.PatientRepository;
import pl.sda.clinic.dto.LoginForm;
import pl.sda.clinic.model.Patient;

import javax.annotation.Resource;

@Service
public class PatientService {

    @Resource(name = "patientRepository")
    private PatientRepository patientRepository;

    public Patient login(LoginForm loginForm){
    Patient patient = patientRepository.findPatientByLoginAndPassword(loginForm.getLogin(), loginForm.getPassword());
    return patient;
}


}
