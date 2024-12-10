package tech.reliab.course.reshetova.bank.service.impl;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.reshetova.bank.entity.*;
import tech.reliab.course.reshetova.bank.service.BankService;

import java.util.ArrayList;
import java.util.Random;

@Setter
@Getter
public class BankServiceImpl implements BankService{

    private static final Random random = new Random();

    ArrayList<Bank> banks = new ArrayList<>();
    ArrayList<BankOffice> offices = new ArrayList<>();
    ArrayList<BankAtm> atms = new ArrayList<>();
    ArrayList<CreditAccount> creditAccounts = new ArrayList<>();
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<PaymentAccount> paymentAccounts = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    @Override
    public Bank createBank(String name) {
        Bank bank = new Bank();

        bank.setId(banks.size());
        banks.add(bank);
        bank.setName(name);
        int rating = givesRandomRating();
        bank.setRating(rating);
        bank.setAllMoney(givesRandomAllMoney());
        bank.setInterestRate(givesRandomInterestRate(rating));
        return bank;
    }

    @Override
    public void addOffice(Bank bank) {
        bank.setNumberOfOffice(bank.getNumberOfOffice() + 1);
    }

    @Override
    public void addATM(Bank bank) {
        bank.setNumberOfBankAtm(bank.getNumberOfBankAtm() + 1);
    }

    @Override
    public void addEmployee(Bank bank) {
        bank.setNumberOfEmployee(bank.getNumberOfEmployee() + 1);
    }

    @Override
    public void addUser(Bank bank) {
        bank.setNumberOfUser(bank.getNumberOfUser() + 1);
    }

    @Override
    public int givesRandomRating() {
        return new Random().nextInt(MAX_RATING + 1);
    }

    @Override
    public int givesRandomAllMoney() {
        return new Random().nextInt(MAX_ALL_MONEY + 1);
    }

    @Override
    public int givesRandomInterestRate(int rating) {
            double baseRate = random.nextDouble() * MAX_INTEREST_RATE;
            double adjustedRate = baseRate - (rating / MAX_RATING_D * baseRate);
            int rez = (int) Math.max(adjustedRate, 0);
            return rez;
    }


    @Override
    public void deleteBank(int index) {
        banks.remove(index);
    }

    //1
    @Override
    public Bank givesBankById(int id) {
        for (Bank bank : banks)
            if (bank.getId() == id)
                return bank;
        return null;
    }

    //2
    @Override
    public User givesUserById(int id) {
        for (User user : users)
            if (user.getId() == id)
                return user;
        return null;
    }

    //3
    @Override
    public BankAtm givesAtmById(int id) {
        for (BankAtm atm : atms)
            if (atm.getId() == id)
                return atm;
        return null;
    }

    //4
    @Override
    public BankOffice givesOfficeById(int id) {
        for (BankOffice office : offices)
            if (office.getId() == id)
                return office;
        return null;
    }

    //5
    @Override
    public CreditAccount givesCreditAccountById(int id) {
        for (CreditAccount creditAccount : creditAccounts)
            if (creditAccount.getId() == id)
                return creditAccount;
        return null;
    }

    //6
    @Override
    public Employee givesEmployeeById(int id) {
        for (Employee employee : employees)
            if (employee.getId() == id)
                return employee;
        return null;
    }

    //7
    @Override
    public PaymentAccount givesPaymentAccountById(int id) {
        for (PaymentAccount paymentAccount : paymentAccounts)
            if (paymentAccount.getId() == id)
                return paymentAccount;
        return null;
    }

    @Override
    public String toStringBanks() {
        String str = "Банки: {\n";
        int indexDelete = 0;
        for (Bank bank : banks) {
            str = str + "банк под индексом "+indexDelete++ +"{\n" +
                    "id : " + bank.getId() +
                    "\nназвание : " + bank.getName() +
                    "\nколичество офисов : " + bank.getNumberOfOffice() +
                    "\nколичество банкоматов : " + bank.getNumberOfBankAtm() +
                    "\nколичество сотрудников :" + bank.getNumberOfEmployee() +
                    "\nколичество клиентов : " + bank.getNumberOfUser() +
                    "\nрэйтинг : " + bank.getRating() +
                    "\nвсего денег : " + bank.getAllMoney() +
                    "\nпроцентная ставка : " + bank.getInterestRate() + "\n" +
                    "}\n";
        }
        str += "}\n----------------------------------\n";
        return str;
    }

