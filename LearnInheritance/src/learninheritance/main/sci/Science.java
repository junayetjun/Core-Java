
package learninheritance.main.sci;

import learninheritance.main.MainSubject;


public class Science extends MainSubject{
   
    private String physics;
    private String chemistry;
    private String higherMath;
    private String biology;

    public Science() {
    }

    public Science(String physics, String chemistry, String higherMath, String biology, String bangla, String english, String math) {
        super(bangla, english, math);
        this.physics = physics;
        this.chemistry = chemistry;
        this.higherMath = higherMath;
        this.biology = biology;
    }

    public Science(String physics, String chemistry, String higherMath, String biology) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.higherMath = higherMath;
        this.biology = biology;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getHigherMath() {
        return higherMath;
    }

    public void setHigherMath(String higherMath) {
        this.higherMath = higherMath;
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }
    
    
    public String getOutput(){
    
    String result = "Bangla: "+ getBangla()+"\n"+ "Engilsh: "+ getEnglish()+"\n"+
            "Math: "+ getMath()+"\n"+ "Physics: "+getPhysics()+"\n"+
            "Chemistry: "+getChemistry()+"\n"+"Higher Math: "+ getHigherMath()+"\n"+
            "Biology: "+getBiology();
            
    return result;
            
    } 
    
    
}
