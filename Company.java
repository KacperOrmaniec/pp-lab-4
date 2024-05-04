import Employees.Employee;
import Employees.Worker;
import Employees.Manager;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Kacper Ormaniec", 5000, 0);
        employees[1] = new Worker("Julia Ormaniec", 6000, "HR");
        employees[2] = new Employee("Jan Kowalski", 5500);
        employees[3] = new Employee("Mikołaj Strzelczyk", 5200);
        employees[4] = new Worker("Stanisław Polański", 5800, "Marketing");

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(54000);

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        employees[0].setSalary(7500);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
