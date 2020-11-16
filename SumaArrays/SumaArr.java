import java.util.Scanner;
import javax.swing.JOptionPane;

public class SumaArr{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int op=0;
        System.out.println("Que programa quiere usar?");
        System.out.println("1.- Array de 100 posiciones.");
        System.out.println("2.- Array con menu grafico.");
        op=entrada.nextInt();

        switch(op){
            case 1:
                int[] num = new int[100];
                int suma = 0;
                double media = 0.00;
                    for(int i = 0; i<num.length; i++){
                        num[i]=i+1;
                        suma+=num[i];
                        System.out.println("La suma ahora vale: "+suma);}
                    System.out.println("La suma de todos los numeros contenidos es de: "+suma);
                    media = (double)suma/num.length;
                    System.out.println("La media de todos los numeros contenidos es de: "+media);
                    break;
            case 2:
            //Mini interfaz
            String texto = JOptionPane.showInputDialog("Introduce el tamaño del arreglo");
            //Se tiene que usa parse
            int tamanio = Integer.parseInt(texto);
            int array[] = new int [tamanio];
            int array2[];
            //rellenamos el primer array con un metodo
            rellenarNumAleatoriosArray(array, 10, 100);
            //apuntar el array2 al arrary1
            array2 = array;
            //creamos un nuevo arrary usando el array1, que tendra una nueva direccion
            array = new int[tamanio];
            //lo volvemos a rellenar 
            rellenarNumAleatoriosArray(array, 10, 100);
            //contiene el arrar con el resultado de multiplicar los valores de los array
            int array3[] = multiplicador(array, array2);

            System.out.println("Arreglo 1: ");
            //metodo para mostrarlos
            mostrarArray(array);
            System.out.println("Arreglo 2: ");
            //metodo para mostrarlos
            mostrarArray(array2);
            System.out.println("Arreglo 3: ");
            //metodo para mostrarlos
            mostrarArray(array3);
            break;
            default: System.out.println("Esta no es una opcion.");break;
        }
        
    }

    //METODOS

    public static void rellenarNumAleatoriosArray(int lista[], int a, int b){
        for(int i = 0; i<lista.length; i++){
            lista[i] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
    public static int[] multiplicador(int array1[], int array2[]){
        int array3[] = new int[array1.length];
        for(int i = 0; i<array1.length; i++){
            array3[i]=array1[i]*array2[i];}
        return array3;
    } 
    public static void mostrarArray(int lista[]){
        for(int i = 0; i<lista.length; i++){
            System.out.println("En la posicion #" + i + " esta el valor aleatorio de: " +lista[i]);
        }
    }

}