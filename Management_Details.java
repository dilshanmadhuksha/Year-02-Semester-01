import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class Management_Details {
    public void Teachers_Salary_calc(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Teacher's Number: ");
        String T_num=Sc.next();
        if (T_num.contains("T1")){
            System.out.println("Teacher's name is Bingumi");
            System.out.println("Enter the No of Students: ");
            int num_of_std = Sc.nextInt();
            System.out.println("");
            System.out.println("Enter the class fee amount: ");
            int Class_fee=Sc.nextInt();
            System.out.println("");
            double rate=0.8;//from each fee
            double payment=num_of_std*Class_fee*rate;
            System.out.println("Income: "+payment);
        } else if (T_num.contains("T2")) {
            System.out.println("Teacher's name is Savindi");
            System.out.println("Enter the No of Students: ");
            int num_of_std = Sc.nextInt();
            System.out.println("");
            System.out.println("Enter the class fee amount: ");
            int Class_fee=Sc.nextInt();
            System.out.println("");
            double rate=0.8;//from each fee
            double payment=num_of_std*Class_fee*rate;
            System.out.println("Income: "+payment);
        }
    }
    public void TeacherPaySheet(){
        System.out.println("****************************************************************");
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Teacher's Number:");
        String code=Sc.next();
        System.out.println("Number of children who participated in the class: ");
        int No=Sc.nextInt();
        System.out.println("Enter Date: ");
        String Date=Sc.next();
        if(code.contains("T1")) {
            String Name1 = "Bingumi";
            System.out.println("Enter class fees amount: ");
            int amount1 = Sc.nextInt();
            int income1 = amount1 * No;
            System.out.println("**********PAY SHEET**********");
            System.out.println("Teacher Name: " + Name1);
            System.out.println("Number of children who participated in the class: " + No);
            System.out.println("income: " + income1);
            int tax1 = income1 * 20 / 100;
            System.out.println("The amount pay to the institute: " + tax1);
            int salary1 = income1 - tax1;
            System.out.println("Teacher's Salary: " + salary1);
            System.out.println("****************************************************************");
            System.out.println("Send massage: Hii " + Name1 + ",An amount of Rs. " + salary1 + " has been transferred to you on " + Date);
            System.out.println("****************************************************************");
        } else if (code.contains("T2")) {
            String Name2="Savindi";
            System.out.println("Enter class fees amount: ");
            int amount2=Sc.nextInt();
            int income2=amount2* No;
            System.out.println("**********PAY SHEET**********");
            System.out.println("Teacher Name: "+Name2);
            System.out.println("Number of children who participated in the class: "+No);
            System.out.println("income: "+income2);
            int tax2=income2*20/100;
            System.out.println("The amount pay to the institute: "+tax2);
            int salary2=income2 - tax2;
            System.out.println("Teacher's Salary: "+salary2);
            System.out.println("****************************************************************");
            System.out.println("Send massage: Hii "+Name2 +",An amount of Rs. "+salary2+" has been transferred to you on "+Date);
            System.out.println("****************************************************************");

        }
    }
    public void Owner_Salary_Calculation(){
        System.out.println("****************************************************************");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Owner Name is D.G Hansaka Kawushalya");
        System.out.println("Enter the No of children attending Bingumi teacher's class and the amount of class fee: ");
        int T1_children=Sc.nextInt();
        int T1_classfee=Sc.nextInt();
        System.out.println("Enter the No of children attending Savindi teacher's class and the amount of class fee: ");
        int T2_children=Sc.nextInt();
        int T2_classfee=Sc.nextInt();
        int Salary=(T1_classfee*T1_children+T2_classfee*T2_children)*20/100;
        System.out.println("Owner Salary: "+Salary);
        System.out.println("****************************************************************");
    }
    public void Owner_Pay_Sheet(){
        System.out.println("****************************************************************");
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Date: " );
        String Date=Sc.next();
        System.out.println("Enter Owner's name: D.G Hansaka Kawushalya");
        System.out.println("Enter the No of children attending Bingumi teacher's class and the amount of class fee: ");
        int T1_children=Sc.nextInt();
        int T1_classfee=Sc.nextInt();
        System.out.println("Enter the No of children attending Savindi teacher's class and the amount of class fee: ");
        int T2_children=Sc.nextInt();
        int T2_classfee=Sc.nextInt();
        int Owner_Sal=(T1_classfee*T1_children+T2_classfee*T2_children)*20/100;
        System.out.println("**********PAY SHEET**********");
        System.out.println("Owner Name: D.G Hansaka Kawushalya");
        System.out.println("Owner Salary: "+Owner_Sal);
        System.out.println("****************************************************************");
        System.out.println("Send massage: Hii Hansaka,An amount of Rs. "+Owner_Sal+"has been transferred to you on "+Date);
        System.out.println("****************************************************************");

    }
    public void Servants_Salary_calc() {
        System.out.println("****************************************************************");
        Scanner Sc = new Scanner(System.in);
        String se_num = Sc.next();
        System.out.println("Enter Date: " );
        System.out.println("Enter Servant's Number: ");
        double daily_payment = 1000;
        if (se_num.contains("se1")) {
            System.out.println("Servant's name is Vinul Vinsura");
            int work_days = Sc.nextInt();
            System.out.println("");
            System.out.println("Enter work days for month: ");
            System.out.println("");
            double payment = daily_payment * work_days;
            System.out.println("Salary: " + payment);
        } else if (se_num.contains("se2")) {
            System.out.println("Servant's name is S. T. Dilshan Madushka");
            int work_days = Sc.nextInt();
            System.out.println("");
            System.out.println("Enter work days for month: ");
            int Class_fee = Sc.nextInt();
            System.out.println("");
            double payment = daily_payment * work_days;
            System.out.println("Salary: " + payment);
        }
    }
}

