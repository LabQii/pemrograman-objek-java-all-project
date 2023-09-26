/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.akhir;

/**
 *
 * @author user
 */

public class Buyer extends Topup {
    private String namaPembeli;
    
    @Override
    public String getNamaPembeli() {
        return namaPembeli;
    }

    @Override
    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

}
