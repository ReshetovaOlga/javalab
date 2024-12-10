package tech.reliab.course.reshetova.bank.entity;


import java.util.ArrayList;
import java.util.Arrays;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

//пользователи
public class User {
    private int id;
    private String fullName;
    private String dateOfBirth;// Дата рождения
    private String placeOfWork;// Место работы
    private int salaryAmount;// Ежемесячный доход (генерируется рандомно, но не более 10 000)
    private ArrayList<Integer> arrayOfIdBanks;// Банки, которыми он пользуется
    private ArrayList<Integer> arrayOfIdCreditAccounts = new ArrayList<>();// Кредитные счета (по умолчанию пусто)
    private ArrayList<Integer> arrayOfIdPaymentAccounts = new ArrayList<>();// Платежные счета (по умолчанию пусто)
    private int creditRatingForBank;// Кредитный рейтинг для банка (генерируется рандомно исходя из ежемесячного дохода, от меньше 1 000 – 100, от 1 000 до 2 000 – 200 и т.д. вплоть до 10 000)
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public ArrayList<Integer> getArrayOfIdBanks() {
        return arrayOfIdBanks;
    }

    public void setArrayOfIdBanks(ArrayList<Integer> arrayOfIdBanks) {
        this.arrayOfIdBanks = arrayOfIdBanks;
    }

    public ArrayList<Integer> getArrayOfIdCreditAccounts() {
        return arrayOfIdCreditAccounts;
    }

    public void setArrayOfIdCreditAccounts(ArrayList<Integer> arrayOfIdCreditAccounts) {
        this.arrayOfIdCreditAccounts = arrayOfIdCreditAccounts;
    }

    public ArrayList<Integer> getArrayOfIdPaymentAccounts() {
        return arrayOfIdPaymentAccounts;
    }

    public void setArrayOfIdPaymentAccounts(ArrayList<Integer> arrayOfIdPaymentAccounts) {
        this.arrayOfIdPaymentAccounts = arrayOfIdPaymentAccounts;
    }

    public int getCreditRatingForBank() {
        return creditRatingForBank;
    }

    public void setCreditRatingForBank(int creditRatingForBank) {
        this.creditRatingForBank = creditRatingForBank;
    }*/

    public void addIdBankInArrayBanksOfBankUser(int idBank){
        this.arrayOfIdBanks.add(idBank);
    }


}