package pl.sda.clinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @Size(min = 6)
    private String login;
    @NotNull
    @Size(min = 8)
            private String password;
            @NotNull
            @Size(min = 11)
            private String PESEL;

            public Patient() {
            }

            public Patient(Long id, String firstName, String lastName, String login, String password, String PESEL) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.PESEL = PESEL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPSEL(String PESEL) {
        this.PESEL = PESEL;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName=" + firstName + '\'' +
                ", lastName=" + lastName + '\'' +
                ", login=" + login + '\'' +
                ", password=" + password + '\'' +
                ", PSEL=" + PESEL + '\'' +
                '}';
    }
}