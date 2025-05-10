
package employeesoop.employees.manager;

import employeesoop.employees.Employees;


public class Manager extends Employees{
    
    public int teamSize;

    public Manager() {
    }

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(int teamSize, String name, int id, double salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void allDetailsEmployees() {
        super.allDetailsEmployees(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        System.out.println("Team size: "+ teamSize+" persons.");
        
    }

   
    
    
    
    
}
