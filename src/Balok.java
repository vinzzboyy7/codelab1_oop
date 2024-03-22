import java.util.Scanner;

public class Balok extends BangunRuang{

    Scanner scanner = new Scanner(System.in);
    public Balok(String namee) {
        super(namee);
    }

    private double panjang;
    private double lebar;
    private double tinggi;

    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    public void luasPermukaan() {
        double hasil = 2 * ((panjang*lebar) + (panjang*tinggi) + (tinggi*lebar));
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    public void volume() {
        double hasil = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
