
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
            //lo que captura es lo que está dentro de la columna con los "", NO el nombre de la variable
            // por eso de nombre a la variable se le puede poner cualquiera
            int id = rs.getInt("id");
            int edad = rs.getInt("edad");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String provincia = rs.getString("provincia");
                    
            System.out.println(" El id es: " + id + "\n Nombre y apellido: " + nombre + " " + apellido + "\n La edad: " + edad + "\n Provincia: " + provincia); 
            
            // PARA MOSTRAR UN SOLO REGISTRO:
            
        }
       
    }            
    
}
