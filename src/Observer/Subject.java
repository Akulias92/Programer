package Observer;

import java.util.ArrayList;

public class Subject {
    // zamisljeni broj korisnika
    private int n;
    // Kreiramo kolekciju Subscribers korisnika koji su se pretplatili na odredjeni Subject
    private ArrayList<Subscriber> pretplatnici = new ArrayList<Subscriber>();
    // Potrebne su nam metode pretplati se i odjavi se...
    
    public void pretplatiSe (Subscriber s){
        // potrebno je korisnika dodati u ArrayList Subscriber
        pretplatnici.add(s);
    }
    // metoda odjavi se
    public void odjaviSe(Subscriber s){
        pretplatnici.remove(s);
        // Kada se korisnik odjavi potrebno je poslati obavestenje, notifyAll metod i on se radi u set metodi...
        // Postavi obavestenje za sve da je se user odjavio sa objekta, set metoda.
    }
    public Subject() {
    }

    public Subject(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        notifyAllSubscribers(n);
        
    }

 
    public void notifyAllSubscribers(int n) {
        // Prolazimo kroz ArrayList pretplatnici i pozivamo update metodu
        for(Subscriber s : pretplatnici)
            s.update(n);
        
    
            }
    }
    
    

