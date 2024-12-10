package tech.reliab.course.reshetova.bank.service.impl;

import tech.reliab.course.reshetova.bank.entity.Bank;
import tech.reliab.course.reshetova.bank.entity.User;
import tech.reliab.course.reshetova.bank.service.UserService;

import java.util.ArrayList;
import java.util.Random;

public class UserServiceImpl implements UserService {
    BankServiceImpl bankService;

    public UserServiceImpl(BankServiceImpl bankService) {
        this.bankService = bankService;
    }

    @Override
    public User createUser(String fullName, String dateOfBirth, String placeOfWork, ArrayList<Integer> arrayOfIdBanks) {
        User user = new User();
        user.setId(bankService.users.size());
        bankService.users.add(user);

        user.setFullName(fullName);
        user.setDateOfBirth(dateOfBirth);
        user.setPlaceOfWork(placeOfWork);
        int salaryAmount = givesRandomSalaryAmount();
        user.setSalaryAmount(salaryAmount);
        user.setArrayOfIdBanks(arrayOfIdBanks);
        addUserToBanks(arrayOfIdBanks);
        user.setCreditRatingForBank(givesRandomRating(salaryAmount));
        return user;
    }

    @Override
    public int givesRandomSalaryAmount() {
        return new Random().nextInt(MAX_SALARY_AMOUNT + 1);
    }


    @Override
    public int givesRandomRating(int salaryAmount) {
        int rating = salaryAmount / 1000;
        if (salaryAmount % 1000 != 0)
            rating++;
        return rating * 100;
    }

    @Override
    public void addUserToBanks(ArrayList<Integer> arrayOfIdBanks) {
        for (int idBank : arrayOfIdBanks) {
            Bank bank = bankService.givesBankById(idBank);
            bankService.addUser(bank);
        }
    }

    public void addBankOfListUser(User user, int idBank){
        user.addIdBankInArrayBanksOfBankUser(idBank);
        Bank bank = bankService.givesBankById(idBank);
        bankService.addUser(bank);
    }

    public void addUser(Bank bank) {
        bank.setNumberOfUser(bank.getNumberOfUser() + 1);
    }

    @Override
    public void addPaymentAccount(User user, int idPaymentAccount){
        ArrayList<Integer> newAccount=user.getArrayOfIdPaymentAccounts();
        newAccount.add(idPaymentAccount);
        user.setArrayOfIdPaymentAccounts(newAccount);
    }

    @Override
    public void addCreditAccount(User user, int idCreditAccount){
        ArrayList<Integer> newAccount=user.getArrayOfIdCreditAccounts();
        newAccount.add(idCreditAccount);
        user.setArrayOfIdCreditAccounts(newAccount);
    }


}