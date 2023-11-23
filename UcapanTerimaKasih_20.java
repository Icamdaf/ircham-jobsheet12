import java.util.Scanner;

public class UcapanTerimaKasih_20 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama yang akan diberi ucapan = ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");

        
        UcapanTambahan("youre the best, " + nama + "!");
    }

    
    public static void UcapanTambahan(String tambahan) {
        System.out.println("Ucapan Tambahan: " + tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
