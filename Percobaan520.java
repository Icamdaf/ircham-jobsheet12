
public class Percobaan520 {
static void Tampil(String str, int ... a) {
    System.out.println("String: " + str);
    System.out.println("jumlah parameter: " + a.length);
    
    for (int i : a) {
        System.out.println(i + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        Tampil("daspro 2019", 100, 200);
        Tampil("teknologi informasi", 1, 2, 3, 4, 5);
        Tampil("polinema");
    }
}