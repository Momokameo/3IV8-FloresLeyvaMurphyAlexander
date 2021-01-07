package ove;

import Gato2M.GameInfz;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class ConMenu implements Serializable{
    public static void main() {
        Procs objlista = new Procs();
        int opcion;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Opciones.\n"
                    + "Escoje que quieres hacer:\n"
                    + "— Añadir Jugador [1];\n"
                    + "— Ver jugadores actuales [2];\n"
                    + "— Modificar un Usuario [3];\n"
                    + "— Regresar [4]."));
            
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Se alcanzo el limite"
                            + "de jugadores [2] registrados.");
                break;
                
                case 2:
                    JOptionPane.showMessageDialog(null,"Para ver los Jugadores,"
                            + "presione el icono [MENU] durante una partida.");
                break;
                
                case 3:
                    objlista.modificar();
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null,"Arch. procesado.");
                    objlista.grabar();
                break;
                
                default:
                JOptionPane.showMessageDialog(null,"Ocurrio un error.");
            }       
        }while((opcion >= 1) && (opcion < 4));
    }
}