
package HDT6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class setFactory {
    
    private static setFactory uniqueSetFactory;
//****************************************
    private static void setFactory(){}
    
    public static Set getSet(int opcion){
        
        if(opcion==1){
            return new HashSet();
        }
        if(opcion==2){
            return new TreeSet();
        }
        if(opcion==3){
            return new LinkedHashSet();
        }else{
            System.out.println("Error");
            return null;
        }    
    }
    
    public static setFactory getListaFactory(){
        if(uniqueSetFactory==null){
            uniqueSetFactory= new setFactory();
            return uniqueSetFactory;
        }else{
            return uniqueSetFactory;
        }
    }
}
