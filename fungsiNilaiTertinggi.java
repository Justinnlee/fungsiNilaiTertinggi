import java.util.Scanner;
public class fungsiNilaiTertinggi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int [] nilai;

        System.out.print("Masukan Jumlah Nilai : ");
        n = scanner.nextInt();
        nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Msukkan nilai ke -" + (i+1) + " = ");
            nilai[i] = scanner.nextInt();
        }
        System.out.print("Nilai Tertinggi adalah : " + getNilaiMax(nilai));
        scanner.close();
    }

    static int getNilaiMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

/* Nama : Justin Lee 
   NIM : 25410100002
 */