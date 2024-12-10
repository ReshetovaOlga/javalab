package tech.reliab.course.reshetova.bank.service;

import tech.reliab.course.reshetova.bank.entity.Bank;
import tech.reliab.course.reshetova.bank.entity.Employee;
import tech.reliab.course.reshetova.bank.service.impl.BankServiceImpl;

public interface EmployeeService {
    // создание сотрудника
    public Employee createEmployee(String fullName, String dateOfBirth, String position, int idBank,
                                   boolean isOfficeJob, int idBankOffice, boolean canGiveLoan, int salaryAmount);

    // удаление сотрудника
    public void deleteEmployee(int index);

}