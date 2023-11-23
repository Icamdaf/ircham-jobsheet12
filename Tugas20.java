import java.util.Scanner;

public class Tugas20 {

    static int[][] nilaiMahasiswa;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
    inputDataNilaiMahasiswa(scanner);
    tampilkanNilaiMahasiswa();
    int hariTerbaik = cariHariTerbaik();
        System.out.println("Hari terbaik adalah hari ke-" + (hariTerbaik + 1));
         tampilkanMahasiswaTertinggi();
        scanner.close();
    }

   
    static void inputDataNilaiMahasiswa(Scanner scanner) {
        System.out.print("Jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Jumlah minggu: ");
        int jumlahMinggu = scanner.nextInt();

        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

   
    static void tampilkanNilaiMahasiswa() {
        System.out.println("Nilai Mahasiswa:");

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    static int cariHariTerbaik() {
        int hariTerbaik = 0;
        int nilaiTertinggi = hitungRataRata(0);

        for (int j = 1; j < nilaiMahasiswa[0].length; j++) {
            int rataRataHariIni = hitungRataRata(j);
            if (rataRataHariIni > nilaiTertinggi) {
                nilaiTertinggi = rataRataHariIni;
                hariTerbaik = j;
            }
        }

        return hariTerbaik;
    }

    
    static void tampilkanMahasiswaTertinggi() {
        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = hitungRataRata(0);

        for (int i = 1; i < nilaiMahasiswa.length; i++) {
            int rataRataMahasiswaIni = hitungRataRata(i);
            if (rataRataMahasiswaIni > nilaiTertinggi) {
                nilaiTertinggi = rataRataMahasiswaIni;
                mahasiswaTertinggi = i;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: Mahasiswa ke-" + (mahasiswaTertinggi + 1));
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Detail nilai:");

        for (int j = 0; j < nilaiMahasiswa[mahasiswaTertinggi].length; j++) {
            System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[mahasiswaTertinggi][j]);
        }
    }

  
    static int hitungRataRata(int minggu) {
        int total = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i][minggu];
        }
        return total / nilaiMahasiswa.length;
    }
}
