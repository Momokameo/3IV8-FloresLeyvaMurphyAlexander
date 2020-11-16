import java.util.Scanner;

public class Operaciones{
    Scanner entrada = new Scanner(System.in);

    public void menu(){
        char op;

        System.out.println("Usted quiere usar:");
        System.out.println("A.- Calculadora.");
        System.out.println("B.- Conversor de unidades.");
        System.out.println("C.- Creacion de cuadros.");
        System.out.println("D.- Movieminto en cuadro.");
        op = entrada.next().charAt(0);

        switch(op){

            case 'A':
                Calculadora(); break;
            case 'B':
                ConversorUnidades(); break;  

            case 'C':
                CreaCuadro(); break;
            case 'D':
                MoviCuadro(); break;
        }
    }

    //METODOS

    public void Calculadora(){
        double numero = 0.00, suma = 0.00, multi = 1.00;
        char operacion, p;

        System.out.println("Seleccione la operacion deseada: ");
        System.out.println("a. Suma y Resta");
        System.out.println("b. Multiplicacion");
        System.out.println("c. Division");
        operacion = entrada.next().charAt(0);

        switch(operacion){

            case 'a':
                do{
                    System.out.println("Para dejar de sumar ingresa 0.");
                    System.out.println("Ingresa el valor a sumar: ");
                    numero = entrada.nextDouble();
                    suma += numero;
                }while(numero!=0);
                System.out.println("La suma total es de: "+ suma);
                break;
            case 'b':
                do{
                    System.out.println("Para dejar de multiplicar ingresa 0.");
                    System.out.println("Ingresa el valor a multiplicar: ");
                    numero = entrada.nextDouble();
                    if(numero > 0){
                        multi *= numero;
                    }else{
                        System.out.println("Ingresa solo positivos.");}
                    }while(numero!=0);
                System.out.println("La multiplicacion total es de: "+ multi);
                break;
            case 'c':
                System.out.println("Ingresa el numero a dividir: ");
                multi=entrada.nextFloat();
                System.out.println("Ingresa el divisor: ");
                numero = entrada.nextDouble();
                multi= multi/numero;
                System.out.println("La division da un total de: "+ multi);
                break;
                }
            }

    public void ConversorUnidades(){
        int op; double m=0.0,r=0.0;
        System.out.println("Que unidad desea convertir?");
        System.out.println("1.-Metros->Cm.");
        System.out.println("2.-Metros->Pulgada.");
        System.out.println("3.-Kg->Libras.");
        System.out.println("4.-Kg->Onza.");
        op=entrada.nextInt();
        switch(op){
            case 1:
                System.out.println("Ingrese la cantidad de metros: ");
                m=entrada.nextDouble(); r=m*100;
                System.out.println(m+" Metros es igual a "+r+" Cm.");
                break;
            case 2:
                System.out.println("Ingrese la cantidad de metros: ");
                m=entrada.nextDouble(); r=m*39.37;
                System.out.println(m+" Metros es igual a "+r+" Pulgadas.");
                break;
            case 3:
                System.out.println("Ingrese la cantidad de Kilogramos: ");
                m=entrada.nextDouble(); r=m*2.205;
                System.out.println(m+" Kg es igual a "+r+" Libras aprox.");
                break;
            case 4:
                System.out.println("Ingrese la cantidad de Kilogramos: ");
                m=entrada.nextDouble(); r=m*35.274;
                System.out.println(m+" Kg es igual a "+r+" Onzas.");
                break;
            default:System.out.println("Esa no es una opcion.");break;
        }
    }

    public void CreaCuadro(){
        int n, m = 0;
        do{
            System.out.println("Ingresa el numero de * que tenga el cuadro magico");
            n = entrada.nextInt();

            //vamos a tener un maximo de *

            if((n<0) || (n>1000)){
                System.out.println("No se aceptan negativos, ni valores superiores a 1000");
            }else{
                    //la base 
                for(int i=0; i<=n; i++){
                    System.out.print("*");
                }
                //salto de linea \n
                System.out.println("");
                    //se encarga de la altura
                    for(int i = -1; i<n-3; i++){
                        System.out.print("*");
                        System.out.print(" ");
                        //este se encarga de los espacios de adentro del cuadrado
                        for(int j = 0; j<n-2; j++){
                            System.out.print(" ");
                        }
                        System.out.println("*");  
                    }
                    for(int k = 0; k<=n; k++){
                        System.out.print("*");
                    }
            }
            System.out.println("\n");
            System.out.println("Si desea detener el programa teclee 1, de lo contrario escriba cualquier otro numero: ");
            m=entrada.nextInt();
        }while(m!=1);
    }

    public void MoviCuadro(){
        int n, m = 0;
        do{
            System.out.println("Ingresa el numero de * que tenga el cuadro magico");
            n = entrada.nextInt();

            if((n<0) || (n>1000)){
                System.out.println("No se aceptan negativos, ni valores superiores a 1000");
            }else{
                for(int i=0; i<=n; i++){
                    System.out.print("*");
                }
                System.out.println("");

                    for(int i = 0; i<n-3; i++){
                        System.out.print("*");
                        System.out.print(" ");

                        for(int j = 0; j<n-2; j++){
                            System.out.print(" ");
                        }
                        System.out.println("*");
                        //la de menor tamaño
                        System.out.print(" ");
                        System.out.print("*");

                        for(int j = 0; j<n-3; j++){
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                    for(int k = 0; k<=n; k++){
                        System.out.print("*");
                    }
            }
            System.out.println("\n");
            System.out.println("Si desea detener el programa teclee 1, de lo contrario escriba cualquier otro numero: ");
            m=entrada.nextInt();
        }while(m!=1);
    }
}