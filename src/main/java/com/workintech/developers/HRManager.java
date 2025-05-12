package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
        setSalary(getSalary() + 1500);
    }

    public void addEmployee(JuniorDeveloper developer) {
        addToArray(juniorDevelopers, developer);
    }

    public void addEmployee(MidDeveloper developer) {
        addToArray(midDevelopers, developer);
    }

    public void addEmployee(SeniorDeveloper developer) {
        addToArray(seniorDevelopers, developer);
    }

    private <T> void addToArray(T[] array, T employee) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = employee;
                System.out.println(employee.getClass().getSimpleName() + " added successfully.");
                return;
            }
        }
        System.out.println("Cannot add " + employee.getClass().getSimpleName() + ": No empty slot available.");
    }
    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
}
