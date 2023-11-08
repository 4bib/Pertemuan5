import java.util.Scanner;

public class KriteriaKegemukan {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input data
            System.out.print("Berat badan (kg) : ");
            float beratBadan = input.nextFloat();
            System.out.print("Tinggi badan (m) : ");
            float tinggiBadan = input.nextFloat();

            // Hitung IMT
            float imt = beratBadan / (tinggiBadan * tinggiBadan);

            // Tentukan kriteria
            String kriteria;
            if (imt < 18.4) {
                kriteria = "Kurang Berat Badan";
            } else if (imt <= 24.9) {
                kriteria = "Berat Badan Ideal";
            } else if (imt <= 29.9) {
                kriteria = "Berat Badan Berlebih";
            } else if (imt <= 39.9) {
                kriteria = "Gemuk";
            } else {
                kriteria = "Sangat Gemuk";
            }

            // Tampilkan output
            System.out.println("IMT = " + imt);
            System.out.println("Kriteria = " + kriteria);
        }
    }
}