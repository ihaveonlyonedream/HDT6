
package HDT6;

import java.util.Set;

public class  Desarrolladores {
    
    private boolean Java = false;
    private boolean Web = false;
    private boolean Celular = false;
    private String Nombre = "";
    
    public void setJava(int opcion){
        if (opcion==1){
            Java = true;
        }
        if(opcion==0){
            Java = false;
        }else{
            System.out.println("Error, opcion incorrecta");
        }
    }
    
    public void setWeb(int opcion){
        if (opcion==1){
            Web = true;
        }
        if(opcion==0){
            Web = false;
        }else{
            System.out.println("Error, opcion incorrecta");
        }
    }
        
    public void setCelular(int opcion){
        if (opcion==1){
            Celular = true;
        }
        if(opcion==0){
            Celular = false;
        }else{
            System.out.println("Error, opcion incorrecta");
        }
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public boolean getJava(){
        return Java;
    }
    
    public boolean getWeb(){
        return Web;
    }
    
    public boolean getCelular(){
        return Celular;
    }
    
    public String getNombre(){
        return Nombre;
    }
}
