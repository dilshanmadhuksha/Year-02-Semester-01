import java.util.Scanner;

public class Parents {
    public void run6() {
        System.out.println("__________W E L C O M E   T O   P A R E N T S   M E N U__________");
        PreviousMenu Pre = new PreviousMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("\tPress 1-----> Go to Parents personal information menu\n\tPress 2-----> Go to your Pay Sheet\n\tPress 3-----> Go to Previous Menu:");
        int Ans3 = sc.nextInt();
        System.out.println("");
        if (Ans3 == 1) {
            Parents_info PareDet = (Parents_info) new User();
            PareDet.parents_info();
            Pre.prePar();
        } else if (Ans3 == 0) {
            Firstprevious F_Main = new Firstprevious();
            F_Main.Parents_to_main();
        }
    }
}

