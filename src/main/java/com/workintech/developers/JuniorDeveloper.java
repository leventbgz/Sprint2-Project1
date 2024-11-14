package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer is working on basic tasks.");
        setSalary((int) (getSalary() * 1.05));
        System.out.println("Salary updated to: " + getSalary());
    }
}
