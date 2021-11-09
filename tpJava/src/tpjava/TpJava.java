package tpjava;

import java.util.Scanner;

public class TpJava {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su hobbie");
        String hobbie = entrada.nextLine();
        System.out.println("Cuál es su editor de código preferido?");
        String editorCodigo = entrada.nextLine();
        System.out.println("Qué sistema operativo utiliza?");
        String sitemaOperativo = entrada.nextLine();
        
        System.out.println("Su nombre completo es: " + nombre + " " + apellido);
        System.out.println("Usted tuene " + edad + " años");
        System.out.println("Uno de sus hobbies es " + hobbie);
        System.out.println("El editor de código de su preferencia es " + editorCodigo + ", y el sistema operativo que utiliza es " + sitemaOperativo);
        
        
    }
    
}
