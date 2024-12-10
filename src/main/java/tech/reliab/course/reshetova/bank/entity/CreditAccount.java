package tech.reliab.course.reshetova.bank.entity;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

//кредитный счет
public class CreditAccount {
    private int id;
    private int idUser;//Пользователь, за которым закреплен этот кредитный счет
    private int idBank;// Название банка, где взят кредит
    private LocalDate loanStartDate;// Дата начала кредита
    private LocalDate loanEndDate;//Дата окончания кредита
    private long loanLongInMonths;// Кол-во месяцев, на которые взят кредит
    private int creditAmount;// Сумма кредита
    private double monthlyPayment;// Ежемесячный платеж
    private int interestRate;// Процентная ставка (должна быть равной процентной ставке банка, в котором взят кредит или ниже)
    private int idEmployee;// Сотрудник, который выдал кредит
    private int idPaymentAccount;// Платежный счет в банке с которого будет осуществляться погашение данного кредита
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public LocalDate getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(LocalDate loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public LocalDate getLoanEndDate() {
        return loanEndDate;
    }

    public void setLoanEndDate(LocalDate loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    public long getLoanLongInMonths() {
        return loanLongInMonths;
    }

    public void setLoanLongInMonths(long loanLongInMonths) {
        this.loanLongInMonths = loanLongInMonths;
    }

    public int getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdPaymentAccount() {
        return idPaymentAccount;
    }

    public void setIdPaymentAccount(int idPaymentAccount) {
        this.idPaymentAccount = idPaymentAccount;
    }*/
}