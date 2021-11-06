
package mi_primer_aplicacion;

public class Juego {
    public int puntos,vidas;
    public String personaje,enemigos,aliados;
    Juego(int puntos, int vidas, String personaje, String enemigos, String aliados) {
        //esto lo hacemos xq al momento de crear la clase NO tenemos el objeto
        //no tenemos el valor hasta q instanciemos la clase
        this.puntos=puntos;
        this.vidas=vidas;
        this.personaje=personaje;
        this.enemigos=enemigos;
    }
}
