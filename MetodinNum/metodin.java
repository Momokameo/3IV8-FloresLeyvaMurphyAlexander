import java.util.Scanner;

public class metodin{
    int glob;
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        char letra;
        metodin masymen = new metodin();

        System.out.println("Se ha creado un objeto de la clase.");
        do{
        System.out.println("Ejecutando programa.");    
        masymen.cargaDeValores();
        System.out.println("Quieres repetir el programa?(s=Si/n=No)");
        letra = entrada.next().charAt(0);
        System.out.println("De acuerdo.");
        }while(letra!='n');
    }

    public void cargaDeValores(){
        Scanner entrada = new Scanner(System.in);
        int val1, val2, val3,mayor, menor;

        System.out.println("Ingresa el primer numero a comparar: ");
        val1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero a comparar: ");
        val2 = entrada.nextInt();
        System.out.println("Ingresa el tercero numero a comparar: ");
        val3 = entrada.nextInt();

        System.out.println("Calculando mayor...");
        mayor = calcuMayor(val1, val2, val3);
        System.out.println("Calculando menor...");
        menor = calcuMenor(val1, val2, val3);
 
        System.out.println("El mayor valor es: "+ mayor);
        System.out.println("El menor valor es: "+ menor);
    }

    public int calcuMayor(int v1, int v2, int v3){
        if(v1>v2 && v1>v3){ glob = v1;
        }else{
            if(v2>v3){ glob = v2;
            }
            else{ glob = v3;
            }
        } return glob;
    }
    public int calcuMenor(int v1, int v2, int v3){
        if(v1<v2 && v1<v3){ glob = v1;
        }else{
            if(v2<v3){ glob= v2;
            }
            else{ glob = v3;
            }
        }
        return glob;
    }

}