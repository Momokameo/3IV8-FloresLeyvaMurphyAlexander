import java.util.Scanner;
import java.util.*;

class DatosUsuario{
    public static void main(String[] args){
    Scanner entrada = new Scanner (System.in);
    
    String nom;
    int edad;
    float alt;

    System.out.println("Escriba su nombre: ");
    nom = entrada.nextLine();
    System.out.println("Ahora su edad: ");
    edad = entrada.nextInt();
    System.out.println("Ahora su altura: ");
    alt = entrada.nextFloat();

    System.out.println("Tu nombre es "+nom);
    System.out.println("Tu edad es "+edad);
    System.out.println("Tu altura es "+alt);
    }
}