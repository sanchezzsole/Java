
package mi_primer_aplicacion;

public class Juego {

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    private int puntos,vidas;
    public String personaje,enemigos,aliados;
    
    Juego(int puntos, int vidas, String personaje, String enemigos, String aliados) {
        //esto lo hacemos xq al momento de crear la clase NO tenemos el objeto
        //no tenemos el valor hasta q instanciemos la clase
        this.puntos=puntos;
        this.vidas=vidas;
        this.personaje=personaje;
        this.enemigos=enemigos;
        this.aliados=aliados;        
    }
    
    String mostrarSaludo(){
        return "Hola soy " + this.personaje + " y tengo " + this.vidas + " vidas.";
    }
}
