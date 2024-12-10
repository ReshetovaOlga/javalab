package tech.reliab.course.reshetova.bank;

import tech.reliab.course.reshetova.bank.service.impl.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        /*ПЕРВАЯ ЛАБОРАТОРНАЯ*/
        BankServiceImpl bankService = new BankServiceImpl();
        BankOfficeServiceImpl officeService = new BankOfficeServiceImpl(bankService);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl(bankService);
        AtmServiceImpl atmService = new AtmServiceImpl(bankService, officeService);
        UserServiceImpl userService = new UserServiceImpl(bankService);
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl(bankService, userService);
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl(bankService, userService);

        //1
        ArrayList<Integer> banks = new ArrayList<Integer>();
        bankService.createBank("банк1");
        banks.add(0);
        //2
        userService.createUser("фамилия1", "01-01-2014", "место работы 1", banks);
        //3
        paymentAccountService.createPaymentAccount(0, 0);
        //4
        officeService.createOffice("офис1", "адрес", 0, true, true, true, true, true, 8000);
        //5
        atmService.createAtm("A", "работает", 0, 0, 0, true, true, 10);
        //6
        employeeService.createEmployee("фамилия_сотрудника1", "01-01-1999", "Service specialist", 0, true, 0, true, 5000);
        //7
        LocalDate d1 = LocalDate.parse("01-01-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate d2 = LocalDate.parse("01-01-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        creditAccountService.createCreditAccount(0, 0,d1, d2,1000, 0, 0);
/*
        System.out.println(bankService.toStringBanks());
        System.out.println(bankService.toStringUsers(0));
        System.out.println(bankService.toStringPaymentAccounts(0));
        System.out.println(bankService.toStringOffices(0));
        System.out.println(bankService.toStringAtms(0));
        System.out.println(bankService.toStringEmployees(0));
        System.out.println(bankService.toStringCreditAccount(0));*/

        System.out.println(bankService.toStringBanksFull());
    }
}