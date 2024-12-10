package tech.reliab.course.reshetova.bank.entity;

import tech.reliab.course.reshetova.bank.service.impl.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

//офисы банка
public class BankOffice {
    private int id;
    private String name;
    private String address;// Адрес банковского офиса
    private int idBank; //
    private boolean isStatusOfJob;// Статус (работает/не работает)
    private boolean canAtmPlacement;//Можно ли разместить банкомат? (да/нет)
    private int numberOfAtm;// Кол-во банкоматов в данном офисе (напрямую зависит от общего числа банкоматов у банка)
    private boolean canGetLoan;//Можно ли оформить кредит в данном офисе? (да/нет)
    private boolean canTakeMoney;//Работает ли на выдачу денег? (да/нет)
    private boolean canDepositAllowed;// Можно ли внести деньги? (да/нет)
    private int allMoney;// Кол-во денег в банковском офисе (напрямую зависит от поля «Всего денег в банке)
    private int costOfRent;//Стоимость аренды банковского офиса
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public boolean isStatusOfJob() {
        return isStatusOfJob;
    }

    public void setStatusOfJob(boolean statusOfJob) {
        isStatusOfJob = statusOfJob;
    }

    public boolean isCanAtmPlacement() {
        return canAtmPlacement;
    }

    public void setCanAtmPlacement(boolean canAtmPlacement) {
        this.canAtmPlacement = canAtmPlacement;
    }

    public int getNumberOfAtm() {
        return numberOfAtm;
    }

    public void setNumberOfAtm(int numberOfAtm) {
        this.numberOfAtm = numberOfAtm;
    }

    public boolean isCanGetLoan() {
        return canGetLoan;
    }

    public void setCanGetLoan(boolean canGetLoan) {
        this.canGetLoan = canGetLoan;
    }

    public boolean isCanTakeMoney() {
        return canTakeMoney;
    }

    public void setCanTakeMoney(boolean canTakeMoney) {
        this.canTakeMoney = canTakeMoney;
    }

    public boolean isCanDepositAllowed() {
        return canDepositAllowed;
    }

    public void setCanDepositAllowed(boolean canDepositAllowed) {
        this.canDepositAllowed = canDepositAllowed;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }

    public int getCostOfRent() {
        return costOfRent;
    }

    public void setCostOfRent(int costOfRent) {
        this.costOfRent = costOfRent;
    }*/
}