    @Override
    public String toStringOffices(int idBank) {
        String str = "Офисы {\n";
        int indexDelete = 0;
        for (BankOffice office : offices) {
            if (office.getIdBank() == idBank) {
                str = str + "Офис под индексом "+indexDelete++ +"{" +
                        "\nid : " + office.getId() +
                        "\nназвание : " + office.getName() +
                        "\nадрес : " + office.getAddress()  +
                        "\nстатус работы : " + office.isStatusOfJob() +
                        "\nМожно ли разместить банкомат : " + office.isCanAtmPlacement() +
                        "\nКол-во банкоматов? : " + office.getNumberOfAtm() +
                        "\nМожно оформить кредит? : " + office.isCanGetLoan() +
                        "\nВыдают деньги? : " + office.isCanTakeMoney()+
                        "\nМожно внести деньги? : " + office.isCanDepositAllowed() +
                        "\nВсего денег : " + office.getAllMoney() +
                        "\ncostOfRent : " + office.getCostOfRent() +
                        "\n}\n";
            }
        }
        str += "}\n----------------------------------\n";
        return str;
    }

    @Override
    public String toStringUsers(int idBank) {
        String str = "Пользователи{\n";
        int indexDelete = 0;
        for (User user : users) {
            if (user.getArrayOfIdBanks().contains(idBank)) {
                str = str + "Пользователь под индексом "+indexDelete++ +"{" +
                        "\nid : " + user.getId() +
                        "\nФИО : " + user.getFullName() +
                        "\nДата рождения : " + user.getDateOfBirth() +
                        "\nМесто работы : " + user.getPlaceOfWork() + '\'' +
                        "\nЕжемесячный доход : " + user.getSalaryAmount() +
                        "\nИспользуемые банки : " + user.getArrayOfIdBanks() +
                        "\nКредитные счета : " + user.getArrayOfIdCreditAccounts() +
                        "\nПлатежные счета : " + user.getArrayOfIdPaymentAccounts() +
                        "\nКредитный рейтинг для банка : " + user.getCreditRatingForBank() +
                        "\n}\n";
            }
        }
        str += "}\n----------------------------------\n";
        return str;
    }

    @Override
    public String toStringEmployees(int idBank) {
        String str = "Сотрудники{\n";
        int indexDelete = 0;
        for (Employee employee : employees) {
            if (employee.getIdBank() == idBank) {
                str = str + "Сотрудник под индексом "+indexDelete++ +"{" +
                        "\nid : " + employee.getId() +
                        "\nФИО : '" + employee.getFullName() +
                        "\nДата рождения : " + employee.getDateOfBirth() +
                        "\nДолжность : " + employee.getPosition() +
                        "\nБанк работы : " + employee.getIdBank() +
                        "\nРаботает удаленно : " + employee.isOfficeJob() +
                        "\nБанковский офис, в котором работает : " + employee.getIdBankOffice() +
                        "\nМожет ли выдавать кредиты? : " + employee.isCanGiveLoan() +
                        "\nРазмер зарплаты : " + employee.getSalaryAmount() +
                        "\n}\n";
            }
        }
        str += "}\n----------------------------------\n";
        return str;
    }

    @Override
    public String toStringAtms(int idBank) {
        String str = "банкоматы {\n";
        int indexDelete = 0;
        for (BankAtm atm : atms) {
            if (atm.getIdBank() == idBank) {
                str = str + "банкомат под индексом "+indexDelete++ + "{" +
                        "\nid : " + atm.getId() +
                        "\nназвание : " + atm.getName() +
                        "\nадрес : " + atm.getAddress() +
                        "\nСтатус работы : " + atm.getWorkStatus() +
                        "\nБанк, которому принадлежит банкомат id : " + atm.getIdBank() +
                        "\nОбслуживающий сотрудник id : " + atm.getIdEmployee() +
                        "\nРаботает на выдачу денег? : " + atm.isDispensingCash() +
                        "\nМожно внести деньги? : " + atm.isCanDepositAllowed() +
                        "\nКол-во денег в банкомате : " + atm.getAllMoney() +
                        "\nСтоимость обслуживания банкомата : " + atm.getAtmMaintenanceCost() +
                        "\n}\n";
            }
        }
        str += "}\n----------------------------------\n";
        return str;
    }


