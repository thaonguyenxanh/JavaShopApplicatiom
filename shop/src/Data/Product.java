/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import Model.mySQLHandler;

/**
 *
 * @author Duy.hv150601
 */
public class Product {
    private int productId;
    public String name, detail;
    public int price, numbers;
    mySQLHandler sql= new mySQLHandler();

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public int checkIfEmpty(){
        String query= "Select * from product";
        if (sql.getConnection()== true) {
            ResultSet products= sql.executeSelect(query);
            try {
                while(products.next()){
                    if(products.getInt(3)==0){
                        return products.getInt(1);
                    }                               
            }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return 0;
    }
    
    public void addNewProduct(String name, int numbers, int price, String detail){
        String query= "insert into product (name, numbers, price, detail) values ('"+name+"', "+Integer.toString(numbers)+","+ Integer.toString(price) +", '"+detail+"');";
        if(sql.getConnection()== true){
            sql.executeQuery(query);
        }   
    }
    public void deleteProduct(){
        
    }
    public String FindElementByName(String Name){
        String query= "Select name from product";
        String nameFound= null;
        if(sql.getConnection()== true){
            ResultSet data= sql.executeSelect(query);
            String[] listName = null;
            int i= 0;
            try {
                while(data.next()){
                listName[i]= data.getString(1);
            }
            for (int j = 0; j < listName.length; j++) {
                if(listName[j]== Name){
                    nameFound= listName[j];
                }
                else{
                    return null;
                }
            }

            } catch (Exception e) {
            }
        }
        else{
            return null;
        }
        return nameFound;
    }
    public void showAllElements(){
        String query= "select * from product";
        if(sql.getConnection()== true){
            ResultSet products= sql.executeSelect(query);
            try {
                while (products.next()) {                    
                    System.out.println(products.getInt(1)+ " "+ products.getString(2)+" "+ products.getInt(3)+ " "+ products.getInt(4)+" "+ products.getString(5));
                }
                sql.closeConnection();
            } 
            catch (Exception e) {
            }
        }
    }
}
