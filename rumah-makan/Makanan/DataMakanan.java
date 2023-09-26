package project.Makanan;

import project.Pembeli.DaftarPembeli;
import project.Pembeli.ProsesPembeli;
import java.util.ArrayList;
import java.util.Scanner;

import static project.sistemRumahMakan.Main.menu;


public class DataMakanan extends ProsesPembeli {
    ArrayList<DaftarPembeli> list = new ArrayList();
    Scanner input = new Scanner(System.in);

    int harga = 0, jumlah = 0, hargaTotal = 0, TotalSemua = 0, TotalSemua2;
    public static int Semua;
    public static int Semua2;
    int no = 1;
    int pilih, banyak, loop;
    private String jenisMakanan;

    public void jikaLoop() throws InterruptedException {
        System.out.println("Ingin mengulang pilih menu lagi?");
        System.out.print("[1] Iya\n[2] Kembali ke Home\n=> ");
        loop = input.nextInt();
        if (loop == 1) {
            daftarMenu();
        } else if (loop == 2) {
            System.out.println("Yee ga milih\n\n");
            menu();
        } else {
            System.out.println("Literasi dong!");
            jikaLoop();
        }
    }

    public void daftarMenu() throws InterruptedException {
        System.out.println("======================================================");
        System.out.println("No |\t\tMenu Makanan            |       Harga     |");
        System.out.println("------------------------------------------------------");
        System.out.println("1. |\t\tSate Ayam (10 tusuk)    |   Rp. 15.000    |");
        System.out.println("2. |\t\tAyam Bakar              |   Rp. 12.000    |");
        System.out.println("3. |\t\tSoto                    |   Rp. 10.000    |");
        System.out.println("4. |\t\tBakso                   |   Rp. 10.000    |");
        System.out.println("5. |\t\tCapcay                  |   Rp. 8.000     |");
        System.out.println("6. |\t\tOseng Kangkung          |   Rp. 8.000     |");
        System.out.println("7. |\t\tAyam Geprek             |   Rp. 8.000     |");
        System.out.println("8. |\t\tSayur Bayam             |   Rp. 6.000     |");
        System.out.println("9. |\t\tTelur Balado            |   Rp. 5.000     |");
        System.out.println("10.|\t\tNasi                    |   Rp. 3.000     |");
        System.out.println("======================================================");
        System.out.println("");
        System.out.print("Masukkan pilihan menu makanan : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                jenisMakanan = "Sate Ayam (10 tusuk)";
                harga = 15000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 2:
                jenisMakanan = "Ayam Bakar\t";
                harga = 12000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 3:
                jenisMakanan = "Soto\t";
                harga = 10000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 4:
                jenisMakanan = "Bakso\t";
                harga = 10000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 5:
                jenisMakanan = "Capcay\t";
                harga = 8000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 6:
                jenisMakanan = "Oseng Kangkung\t";
                harga = 8000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 7:
                jenisMakanan = "Ayam Geprek\t";
                harga = 8000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 8:
                jenisMakanan = "Sayur Bayam\t";
                harga = 6000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 9:
                jenisMakanan = "Telur Balado\t";
                harga = 5000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            case 10:
                jenisMakanan = "Nasi\t";
                harga = 3000;
                System.out.print("Berapa banyak ?  ");
                jumlah = input.nextInt();
                break;
            default:
                System.out.println("Kode yang anda masukkan gada loh yaa");
                jikaLoop();


        }
    }

    public void menuPilih() throws InterruptedException {
        System.out.println("\n\n===============================================================");
        System.out.println("                      DAFTAR MENU MAKANAN                      ");
        System.out.println("===============================================================");
        System.out.print("\nMasukan Jumlah Menu yang akan dipesan : ");
        banyak = input.nextInt();
        for (int i = 0; i < banyak; i++) {
            daftarMenu();
            hargaTotal = jumlah * harga;
            list.add(new DaftarPembeli(no, jenisMakanan, harga, jumlah, hargaTotal));
            no++;
        }
    }

    public void lihatPesanan() {
        System.out.println("\n\n======================================================================");
        System.out.println("                          LIHAT PESANAN ANDA                          ");
        System.out.println("======================================================================");
        System.out.println("| NO |" + " Menu Makanan\t\t\t |" + " Harga\t |" + "  Jumlah\t|" + "\tHarga Total\t |");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("|  " + list.get(i).getNo() + " | " + list.get(i).getjenisMakanan() + "\t | \t" + list.get(i).getHarga() + "\t |\t   " + list.get(i).getJumlah() + "\t|  \t" + list.get(i).getHargaTotal() + "\t\t |");
            TotalSemua += list.get(i).getHargaTotal();
            TotalSemua2 += list.get(i).getHargaTotal();
            Semua2 = TotalSemua2 / 2;
        }
    }

    public void hapus(int no) {
        for (int i = 0; i < list.size(); i++) {
            if (no == list.get(i).getNo()) {
                Semua = TotalSemua - list.get(i).getHargaTotal();
                list.remove(list.get(i));
                System.out.println("Data Telah Di Hapus");
                System.out.println("=============================================================");
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
