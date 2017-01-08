/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Lemme see if this work

import java.sql.*;
/**
 *
 * @author Ragulan
 */
public class Driver {
    private static Driver instance;
    
    private Driver(){
        
    }
    
    public static Driver getInstance(){
        if(instance==null)
            instance = new Driver();
        return instance;
    }
    public static Connection getConnection() throws Exception{
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","sparky");
        return myConn;
    }
    
     public static void createTable() {
        try{
        Connection con= getConnection();
        PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS budgetData(id int NOT NULL AUTO_INCREMENT, Name varchar(255), Price double, Category text, Date text, PRIMARY KEY(id))");
        create.executeUpdate();
        System.out.println("WORKED");
        }
        catch( Exception e){
           e.printStackTrace();
        }
    }
     
    
    public static void updateTable(String name, double price, String category,String date) {
        try{
        Connection con = getConnection();
        PreparedStatement myStmt= null;
        myStmt = con.prepareStatement("update budgetdata set Price = ? where Name = ? And Date = ? and Category = ?");
        
        myStmt.setDouble(1,price);
        myStmt.setString(2,name);
        myStmt.setString(3,date);
        myStmt.setString(4, category);
        myStmt.executeUpdate();
        }
        catch (Exception e){}
            
    }
    
    public static void addTable (String name, double price,String category, String date) {
        try{
        Connection con = getConnection();
        PreparedStatement myStmt= null;
        myStmt = con.prepareStatement("insert into budgetdata (Name, Price, Category, Date) values(?, ?, ?, ?)");
        
        myStmt.setString(1,name);
        myStmt.setDouble(2,price);
        myStmt.setString(3,category);
        myStmt.setString(4,date);
        
        myStmt.executeUpdate();
        }
        catch(Exception e){
             e.printStackTrace();
        }
    }
    
    public static void removeTable (String name, double price, String category, String date) {
        try{
        Connection con = getConnection();
        PreparedStatement myStmt= null;
        myStmt = con.prepareStatement("delete from budgetdata where Name = ? and Price = ? and Category = ? and Date = ?");
        
        myStmt.setString(1,name);
        myStmt.setDouble(2,price);
        myStmt.setString(3,category);
        myStmt.setString(4,date);
        
        myStmt.executeUpdate();
        }
        catch(Exception e){}
    }
    
    public static double getTotalCategoryForMonth(String category, String month, String year) {
       double total=0;
       try{
       Connection con = getConnection();
       String choose = month + "/%/" + year;
       PreparedStatement myStmt = con.prepareStatement("select Price from budgetdata where Category = ? and Date like ?");
       myStmt.setString (1,category);
       myStmt.setString (2,choose);
       
       ResultSet myRs=myStmt.executeQuery();
       
       
        while(myRs.next()){
            total = myRs.getDouble("Price");
        }
       }
       catch(Exception e){}
        return total;
    }
    
    public static ResultSet getInfoCategory (String category, String month, String year){
       ResultSet myRs = null;
               
       try{
       Connection con = getConnection();
       String choose = month + "/%/" + year;
       PreparedStatement myStmt = con.prepareStatement("select Name, Price, Date from budgetdata where Category = ? and Date like ?");
       myStmt.setString (1,category);
       myStmt.setString (2,choose);
       
       myRs=myStmt.executeQuery();
       }
       catch(Exception e ){}
       
      return myRs;
    }
    //
}
