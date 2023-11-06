public class Kendaraan {
    private int Kendaraan_Id;
    private String jenisKendaraan;
    private String merkKenderaan;
    private int ccKendaraan;
    private int harga;

    public Kendaraan(int Kendaraan_Id, String jenisKendaraan, String merkKenderaan, int ccKendaraan, int harga) {
        this.Kendaraan_Id = Kendaraan_Id;
        this.jenisKendaraan = jenisKendaraan;
        this.merkKenderaan = merkKenderaan;
        this.ccKendaraan = ccKendaraan;
        this.harga = harga;
    }



    public int getKendaraan_Id() {
        return Kendaraan_Id;
    }

    public void setKendaraan_Id(int Kendaraan_Id) {
        this.Kendaraan_Id = Kendaraan_Id;
    }


    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getMerkKenderaan() {
        return merkKenderaan;
    }

    public void setMerkKenderaan(String merkKenderaan) {
        this.merkKenderaan = merkKenderaan;
    }

    public int getCcKendaraan() {
        return ccKendaraan;
    }

    public void setCcKendaraan(int ccKendaraan) {
        this.ccKendaraan = ccKendaraan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


}
