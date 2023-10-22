package firstprogram;
import java.util.Scanner;

public class function {
    //metode tambah dengan dua parameter dan tipe data kembalian int
    public static int tambah (int a, int b){
        return a+b;
    }
    //metode kuadrat dengan satu parameter dan tipe data kembalian int
    public static int kuadrat (int c){
        return c*c;
    }
    //metode main sebagai metode utama program
    public static void main(String[] args){
        int hasiltambah=tambah(5,3); //memanggil metode tambah
        int hasilkuadrat=kuadrat(4); //memanggil hasil kuadrat

        System.out.println("Hasil tambah: " +hasiltambah);
        System.out.println("Hasil kuadrat: " +hasilkuadrat);
    }

}
