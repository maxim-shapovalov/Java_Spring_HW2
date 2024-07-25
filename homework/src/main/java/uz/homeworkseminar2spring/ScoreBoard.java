package uz.homeworkseminar2spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScoreBoard {

    private final TicketNumberGenerator ticketNumberGenerator;
    private final Cashier cashier;

    @Autowired
    public ScoreBoard(TicketNumberGenerator ticketNumberGenerator, Cashier cashier) {
        this.ticketNumberGenerator = ticketNumberGenerator;
        this.cashier = cashier;
    }




    public Ticket createNewTicket() {
        return new Ticket(ticketNumberGenerator.createNewNumber(), LocalDateTime.now(), cashier.cashierName());
    }
}
