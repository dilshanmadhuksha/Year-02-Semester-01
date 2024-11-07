import java.util.Scanner;

public class StudentsDetails extends User {

    public StudentsDetails(String name, String idNumber, String phoneNumber, String addres) {
        super();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getIdNumber() {
        return super.getIdNumber();
    }

    @Override
    public void setIdNumber(String idNumber) {
        super.setIdNumber(idNumber);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    public  void Information(){

    }
    public void StdNo(){
        System.out.println("****************************************************************");
        System.out.print("Enter Student's student No: ");
        Scanner sc=new Scanner(System.in);
        String StdNo=sc.next();
        switch(StdNo){
            case "SN101":
                System.out.println("Student Name: S.T Dilshan Madhuksha");
                System.out.println("Address: No:380/51,Walauwatta,Dadalla,Galle");
                System.out.println("Phone No: 0774781125");
                System.out.println("N.I.C No: 200107702449");
                System.out.println("Grede: 12");
                break;
            case "SN102":
                System.out.println("Student Name: G.J Janani Chinthani");
                System.out.println("Address: No:24,Pokunaroad,Godaparagahahena,Kaluthara South");
                System.out.println("Phone No: 0775834356");
                System.out.println("N.I.C No: 200179201784");
                System.out.println("Grede: 12");
                break;
            case "SN103":
                System.out.println("Student Name: W.D Sashikala Savindi");
                System.out.println("Address: No.67,Circular Road,Madampathana,Badulla");
                System.out.println("Phone No: 0701703888");
                System.out.println("N.I.C No: 200160802877");
                System.out.println("Grede: 12");
                break;
            case "SN104":
                System.out.println("Student Name: K.A Bingumi Chamudika");
                System.out.println("Address: Udara,jayamawatha,Polwatta,Denipitiya");
                System.out.println("Phone No: 0786908655");
                System.out.println("N.I.C No: 200160403252");
                System.out.println("Grede: 12");
                break;
            case "SN105":
                System.out.println("Student Name: W.W.G Vinul Vithsura");
                System.out.println("Address: Wikum,Nadugala,Mathara");
                System.out.println("Phone No: 0761693539");
                System.out.println("N.I.C No: 200004702757");
                System.out.println("Grede: 13");
                break;
            case "SN106":
                System.out.println("Student Name: H.Sewwandi Kumari Peiris");
                System.out.println("Address: No:172/A,Weliketiya,Ankokkawela,Galle");
                System.out.println("Phone No: 0702616278");
                System.out.println("N.I.C No: 200150902950");
                System.out.println("Grede: 13");
                break;
        }
        System.out.println("****************************************************************");
    }
    public void feePaid(){
        System.out.println("****************************************************************");
        System.out.print("Enter the student student No to check whether the tution fees have been paid: ");
        Scanner sc=new Scanner(System.in);
        String StdNo=sc.next();
        switch (StdNo){
            case "SN101":
                System.out.println("Class fee Paid");
                break;
            case "SN102":
                System.out.println("Class fee Paid");
                break;
            case "SN103":
                System.out.println("Class fee not Paid");
                break;
            case "SN104":
                System.out.println("Class fee Paid");
                break;
            case "SN105":
                System.out.println("Class fee not Paid");
                break;
            case "SN106":
                System.out.println("Class fee Paid");
                break;
        }
        System.out.println("****************************************************************");
    }
    public void Attendance(){
        System.out.println("****************************************************************");
        System.out.println("Enter the student No to know if the student has attendance classes: ");
        Scanner sc=new Scanner(System.in);
        String StdNo=sc.next();
        switch (StdNo) {
            case "SN101":
                System.out.println("Attendance not noted");
                break;
            case "SN102":
                System.out.println("Attendance not recorded,Msg send to parents");
                break;
            case "SN103":
                System.out.println("Attendance is noted");
                break;
            case "SN104":
                System.out.println("Attendance not recorded,Msg send to parents");
                break;
            case "SN105":
                System.out.println("Attendance is noted");
                break;
            case "SN106":
                System.out.println("Attendance is noted");
                break;

        }
        System.out.println("****************************************************************");
    }
}


