import java.util.Scanner;

public class Servants_infor{

    public void servant_info(){
        System.out.println("****************************************************************");
        System.out.print("Enter Servant's No: ");
        Scanner sc=new Scanner(System.in);
        String se_num=sc.next();

        String se1_name = "Vinul Vinsura";
        String se1_id = "65436386443v";
        String se1_add = "No:23, Dalugama, Kelaniya.";
        String se1_qu = "GCE O/L";
        long se1_acc = 475454675438L;
        long se1_phone_no = +945456558L;

        String se2_name = "S. T. Dilshan Madushka";
        String se2_id = "200107702449";
        String se2_add ="No:380/5, Walauwatta, Dadalla, Galle";
        String se2_qu = "GCE O/L";
        long se2_acc = 475454675438L;
        long se2_phone_no = +94774781125L;

        String se3_name = "H.M.P.M Herath";
        String se3_id = "200108391103";
        String se3_add ="No:380/5, Kobeyigane, Kurunagala";
        String se3_qu = "GCE O/L";
        long se3_acc = 475454675438L;
        long se3_phone_no = +94774781125L;

        switch(se_num) {
            case "S1":
                System.out.println("Name: " + se1_name);
                System.out.println("id: " + se1_id);
                System.out.println("Address " + se1_add);
                System.out.println("Qualifications: " + se1_qu);
                System.out.println("Account No: "+ se1_acc);
                System.out.println("Phone No: " + se1_phone_no);
                break;
            case "S2":
                System.out.println("Name: " + se2_name);
                System.out.println("id: " + se2_id);
                System.out.println("Address " + se2_add);
                System.out.println("Qualifications: " + se2_qu);
                System.out.println("Account No: "+ se2_acc);
                System.out.println("phone No: " + se2_phone_no);
                break;
            case "S3":
                System.out.println("Name: " + se3_name);
                System.out.println("id: " + se3_id);
                System.out.println("Address " + se3_add);
                System.out.println("Qualifications: " + se3_qu);
                System.out.println("Account No: "+ se3_acc);
                System.out.println("phone No: " + se3_phone_no);
                break;
        }
        System.out.println("****************************************************************");
    }
}

