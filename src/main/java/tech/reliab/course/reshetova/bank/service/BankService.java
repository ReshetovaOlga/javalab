package tech.reliab.course.reshetova.bank.service;


import tech.reliab.course.reshetova.bank.entity.*;

        import java.util.ArrayList;

public interface BankService {
    static final int MAX_RATING = 100;
    static final int MAX_ALL_MONEY = 1000000;
    static final int MAX_INTEREST_RATE = 20;
    static final double MAX_RATING_D = 100.0;

    // создание объекта банк
    Bank createBank(String name);

    // увеличивает количество офисов
    void addOffice(Bank bank);

    // увеличивает количество банкоматов
    void addATM(Bank bank);

    // увеличивает количество работников
    void addEmployee(Bank bank);

    // увеличивает количество клиентов
    void addUser(Bank bank);

    // возвращает рандомный рейтинг от 0 до 100
    int givesRandomRating();

    // возвращает рандомно сумму всех денег в банке не более 1 000 000
    int givesRandomAllMoney();

    // возвращает рандомно процентную ставку в процентах не более 20% в зависимости от рейтинга банка,
    //чем он выше, тем ставка должна сгенерироваться меньше
    int givesRandomInterestRate(int rating);

    // удаляет банк
    void deleteBank(int index);

    // возвращает банк по id
    public Bank givesBankById(int id);

    // возвращает пользователя по id
    public User givesUserById(int id);

    // возвращает банкомат по id
    public BankAtm givesAtmById(int id);

    // возвращает офис по id
    public BankOffice givesOfficeById(int id);

    //возвращает кредитный счет по id
    public CreditAccount givesCreditAccountById(int id);

    //возвращает сотрудника по id
    public Employee givesEmployeeById(int id);

    //возвращает платежный счет по id
    public PaymentAccount givesPaymentAccountById(int id);

    //дает все банки в виде строки
    String toStringBanks();

    //дает все офисы в виде строки
    public String toStringOffices(int idBank);

    //дает всех клиентов в виде строки
    public String toStringUsers(int idBank) ;

    //дает всех работников в виде строки
    public String toStringEmployees(int idBank) ;

    //дает все банкоматы в виде строки
    public String toStringAtms(int idBank) ;

    //дает все платежные счета в виде строки
    public String toStringPaymentAccounts(int idUser);

    //дает все кредитные счета в виде строки
    public String toStringCreditAccount(int idUser);


    //--ФУНКЦИИ ДЛЯ ВТОРОЙ ЛАБОРАТОРНОЙ--
    // вывод из второй лр банки
    public String toStringBanksFull();

    //вывод из второй лр пользователи
    public String toStringUsersFull(int idBank);

    // возвращает количество банков
    public int getCountBanks();

    // возвращает количество офисов
    public int getCountOffices();

    // возвращает количество пользователей
    public int getCountEmployees();

    // возвращает количество банкоматов
    public int getCountAtms();

    // возвращает количество платежных счетов
    public int getPaymentAccounts();

    // возвращает количество кредитных счетов
    public int getCreditAccounts();

    // возвращает количество пользователей
    public int getCountUsers();

    // возвращает массив сотрудников из офиса
    public ArrayList<Integer> getIdEmployeeInOffice(int idOffice);

}