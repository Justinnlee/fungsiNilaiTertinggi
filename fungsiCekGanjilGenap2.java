import java.util.Scanner;
public class fungsiCekGanjilGenap2 {
    static int angka = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        angka = scanner.nextInt();

        isGanjil(angka);
        scanner.close();  
    }
    static boolean isGanjil(int angka) {
        if (angka % 2 == 1) {
            System.out.println("Angka " + angka + " adalah Ganjil");
            return true;
        } else {
            System.out.println("Angka " + angka + " adalah Genap");
            return false;
        }
    }
}

