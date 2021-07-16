package PersistenceApp2;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
     private static void savePlayer(BasketballP b) throws FileNotFoundException {
      // logika je  da se napravi xml fajl, fileoutputStream...
      FileOutputStream fos = new FileOutputStream("Players.xml");
      // XML Encoder se bavi citanjem xml fajlova...
      XMLEncoder xe = new XMLEncoder(fos);
      // write players file
      xe.writeObject(b);
      xe.close();
      //xml je dobar zato sto ucitava deklaracije varijabli. Writer XMLDecoder - tacno vidimo sta je int, sta double a sta String.....
      // Metoda za ucitavanje...
      }
     public static  BasketballP loadPlayer() throws FileNotFoundException{
         FileInputStream fis = new FileInputStream("Players.xml");
         // XMLDecoder a ne Encoder
         XMLDecoder xe1 = new XMLDecoder(fis);
         // Kastovanje, ucitaj mi objeka BasketballP. Ne mozemo kao argument staviti objeka b jel reader ne moze da zna sta moze u njemu da ocekuje
         // Kastovanje je konvertovanje, odnosno privremena izmena jednog tipa vrednosti u drugi...
         BasketballP b = (BasketballP) xe1.readObject();
         xe1.close();
         return b;
         
    }
    public static void main(String[] args) throws FileNotFoundException {
        
        //BasketballP b = new BasketballP("Nikola", "Pekovic", "Denver", 12, 28);
       // System.out.println(b);
        
        BasketballP b =loadPlayer();
        System.out.println(b);
        b.setAge(15);
         savePlayer(b);
       
        
    }

   
}
