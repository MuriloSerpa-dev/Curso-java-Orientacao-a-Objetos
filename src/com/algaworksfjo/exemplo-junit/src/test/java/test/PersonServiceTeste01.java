package test;

import dominio.Person;


import service.PersonService;


public class PersonServiceTeste01 {
    public static void main(String[] args) {
        Person person = new Person(21);
        PersonService personService = new PersonService();
        System.out.println(("Is Adult ?'{}'" + personService.isAdult(person)));




    }
}
