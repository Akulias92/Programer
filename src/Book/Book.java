package Book;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/* Anotacija za promenu imena tabele u bazi */
/*@Table(name = "bookstore"")*/
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id;
    /* ne mozemo imati knjigu sa istim imeno*/
    @Column(unique=true)
    private String name;
    private String writer;
    private int page_number;
    private String genre;
    private String publisher;
    /* Anotacija za promenu imena kolone */
    /* @Column(name="fdfd")*/
    private Date date_of_publishing;
    
    public Book(){
        
    }

    public Book(int id, String name, String writer, int page_number, String genre, String publisher, Date date_of_publishing) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.page_number = page_number;
        this.genre = genre;
        this.publisher = publisher;
        this.date_of_publishing = date_of_publishing;
    }

    public Book(String name, String writer, int page_number, String genre, String publisher, Date date_of_publishing) {
        this.name = name;
        this.writer = writer;
        this.page_number = page_number;
        this.genre = genre;
        this.publisher = publisher;
        this.date_of_publishing = date_of_publishing;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate_of_publishing() {
        return date_of_publishing;
    }

    public void setDate_of_publishing(Date date_of_publishing) {
        this.date_of_publishing = date_of_publishing;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", writer=" + writer + ", page_number=" + page_number + ", genre=" + genre + ", publisher=" + publisher + ", date_of_publishing=" + date_of_publishing + '}';
    }
    
        
    }

