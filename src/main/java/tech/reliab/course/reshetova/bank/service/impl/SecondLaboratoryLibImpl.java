package tech.reliab.course.reshetova.bank.service.impl;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.reshetova.bank.entity.Bank;
import tech.reliab.course.reshetova.bank.service.SecondLaboratoryLib;
import tech.reliab.course.reshetova.bank.service.impl.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

@Setter
@Getter

public class SecondLaboratoryLibImpl implements SecondLaboratoryLib {
    private BankServiceImpl bankService = new BankServiceImpl();
    private BankOfficeServiceImpl officeService = new BankOfficeServiceImpl(bankService);
    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl(bankService);
    private AtmServiceImpl atmService = new AtmServiceImpl(bankService, officeService);
    private UserServiceImpl userService = new UserServiceImpl(bankService);
    private PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl(bankService, userService);
    private CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl(bankService, userService);


    @Override
    public void createBanks(int n){
        for (int i=0; i < n; i++){
            bankService.createBank("bank" + i);
        }
    }

    @Override
    public void createOffices(int nOff){
        if (bankService.getCountOffices()==0){
            System.out.println("ОШИБКА. НЕТ БАНКОВ, ЗНАЧИТ НЕТ ОФИСОВ");
        }
        else {
            for (int i = 0; i < bankService.getCountBanks(); i++)
                for (int j = 0; j < nOff; j++) {
                    officeService.createOffice("офис" + i + "-" + j, "адрес" + j, j % i, true, true, true, true, true, 10000 + 1000 * i + 100 * j);
                }
        }
    }

    @Override
    public int getRandomEmployee(ArrayList<Integer> idEmployees){
        var random = new Random();
        return idEmployees.get(random.nextInt(idEmployees.size()));
    }

    @Override
    public void createAtms(int n){
        if (bankService.getCountOffices()==0){
            System.out.println("ОШИБКА. НЕТ ОФИСОВ, ЗНАЧИТ НЕТ БАНКОМАТОВ");
        }
        else {
            for (var office:bankService.getOffices()){
                int idBank = office.getIdBank();
                int idOffice = office.getId();
                ArrayList<Integer> idEmployees = bankService.getIdEmployeeInOffice(idBank);
                for (int i = 0; i < n; i++) {
                    int idEmployee = getRandomEmployee(idEmployees);
                    atmService.createAtm("Банкомат "+idBank+idEmployee, "РАБОТАЕТ", idBank, idOffice, idEmployee, true,
                            true, 100+100*i+10*i*2);
                }
            }

        }
    }

    @Override
    public void createCredits(int n){
        if (bankService.getCountUsers()==0){
            System.out.println("ОШИБКА. НЕТ ПОЛЬЗОВАТЕЛЕЙ, ЗНАЧИТ НЕТ СЧЕТОВ");
        }
        else {

        }
    }

    @Override
    public void createEmployees(int n){


    }

    @Override
    public void createPaymentAccounts(int n){
        if (bankService.getCountUsers()==0){
            System.out.println("ОШИБКА. НЕТ ПОЛЬЗОВАТЕЛЕЙ, ЗНАЧИТ НЕТ СЧЕТОВ");
        }
        else {

        }
    }

    @Override
    public void createUsers(int n){
        for (var bank : bankService.getBanks()) {
            int idBank = bank.getId();
            ArrayList<Integer> arrayIdBank = new ArrayList<>();
            arrayIdBank.add(idBank);
            for (int i = 0; i < n; i++)
                userService.createUser("ФИО"+i+bank.getId(), "01-01-1999", "Должность"+i, arrayIdBank);
        }
    }


    @Override
    public void toStringAll(){
        createBanks(5);
        createOffices(3);
        createAtms(3);
        createEmployees(5);
        createUsers(5);
        createPaymentAccounts(2);
        createCredits(2);
        System.out.println(bankService.toStringBanksFull());

    }
}
