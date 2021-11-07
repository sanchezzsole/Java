package accesorios;

public class Auto {
    public int velocidad;
    private boolean encendido;
    //este como privado xq cdo encendemos el auto no sería necesario
    public int capPasajeros;
    public String color;
    public String modelo;
    public String patente;
    public int anio;

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    public Auto(int velocidad, boolean encendido, int capPasajeros, String color, String modelo, String patente, int anio){
        this.velocidad = velocidad;
        this.encendido = encendido;
        this.capPasajeros = capPasajeros;
        this.color = color;
        this. modelo = modelo;
        this.patente = patente;
        this.anio = anio;
    }
    
    public boolean encender_auto(){
        
        if (this.isEncendido()) {
            System.out.println("El auto está encendido");
            return false;
        } else {
            System.out.println("El auto está encendiendo");
            return true;
        }
    }
}
