/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.akhir;

/**
 *
 * @author user
 */
public class List extends Topup {
    public String namaBarang;
    public int no,harga,jumlah,hargaTotal;

    public List(int no,String namaBarang,int harga,int jumlah,int hargaTotal) {
        this.no=no;
        this.namaBarang=namaBarang;
        this.harga=harga;
        this.jumlah=jumlah;
        this.hargaTotal=hargaTotal;
    }
    @Override
    public String getNamaPembeli() {
        return null;
    }

    @Override
    public void setNamaPembeli(String namaPembeli) {
        
    }

    public String getNama() {
        return namaBarang;
    }

    public void setNama(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    
}
