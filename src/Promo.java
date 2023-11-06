public class Promo {
    private int Id_Promo;
    private int promoPercentage;
    private int maksimumClaim;
    private int minimumPembayaran;
    private boolean aktif;
    private String namaPromo;
    private String deskripsi;
    private String tanggalMulai;
    private String tanggalBerakhir;

    public Promo(int Id_Promo, String namaPromo, String deskripsi, String tanggalMulai, String tanggalBerakhir, int promoPercentage, int maksimumClaim, int minimumPembayaran) {
        this.Id_Promo = Id_Promo;
        this.namaPromo = namaPromo;
        this.deskripsi = deskripsi;
        this.tanggalMulai = tanggalMulai;
        this.tanggalBerakhir = tanggalBerakhir;
        this.promoPercentage = promoPercentage;
        this.maksimumClaim = maksimumClaim;
        this.minimumPembayaran = minimumPembayaran;
        this.aktif = true;
    }


    public int getId_Promo() {
        return Id_Promo;
    }

    public void setId_Promo(int Id_Promo) {
        this.Id_Promo = Id_Promo;
    }

    public int getPromoPrecentage(int promoPrecentage) {
        return promoPrecentage;
    }

    public void setPromoPrecentage(int promoPrecentage) {
        this.promoPercentage = promoPercentage;
    }

    public int getMaksimumClaim() {
        return maksimumClaim;
    }

    public void setMaksimumClaim(int maksimumClaim) {
        this.maksimumClaim = maksimumClaim;
    }

    public int getMinimumPembayaran() {
        return minimumPembayaran;
    }

    public void setMinimumPembayaran(int minimumPembayaran) {
        this.minimumPembayaran = minimumPembayaran;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public String getNamaPromo() {
        return namaPromo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public String getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    public void setTanggalBerakhir(String tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
    }
}
