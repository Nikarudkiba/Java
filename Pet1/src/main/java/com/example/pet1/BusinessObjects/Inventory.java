
package com.example.pet1.BusinessObjects;
import java.sql.*;
/*****************************
 *  Advanced System Projects 
 *  Team 2 
 *  
 * 
 ***************************************/
public class Inventory {
    
            public int ItemID;
            public String ItemName;
            public String Price;
            public String Category;
            public int Quantity;
            
            public Inventory()  {
                
                ItemID = 0;
                ItemName= "";
                Price = "";
                Category = "";
                Quantity = 0;
               
            }
            public Inventory(int id, String name, String price, String category, int quantity) {
                
                ItemID = id;
                ItemName= name;
                Price = price;
                Category = category;
                Quantity = quantity;
                        
            }
            
            
            public void setItemID(int id) {ItemID = id;}
            public int getItemID() {return ItemID;}
            
            public void setItemName(String name) {ItemName = name;}
            public String getItemName() {return ItemName;}
            
            public void setPrice(String price) {Price = price;}
            public String getPrice() {return Price;}
            
            public void setCategory(String category) {Category = category;}
            public String getCategory() {return Category;}
            
            public void setQuantity(int quantity) {Quantity = quantity;} 
            public int getQuantity() {return Quantity;}
            
            
            //Starting here are the methods to access, update, delete and/or Insert data to Database
           
            
            public void SelectDB(int id) {
               ItemID = id;
                
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1;
                    c1=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jose9/OneDrive/Documents/SCHOOLSTUFF!!!!/CIST 2931 Advance System Project/Team2Database.accdb");

                    Statement stmt = c1.createStatement();
                    ResultSet rs = stmt.executeQuery("Select * from Inventory where ItemID = "+ id);
                    
                    rs.next();
                    
                    ItemName = rs.getString(2);
                    Price = rs.getString(3);
                    Category = rs.getString(4);
                    Quantity = rs.getInt(5);
                    
		
                
                     c1.close();
            }       
                catch(Exception se) {
                    System.out.println(se);
			}
                }    
            
            public void insertDB(int id, String name, String price, String category, int quantity) {
                
                ItemID = id;
                ItemName= name;
                Price = price;
                Category = category;
                Quantity = quantity;
                
                try {   

                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection c1;
                    c1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/jose9/OneDrive/Documents/SCHOOLSTUFF!!!!/CIST 2931 Advance System Project/Team2Database.accdb");

                    Statement stat = c1.createStatement();
                    String sql = "Insert Inventory values"
                         + "('" +getItemID()+"'," + "'"+getItemName()+"'," + "'"+getPrice()+"'," + "'"+getCategory()+"'," + "'"+getQuantity()+"')";

                    System.out.println(sql);
                    int n1 = stat.executeUpdate(sql);
                    if(n1==1)
                    { System.out.println("INSERT Successful!!!");}
                    else
                    {
                        System.out.println("INSERT FAILED***********");
                        c1.close();
                    }
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
                    String sql = "Delete from Inventory where ItemID = '" +getItemID()+"'";
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

                    String sql = "UPDATE Inventory SET ItemID = '"+ getItemID() +"', ItemName = '"+ getItemName() +"', Price = '"+ getPrice() +"', Category = '"+ getCategory() +"', Quantity = '"+ getQuantity() +"'";
                    PreparedStatement pstat = c1.prepareStatement(sql);    

                    System.out.println(sql);                               
                    int n = pstat.executeUpdate(sql);
                    if (n==1)
                    { System.out.println("UPDATE Successful!!!");}
                    else
                    {System.out.println("UPDATE FAILED***********");
                         c1.close();}
        }
            catch(Exception e1){
            System.out.println(e1);
        }
            }
            
            
            
            
            public void display(){
                
                System.out.println("Item ID = " + ItemID);
                System.out.println("Item Name = " + ItemName);
                System.out.println("Price = " + Price);
                System.out.println("Category= " + Category);
                System.out.println("Quanitiy = " + Quantity);

            }
            
            
            //Just to test and see of it connects to Database
            public static void main(String args[]) {
                
                Inventory i1 = new Inventory();
                i1.SelectDB(1);            
                i1.display();
            }
    
}
