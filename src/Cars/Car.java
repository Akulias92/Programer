package Cars;

public class Car {
    
   private int id, carCubic;
   private String brand,model,fuel,color;
    
   
   public Car(){
       
   }

    public Car( String brand, String model, String fuel, String color) {
        
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.color = color;
    }

    public Car(int id, String brand, String model, String fuel, String color) {
        this.id = id;
        
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", car_cubic=" +  ", brand=" + brand + ", model=" + model + ", fuel=" + fuel + ", color=" + color + '}';
    }

}    
    
    

