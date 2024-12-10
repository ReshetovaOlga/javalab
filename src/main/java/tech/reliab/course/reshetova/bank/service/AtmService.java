package tech.reliab.course.reshetova.bank.service;

import tech.reliab.course.reshetova.bank.entity.BankAtm;

public interface AtmService {
    /* создание банкомата */
    public BankAtm createAtm(String name, String workStatus, int idBank, int idOffice, int idEmployee,
                             boolean isDispensingCash, boolean canDepositAllowed, int atmMaintenanceCost);

    /* удаление банкомата */
    public void deleteAtm(int index);

    /* возвращается сумму денег в банкомате в зависимости от их количества в банке*/
    public int givesAllMoney(int moneyInBank);
}