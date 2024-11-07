import java.util.Scanner;

public class Student {
    public void run4(){
        System.out.println("________W E L C O M E   T O   S T U D E N T S   M E N U________");
        PreviousMenu pre=new PreviousMenu();
        System.out.println("\tPress 1----->Go to student details\n\tPress 2----->Go to know if class fees have been paid" +
                "\n\tPress 3----->Go to know if students have attendance classes\n\tPress 0----->Go to Previous Menu:");
        Scanner sc=new Scanner(System.in);
        int Ans4=sc.nextInt();
        System.out.println("");
        if(Ans4==1){
            StudentsDetails StdNo=new StudentsDetails("dsdf","31523","0779559463","cgvb nb");
            StdNo.StdNo();
            pre.preStd();
        } else if (Ans4==2) {
            StudentsDetails feepaid=new StudentsDetails("dsdf","31523","0779559463","cgvb nb");
            feepaid.feePaid();
            pre.preStd();
        }else if (Ans4==3) {
            StudentsDetails Att=new StudentsDetails("dsdf","31523","0779559463","cgvb nb");
            Att.Attendance();
            pre.preStd();
        }else if(Ans4==0){
            Firstprevious F_Main=new Firstprevious();
            F_Main.Student_to_main();
        }
    }
}
