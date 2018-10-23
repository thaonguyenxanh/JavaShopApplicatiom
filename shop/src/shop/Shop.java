
package shop;
import Data.Product;
import Data.Product;
import java.net.URL;
import java.sql.*;
import java.util.Scanner;
import Model.mySQLHandler;

/**
 *
 * @author Duy.hv150601
 */
public class Shop {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws SQLException {
        Scanner input= new Scanner(System.in);
        // TODO code application logic here
        mySQLHandler sql= new mySQLHandler();
        Product pro= new Product();
        ResultSet data= null;
        pro.showAllElements();
        String name;
        System.out.println("Input the product name to find the detail: ");
        name= input.nextLine();
        System.out.println(pro.FindElementByName(name));
        
        
    }
    
}
