
package com.example.pet1;


import java.sql.*;

/*************************
 *Advanced System Projects 
 *  Team 2
 * 
 * 
 *****************************/
public class OrderProcessingPerson {
    
            public int ID;
            public String Passwd;
            public String firstName;
            public String lastName;
            public String Email;
            
            public OrderProcessingPerson() {
    
                ID = 0;
                Passwd = "";
                firstName = "";
                lastName = "";
                Email = "";
                              
            }   
            
            public OrderProcessingPerson(int id, String pswd, String fName, String lName, String em) {
                
                ID = id;
                Passwd = pswd;
                firstName = fName;
                lastName = lName;
                Email = em;
                
            }
            
            public void setID (int id) {ID = id;}
            public int getID() {return ID;}
            
            public void setPasswd(String pswd) {Passwd = pswd;}
            public String getPasswd() {return Passwd;}
            
            public void setfirstName(String fName) {firstName = fName;}
            public String getfirstName() {return firstName;}
            
            public void setlastName(String lName) {lastName = lName;}
            public String getlastName() {return lastName;}
            
            public void setEmail(String em) {Email = em;}
            public String getEmail() {return Email;}
            
            
            
            //Starting here are the methods to access, update, delete and/or Insert data to Database
           
            public void SelectDB(int id) {
                ID = id;
                
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1;
                    c1=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jose9/OneDrive/Documents/SCHOOLSTUFF!!!!/CIST 2931 Advance System Project/Team2Database.accdb");

                    Statement stmt = c1.createStatement();
                    ResultSet rs = stmt.executeQuery("Select * from [Order Processing Person] where id = " + id);
                    rs.next();
                    Passwd = rs.getString(2);
                    firstName = rs.getString(3);
                    lastName = rs.getString(4);
                    Email = rs.getString(5);                   		
                
                     c1.close();
            }       
                catch(Exception se) {
                    System.out.println(se);
			}
                }    
            
            public void insertDB(int id, String pswd, String fName, String lName, String em, String addy) {
                
                ID = id;
                Passwd = pswd;
                firstName = fName;
                lastName = lName;
                Email = em;
                
                
                try {   

                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1;
                    c1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jose9/OneDrive/Documents/SCHOOLSTUFF!!!!/CIST 2931 Advance System Project/Team2Database.accdb");

                    Statement stat = c1.createStatement();
                    String sql = "Insert [Order Processing Person] values"
                         + "('" +getID()+"'," + "'"+getPasswd()+"'," + "'"+getfirstName()+"'," + "'"+getlastName()+"'," + "'"+getEmail()+"')";

                    System.out.println(sql);
                    int n1 = stat.executeUpdate(sql);
                    if(n1==1)
                        System.out.println("INSERT Successful!!!");
                    else
                        System.out.println("INSERT FAILED***********");
                        c1.close();
                 }
            
                catch(Exception e1){
                     System.out.println(e1);
             }
                
                }
            
            public void deleteDB()  {
                
                try {   

                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1;
                    c1=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jose9/OneDrive/Documents/SCHOOLSTUFF!!!!/CIST 2931 Advance System Project/Team2Database.accdb");

                    Statement stat = c1.createStatement(); 
                    String sql = "Delete from [Order Processing Person] where id = '" +getID()+"'";
                    int n = stat.executeUpdate(sql);

                
                    if (n==1)
                        System.out.println("Delete Successful!");
                    else
                        System.out.println("Delete Failed!");
                
                         c1.close();
                
                }
                catch(Exception e1){
                    System.out.println(e1);
            }
                
            }
            
            public void updateDB()  {
               
                try{
                    
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1; 
                    c1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jose9/OneDrive/Documents/SCHOOLSTUFF!!!!/CIST 2931 Advance System Project/Team2Database.accdb");          

                    String sql = "UPDATE [Order Processing Person] SET id = '"+ getID() +"', passwd = '"+ getPasswd() +"', firstName = '"+ getfirstName() +"', lastName = '"+ getlastName() +"', email = '"+ getEmail() +"', WHERE id = '"+ getID() +"'";
                    PreparedStatement pstat = c1.prepareStatement(sql);    

                    System.out.println(sql);                               
                    int n = pstat.executeUpdate(sql);
                    if (n==1)
                        System.out.println("UPDATE Successful!!!");
                    else
                         System.out.println("UPDATE FAILED***********");
                         c1.close();
        }
            catch(Exception e1){
            System.out.println(e1);
        }
            }
            
            //Will display Database info if database connects correctly
            public void display(){
                
                System.out.println("Employee ID = " + ID);
                System.out.println("Password = " + Passwd);
                System.out.println("First Name = " + firstName);
                System.out.println("Last Name = " + lastName);
                System.out.println("Email = " + Email);
                
            }
            
            
            //Just to test and see of it connects to Database
            public static void main(String args[]) {
                
                OrderProcessingPerson p1 = new OrderProcessingPerson();
                p1.SelectDB(1);            
                p1.display();
            }
}
