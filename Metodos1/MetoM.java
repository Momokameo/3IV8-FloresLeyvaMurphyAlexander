package Metodos1;
//Libreria
import javax.swing.JOptionPane;
//Objetos
public class MetoM{
    public static void main(String[]args){
        Metodos obj = new Metodos();
        int op=0;
        do{
        //Mini interfaz
        String texto = JOptionPane.showInputDialog("Que opcion deseas realizar? \n 1.-Calcular edad. \n 2.-Area y perimetro.\n 3.-Costo de llamada." );
                //Se tiene que usa parse
                int opcion= Integer.parseInt(texto);
                switch (opcion){
                    case 1:
                    obj.edad(); break;
                    case 2:
                    obj.fig(); break;
                    case 3:
                    obj.call(); break;
                    default:
                    System.out.println("Esta no es una opcion."); break;
                }
                String texto2 = JOptionPane.showInputDialog("Quiere repetir el programa?,entonces teclee cualquier numero de lo \n contario presione 0.");
                //Se tiene que usa parse
                int opcion2= Integer.parseInt(texto2); op=opcion2;
            }while (op!=0);
    }
}
