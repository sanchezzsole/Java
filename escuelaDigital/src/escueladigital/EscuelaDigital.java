package escueladigital;

import alumno.Alumno;
import docente.Docente;

public class EscuelaDigital {

    public static void main(String[] args) {
       Docente docente1 = new Docente(1, "Soledad", "Sanchez", 36);
       Alumno alumno = new Alumno(2, "Franco", "Fittipaldi", 6, 10);
       Campus campus = new Campus(14, "Web");
       campus.setPassword("123456");
       Campus docente = new Campus(12, "web");
       docente.setPassword("1413");
       System.out.println(docente.ingresar(12, "1413"));
    }
    
}
