package ove;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RecLista implements Serializable {
    
    ArrayList<ingresar> listarecuperada = new ArrayList<ingresar>();
    
    public ArrayList<ingresar> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            listarecuperada = (ArrayList<ingresar>)in.readObject();
            in.close();
        }
        catch(Exception e){
            System.out.println("Espera un momento..." + e.getMessage());
        }
        return listarecuperada;
    }
    
    void serializar(ArrayList<ingresar> listaseriar){
        try{
            FileOutputStream out = new FileOutputStream("libro.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(listaseriar);
            objout.close();
        }
        catch(Exception e){
            System.out.println("Se ha produciodo un error en lista." + e.getMessage());
        }
    }
}