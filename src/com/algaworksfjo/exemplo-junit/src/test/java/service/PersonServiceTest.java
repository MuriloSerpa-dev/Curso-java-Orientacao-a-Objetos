package service;

import dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("IS person should be not adult when age is lower than 18:")
    void isAdult_returnFalse_quando_menorQue_18Anos() {
        Person person = new Person(15);
        PersonService personService = new PersonService();

        assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("O metodo deve retornar verdadeiro se idade for maior que 18:")
    void isAdultFor_returns_true_with_ageGreater_Than18() {
        Person person = new Person(18);
        PersonService personService = new PersonService();

        assertTrue(personService.isAdult(adult));
    }
}