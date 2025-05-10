
package employeesoop.employees;


public class Employees {
   
    
    private String name;
    private int id;
    private double salary;

    public Employees() {
    }

    public Employees(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    public void allDetailsEmployees(){
        System.out.println("Name: "+name+"\n"+ "Id: "+id+"\n"+ "Salary: "+salary);
    
    }
    
}
