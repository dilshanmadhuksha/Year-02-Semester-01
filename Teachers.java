import java.util.Scanner;

public class Teachers {
    public void run3() {
        System.out.println("__________W E L C O M E   T O   T E A C H E R S   M E N U__________");
        PreviousMenu Pre = new PreviousMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("\tPress 1----->Go to Teachers personal information menu\n\tPress 2----->Go to your Pay Sheet\n\tPress 0----->Go to Previous Menu:");
        int Ans3 = sc.nextInt();
        System.out.println("");
        if (Ans3 == 1) {
            Teachers_personal_information TeachDet = new Teachers_personal_information();
            TeachDet.personal_infor();
            Pre.preTea();
        } else if (Ans3 == 2) {
            Management_Details PaySheet = new Management_Details();
            PaySheet.TeacherPaySheet();
            Pre.preTea();
        } else if (Ans3 == 0) {
            Firstprevious F_Main = new Firstprevious();
            F_Main.Teacher_to_main();
        }
    }
}
