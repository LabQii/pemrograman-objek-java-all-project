/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.akhir;

/**
 *
 * @author user
 */
import java.util.Scanner;


public class IbuData {

    static BapakData coc = new BapakData();
    static Buyer ok = new Buyer();
    static Scanner input = new Scanner(System.in);
    static int Bayar;
    static int Kembalian;
    static int pil;
    static int pilihan ;
    
    public static void main(String[] args) {
         login();
    }
    
    public static void login(){
        Login c = new Login();
        
        System.out.println("==============================================================");
        System.out.println("                 MUHAMMAD IQBAL FIRMANSYAH                    ");
        System.out.println("                       210441100084                           ");
        System.out.println("                        ~ PBO 2D ~                            ");
        System.out.println("==============================================================");
        System.out.println("");
        System.out.print("Masukkan Username   : ");
        c.nama = input.nextLine();
        System.out.print("Masukkan Password   : ");
        c.pass = input.nextLine();
        c.setUsername("asprak");
        c.setPassword("asprak123");
        
        if(c.nama.equals(c.getUsername()) && c.pass.equals(c.getPassword())){
            System.out.println("Selamat Anda Berhasil Login !! ");
            menu(); 
        }else {
            System.out.println("Data yang anda inputkan salah !!\n\n");
            login();
        }
    }

    public static void menu() {
        System.out.print("Masukkan ID Game Anda  : ");
        String name = input.nextLine();
        ok.setNamaPembeli(name);
        System.out.println("User ID "+ ok.getNamaPembeli()+", Silahkan pilih anda ingin membeli berapa Diamond? ");
        do {
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                ~ SELAMAT DATANG DI CODASHOP ~                ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("1. Beli Diamond");
            System.out.println("2. Cek Ulang Pesanan");
            System.out.println("3. Hapus Pesanan  ");
            System.out.println("4. Bayar dan Cetak Struk ");
            System.out.println("9. Keluar  ");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            
            switch(pil){
                case 1 :
                    coc.menuPilih();
                    break;
                case 2 :
                    coc.lihatPesanan();
                    break;
                case 3 :
                    System.out.print("Nomor berapa yang ingin dihapus    : ");
                    int no = input.nextInt();
                    coc.hapus(no);
                    break;
                case 4 :
                    System.out.print("Tadi Hapus data atau tidak ? Ketik 1 jika Ya, dan 2 jika Tidak : ");
                    pilihan = input.nextInt();
                    CetakStruk();
            }
        } while (pil <5);
    }
    
    public static void CetakStruk(){
        System.out.println("==============================================================");
        System.out.println("                 TERIMAKSIH TELAH ORDER DI                    ");
        System.out.println("                      ~~ CODASHOP ~~                          ");
        System.out.println("                 SEMOGA HARIMU MENYENANGKAN                   ");
        System.out.println("==============================================================");
        System.out.println("");
//        System.out.println("Nama Pembeli  : "+ ok.getNamaPembeli());
        System.out.println("Daftar Pesanan Anda :");
        coc.lihatPesanan();
        if (pilihan == 1){
            System.out.println("--------------------------------------------------------------");
            System.out.println("Total : Rp.  "                           +coc.Semua);
            System.out.print("Bayar : Rp.  "                                    );
            Bayar = input.nextInt();
            Kembalian = Bayar -coc.Semua;
        }
        else {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Total : Rp.  "                          +coc.Semua2);
            System.out.print("Bayar : Rp.  "                                    );
            Bayar = input.nextInt();
            if (Bayar < coc.Semua2) {
                System.out.println("");
                System.out.println("Silahkan Nabung Dulu !!!");
            } else {
                Kembalian = Bayar -coc.Semua2;
                System.out.println("_______________________ _");
                System.out.println("Kembalian : Rp.  " + Kembalian);
                System.out.println("");
                System.out.println("==============================================================");
                System.out.println("               ~ TERIMA KASIH TELAH TOP UP DISINI ~           ");
                System.out.println("                 ~ TETAP BOROS DAN JANGAN HEMAT ~             ");
                System.out.println("==============================================================");

            }
        } 
    }
}
          