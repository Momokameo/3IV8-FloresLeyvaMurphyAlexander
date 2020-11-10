import java.util.*;

public class Arreglitos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int array[][] = new int [3][3];
        float sumarFilas=0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.println("Ingresa el valor de la fila "+ i + " columna " + j + " : ");
                array[i][j] = entrada.nextInt();
            }   
        }
        for(int i = 0; i<array.length; i++){
            sumarFilas = 0;
            for(int j = 0; j<array.length; j++){
                sumarFilas += array[i][j];
                System.out.println(String.format("%d ", array[i][j]));
            }
            System.out.println(String.format("Suma fila : %f, promedio fila: %f ", sumarFilas,
             sumarFilas/array.length));
            System.out.println();
        } 
    }
}