/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopapplication;

import Data.User;
import Model.EmployeeModel;
import Model.MySqlHandler;
import Model.UserModel;
import View.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Data.Employee;
/**
 *
 * @author Duy.hv150601
 */
public class ShopApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MySqlHandler sql= MySqlHandler.getInstance();//su dung sql instance de truy cap vao cac methods, chi can su dung thuoc tinh static trong 1 so buoc ban dau
        // TODO code application logic here
        UserModel um= new UserModel();
        EmployeeModel em= new EmployeeModel();
        ArrayList<Employee> employees= new ArrayList<>();
        employees= em.GetAllEmployee();
        for(Employee employee: employees){
            System.out.println(employee.getFullname()+ "\t" +employee.getAddress()+ "\t" +employee.getPhoneNumber());
        }
        if(sql.connectMySQL()){
            ResultSet data= sql.ExecuteSelectQuery("Select * from Product");
            try {
                while (data.next()) {                
            }
            } catch (SQLException e) {                
            }
        }
        try {
            ArrayList<User> listUser= new ArrayList<User>();
            listUser= um.GetAllUsers();
            for(User u: listUser){
                System.out.println(u.getUsername()+ "\t"+ u.getPassword());
            }
            Login login= new Login();
            login.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
