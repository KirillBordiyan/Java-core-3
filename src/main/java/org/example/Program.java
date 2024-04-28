package org.example;

import org.example.employees.Employee;
import org.example.employees.ProjectEmployeeComparator;
import org.example.employees.Freelancer;
import org.example.employees.Worker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {

        ArrayList<Employee> emplList1 = new ArrayList<>(Arrays.asList(
                new Freelancer(70),
                new Worker(5000),
                new Worker(4600),
                new Freelancer(85))
        );

        for (Employee em: emplList1 ) {
            System.out.println(em.toString());
        }

//        сортировка по типу работы:
        emplList1.sort(Employee::compareTo);

//        сортировка по кол-ву проектов:
//        ProjectEmployeeComparator emplProjectComparator = new ProjectEmployeeComparator();
//        emplList1.sort(emplProjectComparator);


        System.out.println();
        for (Employee em: emplList1 ) {
            System.out.println(em.toString());
        }
    }
}