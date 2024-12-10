package tech.reliab.course.reshetova.bank.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

//сотрудники
public class Employee  {
    private int id;
    private String fullName;
    private String dateOfBirth;//Дата рождения
    private String position;// Должность
    private int idBank;// В каком банке работает
    private boolean isOfficeJob;// Работает ли в банковском офисе или удаленно? (да/нет)
    private int idBankOffice;// Банковский офис, в котором работает
    private boolean canGiveLoan;// Может ли выдавать кредиты? (да/нет)
    private int salaryAmount;// Размер зарплаты
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public boolean isOfficeJob() {
        return isOfficeJob;
    }

    public void setOfficeJob(boolean officeJob) {
        isOfficeJob = officeJob;
    }

    public int getIdBankOffice() {
        return idBankOffice;
    }

    public void setIdBankOffice(int idBankOffice) {
        this.idBankOffice = idBankOffice;
    }

    public boolean isCanGiveLoan() {
        return canGiveLoan;
    }

    public void setCanGiveLoan(boolean canGiveLoan) {
        this.canGiveLoan = canGiveLoan;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }*/
}