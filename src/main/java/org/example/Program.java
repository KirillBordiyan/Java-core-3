package org.example;

import org.example.employees.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        ArrayList<Employee> employeeSortList = new ArrayList<>(Arrays.asList(
                new Freelancer(70),
                new Worker(5000),
                new Worker(4600),
                new Freelancer(85))
        );

//        пример работы метода расчета средней зарплаты
        System.out.println("avgSalary()=" + employeeSortList.get(1).avgSalary());


//        показательный вывод после сортировок:
        for (Employee em: employeeSortList) {
            System.out.println(em.toString());
        }

//        сортировка по типу работы:
        employeeSortList.sort(Employee::compareTo);

//        сортировка по кол-ву проектов:
        ProjectEmployeeComparator employeeProjectComparator = new ProjectEmployeeComparator();
        employeeSortList.sort(employeeProjectComparator);

//        показательный вывод после сортировок:
        System.out.println();
        for (Employee em: employeeSortList ) {
            System.out.println(em.toString());
        }
        System.out.println();


//        последний пункт про отельный класс и создание своего итератора для него
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(new Freelancer(70));
        employeeList.addEmployee(new Freelancer(80));
        employeeList.addEmployee(new Worker(11710));
        employeeList.addEmployee(new Worker(72320));

//        вывод просто всего списка как одной строки
//        System.out.println(employeeList);

//        тк есть итератор, foreach знает, как проходить по каждому элементу этого списка
        for(Employee emp: employeeList){
            System.out.println(emp);
        }
    }
}