import java.util.Scanner;

public class Owner {
    public void run1(){
        System.out.println("________W E L C O M E   T O   O W N E R   M E N U________");
        PreviousMenu pre=new PreviousMenu();
        System.out.println("\tPress 1-----> Go to owner details menu\n\tPress 2-----> Go to owner pay sheet menu\n\tPress 0-----> Go to previous menu:");
        Scanner Sc=new Scanner(System.in);
        int Ans1=Sc.nextInt();
        if(Ans1==1){
            Owner Det=new Owner();
            Det.Details();
            pre.preOwn();
        } else if (Ans1==2) {
            Owner Pay=new Owner();
            Pay.PaySheet();
            pre.preOwn();
        }else if(Ans1==0){
            Firstprevious F_Main=new Firstprevious();
            F_Main.Owner_to_main();
        }
    }
    public void Details(){
        System.out.println("Owner Name is D.G Hansaka Kawushalya");
        System.out.println("Phonne No: 0717276969");
    }
    public void PaySheet(){
        Management_Details PaySheet=new Management_Details();
        PaySheet.Owner_Pay_Sheet();
    }
}
