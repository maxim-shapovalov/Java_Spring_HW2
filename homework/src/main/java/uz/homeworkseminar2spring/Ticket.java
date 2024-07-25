package uz.homeworkseminar2spring;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

public class Ticket {
    private String number;
    private LocalDateTime createDate;
    private String nameCashier;

    public Ticket(String number, LocalDateTime createDate,String nameCashier) {
        this.number = number;
        this.createDate = createDate;
        this.nameCashier = nameCashier;
    }

    public String getNumber() {
        return number;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public String getNameCashier() {
        return nameCashier;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createDate=" + createDate +
                ", nameCashier='" + nameCashier + '\'' +
                '}';
    }
}
