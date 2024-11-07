import java.util.Scanner;

public class PreviousMenu {
    public void preOwn(){
        System.out.println("");
        Scanner sc =new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1: Previous manu\n\tPress 2: Main menu\n\tPress 0: Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if (AnsPre == 1){
            System.out.println("");
            Owner pre = new Owner();
            pre.run1();
        } else if(AnsPre==2) {
            System.out.println("");
            Main main = new Main();
            main.MenuRun();
        }else if(AnsPre==0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }
    public void preMan(){
        System.out.println("");
        Scanner sc =new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1: Previous manu\n\tPress 2: Main menu\n\tPress 0: Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if (AnsPre == 1){
            System.out.println("");
            Management pre = new Management();
            pre.run2();
        } else if(AnsPre==2) {
            System.out.println("");
            Main main = new Main();
            main.MenuRun();
        }else if(AnsPre==0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }
    public void preTea(){
        System.out.println("");
        Scanner sc =new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1: Previous manu\n\tPress 2: Main menu\n\tPress 0: Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if (AnsPre == 1){
            System.out.println("");
            Teachers pre = new Teachers();
            pre.run3();
        } else if(AnsPre==2) {
            System.out.println("");
            Main main = new Main();
            main.MenuRun();
        }else if(AnsPre==0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }
    public void preStd(){
        System.out.println("");
        Scanner sc =new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1: Previous manu\n\tPress 2: Main menu\n\tPress 0: Exit");
        System.out.println();
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if (AnsPre == 1){
            System.out.println("");
            Student pre = new Student();
            pre.run4();
        } else if(AnsPre==2) {
            System.out.println("");
            Main main = new Main();
            main.MenuRun();
        }else if(AnsPre==0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }

    public void prePar(){
        System.out.println("");
        Scanner sc =new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1: Previous manu\n\tPress 2: Main menu\n\tPress 0: Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if (AnsPre == 1){
            System.out.println("");
            Parents pre = new Parents();
            pre.run6();
        } else if(AnsPre==2) {
            System.out.println("");
            Main main = new Main();
            main.MenuRun();
        }else if(AnsPre==0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }

    public void preSer(){
        System.out.println("");
        Scanner sc =new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1: Previous manu\n\tPress 2: Main menu\n\tPress 0: Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if (AnsPre == 1){
            System.out.println("");
            Servants pre = new Servants();
            pre.run5();
        } else if(AnsPre==2) {
            System.out.println("");
            Main main = new Main();
            main.MenuRun();
        }else if(AnsPre==0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }
}
