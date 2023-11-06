import java.util.ArrayList;
import java.util.List;
public class Admin extends User  {

        private List<Promo> promoList;
        private List<Kendaraan> KendaraanList;

        public Admin(String nama, String email, String username, String password) {
            super(nama, email, username, password);
            promoList = new ArrayList<>();
            KendaraanList = new ArrayList<>();
        }

//        Menambahkan Promo
        public void addPromo(int Id_Promo, String namaPromo, String deskripsi, String tanggalMulai, String tanggalBerakhir, int promoPercentage, int maksimumClaim, int minimumPembayaran) {
            // Membuat objek Promo berdasarkan parameter yang diberikan.
            Promo newPromo = new Promo(Id_Promo, namaPromo, deskripsi, tanggalMulai,tanggalBerakhir, promoPercentage, maksimumClaim, minimumPembayaran );

            // Menyimpan objek Promo ke dalam promoList atau tempat penyimpanan yang sesuai.
            promoList.add(newPromo);
        }
        // Menambahkan kendaraan
        public void addKendaraan(int Kendaraan_Id, String jenisKendaraan, String merkKendaraan, int ccKendaraan, int harga){
            Kendaraan newKendaraan = new Kendaraan(Kendaraan_Id, jenisKendaraan, merkKendaraan, ccKendaraan, harga);
            KendaraanList.add(newKendaraan);
        }




//   Mengupdate kendaraan
        public void updateKendaraan(int Kendaraan_Id, String jenisKendaraan, String merkKendaraan, int ccKendaraan, int harga){
            for(Kendaraan kendaraan : KendaraanList){
                if (kendaraan.getJenisKendaraan().equals(jenisKendaraan)){
                    kendaraan.setHarga(harga);
                    kendaraan.setJenisKendaraan(jenisKendaraan);
                    kendaraan.setMerkKenderaan(merkKendaraan);
                    kendaraan.setKendaraan_Id(Kendaraan_Id);
                    kendaraan.setCcKendaraan(ccKendaraan);
                }
            }
        }

//  menghapus kendaraan


}
