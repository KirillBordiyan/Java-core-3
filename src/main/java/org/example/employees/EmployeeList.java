package org.example.employees;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;

@Getter
public class EmployeeList implements Iterable<Employee>{
    private final ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeArrayList.add(employee);
    }

    @Override
    public String toString() {
        return "employeeArrayList=" + employeeArrayList;
    }

    // оверрайды можно вынести как внутренни класс и тогда в return будет new NewIteratorClass();
    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<>() {
            int index;

            @Override
            public boolean hasNext() {
                return index < employeeArrayList.size();
            }

            @Override
            public Employee next() {
                if(hasNext()){
                    return employeeArrayList.get(index++);
                }
                return  null;
            }
        };
    }
}
