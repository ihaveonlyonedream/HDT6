
package HDT6;

import HDT6.setFactory;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        
        Set listaJava = null;
        Set listaWeb = null;
        Set listaCelular = null;
        
        Set listaOpcion1 = null;
        Set listaOpcion2 = null;
        Set listaOpcion3 = null;
        Set listaOpcion4 = null;
        Set listaOpcion5 = null;
        Set listaOpcion6 = null;
        String nombreOpcion7 = "";
 
        Scanner in = new Scanner(System.in);
        
        int opcion =0;
        String nombre = "";
        
        boolean salir = false;
        boolean salirIngreso = false;
        //******************************************************************************************************************
        while(salir==false){
            System.out.println("\n\nBienvenido:\n");
            System.out.println("Que tipo de Set desea utilizar?");
            System.out.println("1. HashSet");
            System.out.println("2. TreeSet");
            System.out.println("3. LinkedHashSet");
            System.out.print("Opcion: ");
            opcion = in.nextInt();
            System.out.println("");
        //******************************************************************************************************************
            
            if(opcion>0 && opcion <4){
                listaJava = setFactory.getSet(opcion);
                listaWeb = setFactory.getSet(opcion);
                listaCelular = setFactory.getSet(opcion);
                listaOpcion1 = setFactory.getSet(opcion);
                listaOpcion2 = setFactory.getSet(opcion);
                listaOpcion3 = setFactory.getSet(opcion);
                listaOpcion4 = setFactory.getSet(opcion);
                listaOpcion5 = setFactory.getSet(opcion);
                listaOpcion6 = setFactory.getSet(opcion);
                
                salir = true;
            }
        }
        //******************************************************************************************************************
        
        while (salirIngreso==false){
            System.out.println("\n\nDesarrollador\n");
            System.out.println("Nombre?");
            in.nextLine();
            nombre = in.nextLine();
            System.out.println("");
        //******************************************************************************************************************    
            System.out.println("Tiene experiencia en Java? (Si=1; No=0)");
            opcion = in.nextInt();
            System.out.println("");
            
            if (opcion==1){
                listaJava.add(nombre);
            }
        //******************************************************************************************************************    
            System.out.println("Tiene experiencia en Web? (Si=1; No=0)");
            opcion = in.nextInt();
            System.out.println("");
            
            if (opcion==1){
                listaWeb.add(nombre);
            }
        //******************************************************************************************************************    
            System.out.println("Tiene experiencia en Celulares? (Si=1; No=0)");
            opcion = in.nextInt();
            System.out.println("");
            
            if (opcion==1){
                listaCelular.add(nombre);
            }
        //******************************************************************************************************************    
            System.out.println("Desea agregar otro Desarrollador? (Si=1; No=0)");
            opcion = in.nextInt();
            System.out.println("");
            
            if (opcion==0){
                salirIngreso=true;
            }
        //******************************************************************************************************************    
        }
        
        //OPCION NO 1*******************************************************************************************************
        listaOpcion1.addAll(listaJava);
        listaOpcion1.retainAll(listaWeb);
        listaOpcion1.retainAll(listaCelular);
        System.out.println("Desarrolladores con experiencia en Java, web y celulares: " + listaOpcion1);
        
        //OPCION NO 2*******************************************************************************************************
        listaOpcion2.addAll(listaJava);
        listaOpcion2.removeAll(listaWeb);
        System.out.println("Desarrolladores con experiencia en Java pero no en Web: " + listaOpcion2);
        //OPCION NO 3*******************************************************************************************************
        listaOpcion3.add(listaWeb);
        listaOpcion3.retainAll(listaCelular);
        listaOpcion3.removeAll(listaJava);
        System.out.println("Desarrolladores con experiencia en Web y Celulares pero que no tienen experiencia en Java: " + listaOpcion3);
        //OPCION NO 4*******************************************************************************************************
        listaOpcion3.add(listaWeb);
        listaOpcion3.addAll(listaCelular);
        listaOpcion3.removeAll(listaJava);
        System.out.println("Desarrolladores con experiencia en Web o Celulares pero que no tienen experiencia en Java: " + listaOpcion3);
        //OPCION NO 5*******************************************************************************************************
        if((listaWeb.containsAll(listaJava))==true){
            System.out.println("El conjunto de Java es un subconjunto del conjunto de Web");
        }else{
            System.out.println("El conjunto de Java NO es un subconjunto del conjunto Web");
        }
        //OPCION NO 6*******************************************************************************************************
        if(listaJava.size()>listaWeb.size() && listaJava.size()>listaCelular.size()){
            listaOpcion6 = listaJava;
            nombreOpcion7 = "Java";
            System.out.println("El conjuto de desarrolladores mas grande es Java. Integrantes:\n" + listaJava);
        }
        else if(listaWeb.size()>listaJava.size() && listaWeb.size() >listaCelular.size()){
            listaOpcion6 = listaWeb;
            nombreOpcion7 = "Web";
            System.out.println("El conjuto de desarrolladores mas grande es Web. Integrantes:\n" + listaWeb);
        }
        else if(listaCelular.size()>listaJava.size() && listaCelular.size() >listaWeb.size()){
            listaOpcion6 = listaCelular;
            nombreOpcion7 = "Celular";
            System.out.println("El conjuto de desarrolladores mas grande es Celulares. Integrantes:\n" + listaCelular);
        }else{
            System.out.println("Existen dos o mas conjuntos mayores");
        }
        //OPCION NO 7*******************************************************************************************************
        if(listaOpcion6!=null){
            Set ordenado = new TreeSet(listaOpcion6);
            System.out.println("El conjuto de desarrolladores mas grande es " + nombreOpcion7+ "Integrantes: \n" + ordenado);
        }else{
            System.out.println("Existen dos o mas conjuntos mayores");
        }
        //******************************************************************************************************************
    }
}


