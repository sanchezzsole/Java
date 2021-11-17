
package config;

import java.sql.*;//el asterisco trae todas las clases de sql

public class Conexion {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection() throws ClassNotFoundException{
        Connection conexion = null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tpcodoacodo","admin","123456");
        }
            catch(SQLException e){
                System.out.println(e.toString());
                }
        return conexion;
    }
    public static void main(String [] argms) throws SQLException, ClassNotFoundException{
        Connection conexion = null;
        Conexion con = new Conexion();
        conexion = con.getConection();
        PreparedStatement ps;
        ResultSet rs;
        
        ps = conexion.prepareStatement("SELECT * FROM registros");
        rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            int edad = rs.getInt("edad");
            System.out.println("El id es: " + id + " y la edad " + edad); 
        }
       
    }            
    
}
