package service;

import model.Person;

public class FilePersonService implements PersonService{//FilePersonService is PersonService
    @Override
    public void save(Person person) {
        System.out.println("speicher in Datei "+person);
    }
}
