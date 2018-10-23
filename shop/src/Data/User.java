/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Duy.hv150601
 */
public class User {
    protected String fullname, username, password, address, number;
    private int id;
    protected String role;
    
    public User(String fullname, String username, String password, String address, String number, int id, String role) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.address = address;
        this.number = number;
        this.id = id;
        this.role = role;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
