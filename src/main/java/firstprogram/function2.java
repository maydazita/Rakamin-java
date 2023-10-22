package firstprogram;

import firstprogram.namaku;
import panggilan.coba_panggil;

public class function2 {
    public static void main (String[] agrs){
        int x=2;
        int y=3;
        int z=10;


        namaku.Indah("ridwan");
        namaku.Indah("asep");
        namaku.Indah("indah");
        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
        coba_panggil.ayopanggil();
    }

    public static int tambah(int a, int b){
        int hasiltambah = a+b;
        System.out.println("Hasil tambah "+a+" dengan "+b+" adalah: "+hasiltambah);
        return hasiltambah;
    }
}
