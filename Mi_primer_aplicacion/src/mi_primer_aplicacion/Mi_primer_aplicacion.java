package mi_primer_aplicacion;

import accesorios.Auto;

public class Mi_primer_aplicacion {
    //para declarar las variables: primero si es public/private, luego el tipo de variable, y luego el nombreElegido

    public static void main(String[] args) {
        //al ejecutar la aplicacion se ejecuta DENTRO DE ESTA FX que es la FX MAIN
        
        //para mostrar en la consola los valores: soutTAB y pone:   System.out.println("");
        System.out.println("Hola de nuevo! tanto tiempo...");
            int numero;
            float promedio;
            boolean llueve=false;
            numero = 13;
            float resultado = numero+19;
            promedio = (numero + 19) / 2;
            System.out.println(resultado);
            System.out.println("El promedio es: "+ promedio);
            System.out.println(45>19 && 19<10);
            System.out.println(45>19 || 19<10);
            System.out.println(45>19 != 19<10);
            System.out.println("");
            if(llueve== true){
                System.out.println("Usar paraguas");
            }else{
                System.out.println("No usamos paraguas");
            }
             
            
            Juego jugador = new Juego(0, 3, "Mario", "Hongos", "martillo");
            Juego jugador2 = new Juego(0, 3, "Luigi", "Hongos", "Fuego");
            System.out.println("Mi nombre es "+ jugador.personaje);
            System.out.println("Tengo " + jugador.getVidas() + " vidas");
            System.out.println(jugador.mostrarSaludo());
            System.out.println(jugador2.mostrarSaludo());
            
            Auto miAuto = new Auto(60, true, 5, "Azul", "Suran", "ABC123", 2015);
            miAuto.setEncendido(true);
            System.out.println(miAuto.encender_auto());
            
        
    }
    
}
