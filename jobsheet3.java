
import java.util.Scanner;

public class jobsheet3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean pelangganListrik;
        int penggunaanListrik;
        double tarifListrik = 1500.0,totalTagihan;

        System.out.println("Masukkan pelanggan (true/false);");
        pelangganListrik = input.nextBoolean(); 
        System.out.println("Masukkan penggunaan listrik");
        penggunaanListrik = input.nextInt();
        
        totalTagihan = penggunaanListrik * tarifListrik;
        pelangganListrik = penggunaanListrik > 500;
        
        System.out.println("total tagihan pengguna :" + totalTagihan);
        System.out.println("apakah melebihi 500Kwh" + pelangganListrik);
        input.close();
    }
}
