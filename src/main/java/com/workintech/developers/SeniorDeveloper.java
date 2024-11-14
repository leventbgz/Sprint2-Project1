package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer is leading critical projects.");
        setSalary((int) (getSalary() * 1.15));
        System.out.println("Salary updated to: " + getSalary());
    }
}
