import java.util.Scanner;

public class PotonganPembelian {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input data
            System.out.print("Total pembelian Rp ");
            int totalPembelian = input.nextInt();

            // Hitung potongan
            int potongan;
            if (totalPembelian < 50000) {
                potongan = (int) (0.05 * totalPembelian);
            } else {
                potongan = (int) (0.2 * totalPembelian);
            }

            // Hitung jumlah yang harus dibayarkan
            int jumlahHarusDibayarkan = totalPembelian - potongan;

            // Tampilkan output
            System.out.println("Total pembelian Rp " + totalPembelian);
            System.out.println("Besarnya potongan Rp " + potongan);
            System.out.println("Jumlah yang harus dibayarkan Rp " + jumlahHarusDibayarkan);
        }
    }
}