package ru.sharipov;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkerCompanyData workerCompanyData = new WorkerCompanyData();
        Worker worker1 = new Worker(
                "John", "Doe", 30, 3000.0, "Engineer");
        Worker worker2 = new Worker(
                "Jane", "Doe", 25, 2500.0, "Developer");
        Worker worker3 = new Worker(
                "Bob", "Smith", 40, 5000.0, "Manager");
        Worker worker4 = new Worker(
                "Alice", "Johnson", 35, 4000.0, "Architect");
        workerCompanyData.add(worker1);
        workerCompanyData.add(worker2);
        workerCompanyData.add(worker3);
        workerCompanyData.add(worker4);
        View view = new View();
        int userInput = 0;
        while (userInput != 7) {
            System.out.println();
            System.out.println("=========== Информационная система Some Company ==========");
            System.out.println();
            System.out.println("1. Показать список сотрудников ");
            System.out.println("2. Добавить сотрудника ");
            System.out.println("3. Удалить сотрудника ");
            System.out.println("4. Фильтр сотрудников по параметру ");
            System.out.println("5. Изменить данные сотрудника ");
            System.out.println("6. Поиск сотрудника ");
            System.out.println("7. Закрыть приложение ");
            System.out.println();
            System.out.print("Введите цифру из меню: ");
            userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println();
                view.showInfo(workerCompanyData.getWorkerList());
            }
            if (userInput == 2) {
                System.out.print("Введите Имя: ");
                String firstName = scanner.next();
                System.out.print("Введите Фамлиию: ");
                String secondName = scanner.next();
                System.out.print("Введите возраст: ");
                Integer age = scanner.nextInt();
                System.out.print("Введите уровень зарплаты: ");
                Double salary = scanner.nextDouble();
                System.out.print("Введите должность: ");
                String rank = scanner.next();
                workerCompanyData.add(new Worker(firstName, secondName, age, salary, rank));
            }
            if (userInput == 3) {
                System.out.println();
                System.out.println("Для того чтобы удалить работника из БД необходимо ввести его ID ");
                System.out.println();
                System.out.print("Введите ID работника сюда: ");
                workerCompanyData.remove(scanner.nextInt());
            }
            if (userInput == 4) {
                System.out.println();
                System.out.println("1.Фильтровать по Имени ");
                System.out.println("2.Фильтровать по Фамилии ");
                System.out.println("3.Фильтровать по Должности ");
                System.out.println("4.Фильтровать по Зарплате ");
                System.out.println("5.Фильтровать по Возрасту ");
                System.out.println();
                System.out.print("Введите соответствующую цифру из меню: ");
                Integer mainMenu = scanner.nextInt();
                view.filterByParam(scanner, workerCompanyData.getWorkerList(), mainMenu);
            }
            if (userInput == 5) {
                System.out.println();
                System.out.println("1.Изменить Имя ");
                System.out.println("2.Изменить Фамилию ");
                System.out.println("3.Изменить Должность ");
                System.out.println("4.Изменить Зарплату ");
                System.out.println("5.Изменить Возраст ");
                System.out.println();
                System.out.print("Введите соответствующую цифру из меню: ");
                Integer inputMenu = scanner.nextInt();
                System.out.print("Введите ID сотрудника: ");
                Integer inputId = scanner.nextInt();
                System.out.print("Введите значение: ");
                String newData = scanner.next();
                workerCompanyData.changeData(inputMenu, inputId, newData);
            }
            if (userInput == 6) {
                System.out.println();
                System.out.println("1. Поиск по Имени ");
                System.out.println("2. Поиск по Фамилии ");
                System.out.println("3. Поиск по Должности ");
                System.out.println("4. Поиск по Зарплате ");
                System.out.println("5. Поиск по Возрасту ");
                System.out.println();
                System.out.print("Введите соответствующую цифру из меню: ");
                Integer menuInput = scanner.nextInt();
                System.out.println();
                System.out.print("Введите значение: ");
                String input = scanner.next();
                System.out.println();
                view.findWorker(workerCompanyData.getWorkerList(), menuInput, input);
            }
        }
        scanner.close();
    }
}