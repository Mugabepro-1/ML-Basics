package org.mupro.springbootapi.service;

import org.mupro.springbootapi.model.Person;
import org.mupro.springbootapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;
    public void addNewPerson(Person p){
        personRepository.save(p);
    }

    public List<Person> getAllPersons(){
       return personRepository.findAll();
    }

    public void deletePerson(int id){
        Person p = personRepository.getReferenceById(id);
        if(p!=null){
            personRepository.delete(p);
        }
    }

    public Optional<Person> findById(int id){
        return personRepository.findById(id);
    }
    public Optional<Person> findByEmail(String email){
        return personRepository.findByEmail(email);
    }

}
