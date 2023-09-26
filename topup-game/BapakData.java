/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.akhir;

/**
 *
 * @author user
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BapakData extends Topup {
    ArrayList<List> list = new ArrayList();
    Scanner input = new Scanner(System.in);
    
    String namaBarang = null;
    int harga = 0,jumlah = 0,hargaTotal=0, TotalSemua = 0, TotalSemua2;
    static int Semua, Semua2;
    int no = 1;
    int pilih,banyak;
    
    
    void menuPilih() {
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("              ~ JANGAN HEMAT DAN TETAPLAH BOROS ~             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\nMasukkan berapa jumlah paket diamond yang ingin anda beli : ");
        banyak = input.nextInt();
        for(int i = 0 ; i<banyak ; i++){
            System.out.println("---------------------------------------------");
            System.out.println("No |     Nama Barang        |     Harga     |");
            System.out.println("---------------------------------------------");
            System.out.println("1. |     COC 100 GEMS       |   Rp 10.000   |");
            System.out.println("2. |     COC 200 GEMS       |   Rp 20.000   |");
            System.out.println("3. |     COC 300 GEMS       |   Rp 30.000   |");
            System.out.println("4. |     COC 400 GEMS       |   Rp 40.000   |");
            System.out.println("5. |     COC 500 GEMS       |   Rp 50.000   |");
            System.out.println("6. |     COC 600 GEMS       |   Rp 60.000   |");
            System.out.println("7. |     COC 700 GEMS       |   Rp 70.000   |");
            System.out.println("8. |     COC 800 GEMS       |   Rp 80.000   |");
            System.out.println("9. |     COC 900 GEMS       |   Rp 90.000   |");
            System.out.println("10.|     COC 1000 GEMS      |   Rp 100.000  |");
            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.print("Silahkan pilih ingin membeli Diamond nomor berapa ? : ");
            pilih = input.nextInt();
            switch (pilih){
                case 1 :
                    namaBarang = "COC 100 GEMS";
                    harga = 10000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 2 :
                    namaBarang = "COC 200 GEMS";
                    harga = 20000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 3 :
                    namaBarang = "COC 300 GEMS";
                    harga = 30000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 4 :
                    namaBarang = "COC 400 GEMS";
                    harga = 40000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 5 :
                    namaBarang = "COC 500 GEMS";
                    harga = 50000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 6 :
                    namaBarang = "COC 600 GEMS";
                    harga = 60000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 7 :
                    namaBarang = "COC 700 GEMS";
                    harga = 70000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 8 :
                    namaBarang = "COC 800 GEMS";
                    harga = 80000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 9 :
                    namaBarang = "COC 900 GEMS";
                    harga = 90000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                case 10 :
                    namaBarang = "COC 1000 GEMS";
                    harga = 100000;
                    System.out.print("Beli Berapa ?  ");
                    jumlah = input.nextInt();
                    break;
                default :
                    System.out.println("Anda Salah Menginputkan, Mohon Diulangi  ");
                    break;
            }
            hargaTotal = jumlah * harga;
            list.add(new List(no, namaBarang,harga, jumlah, hargaTotal));
            no++;
        }
    }
    
    void lihatPesanan() {
        System.out.println("");
        System.out.println("");
        System.out.println("| NO |"+"  Nama Barang |"+"  Harga |"+"  Jumlah |"+"  Harga Total |");
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println("|  "+ list.get(i).getNo()+ "   " + list.get(i).getNamaBarang()+"      "+list.get(i).getHarga()+"       "+list.get(i).getJumlah()+"    "+list.get(i).getHargaTotal()+"     |"); 
            TotalSemua += list.get(i).getHargaTotal();
            TotalSemua2 += list.get(i).getHargaTotal();
            Semua2 = TotalSemua2/1;
        }
    }
    
    void hapus(int no) {
        for (int i = 0; i < list.size(); i++) {
            if (no == list.get(i).getNo()) {
                Semua = TotalSemua - list.get(i).getHargaTotal();
                list.remove(list.get(i));
                System.out.println("");
                System.out.println("~~~~~~~~~~ Data Telah Di Hapus ~~~~~~~~~~~");
                System.out.println("==========================================");
            }
        }
    }
    
    @Override
    public String getNamaPembeli() {
        return null;
    }

    @Override
    public void setNamaPembeli(String namaPembeli) {
        
    }

}
