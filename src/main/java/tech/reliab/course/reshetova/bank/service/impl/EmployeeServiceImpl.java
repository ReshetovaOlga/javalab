package tech.reliab.course.reshetova.bank.service.impl;

import tech.reliab.course.reshetova.bank.entity.Bank;
import tech.reliab.course.reshetova.bank.entity.Employee;
import tech.reliab.course.reshetova.bank.service.EmployeeService;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    BankServiceImpl bankService;

    public EmployeeServiceImpl(BankServiceImpl bankService) {
        this.bankService = bankService;
    }

    @Override
    public Employee createEmployee(String fullName, String dateOfBirth, String position, int idBank,
                                   boolean isOfficeJob, int idBankOffice, boolean canGiveLoan, int salaryAmount) {
        Employee employee = new Employee();
        employee.setId(bankService.employees.size());
        bankService.employees.add(employee);
        Bank bank = bankService.givesBankById(idBank);
        bankService.addEmployee(bank);

        employee.setFullName(fullName);
        employee.setDateOfBirth(dateOfBirth);
        employee.setPosition(position);
        employee.setIdBank(idBank);
        employee.setOfficeJob(isOfficeJob);
        employee.setIdBankOffice(idBankOffice);
        employee.setCanGiveLoan(canGiveLoan);
        employee.setSalaryAmount(salaryAmount);
        return employee;
    }

    public void deleteEmployee(int index) {
        bankService.employees.remove(index);
    }
}