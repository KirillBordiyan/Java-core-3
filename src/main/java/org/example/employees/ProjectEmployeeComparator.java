package org.example.employees;

import java.util.Comparator;

public class ProjectEmployeeComparator implements Comparator<Employee> {

    /**
     * Метод сравнения Comparator отдельного класса
     * @param o1 работник для сравнения 1
     * @param o2 работник для сравнения 2
     * @return int = 1/0/-1 (1 - выше, 0 - равны, -1 - объект ниже)
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompletedProject() - o2.getCompletedProject();
    }
}
