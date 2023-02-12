public class Employee {
    private static int counterid = 1;
    private final int id;
    private final String employeeName;
    private int department;
    private int salary;


    public Employee(String employeeName,
                    int department,
                    int salary) {
        this.id = counterid++;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return String.format(
                "id: %d, Ф.И.О.: %s, ЗП: %d, № отдела: %d",
                id,
                employeeName,
                salary,
                department
        );

    }

}
