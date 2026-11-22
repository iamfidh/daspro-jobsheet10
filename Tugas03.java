import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int survei[][] = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print(" Pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
                while (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println("NIlai harus antara 1-5.");
                    System.out.print("Masukkan ulang: ");
                    survei[i][j] = sc.nextInt();
                }            
            }
        }
        System.out.println("========================================");
        System.out.println("Rata-rata Setiap Responden");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
            double rata2 = (double) total / 6;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata2);
        }
        System.out.println("========================================");
        System.out.println("Rata-rata Setiap Pertanyaan ");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            double rata2 = (double) total / 10;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata2);
        }
        System.out.println("========================================");
        int totalSeluruhnya = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalSeluruhnya += survei[i][j];
            }   
        }
        double rata2Seluruhnya = (double) totalSeluruhnya / 60;
        System.out.println("Rata-rata keseluruhan: " + rata2Seluruhnya);
    }
}
