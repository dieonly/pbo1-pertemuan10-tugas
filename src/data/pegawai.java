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
}
