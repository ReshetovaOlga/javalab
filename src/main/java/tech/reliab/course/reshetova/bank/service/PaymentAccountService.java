package tech.reliab.course.reshetova.bank.service;

import tech.reliab.course.reshetova.bank.entity.PaymentAccount;


public interface PaymentAccountService {
    // создает платежный счет
    public PaymentAccount createPaymentAccount(int idUser, int idBank);

    // создает платежный счет
    public PaymentAccount createPaymentAccount(int idUser, int idBank, int sum);

    // добавляет платежный счет в список клиента, которому принадлежит
    public void addPaymentAccountToUser( int idUser, int idPaymentAccount);

    // удаляет платежный счет
    public void deletePaymentAccount(int index);
}