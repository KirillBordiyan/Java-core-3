package org.example.employees;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker extends Employee{

    public Worker(double salaryRate){
        super(2, salaryRate);
    }

    @Override
    public double avgSalary() {
        return salaryRate;
    }
}
