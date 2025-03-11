import java.util.Scanner;

public class VeciManji {

    public static void main(String[] args) {
        System.out.println("Molim unesite broj");
        Scanner skener = new Scanner(System.in);
        int x = skener.nextInt();

        if (x < 50) {
            System.out.println("Broj je manji.");
        } else if (x > 50) {
            System.out.println("Broj je veći.");
        } else {
            System.out.println("Broj je 50.");
        }
    }
}