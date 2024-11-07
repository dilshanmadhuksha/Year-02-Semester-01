import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("**********W E L C O M E   C L A S S   M A N A G E M E N T   S Y S T E M**************");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        Main All = new Main();
        All.MenuRun();
    }

    public void MenuRun() {
        System.out.println("");
        System.out.println("********W E L C O M E   T O   M A I N    M E N U********");
        System.out.println("\tPress 1----->  Go to owner menu\n\tPress 2-----> Go to management menu\n\tPress 3-----> Go to teacher menu\n\tPress 4-----> Go to student menu\n\t"+
                "Press 5-----> Go to servants menu\n\tPress 6-----> Go to parents menu");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int Ans = sc.nextInt();
        System.out.println("");

        if (Ans == 1) {
            Owner run1 = new Owner();
            run1.run1();
        } else if (Ans == 2) {
            Management run2 = new Management();
            run2.run2();
        } else if (Ans == 3) {
            Teachers run3 = new Teachers();
            run3.run3();
        } else if (Ans == 4) {
            Student run4 = new Student();
            run4.run4();
        } else if (Ans == 5) {
            Servants run5 = new Servants();
            run5.run5();
        } else if (Ans == 6) {
            Parents run6 = new Parents();
            run6.run6();
        } else {
            System.out.println("Invalid option. Please enter a number between 1 and 6.");
        }

        sc.close();
    }
}
