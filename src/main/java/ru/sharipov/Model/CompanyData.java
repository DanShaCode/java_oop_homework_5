package ru.sharipov.Model;


import ru.sharipov.Model.Worker;

public interface CompanyData {
    void add(Worker worker);

    void remove(int id);

    void changeData(Integer input, Integer inputId, String newData);
}
