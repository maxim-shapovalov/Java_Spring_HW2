package uz.homeworkseminar2spring;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator{

    public String createNewNumber(){
        return "Ticket # " + UUID.randomUUID().toString();
    }
}
