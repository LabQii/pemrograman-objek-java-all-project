/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.akhir;

/**
 *
 * @author user
 */
public class Login implements LoginBuyer{
    String username, password, nama, pass;
    
    public Login (String username, String password, String nama, String pass) {
        this.username=username;
        this.password=password;
        this.nama=nama;
        this.pass=pass;
    }
    
    public Login(){
        
    }
    
    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

}
