import java.util.Scanner;

public class Servants {
    public void run5() {
        System.out.println("__________W E L C O M E   T O   S E R V A N T S   M E N U__________");
        PreviousMenu Pre = new PreviousMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("\tPress 1-----> Go to Servant personal information menu\n\tPress 2-----> Go to your Pay Sheet\n\tPress 3-----> Go to Previous Menu:");
        int Ans3 = sc.nextInt();
        System.out.println("");
        if (Ans3 == 1) {
            Servants_infor SerDet = new Servants_infor();
            SerDet.servant_info();
            Pre.preSer();
        } else if (Ans3 == 2) {
            Management_Details PaySheet = new Management_Details();
            PaySheet.Servants_Salary_calc();
            Pre.preSer();
        } else if (Ans3 == 0) {
            Firstprevious F_Main = new Firstprevious();
            F_Main.Servant_to_main();
        }
    }
}
