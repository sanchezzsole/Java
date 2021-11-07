package ejercicio_unidad_2;
import java.util.Scanner;
public class Ejercicio_unidad_2 {

    public static void main(String[] args) {
        
        public String nombre;
        public String apellido;
        public int edad;
        public String hobbie;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        nombre=entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad=entrada.nextInt();
        System.out.println("Cuál es su hobbie?");
        nombre=entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=entrada.nextLine();
        
        
        System.out.println("Su nombre nombre completo es: " + nombre + " " + apellido);
        System.out.println("Usted tiene: " + edad + " años");
        System.out.println("Su hobbie es: " + hobbie);
          
            
        
        
    }
    
}
