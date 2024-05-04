public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Kacper Ormaniec", 50000);
        employees[1] = new Employee("Julia Ormaniec", 60000);
        employees[2] = new Employee("Jan Kowalski", 55000);
        employees[3] = new Employee("Mikołaj Strzelczyk", 52000);
        employees[4] = new Employee("Stanisław Polański", 58000);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(54000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
