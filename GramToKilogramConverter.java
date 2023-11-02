
import java.util.Scanner;

public class GramToKilogramConverter {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan berat dalam gram
        System.out.print("Masukkan berat dalam gram: ");
        double beratGram = input.nextDouble();

        // Menghitung berat dalam kilogram
        double beratKilogram = beratGram / 1000;

        // Menampilkan hasil konversi
        System.out.println("Berat dalam kilogram: " + beratKilogram + " kg");

        // Menutup objek Scanner
        input.close();
    }
}
