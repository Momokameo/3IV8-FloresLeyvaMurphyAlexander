import java.util.*;
public class ArreglosT {
    int cual;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char let;
        int opc;           
      do{
       System.out.println("Que programa quiere realizar?");
       System.out.println("1. Promedio de positivos y negativos.");
       System.out.println("2. Promedio de pares del array.");
       System.out.println("3. Lector de calificaciones.");
       System.out.println("4. Sumar en matriz s.");

       
        opc = entrada.nextInt();

        switch (opc) {
            case 1: ArreglosT np = new ArreglosT();
                do{
                np.negativo();
                System.out.println("Quiere repetir? (s=Si/n=No)");
                let = entrada.next().charAt(0);
            }while(let == 's');
            break;

            case 2: ArreglosT pares = new ArreglosT();
                do{
                pares.Pares();
                System.out.println("Quiere repetir? (s=Si/n=No)");
                let = entrada.next().charAt(0);
            }while(let == 's'); break;
           
            case 3: ArreglosT calif = new ArreglosT();
            do{   
                calif.LecCali();
                System.out.println("Quiere repetir? (s=Si/n=No)");
                let = entrada.next().charAt(0);
            }while(let == 's'); break;

            case 4: ArreglosT matriz = new ArreglosT();
            do{
                matriz.matr();
                System.out.println("Quiere repetir? (s=Si/n=No)");
                let = entrada.next().charAt(0);
            }while(let == 's'); break;
        }
            System.out.println("Quiere repetir el menu inicial? (s=Si/n=No)");

            let = entrada.next().charAt(0);
            }while(let == 's');
    }


            public void negativo(){
            
                 Scanner entrada = new Scanner(System.in);
                    int k,posi= 0,nega=0; 
                    int[] numeros = new int[10]; 
                    double sumaPos = 0, sumaNeg = 0;               
                    
                    System.out.println("Escriba los numeros para el arreglo: ");
                    for (k = 0; k < 10; k++) {
                        System.out.print("Numero #" + k + "= ");
                        numeros[k]=entrada.nextInt();
                    }
                    
                    for (k = 0; k < 10; k++) {
                        if (numeros[k] > 0){ 
                            sumaPos += numeros[k];
                            posi++;
                        } else if (numeros[k] < 0){ 
                            sumaNeg += numeros[k];
                            nega++;
                        }
                    }
            
                    if (posi != 0) {
                        System.out.println("La media de los valores positivos es: " + sumaPos / posi);                
                    } else {
                        System.out.println("Usted no introdujo numeros positivos.");
                    }
                    if (nega != 0) {
                        System.out.println("La media de los valores negativos es: " + sumaNeg / nega);
                    } else {
                        System.out.println("Usted no introdujo numeros positivos.");
                    }
                }
                
                public void Pares(){
                    Scanner entrada = new Scanner(System.in);
                    int g;
                    int[] numeros = new int[10];
                    double media = 0;
        
                    System.out.println("Esriba los numeros para su arreglo: ");
                    for (g=0;g<10;g++) {
                        System.out.print("Numero #" + g + "= ");
                        numeros[g] = entrada.nextInt();
                    }
                    
                    for (g=0;g<10;g++) {
                        if (g%2 == 0){ 
                            media = media + numeros[g];
                        }
                    }
                    System.out.println("La media de los valores que se encuentran en posiciones pares es: "+ media/5);              
                }

                public void LecCali(){
                    Scanner entrada = new Scanner(System.in);
                    int k,apro=0,repro=10;
                    double suma = 0, media;
                    double[] notas = new double[10]; 

                    for (k=0; k < notas.length; k++) {
                        System.out.print("Alumno #" + (k + 1) + " Su calificacion final es: ");
                        notas[k] = entrada.nextDouble();
                    }
                    for (k = 0; k < notas.length; k++) {
                        suma = suma + notas[k];
                    }
                    media = suma / notas.length;
                          System.out.println("Las calificaciones son: ");
                    for (k = 0; k < notas.length; k++) { 
                            System.out.println("Alumno #" + (k + 1)+ " cuya calificacion final es: " + notas[k]);
                    }
                         System.out.printf("El promedio medio del curso es: %.2f %n", media);              
                         System.out.println("Las calificaiones superiores a la media son: ");
                    for (k=0; k < notas.length; k++) {
                        if (notas[k] > media) {
                            System.out.println("Alumno #" + (k + 1)+ " de calificacion final: " + notas[k]);
                        }
                    }
                        for (k=0;k<notas.length;k++) {
                        if (notas[k] >= 6 ) {
                            apro= apro + 1;          
                }
            }
                repro=repro-apro;   
                System.out.println("Alumnos que pasaron: "+apro);
                    System.out.println("Alumnos reprobados: "+repro);
                }
                public void matr(){
                    Scanner entrada = new Scanner(System.in);
                    int arrA[][] = new int [3][3];
                    int arrB[][] = new int [3][3];
                    int sumas [][] = new int[arrA.length][arrA.length];
                    float arreglos=0;
                    for(int i=0; i<arrA.length; i++){
                        for(int j=0; j<arrA.length; j++){
                            System.out.println("Introduce el numero de la fila del "
                            + i + " columna " + j + " del primer arreglo (A): ");
                            arrA[i][j] = entrada.nextInt();     
                }
            }
            for(int i=0; i<arrB.length; i++){
                //columnas
                for(int j=0; j<arrB.length; j++){
                    System.out.println("Introduce el numero de la fila "
                    + i + " columna " + j + " del segundo arreglo (B): ");
                    arrB[i][j] = entrada.nextInt();
                }
        }
        int[][] suma = new int[arrA.length][arrA[0].length];
        for (int i=0; i < arrA.length; i++) {
            for (int j=0; j < arrA[i].length; j++) {				
              suma[i][j]=arrA[i][j]+arrB[i][j];	
        }
        }
        for (int i=0; i < sumas.length; i++) {
            System.out.print("|");
            for (int j=0; j < suma[i].length; j++) {
              System.out.print (suma[i][j]);
              if (j!=suma[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
     }             
 } 
                