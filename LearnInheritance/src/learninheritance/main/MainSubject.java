
package learninheritance.main;


public class MainSubject {
    
    private String bangla;
    private String english;
    private String math;

    public MainSubject(String bangla, String english, String math) {
        this.bangla = bangla;
        this.english = english;
        this.math = math;
    }

    public MainSubject() {
    }

    public String getBangla() {
        return bangla;
    }

    public void setBangla(String bangla) {
        this.bangla = bangla;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "MainSubject{" + "bangla=" + bangla + ", english=" + english + ", math=" + math + '}';
    }
    
    
}
