import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int s1, s2, secim;
        System.out.print("Hesap makinesi\n");

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        s1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        s2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuç: " + (s1 + s2));
                break;
            case 2:
                System.out.println("Sonuç: " + (s1 - s2));
                break;
            case 3:
                System.out.println("Sonuç: " + (s1 * s2));
                break;
            case 4:
                System.out.println("Sonuç: " + (s1 / s2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
                break;
        }
    }
}