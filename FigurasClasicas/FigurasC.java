import java.util.Scanner;

class FigurasC{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        float base, alt;
        int opcion;
        char letra;
        double res,res2;
    do{
        System.out.println("Elija la opcion deseada (solo figuras regulares): ");
        System.out.println("1- Area y perimetro de Cuadrado: ");
        System.out.println("2- Area y perimetro de Triangulo: ");
        System.out.println("3- Area y perimetro de Circulo: ");
        System.out.println("4- Area y perimetro de Rectangulo: ");
        System.out.println("5- Area y perimetro de Pentagono: ");
        System.out.println("6- Salir: ");

        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese la medida de un lado: ");
                base = entrada.nextFloat();
                res = base*base;
                res2= 4*base;
                System.out.println("El area es: "+res);
                System.out.println("El perimtro es: "+res2);
                break;
            case 2:
                System.out.println("Ingrese la medida de la base: ");
                base = entrada.nextFloat();
                System.out.println("Ingrese la medida de la altura: ");
                alt = entrada.nextFloat();
                res = (base*alt)/2;
                res2= base*3;
                System.out.println("El area es: "+res);
                System.out.println("El perimtro es: "+res2);
                break;
            case 3:
                System.out.println("Ingrese la medida del radio: ");
                base = entrada.nextFloat();
                res = (base*base)*3.1416;
                res2= 2*3.1416*base;
                System.out.println("El area es: "+res);
                System.out.println("El perimtro es: "+res2);
                break;
            case 4:
                System.out.println("Ingrese la medida de la base: ");
                base = entrada.nextFloat();
                System.out.println("Ingrese la medida de la altura: ");
                alt = entrada.nextFloat();
                res = base*alt;
                res2= (2*base)+(2*alt);
                System.out.println("El area es: "+res);
                System.out.println("El perimtro es: "+res2);
                break;
            case 5:
                System.out.println("Ingrese la medida del apotema: ");
                base = entrada.nextFloat();
                System.out.println("Ingrese la medida de un lado: ");
                alt= entrada.nextFloat();
                res = 5*alt;
                res2= (res*base)/2;
                System.out.println("El area es: "+res2);
                System.out.println("El perimtro es: "+res);
                break;
            default:
                System.out.println("Gracias por usar, buen dia.");
        } 
            System.out.println("Quiere que el progrma se repita?(s=si/n=no)");
            letra = entrada.next().charAt(0);
        }while(letra == 's');
    }
}
