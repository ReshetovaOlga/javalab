package tech.reliab.course.reshetova.bank.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString

//банк
public class Bank {
    private int id;
    private String name;
    private int numberOfOffice = 0;// Кол-во офисов (заполняется и считается автоматически при добавление нового офиса), по умолчанию 0
    private int numberOfBankAtm = 0;// Кол-во банкоматов (заполняется и считается автоматически при добавлении нового банкомата), по умолчанию 0
    private int numberOfEmployee = 0;// Кол-во сотрудников (заполняется и считается автоматически при добавлении нового сотрудника), по умолчанию 0
    private int numberOfUser = 0;// Кол-во клиентов (заполняется и считается автоматически при добавлении нового клиента в банк), по умолчанию 0
    private int rating;// Рейтинг банка (генерируется рандомно, от 0 до 100, где 100 наивысший балл, чем выше рейтинг банка, тем меньше должна быть процентная ставка)
    private int allMoney;// Всего денег в банке (генерируется рандомно, но не более 1 000 000)
    private int interestRate;// Процентная ставка (генерируется рандомно, но не более 20%, однако нужно учитывать рейтинг банка, чем он выше, тем ставка должна сгенерироваться меньше)


    /*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfOffice() {
        return numberOfOffice;
    }

    public void setNumberOfOffice(int numberOfOffice) {
        this.numberOfOffice = numberOfOffice;
    }

    public int getNumberOfBankAtm() {
        return numberOfBankAtm;
    }

    public void setNumberOfBankAtm(int numberOfBankAtm) {
        this.numberOfBankAtm = numberOfBankAtm;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberOfUser() {
        return numberOfUser;
    }

    public void setNumberOfUser(int numberOfUser) {
        this.numberOfUser = numberOfUser;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }*/
}