    @Override
    public String toStringCreditAccount(int idUser) {
        String str = "Кредитные счета {\n";
        int indexDelete = 0;
        for (CreditAccount creditAccount : creditAccounts) {
            if (creditAccount.getIdUser() == idUser) {
                str = str + "Кредитный счет под индексом "+indexDelete++ + "{" +
                        "\nid : " + creditAccount.getId() +
                        "\nПользователь cчета id : " + creditAccount.getIdUser() +
                        "\nБанк, где взят кредит id : " +  creditAccount.getIdBank()+
                        "\nДата начала кредита : " + creditAccount.getLoanStartDate() +
                        "\nДата окончания кредита : " + creditAccount.getLoanEndDate() +
                        "\nКол-во месяцев, на которые взят кредит : " +  creditAccount.getLoanLongInMonths() +
                        "\nСумма кредита : " + creditAccount.getCreditAmount() +
                        "\nЕжемесячный платеж : " + creditAccount.getMonthlyPayment() +
                        "\nПроцентная ставка : " + creditAccount.getInterestRate() +
                        "\nСотрудник, который выдал кредит : " + creditAccount.getIdEmployee() +
                        "\nПлатежный счет в банке для погашения id : " + creditAccount.getIdPaymentAccount() +
                        "\n}\n";
            }
        }
        str += "}\n----------------------------------\n";
        return str;
    }

    @Override
    public String toStringPaymentAccounts(int idUser) {
        String str = "Платежные счета {\n";
        int indexDelete = 0;
        for (PaymentAccount paymentAccount : paymentAccounts) {
            if (paymentAccount.getIdUser() == idUser) {
                str = str + "Платежный счет "+indexDelete++ + "{" +
                        "\nid : " + paymentAccount.getId() +
                        "\nПользователь счёта id : " + paymentAccount.getIdUser() +
                        "\nНазвание банка, в котором открыт этот счет id : " + paymentAccount.getIdBank() +
                        "\nСумма, которая лежит в данный момент на счету : " + paymentAccount.getSum() +
                        "\n}\n";

            }
        }
        str += "}\n----------------------------------\n";
        return str;
    }

    @Override
    public String toStringBanksFull(){
        String str = "Банки: {\n";
        int indexDelete = 0;
        for (Bank bank : banks) {
            str = str + "банк под индексом "+indexDelete++ +"{\n" +
                    "   id : " + bank.getId() +
                    "\n     название : " + bank.getName() +
                    "\n     количество офисов : " + bank.getNumberOfOffice() +
                    "\n     количество банкоматов : " + bank.getNumberOfBankAtm() +
                    "\n     количество сотрудников :" + bank.getNumberOfEmployee() +
                    "\n     количество клиентов : " + bank.getNumberOfUser() +
                    "\n     рэйтинг : " + bank.getRating() +
                    "\n     всего денег : " + bank.getAllMoney() +
                    "\n     процентная ставка : " + bank.getInterestRate() + "\n" +
                    "}\n";

            str = str + toStringOffices(bank.getId()) + toStringAtms(bank.getId()) + toStringEmployees(bank.getId()) + toStringUsersFull(bank.getId());
        }
        str += "}\n----------------------------------\n\n";
        return str;
    }

    @Override
    public String toStringUsersFull(int idBank) {
        String str = "Пользователи{\n";
        int indexDelete = 0;
        for (User user : users) {
            if (user.getArrayOfIdBanks().contains(idBank)) {
                str = str + "Пользователь под индексом "+indexDelete++ +"{" +
                        "\n     id : " + user.getId() +
                        "\n     ФИО : " + user.getFullName() +
                        "\n     Дата рождения : " + user.getDateOfBirth() +
                        "\n     Место работы : " + user.getPlaceOfWork() + '\'' +
                        "\n     Ежемесячный доход : " + user.getSalaryAmount() +
                        "\n     Используемые банки : " + user.getArrayOfIdBanks() +
                        "\n     Кредитные счета : " + user.getArrayOfIdCreditAccounts() +
                        "\n     Платежные счета : " + user.getArrayOfIdPaymentAccounts() +
                        "\n     Кредитный рейтинг для банка : " + user.getCreditRatingForBank() +
                        "\n}\n";
                str = str + toStringCreditAccount(user.getId()) + toStringPaymentAccounts(user.getId());
            }
        }
        str += "}\n----------------------------------\n";
        return str;
    }

    @Override
    public int getCountBanks(){
        return banks.size();
    }

    @Override
    public int getCountOffices(){
        return offices.size();
    }

    @Override
    public int getCountEmployees(){
        return employees.size();
    }

    @Override
    public int getCountAtms(){
        return atms.size();
    }

    @Override
    public int getPaymentAccounts(){
        return paymentAccounts.size();
    }

    @Override
    public int getCreditAccounts(){
        return creditAccounts.size();
    }

    @Override
    public int getCountUsers(){
        return users.size();
    }

    @Override
    public ArrayList<Integer> getIdEmployeeInOffice(int idOffice) {
        ArrayList<Integer> employeeById = new ArrayList<>();
        for (var employee : employees)
            if (employee.getIdBankOffice() == idOffice)
                employeeById.add(employee.getId());

        return employeeById;
    }

}