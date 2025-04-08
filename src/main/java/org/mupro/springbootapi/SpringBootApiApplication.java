package org.mupro.springbootapi;

import org.mupro.springbootapi.model.Address;
import org.mupro.springbootapi.model.Booking;
import org.mupro.springbootapi.model.Person;
import org.mupro.springbootapi.repository.BookingRepository;
import org.mupro.springbootapi.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepo, BookingRepository bookingRepo){
        return args -> {
            Address address1 = new Address("Musanze", "Muhoza", "Ruhengeri");
            Person person1 = new Person("Mugabe", "Promesse", "mugabepromesse@gmail.com", address1 );
            Booking booking1 = new Booking(2, 500000, person1);

            personRepo.save(person1);
            bookingRepo.save(booking1);
        };
    }

}

//Done with database interactions so am left with playing with service and controllers to generate apis. Bon voyage!!!!
