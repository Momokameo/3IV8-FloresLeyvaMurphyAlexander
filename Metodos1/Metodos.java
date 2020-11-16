package Metodos1;
//libreria
import java.util.Scanner;

public class Metodos {
    static Scanner entrada = new Scanner(System.in);
    int op=0;
    float a=0,b=0, c;
    public void edad() {
        Metodos.calcuEd();
    }
    public void fig() {
        System.out.println("Con que figura desea trabajar?");
        System.out.println("1.-Circulo.");
        System.out.println("2.-Cuadrado.");
        System.out.println("3.-Rectangulo.");
        System.out.println("4.-Triangulo isoceles.");
        op= entrada.nextInt();
        switch(op){
            case 1:
            System.out.println("Cual es el radio?");
            a=entrada.nextFloat();b=a;
            Metodos.FigurasC(a);
            Metodos.FigurasC2(b);
            System.out.println("El area es "+a+" y el perimetro "+b);
            case 2:
            System.out.println("Cual es la altura?");
            a=entrada.nextFloat();
            System.out.println("Cual es la base?");
            b=entrada.nextFloat();
            Metodos.FigurasCuadradas(a,b);
            Metodos.FigurasCuadradas2(a,b);
            System.out.println("El area es "+a+" y el perimetro "+b);
            case 3:
            System.out.println("Cual es la altura?");
            a=entrada.nextFloat();
            System.out.println("Cual es la base?");
            b=entrada.nextFloat();
            Metodos.FigurasCuadradas(a,b);
            Metodos.FigurasCuadradas2(a,b);
            System.out.println("El area es "+a+" y el perimetro "+b);
            case 4:
            System.out.println("Cual es la altura?");
            a=entrada.nextFloat();
            System.out.println("Cual es la base?");
            b=entrada.nextFloat();
            Metodos.FigurasT(a,b);
            Metodos.FigurasT2(a,b);
            System.out.println("El area es "+a+" y el perimetro "+b);
            default: System.out.println("Esta no es una opcion.");
        }
    }

    public void call() {

    }
    //Para edad
    static void calcuEd() {
        double año = 0.0, ed = 0.0;
        System.out.println("En que año nacio usted?");
        año = entrada.nextDouble();
        if (año<1950||año>2020){
            System.out.println("Datos invalidos a menos que sea del futuro o un adulto mayor.");
        }else{
            ed=2020-año;
            System.out.println("Usted tiene "+ed+"años.");
        }
    }
    //Para circulo
    static float FigurasC(float altura) {
        altura= (float) (3.14 * 2 * altura);
        return altura;
    }
    static float FigurasC2(float altura) {
        altura=(float) ((altura*altura)*3.14);;
        return altura;
    }
    //Para 4lados
    static float FigurasCuadradas(float altura, float base) {
        altura= altura*base;
        return altura;
    }
    static float FigurasCuadradas2(float altura,float base) {
        base= (2*base)+(2*altura);
        return base;
    }
    //Para 3lados
    static float FigurasT(float altura,float base) {
        altura= (base*altura)/2;
        return altura;
    }
    static float FigurasT2(float altura,float base) {
        base= base+(2*altura);
        return base;
    }
}

    

