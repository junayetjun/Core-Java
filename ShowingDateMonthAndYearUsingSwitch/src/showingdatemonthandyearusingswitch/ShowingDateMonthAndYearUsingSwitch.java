package showingdatemonthandyearusingswitch;

import java.util.Scanner;

public class ShowingDateMonthAndYearUsingSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Date ");
        int date = input.nextInt();

        System.out.println("Enter the Month ");
        int month = input.nextInt();
        String newMonth = "";

        System.out.println("Enter the Year ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                newMonth = "January";
                break;
            case 2:
                newMonth = "February";
                break;
            case 3:
                newMonth = "March";
                break;
            case 4:
                newMonth = "April";
                break;
            case 5:
                newMonth = "May";
                break;
            case 6:
                newMonth = "June";
                break;
            case 7:
                newMonth = "July";
                break;
            case 8:
                newMonth = "August";
                break;
            case 9:
                newMonth = "September";
                break;
            case 10:
                newMonth = "Octobar";
                break;
            case 11:
                newMonth = "November";
                break;
            case 12:
                newMonth = "December";
                break;

            default:
                System.out.println("Invalid Month");
                System.exit(0);
                
        }
        
        if (year % 4==0 && year % 100 != 0 || year % 400 == 0){
            
            if(month == 1 && date > 31 ||
                    month == 2 && date > 29 || 
                    month == 3 && date > 31 ||
                    month == 4 && date > 30 ||
                    month == 5 && date > 31 ||
                    month == 6 && date > 30 || 
                    month == 7 && date > 31 ||
                    month == 8 && date > 31 ||
                    month == 9 && date > 30 ||
                    month == 10 && date > 31 ||
                    month == 11 && date > 30 ||
                    month == 12 && date > 31 ){
                System.out.println("Invalid Date ");
                System.exit( 0);                
            
            }
            else {
                System.out.println(newMonth + " " + date +", "+ year);
            }
        
        
        }
        else {
            if(month == 1 && date > 31
                    ||month == 2 && date > 28
                    ||month == 3 && date > 31
                    ||month == 4 && date > 30 
                    ||month == 5 && date > 31
                    ||month == 6 && date > 30
                    ||month == 7 && date > 31
                    ||month == 8 && date > 31
                    ||month == 9 && date > 30
                    ||month == 10 && date > 31
                    ||month == 11 && date > 30
                    ||month == 12 && date > 31){
                System.out.println("Invalid Date ");
                System.exit(0);            
            }
            else{
                System.out.println(newMonth + " "+ date +", "+ year);
            }
        
        
        }
        
        

    }

}
