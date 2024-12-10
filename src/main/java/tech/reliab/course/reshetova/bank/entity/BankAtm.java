package tech.reliab.course.reshetova.bank.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

//банкомат
public class BankAtm {
    private int id;
    private String name;
    private String address;// Адрес (сопадает с адресом банковского офиса)
    private String workStatus;//Статус (работает/не работает/нет денег)
    private int idBank;// Банк, которому принадлежит банкомат
    private int idEmployee;//Обслуживающий сотрудник
    private boolean isDispensingCash;// Работает ли на выдачу денег? (да/нет)
    private boolean canDepositAllowed;// Можно ли внести деньги? (да/нет)
    private int allMoney;//Кол-во денег в банкомате (напрямую зависит от поля «Всего денег в банке)
    private int atmMaintenanceCost;//Стоимость обслуживания банкомата
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

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public boolean isDispensingCash() {
        return isDispensingCash;
    }

    public void setDispensingCash(boolean dispensingCash) {
        isDispensingCash = dispensingCash;
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

    public int getAtmMaintenanceCost() {
        return atmMaintenanceCost;
    }

    public void setAtmMaintenanceCost(int atmMaintenanceCost) {
        this.atmMaintenanceCost = atmMaintenanceCost;
    }*/
}

