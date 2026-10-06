import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU PROGRAM GEOMETRI ===");
            System.out.println("1. Buat Bujur Sangkar");
            System.out.println("2. Buat Lingkaran");
            System.out.println("3. Buat Silinder");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = scanner.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String warnaBujur = scanner.next();
                    BujurSangkar bs = new BujurSangkar(sisi, warnaBujur);
                    bs.printInfo();
                    break;
                case 2:
                    System.out.print("Masukkan radius: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String warnaLingkaran = scanner.next();
                    Lingkaran lingkaran = new Lingkaran(radius, warnaLingkaran);
                    lingkaran.printInfo();
                    break;
                case 3:
                    System.out.print("Masukkan tinggi silinder: ");
                    double tinggi = scanner.nextDouble();
                    System.out.print("Masukkan radius alas: ");
                    double radSilinder = scanner.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String warnaSilinder = scanner.next();
                    Silinder silinder = new Silinder(tinggi, radSilinder, warnaSilinder);
                    silinder.printInfo();
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}