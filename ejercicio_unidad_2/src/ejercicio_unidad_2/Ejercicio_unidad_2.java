package ejercicio_unidad_2;
import java.util.Scanner;
public class Ejercicio_unidad_2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //siempre que quiero q el usuario ingrese datos debo declarar la clase SCANNER 
        // de la siguiente manera, e importar java.util.Scanner;
        //la clase Scanner necesita parametros, System.in
        System.out.println("Ingrese su nombre");
        String nombre=entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido=entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad=entrada.nextInt();
        System.out.println("Cuál es su hobbie?");
        String hobbie = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese su uuario");
        String usuario=entrada.nextLine();
        System.out.println("Ingrese su contraseña");
        String pass=entrada.nextLine();
        Ingreso ingresar = new Ingreso();
        ingresar.setUsuario(usuario);
        ingresar.setPass(pass);
       if(ingresar.validar()){
           System.out.println("Bienvenid@ " + ingresar.getUsuario());
       } else {
           System.out.println("Los datos son incorrectos, ingreselos nuevamente");
       } 
        //System.out.println("Su nombre nombre completo es: " + nombre + " " + apellido);
        //System.out.println("Usted tiene: " + edad + " años");
        //System.out.println("Su hobbie es: " + hobbie);  
    }
    
}
