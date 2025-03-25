package nameagesalary;

import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter Your Name, Age and Salary");

        String name = user.nextLine();

        int age = user.nextInt();

        double salary = user.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary); 

    }

}
