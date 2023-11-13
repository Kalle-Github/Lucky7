import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int luku, luku2, luku3;
        int raha = 5;
        String vastaus;

        do {
            System.out.println("Sinulla on " + raha + " € Peli maksaa 1€");

            vastaus = in.nextLine();

            if (vastaus.equals("")) {
                raha -= 1;
                luku = random.nextInt(10) + 1;
                luku2 = random.nextInt(10) + 1;
                luku3 = random.nextInt(10) + 1;

                System.out.println(luku);
                System.out.println(luku2);
                System.out.println(luku3);

                if (raha == 0) {
                    System.out.println("Rahat loppuivat");
                }
            } else if (vastaus.equals("e")) {
                break;
            } else {
                System.out.println("Virheellinen syöte");
            }

            System.out.println("Haluatko pelata uudestaan? Paina enter pelataksesi tai e peruuttaaksesi");

        } while (raha > 0);
    }
}