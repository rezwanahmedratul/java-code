import java.util.Scanner;
public class Employee {
    private String name;
    private int salary;


    public void Employee(String n) {
        name = n;
        salary = 0;
    }
    public void Employee(String n, int s) {
        name = n;
        salary = s;
    }

    public void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.Employee("tttt", 1200);
        
        Employee emp2 = new Employee();
        emp2.Employee("rrrr");

        System.out.println("\nEmployee 1:");
        emp1.display();
        System.out.println("\nEmployee 2:");
        emp2.display();
    }
}