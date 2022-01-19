package githubPatika;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double fiyatArmut = 2.14, fiyatElma = 3.67, fiyatDomates = 1.11, fiyatMuz = 0.95, fiyatPatlıcan = 5.00;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo;

        Scanner input = new Scanner (System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armutKilo = input.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo = input.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo = input.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muzKilo = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcanKilo = input.nextInt();
        double toplamTutar = fiyatArmut*armutKilo+fiyatElma*elmaKilo+fiyatDomates*domatesKilo+fiyatMuz*muzKilo+fiyatPatlıcan*patlıcanKilo;
        System.out.println("Toplam Tutar : " + toplamTutar + " TL"  );


    }
}
