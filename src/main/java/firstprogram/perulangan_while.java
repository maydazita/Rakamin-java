package firstprogram;
import java.util.Scanner;

public class perulangan_while {
    public static void main (String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you ready?");
        String ulangi = scanner.nextLine();
        System.out.println("Start");
        int counter =0;

        while (ulangi.equals("1") || ulangi.equalsIgnoreCase("yes")){
            System.out.println("pengulangan ke- "+counter);
            System.out.print("Apakah anda mau mengulangi? (yes/no) : ");
            String jawab =scanner.nextLine();
            counter++;

            if (!jawab.equalsIgnoreCase("yes")){
                ulangi="0";
            }

        }

    }
}
