/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
    
     public static void createTable() throws Exception {
        Connection con= getConnection();
        PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS budgetData(id int NOT NULL AUTO_INCREMENT, Name varchar(255), Price double, Category text, Date text, PRIMARY KEY(id))");
        create.executeUpdate();
    }
     
    
    public static void updateTable(String name, double price, String date)throws Exception {
        Connection con = getConnection();
        PreparedStatement myStmt= null;
        ResultSet myRs = null;
        myStmt = con.prepareStatement("select * from budgetdata where Name = ? AND Price = ? And Date = ?");
        
        myStmt.setString(1,name);
        myStmt.setDouble(2,price);
        myStmt.setString(3,date);
        
        myRs = myStmt.executeQuery();
            
    }
    
    public static void addTable (String name, double price,String category, String date) throws Exception {
        Connection con = getConnection();
        PreparedStatement myStmt= null;
        ResultSet myRs = null;
        myStmt = con.prepareStatement("insert into budgetdata (Name, Price, Category, Date) values(?, ?, ?, ?)");
        
        myStmt.setString(1,name);
        myStmt.setDouble(2,price);
        myStmt.setString(3,category);
        myStmt.setString(4,date);
        
        myRs = myStmt.executeQuery();
    }
    
    public static void removeTable (String name, double price, String category, String date) throws Exception {
        Connection con = getConnection();
        PreparedStatement myStmt= null;
        ResultSet myRs = null;
        myStmt = con.prepareStatement("delete from budgetdata where Name = ? and Price = ? and Category = ? and Date = ?");
        
        myStmt.setString(1,name);
        myStmt.setDouble(2,price);
        myStmt.setString(3,category);
        myStmt.setString(4,date);
        
        myRs = myStmt.executeQuery();
    }
    
    public static double getTotalCategoryForMonth(String category, String month, String year) throws Exception {
       Connection con = getConnection();
       String choose = month + "%" + year;
       PreparedStatement myStmt = con.prepareStatement("select Price from budgetdata where Category = ? and Date like ?");
       myStmt.setString (1,category);
       myStmt.setString (2,choose);
       
       ResultSet myRs=myStmt.executeQuery();
       double total=0;
       
        while(myRs.next()){
            total = myRs.getDouble("Price");
        }
        return total;
    }
    
}
