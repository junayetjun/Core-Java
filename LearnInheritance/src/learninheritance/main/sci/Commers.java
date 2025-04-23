
package learninheritance.main.sci;

import learninheritance.main.MainSubject;


public class Commers extends MainSubject{
    
    private String accounting;
    private String finance;
    private String marketing;

    public Commers() {
    }

    public Commers(String accounting, String finance, String marketing, String bangla, String english, String math) {
        super(bangla, english, math);
        this.accounting = accounting;
        this.finance = finance;
        this.marketing = marketing;
    }

    public Commers(String accounting, String finance, String marketing) {
        this.accounting = accounting;
        this.finance = finance;
        this.marketing = marketing;
    }

    public String getAccounting() {
        return accounting;
    }

    public void setAccounting(String accounting) {
        this.accounting = accounting;
    }

    public String getFinance() {
        return finance;
    }

    public void setFinance(String finance) {
        this.finance = finance;
    }

    public String getMarketing() {
        return marketing;
    }

    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }
    
    
    public String result(){
        
        String resultOne = "Bangla: "+ getBangla()+"\n"+ "Engilsh: "+ getEnglish()+"\n"+
            "Math: "+ getMath()+"\n"+ "Accounting: "+getAccounting()+"\n"+"Finance: "+getFinance()+
                "\n"+"Marketing: "+getMarketing();
    
    return resultOne;
    
    }
    
    
}
