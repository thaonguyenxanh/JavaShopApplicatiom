/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.*;


/**
 *
 * @author Duy.hv150601
 */
public class mySQLHandler {
    private Connection con= null;
    private Statement state= null;
    private ResultSet resultSet= null;
    private final String url= "jdbc:mysql://localhost:3306/shop";
    private final String password= "Hoangduytd97";
    private final String user= "root";
    
    
    public boolean getConnection(){
        try {
            this.con= DriverManager.getConnection(this.url,this.user, this.password);
            this.state= this.con.createStatement();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public void closeConnection(){
        try {
            this.con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public ResultSet executeSelect(String query){
        try {
            this.resultSet= this.state.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        } 
        return  this.resultSet;
    }
    
    public void executeQuery(String query){
        try {
            this.resultSet= this.state.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public boolean isConnected() throws SQLException{
        if(this.con.isClosed()){
            System.out.println("Closed!");
            return true;
        }
        else {
            System.out.println("Not yet!");
            return false;
        }
    }
}
