package calculadora;
import java.util.Scanner;
import operaciones.Operaciones;
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        float num1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo número");
        float num2 = entrada.nextFloat();
        System.out.println("Ingrese la operación a realizar: suma, resta, división, multiplicacion");
        String operac = entrada.next();
        
        Operaciones operacion = new Operaciones(num1, num2, operac);
        System.out.println("El resultado de la operación seleccionada es: \n" + operacion.op());
    
    }
    
}
