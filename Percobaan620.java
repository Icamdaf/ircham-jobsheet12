import java.util.Scanner;


public class Percobaan620 {
static int hitungLuas (int pnjg, int lb){
    int Luas = pnjg * lb;
    return Luas;
}
static int hitungVolume (int tinggi, int a , int b){
    int volume = hitungLuas(a, b) * tinggi;
    return volume;
}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int p,l,t,L,vol;
    System.out.println("masukkan panjang");
    p = input.nextInt();
    System.out.println("masukkan lebar");
    l = input.nextInt();
    System.out.println("masukkan tinggi");
    t = input.nextInt();

    L = p*l;
    System.out.println("luas persegi panjang adalah" +L);
    vol = hitungVolume(t, p, l);
    System.out.println("volume dari balok adalah" +vol);
    
    }
}