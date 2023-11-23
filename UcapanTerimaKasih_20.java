import java.util.Scanner;

public class UcapanTerimaKasih_20 {
public static String PenerimaUcapan(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Tuliskan nama yang akan diberi ucapan = ");
    String namaOrang = sc.nextLine();
    sc.close();
    return namaOrang;
}
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("thank you" +nama+ "for being th best teacher in the world.\n" + "you inspired in me a love for learning and made me feel like i could ask you anything.");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}