package org.example.employees;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Freelancer extends Employee{

    public Freelancer(double salaryRate) {
        super(1, salaryRate);
    }

    @Override
    public double avgSalary() {
        return 20.8 * 8 * salaryRate;
    }
}
