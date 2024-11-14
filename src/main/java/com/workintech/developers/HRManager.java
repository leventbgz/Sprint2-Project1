package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    /*
    int numOfJunior;
    int numOfMid;
    int numOfSenior;
    */
    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, int salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers, int numOfJunior, int numOfMid, int numOfSenior) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employee relations and recruitment.");
        setSalary((int) (getSalary() * 1.08));
        System.out.println("Salary updated to: " + getSalary());
    }

    // to add JuniorDeveloper
    public void addEmployee(JuniorDeveloper developer) {
        if (juniorDevelopers == null || juniorDevelopers.length == 0) {
            System.out.println("The Senior Developers array is not initialized or has no capacity.");
            return;
        }

        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) { // Eğer boş bir alan bulursak
                juniorDevelopers[i] = developer;
                System.out.println("Junior Developer added successfully at index " + i);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space available to add more Junior Developers.");
        }
    }

    // to add MidDeveloper
    public void addEmployee(MidDeveloper developer) {
        if (midDevelopers == null || midDevelopers.length == 0) {
            System.out.println("The Mid Developers array is not initialized or has no capacity.");
            return;
        }

        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) { // Eğer boş bir alan bulursak
                midDevelopers[i] = developer;
                System.out.println("Mid Developer added successfully at index " + i);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space available to add more Mid Developers.");
        }
    }

    // to add SeniorDeveloper
    public void addEmployee(SeniorDeveloper developer) {
        if (seniorDevelopers == null || seniorDevelopers.length == 0) {
            System.out.println("The Senior Developers array is not initialized or has no capacity.");
            return;
        }

        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) { // Eğer boş bir alan bulursak
                seniorDevelopers[i] = developer;
                System.out.println("Senior Developer added successfully at index " + i);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space available to add more Senior Developers.");
        }
    }
}
