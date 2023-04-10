package ru.sharipov.Model;

import lombok.Data;

@Data
public class Worker {
    private static Integer id = 0;
    private Integer currentId;
    private String firstName;
    private String secondName;
    private Integer age;
    private Double salary;
    private Integer experience;
    private String rank;

    public Worker(String firstName, String secondName, Integer age, Double salary, String rank) {
        this.currentId = getWorkerId();
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
        this.rank = rank;
    }

    public Integer getWorkerId() {
        return ++id;
    }

    @Override
    public String toString() {
        return "| ID: " + getCurrentId() + " | First Name: " + getFirstName() + " | Second Name: " + getSecondName()
                + " | Age: " + getAge() + " | Salary: " + getSalary() + " | Rank: " + getRank();
    }


}
