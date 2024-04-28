package org.example.employees;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public abstract class Employee implements Comparable<Employee>{

    protected int workerType;
    protected double salaryRate;
    /**
     *мы скажем, что при создании работника показатель выполненных работ - случайный,
     *для наглядности работы компаратора
     */
    protected int completedProject;
    private Random rnd = new Random();

    protected Employee(int workerType, double salaryRate) {
        this.workerType = workerType;
        this.salaryRate = salaryRate;
        this.completedProject = rnd.nextInt(1,11);
    }

    public abstract double avgSalary();

    @Override
    public String toString() {
        return "Employee: " +
                "workerType=" + workerType +
                ", salaryRate=" + salaryRate +
                ", completedProject=" + completedProject;
    }

    /**
     * Метод сравнения по типу работника
     * @param o сравниваемый работник
     * @return int = 1/0/-1 (1 - выше, 0 - равны, -1 - объект ниже)
     */
    @Override
    public int compareTo(Employee o) {
        return this.getWorkerType() - o.getWorkerType();
    }
}
