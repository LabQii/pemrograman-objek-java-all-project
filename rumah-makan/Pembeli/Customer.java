package project.Pembeli;

public class Customer extends ProsesPembeli {
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