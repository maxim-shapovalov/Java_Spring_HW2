package uz.homeworkseminar2spring;

import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class Cashier {
    public String cashierName(){
        return "Cashier # " + ThreadLocalRandom.current().nextInt(1,10);
    }

}
