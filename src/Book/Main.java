/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.sql.Date;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Session se = HibernateUtil.createSessionFactory().openSession();
                Transaction tr = se.beginTransaction();
                Librarian lb = new Librarian("Milos", "Petkovic");
                se.save(lb);
                tr.commit();
                se.close();
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
        Date d = new Date(10, 05, 1976);

        /* da bi spustili u bazu treba nam sesija koju smo kreirali i da zatvorimo sesiju*/
 /* Kao i dbqueries pozivamo sesiju preko hibernateutil klase, kreiramo, otvorimo i zatvorimo*/
 /* Takodje napravimo transakciju s kreirane sesihe, s.beginTransaction(): */
 /* Ne zaboravi transaction.commit i da sacuvas knjigu u bazi posto je ObjectRelaMappin persistence programiranje...*/
 /* Comit cuva podatke dok ne komitujemo a ondac spusta u bazu */
        System.out.println("Enter CRUD option:");
        char option = sc.nextLine().charAt(0);
        switch (option) {
            case 'C':
                System.out.println("Enter name of book: ");
                String ime = sc.nextLine();
                System.out.println("Enter writer of book: ");
                String pisac = sc.nextLine();
                System.out.println("Enter number of pages: ");
                int broj_strana = sc.nextInt();
                System.out.println("Enter genre of book: ");
                String zanr = sc.nextLine();
                System.out.println("Enter publisher of book: ");
                String izdavac = sc.nextLine();
                Book b = new Book();
                b.setName(ime);
                b.setWriter(pisac);
                b.setPage_number(broj_strana);
                b.setGenre(zanr);
                b.setPublisher(izdavac);
                b.setDate_of_publishing(null);

                Session s = HibernateUtil.createSessionFactory().openSession();
                Transaction t = s.beginTransaction();
                s.save(b);
                t.commit();
                s.close();
                break;

            case 'R':
                System.out.println("Enter id of your book: ");
                int id = sc.nextInt();
                /* Otvaramo sesiju i transakciju sa bazom i malo drugacija get Id metoda ali se kreira kniga b2 , kastuje se i nad sesijom 2 get metoda klase i id-a */
                Session s2 = HibernateUtil.createSessionFactory().openSession();
                Transaction t2 = s2.beginTransaction();
                Book b2 = (Book) s2.get(Book.class, id);
                System.out.println(b2);
                t2.commit();
                s2.close();
                break;

            case 'U':
                System.out.println("Enter id of book: ");
                /* Desava se da preskoci update atribut , novo ime, izdavaca itd. Integer parseint */
                id = Integer.parseInt(sc.nextLine());
                System.out.println("Enter new publisher: ");
                izdavac = sc.nextLine();
                /* Dovlacimo knjigu iz baze */

                Session s3 = HibernateUtil.createSessionFactory().openSession();
                Transaction t3 = s3.beginTransaction();
                /* Uvek kreiramo novi objekat */
                Book b3 = (Book) s3.get(Book.class, id);
                /* postavljamo novo ime set */
                b3.setPublisher(izdavac);
                /* Updajtujemo knjigu kada setujemo atribut koji se menja */
                s3.update(b3);
                t3.commit();
                s3.close();
                break;
                
                case'D':
                    System.out.println("Enter id of book: ");
                    id = sc.nextInt();
                    
                    Session s4 = HibernateUtil.createSessionFactory().openSession();
                Transaction t4 = s4.beginTransaction();
                Book b4 = new Book();
                b4.setId(id);
                s4.delete(b4);
                t4.commit();
                s4.close();
                break;
                default:
                    System.out.println("Wrong option!");
                
                        
                
        }
    }

}
