import Employees.Employee;
import Employees.Worker;
import Employees.Manager;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Kacper Ormaniec", 50000, 0);
        employees[1] = new Worker("Julia Ormaniec", 60000, "HR");
        employees[2] = new Employee("Jan Kowalski", 55000);
        employees[3] = new Employee("Mikołaj Strzelczyk", 52000);
        employees[4] = new Worker("Stanisław Polański", 58000, "Marketing");

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(54000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
