import java.util.Arrays;

public class Main {
    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Мария Ивановна Иванова ", "1", 50_000);
        employee[1] = new Employee("Денис Денисович Дурнев ", "2", 100_000);
        employee[2] = new Employee("Григорий Юрьевич Вертлявый", "1", 99_000);
        employee[3] = new Employee("Жанна Рудольфовна Морозова", "4", 50_000);
        employee[4] = new Employee("Виктория Исааковна Зюзина", "5", 25_000);
        employee[5] = new Employee("Валерия Петровна Бабкина", "4", 88_000);
        employee[6] = new Employee("Игорь Юрьевич Смуглов", "5", 60_000);
        employee[7] = new Employee("Федор Геннадьевич Мурзилкин", "4", 89_000);
        employee[8] = new Employee("Армен Ашотович Григорян", "3", 90_000);
        employee[9] = new Employee("Инесса Викторовна Балалайкина", "4", 30_000);
        System.out.println(employee[1]);
        System.out.println(Arrays.toString(employee));
        System.out.println(employeeMaxSalary);
    }



    }
