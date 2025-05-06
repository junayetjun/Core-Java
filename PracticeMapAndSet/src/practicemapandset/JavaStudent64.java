package practicemapandset;

public class JavaStudent64 {

    public int studentId;
    public String name;
    public String email;

    public JavaStudent64() {
    }

    public JavaStudent64(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentDetails(){
    
      return "Studen ID: "+studentId+"\n"+"Name: "+name+"\n"+
                "Email: "+email+"\n"+"--------------------------";
    
    }
    
    
    @Override
    public String toString() {
        return "JavaStudent64{" + "studentId=" + studentId + ", name=" + name + ", email=" + email + '}';
    }
    
    

}
