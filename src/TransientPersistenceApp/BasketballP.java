package TransientPersistenceApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasketballP {
    
    private String name, surname, nickname, team;
    private int height, age, number;
    
    public BasketballP() {
        
    }
    
    public BasketballP(String name, String surname, String nickname, String team, int height, int age, int number) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.team = team;
        this.height = height;
        this.age = age;
        this.number = number;
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public String getTeam() {
        return team;
    }
    
    public void setTeam(String team) {
        this.team = team;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
        
    }
    
    @Override
    public String toString() {
        return "BasketballPlayers: " + "Name=" + name + ", Surname=" + surname + ", Nickname=" + nickname + ", Team=" + team + ", Height=" + height + " cm" + ", Age=" + age + " years" + ", Number=" + number + '\n';
    }
    // Kreiramo Storage metodu za trajno cuvanje kosrkasa, persistence...
    
    public void saveMyPlayers() {
        try {
            // Kreiramo file writer gde cemo cuvati kosarkase, txt file
            // kako writer nebi brisao prethodnog igraca nakon ucitavanja trugo treba pozvati new FileWriter.apend, boolean(true,false)- dodati, nadovezivati....
            FileWriter fw = new FileWriter("MyPlayers.txt", true);
            // Napisati fajl i prevesti ga u toString, kako bi mogao da cita objekte...
            fw.write(this.toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(BasketballP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static ArrayList<BasketballP> loadBasketPFile() throws FileNotFoundException, IOException {
        ArrayList<BasketballP> players = new ArrayList<BasketballP>();
        FileReader fr = new FileReader("MyPlayers.txt");
        BufferedReader br = new BufferedReader(fr);
        // ReadLine treba da se desava dokle god ima teksta, tj. dokle god je razlicito od nule
        String linija;
        while ((linija = br.readLine()) != null) {
            // Kreiramo niz atributa koje smo definisali za kosarkasa i delimo ih(Split) zarezom, spejsom..... AKo je niz[]
            String[] spl = linija.split(", ");
            // Onda atribute setujemo prema lokaciju
            // Integer parse rasclanjavanje int to String. Integer kao objekat rasclaniti to String.
            BasketballP b1 = new BasketballP(spl[0], spl[1], spl[2], spl[3], Integer.parseInt(spl[4]), Integer.parseInt(spl[5]), Integer.parseInt(spl[6]));
            players.add(b1);
        }
        
        br.close();
        return players;
    }
    
}
