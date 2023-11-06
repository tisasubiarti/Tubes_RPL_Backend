public class Pelanggan extends User {
    private int Pelanggan_Id;
    private String JenisKelamin;
    private String Alamat;
    private int NoTelp;

    public Pelanggan(String nama, String email, String username, String password, String JenisKelamin, String Alamat, int NoTelp) {
        super(nama, email, username, password);
        this.JenisKelamin = JenisKelamin;
        this.Alamat = Alamat;
        this.NoTelp = NoTelp;
    }

    public String getUserType(){
        return "Pelanggan";
    }


    public void viewPromo(Promo promo) {
        if (promo.isAktif()) {
            System.out.println("Promo: " + promo.getNamaPromo());
            System.out.println("Deskripsi: " + promo.getDeskripsi());
            System.out.println("Tanggal Mulai: " + promo.getTanggalMulai());
            System.out.println("Tanggal Berakhir: " + promo.getTanggalBerakhir());
        } else {
            System.out.println("Promo " + promo.getNamaPromo() + " sudah tidak aktif.");
        }
    }

    public void addAtributBerkendara() {

    }
}
