package com.example.pet1.BusinessObjects;

import java.sql.*;

/*****************************
 *  Advanced System Projects 
 *  Team 2 
 *  
 * 
 ***************************************/
public class Customer {
    
            public int custID;
            public String passwd;
            public String firstName;
            public String lastName;
            public String email;
            public String address;
            
            
            public Customer() {
                custID = 0;
                passwd = "";
                firstName = "";
                lastName = "";
                email = "";
                address = "";
            }
            
            public Customer(int id, String pswd, String fName, String lName, String em, String addy ) {
                custID = id;
                passwd = pswd;
                firstName = fName;
                lastName = lName;
                email = em;
                address = addy;
            }

            public void setcustID(int id) {custID = id;}
            public int getcustID() {return custID;}
            
            public void setpasswd(String pswd) {passwd = pswd;}
            public String getpasswd() {return passwd;}
            
            public void setfirstName(String fName) {firstName = fName;}
            public String getfirstName() {return firstName;}
            
            public void setlastName(String lName) {lastName = lName;}
            public String getlastName() {return lastName;}
            
            public void setemail(String em) {email = em;}
            public String getemail() {return email;}
            
            public void setaddress(String addy) {address = addy;}
            public String getaddress() {return address;}
            

           //Starting here are the methods to access, update, delete and/or Insert data to Database

            public void SelectDB(int id)
            {
                custID = id;
                try
                {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1;
                    c1=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Justi/OneDrive/Documents/GitHub/Java/Pet1/src/main/java/com/example/pet1/Team2Database.accdb");

                    Statement stmt = c1.createStatement();
                    ResultSet rs = stmt.executeQuery(String.format("Select * from Customer where custID = %d", id));
                    rs.next();
                    passwd = rs.getString(2);
                    firstName = rs.getString(3);
                    lastName = rs.getString(4);
                    email = rs.getString(5);
                    address = rs.getString(6);
		
                
                     c1.close();
                     }
                catch(Exception se) {
                    System.out.println(se);}
            }
            
            public void insertDB(int id, String pswd, String fName, String lName, String em, String addy)
            {
                custID = id;
                passwd = pswd;
                firstName = fName;
                lastName = lName;
                email = em;
                address = addy;
                
                try {   

                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1;
                    c1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Justi/OneDrive/Documents/GitHub/Java/Pet1/src/main/java/com/example/pet1/Team2Database.accdb");

                    Statement stat = c1.createStatement();
                    String sql = String.format("Insert Customer values('%d','%s','%s','%s','%s','%s')", getcustID(), getpasswd(), getfirstName(), getlastName(), getemail(), getaddress());

                    System.out.println(sql);
                    int n1 = stat.executeUpdate(sql);
                    if(n1==1)
                        System.out.println("INSERT Successful!!!");
                    else{
                        System.out.println("INSERT FAILED***********");
                        c1.close();}
                 }
            
                catch(Exception e1){
                     System.out.println(e1);}
            }
            
            public void deleteDB()
            {
                try
                {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1;
                    c1=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Justi/OneDrive/Documents/GitHub/Java/Pet1/src/main/java/com/example/pet1/Team2Database.accdb");

                    Statement stat = c1.createStatement(); 
                    String sql = String.format("Delete from Customer where custID = '%d'", getcustID());
                    int n = stat.executeUpdate(sql);

                
                    if (n==1)
                        System.out.println("Delete Successful!");
                    else
                    {System.out.println("Delete Failed!");
                         c1.close();}
                
                }
                catch(Exception e1){
                    System.out.println(e1);}
                
            }
            
            public void updateDB()  {
               
                try{
                    
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1; 
                    c1 = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Justi\\OneDrive\\Documents\\GitHub\\Java\\Pet1\\Pet_Store\\Team2Database.accdb");

                    String sql = String.format("UPDATE Customer SET custID = '%d', passwd = '%s', firstName = '%s', lastName = '%s', email = '%s', address = '%s', WHERE custId = '%d'", getcustID(), getpasswd(), getfirstName(), getlastName(), getemail(), getaddress(), getcustID());
                    PreparedStatement pstat = c1.prepareStatement(sql);    

                    System.out.println(sql);                               
                    int n = pstat.executeUpdate(sql);
                    if (n==1){
                        System.out.println("UPDATE Successful!!!");}
                    else{
                         System.out.println("UPDATE FAILED***********");
                         c1.close();}
                }
                catch(Exception e1){
                System.out.println(e1);
                }
            }
           
            //Will display Database info if database connects correctly
//            public void display(){
//
//                System.out.println("Customer ID = " + custID);
//                System.out.println("Password = " + passwd);
//                System.out.println("First Name = " + firstName);
//                System.out.println("Last Name = " + lastName);
//                System.out.println("Email = " + email);
//                System.out.println("Address = " + address);
//            }
            
            
            //Just to test and see of it connects to Database
            public static void main(String[] args) {
                
                //Customer c1 = new Customer();
                //c1.SelectDB(1001);
                //c1.display();
            }
}
