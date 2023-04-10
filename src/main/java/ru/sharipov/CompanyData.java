package ru.sharipov;


public interface CompanyData {
    void add(Worker worker);

    void remove(int id);

    void changeData(Integer input, Integer inputId, String newData);
}
