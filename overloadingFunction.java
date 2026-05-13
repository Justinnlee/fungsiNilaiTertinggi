// Latihan menghitung luas persegi panjang
// Menulis fungsi harus dibawah psvm
import java.util.Scanner;
public class overloadingFunction {
static int pj, lb;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Didalam main gunanya untuk memanggil fungsi (wajib), dan untuk pembuatan fungsi harus diluar main

        System.out.print("Masukkan Panjang Persegi Panjang (dalam cm) : ");
        pj = scanner.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang (dalam cm) : ");
        lb = scanner.nextInt();
        System.out.println();

        System.out.println(" Luas Persegi Panjang : " + hitungLuas());
        scanner.close();
    }
    /* Overloading function : Pembuatan fungsi dengan nama yang sama
    namun dengan jumlah parameter yang berbeda 
    */
        static int hitungLuas() {
        int luas = pj * lb;

        return luas;
    }
    
    
}

