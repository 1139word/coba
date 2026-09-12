import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== MENU LINGKARAN ===");
            System.out.println("1. Hitung luas");
            System.out.println("2. Hitung keliling");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            if (pilihan == 1 || pilihan == 2) {
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();

                if (jariJari < 0) {
                    System.out.println("Jari-jari tidak boleh negatif.");
                } else if (pilihan == 1) {
                    double luas = Math.PI * jariJari * jariJari;
                    System.out.printf("Luas lingkaran: %.2f%n", luas);
                } else {
                    double keliling = 2 * Math.PI * jariJari;
                    System.out.printf("Keliling lingkaran: %.2f%n", keliling);
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih sudah menggunakan program ini.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1 sampai 3.");
            }
        } while (pilihan != 3);

        input.close();
    }
}
