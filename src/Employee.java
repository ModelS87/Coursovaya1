public class Employee {
    private String employeeName;
    private String department;
    private int salary;
    private int id;
    static int count;

    public Employee(String employeeName, String department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        id = ++ count;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Ф.И.О. сотрудника: " + employeeName + ", отдел: " + department + ", зарплата: " + salary;
    }
    public static Employee searchMaxSalary (Employee[] employee) {
        Employee employeeMaxSalary = null;
        int maxSalary = employee[0].getSalary();
        for(int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                employeeMaxSalary = employee [i];
            }
        }
        return employeeMaxSalary;
    }
    public static Employee searchMinSalary (Employee[] employee) {
        Employee employeeMinSalary = null;
        int minSalary = employee[0].getSalary();
        for(int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                employeeMinSalary = employee [i];
            }
        }
        return employeeMinSalary;
    }
}
