import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;

public class Firstprevious {
    public void Owner_to_main() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1----->Continue manu\n\tPress 2----->Previous menu\n\tPress 0----->Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if(AnsPre==1){
            System.out.println("");
            Owner ConOwn=new Owner();
            ConOwn.run1();
        }
        else if (AnsPre == 2) {
            System.out.println("");
            Main preMain = new Main();
            preMain.MenuRun();
        }
        else if (AnsPre == 0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }
    public void Management_to_main() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1----->Continue manu\n\tPress 2----->Previous menu\n\tPress 0----->Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if(AnsPre==1){
            System.out.println("");
            Management ConMan=new Management();
            ConMan.run2();
        }
        else if (AnsPre == 2) {
            System.out.println("");
            Main preMain = new Main();
            preMain.MenuRun();
        }
        else if (AnsPre == 0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }
    public void Teacher_to_main() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1----->Continue manu\n\tPress 2----->Previous menu\n\tPress 0----->Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if(AnsPre==1){
            System.out.println("");
            Teachers ConTea=new Teachers();
            ConTea.run3();
        }
        else if (AnsPre == 2) {
            System.out.println("");
            Main preMain = new Main();
            preMain.MenuRun();
        }
        else if (AnsPre == 0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }
    public void Student_to_main() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1----->Continue manu\n\tPress 2----->Previous menu\n\tPress 0----->Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if(AnsPre==1){
            System.out.println("");
            Student ConStd=new Student();
            ConStd.run4();
        }
        else if (AnsPre == 2) {
            System.out.println("");
            Main preMain = new Main();
            preMain.MenuRun();
        }
        else if (AnsPre == 0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }

    public void Parents_to_main() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1----->Continue manu\n\tPress 2----->Previous menu\n\tPress 0----->Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if(AnsPre==1){
            System.out.println("");
            Parents ConPar=new Parents();
            ConPar.run6();
        }
        else if (AnsPre == 2) {
            System.out.println("");
            Main preMain = new Main();
            preMain.MenuRun();
        }
        else if (AnsPre == 0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }

    public void Servant_to_main() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tPress 1----->Continue manu\n\tPress 2----->Previous menu\n\tPress 0----->Exit");
        System.out.print("Do you want any ? :");
        int AnsPre = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        if(AnsPre==1){
            System.out.println("");
            Servants ConSer=new Servants();
            ConSer.run5();
        }
        else if (AnsPre == 2) {
            System.out.println("");
            Main preMain = new Main();
            preMain.MenuRun();
        }
        else if (AnsPre == 0) {
            System.out.println("");
            System.out.println("Thankyou!!!!!!!");
        }
    }
}
