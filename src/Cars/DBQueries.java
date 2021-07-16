package Cars;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBQueries {
    
    // Kreiramo metodu za unos automobila u bazu...
    public static void insertCars(Car c) throws SQLException{
        Connection conn = DBConnection.getConn();
        String upit = "insert into cars  " + " (brand,model,fuel,color)" + " values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);
        
        ps.setString(1, c.getBrand());
        ps.setString(2, c.getModel());
        ps.setString(3, c.getFuel());
        ps.setString(4, c.getColor());
        ps.execute();
    }

    public static void deleteCar(int id) throws SQLException {
        Connection conn = DBConnection.getConn();
        String upit = "delete from cars where id =?";
        PreparedStatement ps = conn.prepareStatement(upit);
        ps.setInt(1, id);
        ps.execute();
         
    }

    public static void updateCar(int id, String color) throws SQLException {
        Connection conn = DBConnection.getConn();
        String upit = "update cars set color = ? where id = ?";
        PreparedStatement ps = conn.prepareStatement(upit);
        ps.setString(1, color);
        ps.setInt(2, id);
        
    }

    public static Car getById(int id) throws SQLException {
        // Vraca iz baze u konzolu, objekat. Nije void
        Connection conn = DBConnection.getConn();
        String upit = "select*from cars where id = ?";
        PreparedStatement ps = conn.prepareStatement(upit);
        ResultSet rs = ps.executeQuery();
        // rs.next spustanje kursora, da ne bi doslo do exception, primer da izaberemo auto id 56 a u tabeli imamo 4 automobila. Obraditi izuzeta
        if(rs.next()==false)
        return null;
        //System.out.println("Car with this id dont exsist :(");
        
        Car c2 = new Car(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
        
        return c2;
    }

  
    }
    

