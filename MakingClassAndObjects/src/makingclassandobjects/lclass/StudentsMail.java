
package makingclassandobjects.lclass;


public class StudentsMail {
    
    private int id;
    private String name;
    private String email;
    private String courseName;
    private int courseTime;

    public StudentsMail() {
    }

    public StudentsMail(int id, String name, String email, String courseName, int courseTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.courseName = courseName;
        this.courseTime = courseTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 6 && name.length() < 20 ){
            this.name = name;
        
        }
        else{
            System.out.println("Name must be between 6 to 20 character.");
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(int courseTime) {
        this.courseTime = courseTime;
    }
    
    
    
    public String allDataOfStudents(){
    
        String fullInfo = "ID: "+ id +"\n"+"Name: "+ name+ "\n"+"Email: "
                + email+"\n"+ "Course Name: "+courseName+"\n"+ "Time: "+ courseTime ;
//        System.out.println("ID: "+ id +"\n"+"Name: "+ name+ "\n"+"Email: "
//                + email+ "Course Name: "+courseName+ "Time: "+ courseTime );
    
            return fullInfo;
    }
    
    
    
}
