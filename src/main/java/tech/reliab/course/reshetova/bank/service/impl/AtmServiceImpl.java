package tech.reliab.course.reshetova.bank.service.impl;

import tech.reliab.course.reshetova.bank.entity.Bank;
import tech.reliab.course.reshetova.bank.entity.BankAtm;
import tech.reliab.course.reshetova.bank.entity.BankOffice;
import tech.reliab.course.reshetova.bank.service.AtmService;

import java.util.Random;

public class AtmServiceImpl implements AtmService {
    BankServiceImpl bankService;
    BankOfficeServiceImpl officeService;

    public AtmServiceImpl(BankServiceImpl bankService, BankOfficeServiceImpl officeService) {
        this.bankService = bankService;
        this.officeService = officeService;
    }


    @Override
    public BankAtm createAtm(String name, String workStatus, int idBank, int idOffice, int idEmployee,
                             boolean isDispensingCash, boolean canDepositAllowed, int atmMaintenanceCost) {
        BankAtm atm = new BankAtm();
        atm.setId(bankService.atms.size());
        bankService.atms.add(atm);
        Bank bank = bankService.givesBankById(idBank);
        bankService.addATM(bank);
        BankOffice office = bankService.givesOfficeById(idOffice);
        officeService.addAtm(office);

        atm.setName(name);
        atm.setAddress(office.getAddress());
        atm.setWorkStatus(workStatus);
        atm.setIdBank(idBank);
        atm.setIdEmployee(idEmployee);
        atm.setDispensingCash(isDispensingCash);
        atm.setCanDepositAllowed(canDepositAllowed);
        atm.setAllMoney(givesAllMoney(bank.getAllMoney()));
        atm.setAtmMaintenanceCost(atmMaintenanceCost);

        return atm;
    }

    @Override
    public void deleteAtm(int index) {
        bankService.atms.remove(index);
    }

    @Override
    public int givesAllMoney(int moneyInBank) {
        return new Random().nextInt(moneyInBank);
    }
}