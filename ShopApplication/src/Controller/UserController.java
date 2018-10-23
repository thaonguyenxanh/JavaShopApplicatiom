/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.UserModel;
import Data.User;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Duy.hv150601
 */
public class UserController {
    private final UserModel userModel= new UserModel();
    
    public User Login(String Username, String Password){
        User user= new User();
        user= userModel.SearchUserByUsername(Username);
        if ((user!= null) && (user.getPassword().equals(Password))) {
            return user;
        }
        return null;
    }
    public ArrayList<User> GetAllUser() throws SQLException{
        return userModel.GetAllUsers();
    }
    public boolean CreateNewAccount(String Username, String Password, String Fullname, String Address, String PhoneNumber){
        return userModel.CreateNewAccount(Username, Password, Fullname, Address, PhoneNumber, 3)== true;
    }
    public void ChangePassword(String Username, String newPassword, String OldPassword){
        userModel.ChangePassword(Username, newPassword);
    }
    public UserModel getInformation(String Username) throws SQLException{
        UserModel user= new UserModel();
        user= userModel.getInformation(Username);
        return user;
    }
    public boolean UpdateInformation(String Fullname, String Address, String PhoneNumber, String Username){
        if (userModel.UpdateInformation(Fullname, Address, PhoneNumber, Username)) {
            return true;
        }
        return false;
    }
}
