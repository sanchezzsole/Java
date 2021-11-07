/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_primer_aplicacion;

/**
 *
 * @author Soledad
 */
public class Auto {
    private String color; 
    private int ruedas; 
    private String marca; 
    
    public Auto(String color, int ruedas, String marca){
        this.color = color; 
        setRuedas(ruedas);
        this.marca = marca; 
    }

    Auto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String dameColor(){
        return this.color; 
    }
    public String dameMarca(){
        return this.marca; 
    }
    public int dameRuedas(){
        return this.ruedas; 
    }
    
    public void setRuedas(int cantidad){
        if (cantidad < 0 || cantidad > 4){
            this.ruedas = 4;
        } else {
            this.ruedas=cantidad; 
        }
        
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}



// EN EL MAIN:

     
            
            String nombreDos;
            
            Auto auto1 = new Auto("verde", 4, "Fiat");
            
            /*System.out.println(auto1.dameColor());
            System.out.println(auto1.dameMarca());
            System.out.println(auto1.dameRuedas());
            */
            auto1.setRuedas(10);
            
            System.out.println("El auto tiene " + auto1.dameRuedas()+ " ruedas");
            
            