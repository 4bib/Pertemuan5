import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input data
            System.out.print("NPM : ");
            String npm = input.nextLine();
            System.out.print("Nama Mahasiswa : ");
            String nama = input.nextLine();
            System.out.print("Nilai Kehadiran : ");
            int nilaiKehadiran = input.nextInt();
            System.out.print("Nilai Tugas : ");
            int nilaiTugas = input.nextInt();
            System.out.print("Nilai UTS : ");
            int nilaiUTS = input.nextInt();
            System.out.print("Nilai UAS : ");
            int nilaiUAS = input.nextInt();

            // Hitung nilai akhir
            double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

            // Tentukan grade
            char grade;
            if (nilaiAkhir >= 76) {
                grade = 'A';
            } else if (nilaiAkhir >= 66) {
                grade = 'B';
            } else if (nilaiAkhir >= 56) {
                grade = 'C';
            } else if (nilaiAkhir >= 46) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            // Tampilkan output
            System.out.println("NPM Mahasiswa : " + npm);
            System.out.println("Nama Mahasiswa : " + nama);
            System.out.println("Nilai Rata-rata : " + nilaiAkhir);
            System.out.println("Grade : " + grade);
            System.out.println("Keterangan : " + getKeterangan(grade));
        }
    }

    private static String getKeterangan(char grade) {
        String keterangan;
        switch (grade) {
            case 'A':
                keterangan = "Istimewa";
                break;
            case 'B':
                keterangan = "Baik";
                break;
            case 'C':
                keterangan = "Cukup";
                break;
            case 'D':
                keterangan = "Kurang";
                break;
            default:
                keterangan = "Kurang sekali";
                break;
        }
        return keterangan;
    }
}