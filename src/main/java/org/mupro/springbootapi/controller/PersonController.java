package org.mupro.springbootapi.controller;

import org.mupro.springbootapi.model.Person;
import org.mupro.springbootapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:8095")
@RequestMapping("/mupro/api/v1")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/hello")
    public String getMessage(){
        return "Hello world !!";
    }


    @PostMapping("/person")
    public void addNewPerson(@RequestBody Person p){
        personService.addNewPerson(p);
    }

    @GetMapping("/person")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @GetMapping("/person/{id}")
    public Optional<Person> getPersonById(@PathVariable int id){
        return personService.findById(id);
    }

    @GetMapping("/person/email")
    public Optional<Person> getPersonByEmail(@RequestParam String email){
        return personService.findByEmail(email);
    }
}
