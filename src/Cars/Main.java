
package Cars;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    
     static  Scanner sc = new Scanner(System.in);
    
     private static Car yourCar() {
         System.out.println("ENTER THE CAR BRAND: ");
         String brand = sc.next();
         System.out.println("ENTER THE CAR MODEL: ");
         String model = sc.next();
         System.out.println("ENTER THE CAR FUEL:  ");
         String fuel = sc.next();
         System.out.println("ENTER THE CAR COLOR: ");
         String color = sc.next();
         
         Car c1 = new Car( brand, model, fuel, color);
         
         return c1;
         
     }
    
    public static void main(String[] args) throws SQLException {
        
        //yourCar();
        
        
        
        System.out.println("Select option CRUD: ");
        char option = sc.next().charAt(0);
        switch(option){
            case'C':
                Car a = yourCar();
        // Kako sacuvati automobil u slucaju gubitka struje, kresovanja aplikacije itd...
        // save metod to Database ili txt file xml file itd..
        DBQueries.insertCars(a);
        break;
            case 'D':
                System.out.println("ENTER THE CAR ID:");
                int id = sc.nextInt();
                DBQueries.deleteCar(id);
                break;
                
            case 'U':
                System.out.println("ENTER THE CAR ID: ");
                id = sc.nextInt();
                System.out.println("ENTER THE NEW COLOR: ");
                String color = sc.next();
                DBQueries.updateCar(id,color);
                break;
            case 'R':
                System.out.println("ENTER THE CAR ID WHAT DO YOU LIKE: ");
                id = sc.nextInt();
                Car myCar = DBQueries.getById(id);
                System.out.println(myCar);
                break;
            default:
                System.out.println("Wrong option!");
                
        }
      
        
        
    }

  
   
       
    }
    

