package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
    }


}
