package ru.sharipov;

import java.util.List;
import java.util.Scanner;

public class View<T> {
    public void showInfo(List<T> elements) {
        for (T element : elements)
            System.out.println(element.toString());
    }

    public void filterByParam(Scanner scanner, List<Worker> workerList, Integer mainMenu) {
        if (mainMenu == 1) {
            System.out.println();
            System.out.print("Введите Имя: ");
            String input = scanner.next();
            System.out.println();
            for (Worker worker : workerList) {
                if (worker.getFirstName().contains(input)) {
                    System.out.println(worker);
                }
            }
        }
        if (mainMenu == 2) {
            System.out.println();
            System.out.print("Введите Фамилию: ");
            String input = scanner.next();
            System.out.println();
            for (Worker worker : workerList) {
                if (worker.getSecondName().contains(input)) {
                    System.out.println(worker);
                }
            }
        }
        if (mainMenu == 3) {
            System.out.println();
            System.out.print("Введите Должность: ");
            String input = scanner.next();
            System.out.println();
            for (Worker worker : workerList) {
                if (worker.getRank().contains(input)) {
                    System.out.println(worker);
                }
            }
        }
        if (mainMenu == 4) {
            System.out.println();
            System.out.println("1. Зарплата от");
            System.out.println("2. Зарплата до");
            System.out.println("3. Среднее значение по зарплате ");
            System.out.println();
            System.out.print("Введите соответствующую цифру из меню: ");
            Integer subMenu = scanner.nextInt();
            if (subMenu == 1) {
                System.out.println();
                System.out.print("Введите значение: ");
                Double input = scanner.nextDouble();
                System.out.println();
                for (Worker worker : workerList)
                    if (worker.getSalary() >= input)
                        System.out.println(worker);
            }
            if (subMenu == 2) {
                System.out.print("Введите значение: ");
                Double input = scanner.nextDouble();
                System.out.println();
                for (Worker worker : workerList)
                    if (worker.getSalary() <= input)
                        System.out.println(worker);
            }
            if (subMenu == 3) {
                System.out.println();
                System.out.print("Среднее значение по зарплате всех сотрудников компании: ");
                Double meanSalary = (double) 0;
                Double workerAmount = (double) workerList.size();
                for (Worker worker : workerList)
                    meanSalary += worker.getSalary();
                System.out.println((meanSalary / workerAmount));
            }
        }
        if (mainMenu == 5) {
            System.out.println();
            System.out.println("1. Возраст от");
            System.out.println("2. Возраст до");
            System.out.println("3. Среднее значение по возрасту ");
            System.out.println();
            System.out.print("Введите соответствующую цифру из меню: ");
            Integer subMenu = scanner.nextInt();
            if (subMenu == 1) {
                System.out.println();
                System.out.print("Введите значение: ");
                Integer input = scanner.nextInt();
                System.out.println();
                for (Worker worker : workerList)
                    if (worker.getAge() >= input)
                        System.out.println(worker);
            }
            if (subMenu == 2) {
                System.out.println();
                System.out.print("Введите значение: ");
                Integer input = scanner.nextInt();
                System.out.println();
                for (Worker worker : workerList)
                    if (worker.getAge() <= input)
                        System.out.println(worker);
            }
            if (subMenu == 3) {
                System.out.println();
                System.out.print("Среднее значение по возрасту всех сотрудников компании: ");
                Double meanAge = (double) 0;
                Double workerAmount = (double) workerList.size();
                for (Worker worker : workerList)
                    meanAge += worker.getAge();
                System.out.println((meanAge / workerAmount));
            }
        }

    }

    public void findWorker(List<Worker> workerList, Integer menuInput, String input) {
        if (menuInput == 1) {
            System.out.println();
            for (Worker worker : workerList) {
                if (worker.getFirstName().contains(input))
                    System.out.println(worker);
            }
        }
        if (menuInput == 2) {
            System.out.println();
            for (Worker worker : workerList) {
                if (worker.getSecondName().contains(input))
                    System.out.println(worker);
            }
        }
        if (menuInput == 3) {
            System.out.println();
            for (Worker worker : workerList) {
                if (worker.getRank().contains(input))
                    System.out.println(worker);
            }
        }
        if (menuInput == 4) {
            System.out.println();
            for (Worker worker : workerList) {
                if (worker.getSalary() == Double.parseDouble(input))
                    System.out.println(worker);
            }
        }
        if (menuInput == 5) {
            System.out.println();
            for (Worker worker : workerList) {
                if (worker.getAge() == Integer.parseInt(input))
                    System.out.println(worker);
            }
        }
    }
}
