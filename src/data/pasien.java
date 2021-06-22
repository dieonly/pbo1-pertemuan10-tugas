package data;

//Parent Class
public class pasien {
    //Deklarasi 8 Atribut
    public String nama;
    public String nopasien;
    public String alamat;
    public String notelp;
    public String status;
    public String poliklinik;
    public String faskes;
    public String carabayar;

    //Deklarasi 4 Method
    public void daftar(){
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Ini Adalah Form Data Lengkap Pasien");
        System.out.println("Nama :" +nama);
        System.out.println("No. Pasien :" +nopasien);
        System.out.println("Alamat :" +alamat);
        System.out.println("No. telp :" +notelp);
        System.out.println("Rawat Jalan/Inap :" +status);
        System.out.println("PoliKlinik :" +poliklinik);
        System.out.println("Tingkat Faskes :" +faskes);
        System.out.println("Cara Bayar :" +carabayar);
        System.out.println("");
    }

    public void infopasien(){
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Ini Adalah Info Pasien");
        System.out.println("Nama:" +nama);
        System.out.println("No. Pasien :" +nopasien);
        System.out.println("Alamat :" +alamat);
        System.out.println("No. telp :" +notelp);
        System.out.println("");
    }

    public void kontakadmin(){
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Ini Adalah Kontak Admin");
        System.out.println("No. telp : (0511)-0223-9879");
        System.out.println("");
    }
    public void terdaftar(){
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Ini Adalah Fasilitas Kesehatan Yang tersedia");
        System.out.println("Tingkat Faskes yang tersedia :");
        System.out.println("1. Faskes Tingkat I");
        System.out.println("2. Faskes Tingkat II");
        System.out.println("3. Faskes Tingkat III");
        System.out.println("");
    }

    //Deklarasi 3 Constructor

    public pasien() {
    }

    public pasien(String nama, String nopasien,
                  String alamat, String notelp) {
        this.nama = nama;
        this.nopasien = nopasien;
        this.alamat = alamat;
        this.notelp = notelp;
    }

    public pasien(String nama, String nopasien,
                  String alamat, String notelp,
                  String status, String poliklinik,
                  String faskes, String carabayar) {
        this.nama = nama;
        this.nopasien = nopasien;
        this.alamat = alamat;
        this.notelp = notelp;
        this.status = status;
        this.poliklinik = poliklinik;
        this.faskes = faskes;
        this.carabayar = carabayar;
    }
}
