package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Mid Developer is working on intermediate-level projects.");
        setSalary((int) (getSalary() * 1.10));
        System.out.println("Salary updated to: " + getSalary());
    }
}
