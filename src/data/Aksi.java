package data;

public class Aksi {

    public static void main(String[] args) {
        //Deklarasi 6 Object, Constructor pada Class pasien.
        pasien sunarto = new pasien();
        pasien susilah = new pasien();

        pasien yusuf = new pasien("Yusuf Setianovanto",
                "19630047", "Martapura", "082283987965");
        yusuf.infopasien();

        pasien thesa = new pasien("Thesa Aprianto", "19630146",
                "Banjarbaru", "089879659870");
        thesa.infopasien();

        pasien nova = new pasien("Nova", "19877022",
                "Martapura", "082145938768","Rawat Inap",
                "Penyakit Dalam", "Tingkat 2", "BPJS");
        nova.daftar();

        pasien anto = new pasien("Anto", "198770021",
                "Martapura", "08976828281", "Rawat Jalan",
                "Poli Gigi", "Tingkat 1", "Transfer");
        anto.daftar();
    }
}
