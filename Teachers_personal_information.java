import com.sun.security.jgss.GSSUtil;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.util.SortedMap;

public class Teachers_personal_information {
    public  void personal_infor(){
        System.out.println("********W E L C O M E   T O   T E A C H E R S   M E N U********");
        String T1_name = "Bingumi";
        String T1_qu = "Bsc";
        long T1_acc = 435651247327L;
        String T1_sub = "Science";
        long T1_phone_no = 1535864164L;

        String T2_name = "Savindi";
        String T2_qu = "Bsc.(Hons)";
        long T2_acc = 435654647327L;
        String T2_sub = "Science";
        long T2_phone_no = 4386864164L;
        System.out.println("****************************************************************");
        Scanner teachers_number =  new Scanner(System.in);
        System.out.println("Enter teachers' number: ");
        String T_num = teachers_number.nextLine();

        switch(T_num){
            case "T1":
                System.out.println("Name: "+T1_name);
                System.out.println("Qualifications: "+T1_qu);
                System.out.println("Account No: "+T1_acc);
                System.out.println("Subject: "+T1_sub);
                System.out.println("Phone No: "+T1_phone_no);
                System.out.println("****************************************************************");
                break;
            case "T2":
                System.out.println("Name: "+T2_name);
                System.out.println("Qualification: "+T2_qu);
                System.out.println("Account No: "+T2_acc);
                System.out.println("Subject: "+T2_sub);
                System.out.println("phone No: "+T2_phone_no);
                System.out.println("****************************************************************");
                break;
        }
    }
}