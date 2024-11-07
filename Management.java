import java.util.Scanner;

public class Management {
    public void run2() {
        System.out.println("________W E L C O M E   T O   M A N A G M E N T   M E N U________");
        PreviousMenu Pre = new PreviousMenu();
        System.out.println("\tPress 1----->Go to teacher's salary calculation menu\n\tPress 2----->Go to Teacher pay sheet menu," +
                "\n\tPress 3----->Go to teacher's salary calculation menu\n\tPress 4----->Go to owner paysheet\n\tPress 0----->Go to Previous Menu:");
        Scanner Sc = new Scanner(System.in);
        int Ans2 = Sc.nextInt();
        if (Ans2 == 1) {
            Management_Details TeaSalCal = new Management_Details();
            TeaSalCal.Teachers_Salary_calc();
            Pre.preMan();
        } else if (Ans2 == 2) {
            Management_Details TechPaySheet = new Management_Details();
            TechPaySheet.TeacherPaySheet();
            Pre.preMan();
        } else if (Ans2 == 3) {
            Management_Details OwnSalCal = new Management_Details();
            OwnSalCal.Owner_Salary_Calculation();
            Pre.preMan();
        } else if (Ans2 == 4) {
            Management_Details OwnerPay = new Management_Details();
            OwnerPay.Owner_Pay_Sheet();
            Pre.preMan();
        } else if (Ans2 == 0) {
            Firstprevious F_Main = new Firstprevious();
            F_Main.Management_to_main();
        }
    }
}
