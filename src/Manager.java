import java.util.List;
import java.util.ArrayList;
public class Manager extends User {
    public Manager(String nama, String email, String username, String password) {
        super(nama, email, username, password);
    }

    public String getUserType(){
        return "Manager";
    }

    public void viewReports(List<Kendaraan> kendaraanList) {
        System.out.println("Laporan Kendaraan:");

        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println("ID Kendaraan: " + kendaraan.getKendaraan_Id());
            System.out.println("Jenis Kendaraan: " + kendaraan.getJenisKendaraan());
            System.out.println("Merk Kendaraan: " + kendaraan.getMerkKenderaan());
            System.out.println("CC Kendaraan: " + kendaraan.getCcKendaraan());
            System.out.println("Harga: " + kendaraan.getHarga());
            System.out.println();
        }
    }

}
