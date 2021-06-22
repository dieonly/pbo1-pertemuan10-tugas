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
}
