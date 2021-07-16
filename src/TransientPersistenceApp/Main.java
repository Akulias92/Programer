package TransientPersistenceApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // klasni metod kako bi ga sve metode videle, Scanner kao klasni atribut
    static Scanner sc = new Scanner(System.in);

    // Kreiramo posebnu metodu za kreiranje kosarkasa, rasterecen main
    // Metoda nije void, mora return povratni metod....
    public static BasketballP loadBasketballPlayers() {
        //Scanner sc = new Scanner(System.in);

        System.out.println("Enter player name: ");
        String name = sc.next();
        System.out.println("Enter player surrname: ");
        String surname = sc.next();
        System.out.println("Enter player nickname: ");
        String nickname = sc.next();
        System.out.println("Enter player team: ");
        // Da bi mogli da pisemo primer "Crvena Zvezda nextLine
        String team = sc.next();
        System.out.println("Enter player height:");
        int height = sc.nextInt();
        System.out.println("Enter player age: ");
        int age = sc.nextInt(); 
        System.out.println("Enter player number: ");
        int number = sc.nextInt();
        //sc.close();
        return new BasketballP(name, surname, nickname, team, height, age, number);

    }

    public static void main(String[] args) throws IOException {
        // Deklarisati BasketballP kao b, pozvati metodu i dodati u ArrayList-u
        // Preglednost Main klasee!!
        // Mozemo pozvati fajl i videti sta je vec upisano od igraca u njemu, dakle ne new ArrayList vec pozivamo nad BasketballP metodu za ucitavanje fajla 
        ArrayList<BasketballP> players = new ArrayList<>();
        
        System.out.println("How many players do you want?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BasketballP b = loadBasketballPlayers();
            // pozivamo kreirani metod za cuvanje igraca....
            b.saveMyPlayers();
            players.add(b);
        }
     // Kako sacuvati objekte da se ne izgube, persistence, trajno cuvanje....
    }
}
