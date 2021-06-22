package data;

//Sub Class/Child-Class
public class pegawai extends pasien {
    //Deklarasi 3 atribut
    public String namapeg;
    public String nopegawai;
    public String shift;

    //Deklarasi 2 Method
    public void datapegawai(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Ini Adalah Data Pegawai");
        System.out.println("Nama Pegawai  :" +namapeg);
        System.out.println("No. Pegawai   :" +nopegawai);
        System.out.println("Shift Pegawai :" +shift);
        System.out.println("");
    }

    public void jamkerja(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Ini Adalah Jam Kerja Pegawai");
        System.out.println("Shift Pegawai :" +shift);
        System.out.println("");
    }

    //Getter&Setter Seluruh Atribut

    public String getNamapeg() {
        return namapeg;
    }

    public void setNamapeg(String namapeg) {
        this.namapeg = namapeg;
    }

    public String getNopegawai() {
        return nopegawai;
    }

    public void setNopegawai(String nopegawai) {
        this.nopegawai = nopegawai;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    //Overriding
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
}
