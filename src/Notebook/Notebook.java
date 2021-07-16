package Notebook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
// Entity identifikator, objekat postaje entitet, ne deljiv, objekat je celina(Granulacija). Sql pravi tabelu po istom nazivu Entiteta
public class Notebook {    
    @Id
    // Anotacija glavnog entity atributa.
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Kod za generisanje PrimaryKey za id...
    private int id;
    private String manufacturer;
    private String brand;
    private String model;
    private int disk;
    private int RAM;
    private double processor;
    
    public Notebook(){
        
    }

    public Notebook(int id, String manufacturer, String brand, String model, int disk, int RAM, double processor) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.model = model;
        this.disk = disk;
        this.RAM = RAM;
        this.processor = processor;
    }

    public Notebook(String manufacturer, String brand, String model, int disk, int RAM, double processor) {
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.model = model;
        this.disk = disk;
        this.RAM = RAM;
        this.processor = processor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getProcessor() {
        return processor;
    }

    public void setProcessor(double processor) {
        this.processor = processor;
    }

   
    @Override
    public String toString() {
        return "Notebook{" + "id=" + id + ", manufacturer=" + manufacturer + ", brand=" + brand + ", model=" + model + ", disk=" + disk + ", RAM=" + RAM + ", processor=" + processor + '}';
    }
    
}
