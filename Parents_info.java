import java.util.Scanner;

public class Parents_info extends User{
    public Parents_info(String name, String idNumber, String phoneNumber, String addres) {
        super();
    }

    public void Information(){


    }

    public void parents_info(){
        System.out.println("****************************************************************");
        System.out.print("Enter Student's student No: ");
        Scanner sc=new Scanner(System.in);
        String StdNo=sc.next();

        switch(StdNo){
            case "SN101":
                System.out.println("Guardian Name: S.T Dilshan Madhuksha");
                System.out.println("Address: No:380/51,Walauwatta,Dadalla,Galle");
                System.out.println("Phone No: 0774781125");
                System.out.println("N.I.C No: 200107702449");
                break;
            case "SN102":
                System.out.println("Guardian Name: G.J Janani Chinthani");
                System.out.println("Address: No:24,Pokunaroad,Godaparagahahena,Kaluthara South");
                System.out.println("Phone No: 0775834356");
                System.out.println("N.I.C No: 200179201784");
                break;
            case "SN103":
                System.out.println("Guardian Name: W.D Sashikala Savindi");
                System.out.println("Address: No.67,Circular Road,Madampathana,Badulla");
                System.out.println("Phone No: 0701703888");
                System.out.println("N.I.C No: 200160802877");
                break;
            case "SN104":
                System.out.println("Guardian Name: K.A Bingumi Chamudika");
                System.out.println("Address: Udara,jayamawatha,Polwatta,Denipitiya");
                System.out.println("Phone No: 0786908655");
                System.out.println("N.I.C No: 200160403252");
                break;
            case "SN105":
                System.out.println("Guardian Name: W.W.G Vinul Vithsura");
                System.out.println("Address: Wikum,Nadugala,Mathara");
                System.out.println("Phone No: 0761693539");
                System.out.println("N.I.C No: 200004702757");
                break;
            case "SN106":
                System.out.println("Guardian Name: H.Sewwandi Kumari Peiris");
                System.out.println("Address: No:172/A,Weliketiya,Ankokkawela,Galle");
                System.out.println("Phone No: 0702616278");
                System.out.println("N.I.C No: 200150902950");
                break;
        }
        System.out.println("****************************************************************");
    }
}
