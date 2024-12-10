package tech.reliab.course.reshetova.bank.service;

import java.util.ArrayList;

public interface SecondLaboratoryLib {

    public void createBanks(int n);

    public void createOffices(int n);

    public void createAtms(int n);

    public void createCredits(int n);

    public void createEmployees(int n);

    public void createPaymentAccounts(int n);

    public void createUsers(int n);

    public void toStringAll();

    public int getRandomEmployee(ArrayList<Integer> idEmployees);
}
