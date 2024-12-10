package tech.reliab.course.reshetova.bank.service;

import tech.reliab.course.reshetova.bank.entity.CreditAccount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface CreditAccountService {
    // создание кредитного счета
    public CreditAccount createCreditAccount(int idUser, int idBank, LocalDate loanStartDate, LocalDate loanEndDate,
                                             int creditAmount, int idEmployee, int idPaymentAccount);

    // добавляет кредитный счет в список клиента, которому принадлежит
    public void addCreditAccount( int idUser, int idCreditAccount);

    // возвращает количество месяцев между началом и концом кредита
    public long getMonthsBetween(LocalDate startDate, LocalDate endDate);

    // возвращает месячный платеж
    public double calculateMonthlyPayment(long creditAmount, int interestRate, long loanLongInMonths);

    // удаляет кредитный счет
    public void deleteCreditAccount(int index);

}