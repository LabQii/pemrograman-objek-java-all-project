package project.sistemRumahMakan;
import project.Makanan.DataMakanan;
import project.Pembeli.Customer;
import project.loginActive.Login;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {


    static DataMakanan foodBase = new DataMakanan();
    static Customer buyer = new Customer();
    static Scanner input = new Scanner(System.in);
    static int Bayar;
    static int Kembalian;
    static int pil;
    static int pilihan;

    public static void main(String[] args) throws InterruptedException {
        login();
    }

    public static void login() throws InterruptedException {
        Login active = new Login();

        System.out.println("==============================================================");
        System.out.println("                 SELAMAT DATANG DI LOGIN ADMIN                ");
        System.out.println("==============================================================");
        System.out.print("Masukkan Username   : ");
        active.nama = input.nextLine();
        System.out.print("Masukkan Password   : ");
        active.pass = input.nextLine();
        active.setUsername("asprak");
        active.setPassword("asprak123");

        if (active.nama.equals(active.getUsername()) && active.pass.equals(active.getPassword())) {
            System.out.println("Login Berhasil !! ");
            tanyaNama();
        } else {
            System.out.println("Inputan Anda Salah !!\n\n");
            login();
        }
    }

    public static void tanyaNama() throws InterruptedException {
        System.out.print("Masukkan nama anda  : ");
        String name = input.nextLine();
        buyer.setNamaPembeli(name);
        System.out.println("\n\nHallo " + buyer.getNamaPembeli() + ", Silahkan Memesan Makanan dan Selamat Menikmati ");
        menu();
    }

    public static void menu() throws InterruptedException {
        do {
            System.out.println("\n===========================================================");
            System.out.println("        ~ SELAMAT DATANG DI RUMAH MAKAN MBAK YANTI  ~                     ");
            System.out.println("===========================================================");
            System.out.println("1. Lihat Daftar Menu dan Pilih");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Hapus");
            System.out.println("4. Bayar dan Cetak Struk");
            System.out.println("5. Keluar");
            System.out.print("Pilih => ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    foodBase.menuPilih();
                    break;
                case 2:
                    foodBase.lihatPesanan();
                    break;
                case 3:
                    System.out.print("Nomor berapa yang ingin dihapus    : ");
                    int no = input.nextInt();
                    foodBase.hapus(no);
                    break;
                case 4:
                    System.out.print("Tadi Hapus Pemesanan atau tidak ?\n[1] Iya\n[2] Tidak\nPilih => ");
                    pilihan = input.nextInt();
                    CetakStruk();
                    break;
                case 5:
                    System.out.println("\n\n===== TERIMAKASIH TELAH MAMPIR =====");
                    break;
                default:
                    System.out.println("Kamu Salah Memasukkan Kode");
                    sleep(1500);
                    System.out.println("Mohon Ulangi Lagi");
                    sleep(1500);
                    menu();
            }
        } while (pil < 5);
    }


    public static void CetakStruk() throws InterruptedException {
        System.out.println("==============================================================");
        System.out.println("                      RUMAH MAKAN KUSIRI                      ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("              Jalan in Aja Dulu, No. 01, Hatimuu              ");
        System.out.println("==============================================================");
        System.out.println("\nNama Pembeli  : " + buyer.getNamaPembeli());
        System.out.println("Daftar Pesanan Anda :");
        foodBase.lihatPesanan();
        if (pilihan == 1) {
            System.out.println("                                 Total         : Rp.  " + foodBase.Semua);
            System.out.print("                                 Bayar         : Rp.  ");
            Bayar = input.nextInt();
            if (Bayar < foodBase.Semua) {
                System.out.println("YEE NGUTANG");
                System.out.println("KELUAR AJA!");
                menu();
            } else {
                Kembalian = Bayar - foodBase.Semua;
                System.out.println("                                                ______________ _");
                System.out.println("                                 Kembalian     : Rp.  " + Kembalian);
                System.out.println("\n");
                System.out.println("                                                Admin   \n\n");
                System.out.println("                                                Iqbal ");
                System.out.println("\n                ~ TERIMA KASIH SUDAH MEMESAN ~                \n");
                System.out.println("==============================================================");
                System.out.println("                    ~ SEMOGA ANDA BELI LAGI ~                 ");
                System.out.println("==============================================================");
            }
        } else {
            System.out.println("                                 Total         : Rp.  " + foodBase.Semua2);
            System.out.print("                                 Bayar         : Rp.  ");
            Bayar = input.nextInt();
            if (Bayar < foodBase.Semua2) {
                System.out.println("YEE NGUTANG");
                System.out.println("KELUAR AJA!");
                menu();
            } else {
                Kembalian = Bayar - foodBase.Semua2;
                System.out.println("                                                ______________ _");
                System.out.println("                                 Kembalian     : Rp.  " + Kembalian);
                System.out.println("\n");
                System.out.println("                                                Admin   \n\n");
                System.out.println("                                                Iqbal ");
                System.out.println("\n                ~ TERIMA KASIH SUDAH MEMESAN ~                \n");
                System.out.println("==============================================================");
                System.out.println("                    ~ SEMOGA ANDA BELI LAGI ~                 ");
                System.out.println("==============================================================");
            }
        }
        System.out.println("\n\nAnda Akan Kembali ke Home");
        sleep(1500);
        System.out.println("\nMasukkan 5 Jika Ingin Keluar");
        sleep(2000);
    }
}



