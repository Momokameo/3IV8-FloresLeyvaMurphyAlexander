package ove;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Procs implements Serializable{
    
    private ArrayList<ingresar> listalibros;
    
    private RecLista objarchivo = new RecLista();
    
    
    public Procs(){
        listalibros = new ArrayList<ingresar>();
        listalibros = objarchivo.leer();
    }
    
    public void agregarLibro(){
        String resp = "s";
        
        while(resp == "s"){
            ingresar objlibro = new ingresar();
            objlibro.aceptaDatos();
            listalibros.add(objlibro);
            resp = JOptionPane.showInputDialog("Usuario agregado.\n"
                    + "¿Quiere añadir otro usuario? (S/N).");
        }
    }
    
    public void consultaGral(){
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"No existen usuarios guardados.");
        }else{
            JOptionPane.showMessageDialog(null,"Usuaros:\n");
            for(int i = 0; i<listalibros.size(); i++){
                JOptionPane.showMessageDialog(null,"Nombre: " + listalibros.get(i).getNombre()+ ".\n"
                                 + "Edad: " + listalibros.get(i).getEdad()+ ".\n"
                                 + "Puntaje: " + listalibros.get(i).getPrecio()+ ".\n");
            }
            
        }
    }
    
    private int traePosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        for(int i = 0; i < listalibros.size(); i++){
            if(nombreBuscar.equals(listalibros.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
            }
        }
        if(!existe){
            JOptionPane.showMessageDialog(null,"No hay regsitro del usuario.");
            pos = -1;
        }
        return pos;
    }
    
    public int buscar(){
        int posBuscando = 0;
        String nombreBusca;
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"No existen usuarios.");
        }
        else{
        nombreBusca = JOptionPane.showInputDialog("¿Cual es el nombre del jugador?:");
        
        posBuscando = traePosicion(nombreBusca);
        
        JOptionPane.showMessageDialog(null,"Nombre: " + listalibros.get(posBuscando).getNombre()
                + "Edad: " + listalibros.get(posBuscando).getEdad()
                + "Puntaje: " + listalibros.get(posBuscando).getPrecio()
                + "ID: " + listalibros.get(posBuscando));
        }
        return posBuscando;
    }
    
    public void borrar(){
        String libroBorrar;
        int posBorrar;
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"Usuarios Inexistentes.");
        }else{
            posBorrar = buscar();
            if(posBorrar < listalibros.size()){
                listalibros.remove(posBorrar);
                JOptionPane.showMessageDialog(null,"Me deshice del usuario correctamente 3:).");
            }
        }
    }
    
    public void modificar(){
        int posModificar = 0;
        int resMods = 0;
        String nombreModificar;
        String opcion = "s";
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"Usuarios inexistentes.");
        }
        else{
            nombreModificar = JOptionPane.showInputDialog("¿Que usuario quieres modificar?:");
        
        while("s".equals(opcion)){
            posModificar = traePosicion(nombreModificar);
            if(posModificar <= 0);
            resMods = Integer.parseInt(JOptionPane.showInputDialog("\n¿Que dato vas a edittar?:"
                        + "\n— nombre (1);"
                        + "\n— edad (2)."));
                
                switch (resMods) {
                    case 1:
                        JOptionPane.showMessageDialog(null,"El jugador es: "
                                + listalibros.get(posModificar).getNombre());
                        listalibros.get(posModificar).setNombre(JOptionPane.showInputDialog("El nuevo nombre sera:"));
                        JOptionPane.showMessageDialog(null,"Cambio de identidad exitoso."
                                + "\nNombre del usuario: " + listalibros.get(posModificar).getNombre());
                    break;
                    
                    case 2:
                        JOptionPane.showMessageDialog(null,"La edad actual es: "
                                + listalibros.get(posModificar).getEdad());
                        listalibros.get(posModificar).setEdad(Integer.parseInt(JOptionPane.showInputDialog("La nueva edad sera:")));
                        JOptionPane.showMessageDialog(null,"Cambio de identidad exitoso."
                                + "\nEdad: " + listalibros.get(posModificar).getEdad());
                    break;                
                }
            opcion = JOptionPane.showInputDialog("¿Quieres hacer otra modificacion? (S/N).");        
        }
        }
    }

    public ArrayList<ingresar> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<ingresar> listalibros) {
        this.listalibros = listalibros;
    }

    public RecLista getObjarchivo() {
        return objarchivo;
    }

    public void setObjarchivo(RecLista objarchivo) {
        this.objarchivo = objarchivo;
    }
    
    public void grabar(){
        getObjarchivo().serializar(listalibros);
    }
}