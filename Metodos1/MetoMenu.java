import java.util.Scanner;
import javax.swing.JOptionPane;
public class MetoMenu{
    Scanner entrada = new Scanner(System.in);
    public void Metomenu(){
        char letra;   
        int op=0;
        String cadena;
        do{   
        op = Integer.parseInt(JOptionPane.showInputDialog("De: Flores Leyva Murphy Alexander.\nQue programa desea usar?\n1.- Calculador de edad.\n2.-Figuras.\n3.- Llamadas."));
        switch(op){
            case 1:  
                do{
                    MetoAge obj = new MetoAge();
                    obj.Age();
                    letra = JOptionPane.showInputDialog("Quiere repetir el programa?\n (s=Si/n=No)").charAt(0);
                }while(letra == 's'); break;
            case 2:
                do{
                    MetoFig obj = new MetoFig();
                    obj.Figs();
                    letra = JOptionPane.showInputDialog("Quiere repetir el programa?\n (s=Si/n=No)").charAt(0);
                }while(letra == 's'); break;  
            case 3: 
            do{
                MetoCall obj = new MetoCall();
                obj.Call();
                letra = JOptionPane.showInputDialog("Quiere repetir el programa?\n (s=Si/n=No)").charAt(0);
            }while(letra == 's'); break;
            default: JOptionPane.showInputDialog("Esta no es una opcion."); break;
        }
        letra = JOptionPane.showInputDialog("Quiere repetir el menu?\n (s=Si/n=No)").charAt(0);
            }while(letra == 's');}
}