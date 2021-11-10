package operaciones;

public class Operaciones {
    public float num1;
    public float num2;
    String operac;
    public Operaciones(float num1, float num2, String operac){
        this.num1=num1;
        this.num2=num2;
        this.operac=operac;
    }
    
    public float op(){
        if (operac.equals("suma")) {
            return num1 + num2;
        } else if (operac.equals("resta")){ 
            return num1 - num2;
        } else if (operac.equals("division")){ 
            return num1 / num2;
        } else if (operac.equals("multiplicacion")){ 
            return num1 * num2;
        } else return 0;
            
    }
}