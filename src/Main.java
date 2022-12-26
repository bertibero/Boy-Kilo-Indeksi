import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kg,boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kilogramınızı giriniz :");
        kg = inp.nextInt();

        System.out.print("Boyunuzu metre cinsinden giriniz :");
        boy = inp.nextDouble();

        double vKitleIndeksi = kg / (boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : " + vKitleIndeksi);


    }
}