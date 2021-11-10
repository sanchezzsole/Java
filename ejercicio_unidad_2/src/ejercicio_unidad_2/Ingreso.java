package ejercicio_unidad_2;

public class Ingreso {
    private String usuario;
    private String pass;
    private String miUsuario="sole";
    private String miPass = "123456";
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String user){
        usuario=user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean validar(){
        return (usuario.equals(miUsuario)) && (pass.equals(miPass));
        }
    }

