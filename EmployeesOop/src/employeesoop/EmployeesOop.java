package employeesoop;

import employeesoop.employees.manager.Manager;
import java.util.Scanner;

public class EmployeesOop {

    public static void main(String[] args) {

        Manager m = new Manager();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the ID ");
        int userInput = s.nextInt();
        m.setId(userInput);

        String userName = s.nextLine();
        System.out.println("Enter the Name ");
        userName = s.nextLine();
        m.setName(userName);

        System.out.println("Enter the Salary ");
        double userSalary = s.nextDouble();
        m.setSalary(userSalary);
        
        System.out.println("Enter the Team Size ");
        userInput = s.nextInt();
        m.setTeamSize(userInput);
        
        
        System.out.println("------------------------ ");

//       m.setId(123);
//       m.setName("Junayet");
//       m.setSalary(1200);
//       m.setTeamSize(5);
        m.allDetailsEmployees();

    }

}
