import java.sql.*;

public class Student {
    public int SID,Zip;
    public String FName,LName,Address,City,State,email;
    public double Gpa;
    public static void main(String[]Args){
        System.out.println("Test 1");
    Student s1= new Student(4,"Frank","jones","123 Main","Atlanta","Ga",30133,"fj@yahoo.com",3.2);
    s1.Display();
        System.out.println("Test 2");
    Student s2= new Student();
    s2.SelectDB(4);
    s2.Display();
        System.out.println("Test 3");


        System.out.println("Test 4");

    }
    public Student(int Sid, String FirstName,String LastName,String Adrs,String Cty,String St,int zip,String Em,Double gpa){
         SID=Sid;FName=FirstName;LName=LastName;Address=Adrs;City=Cty;State=St;Zip=zip;email=Em;Gpa=gpa;}

    public Student(){
        SID=0;FName=" ";LName=" ";Address=" ";City=" ";State=" ";Zip=0;email=" ";Gpa=0.0;}

    public void SetSID(int ID){SID=ID;}
    public int GetSID(){return SID;}
    public void SetFName(String F){FName=F;}
    public String GetFname(){return FName;}
    public void SetLName(String L){LName=L;}
    public String GetLname(){return LName;}
    public void SetAddress(String A){Address=A;}
    public String GetAddress(){return Address;}
    public void SetCity(String C){City=C;}
    public String GetCity(){return City;}
    public void SetState(String S){State=S;}
    public String GetState(){return State;}
    public void SetZip(int Z){Zip=Z;}
    public int GetZip(){return Zip;}
    public void SetEmail(String E){email=E;}
    public String GetEmail(){return email;}
    public void SetGpa(double G){Gpa=G;}
    public double GetGpa(){return Gpa;}

    public void Display(){
        System.out.println(" Student ID: "+GetSID());
        System.out.println(" Student First Name: "+GetFname());
        System.out.println(" Student Last Name: "+GetLname());
        System.out.println(" Student Address: "+GetAddress());
        System.out.println(" Student City: "+GetCity());
        System.out.println(" Student State: "+GetState());
        System.out.println(" Student Zip: "+GetZip());
        System.out.println(" Student Email: "+GetEmail());
        System.out.println(" Student Gpa: "+GetGpa());
    }
    public void SelectDB(int pc){
        try{
            SID=pc;
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Justi/IdeaProjects/Java2Lab9/RegistrationMDB.accdb");
            System.out.println("connected");
            Statement stmt = con1.createStatement();
            String sql ="Select * from Students where ID ='"+GetSID()+"'";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();

            SetFName(rs.getString(2));
            SetLName(rs.getString(3));
            SetAddress(rs.getString(4));
            SetCity(rs.getString(5));
            SetState(rs.getString(6));
            SetZip(rs.getInt(7));
            SetEmail(rs.getString(8));
            SetGpa(rs.getDouble(9));


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void inertBD(int Sid, String FirstName,String LastName,String Adrs,String Cty,String St,int zip,String Em,double gpa) {
        SID=Sid;FName=FirstName;LName=LastName;Address=Adrs;City=Cty;State=St;Zip=zip;email=Em;Gpa=gpa;
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con2 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Justi/IdeaProjects/Java2Lab9/RegistrationMDB.accdb");
            Statement stmt2 = con2.createStatement();
            String sql2= "Insert into Students values ('"+GetSID()+"','"+ GetFname()+"','"+"'"+GetLname()+"','"+"'"+GetAddress()+"','"+"'"+GetCity()+"','"+"'"+GetState()+"','"+"'"+GetZip()+"','"+"'"+GetEmail()+"','"+"'"+GetGpa()+"')";

            System.out.println(sql2);
            int n1=stmt2.executeUpdate(sql2);
            if(n1==1)
                    System.out.println("Insert Successfull!!");
            else
                    System.out.println("Insert Failed******");
            con2.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}