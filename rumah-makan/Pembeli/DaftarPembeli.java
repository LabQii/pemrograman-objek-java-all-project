package project.Pembeli;

public class DaftarPembeli extends ProsesPembeli {
    public String jenisMakanan;
    public int no, harga, jumlah, hargaTotal;

    public DaftarPembeli(int no, String jenisMakanan, int harga, int jumlah, int hargaTotal) {
        this.no = no;
        this.jenisMakanan = jenisMakanan;
        this.harga = harga;
        this.jumlah = jumlah;
        this.hargaTotal = hargaTotal;
    }

    @Override
    public String getNamaPembeli() {
        return null;
    }

    @Override
    public void setNamaPembeli(String namaPembeli) {

    }

    public int getNo() {
        return no;
    }


    public int getHarga() {
        return harga;
    }


    public int getJumlah() {
        return jumlah;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public String getjenisMakanan() {
        return jenisMakanan;
    }

}