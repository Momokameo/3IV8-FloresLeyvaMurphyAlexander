import java.util.Scanner;
    class EstructuraD{
        public static void main(String[]args){
            int edad,opcion,dig;
            float numero,numero2;
            double res,bono,cal,res2;
            char letra,letra2,letra3,letra4,letra5;
            Scanner entrada = new Scanner (System.in);
        do{
            opcion=0;
            System.out.println("Buen dia, porfavor escoja la opcion que necesite:");
            System.out.println("1-Solicitud de Bono.");
            System.out.println("2-Conversor decimal-binario.");
            System.out.println("3-Conversor de unidades de temperatura.");
            System.out.println("4-Contador de numeros +-.");
            System.out.println("5-Lector de cantidades.");
            System.out.println("6-Calculador de figuras.");
            System.out.println("7-Ver tabla.");
            System.out.println("13-Calculadora.");

            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El bono neto es de $10000 MX");
                    System.out.println("Indique su edad: ");
                    edad= entrada.nextInt();
                    if (edad >105 || edad<0){
                        System.out.println("Esta edad no es posible, intente de nuevo.");
                    } else{
                        if (edad >= 65){
                            bono=10000*.4; bono =10000-bono;
                            System.out.println("Se le aplicara un descuento del 40% por lo que que el precio del bono seria: $"+bono);
                            bono=0;
                            break;
                        }
                        if (edad <=21){
                            System.out.println("Sus padres son socios?(s=Si/n=No):");
                            letra2 = entrada.next().charAt(0);
                            if (letra2 == 's'){
                                bono=10000*.45; bono=10000-bono;
                                System.out.println("De acuerdo, por lo tanto se le aplicara un descuento del 45% al bono, por lo tanto el precio seria: $"+bono);
                                bono=0;
                                break;
                            }
                            else{
                                bono=10000*.25; bono=10000-bono;
                                System.out.println("De acuerdo, por lo tanto se le aplicara un descuento del 25% al bono, por lo tanto el precio seria: $"+bono);
                                bono=0;
                                break;
                            }
                        }
                    }
                case 2:
                    System.out.println("Introduzca el valor que desee convertir a binario (solo numeros positivos): ");
                    numero= entrada.nextFloat();
                    edad=0; res=0;
                    if (numero<0){
                        System.out.println("Eso no es un valor positivo, intente de nuevo.");
                    }
                    else{
                        while(numero!=0){
                            dig= (int) (numero % 2);
                            res= res +dig* Math.pow(10, edad);
                            edad++;
                            numero= numero/2;
                        }
                        System.out.println("En binario seria: "+res);
                        break;
                    }
                case 3:
                    System.out.println("Escoja su unidad inicial:");
                    System.out.println("f- FAHRENHEIT a:");
                    System.out.println("c- CELSIUS a:");
                    System.out.println("k- KELVINE a:");
                    System.out.println("r- RANKINE a:");
                    letra2 =entrada.next().charAt(0);
                    System.out.println("Cuantos grados?");
                    numero=entrada.nextFloat();
                    switch (letra2){
                    case 'f':
                        System.out.println("A que unidad?(mismas opciones con las mismas letras)");
                        letra3=entrada.next().charAt(0);
                        switch (letra3){
                            case 'f': 
                            System.out.print("En grados FAHRENHEIT serian: "+numero);System.out.println(" grados.");
                            break;
                            case'c':
                            numero= numero-32; numero= numero*5/9;
                            System.out.print("En grados CELSIUS serian: "+numero);System.out.println(" grados.");
                            break;
                            case 'k': 
                            numero=numero-32;numero=numero*5/9;res= numero + 273.15;
                            System.out.print("En grados KELVINE serian: "+res);System.out.println(" grados.");
                            break;
                            case 'r':
                            numero= (float) (numero + 459.67);
                            System.out.print("En grados RANKINE serian: "+numero);System.out.println(" grados.");
                            break;
                            default:
                            System.out.println("No es una opcion valida.");
                        }break;
                    case'c':
                        System.out.println("A que unidad?(mismas opciones con las mismas letras)");
                        letra3=entrada.next().charAt(0);
                        switch (letra3){
                            case 'f': 
                            numero= (numero*9/5)+32;
                            System.out.print("En grados FAHRENHEIT serian: "+numero);System.out.println(" grados.");
                            break;
                            case'c':
                            System.out.print("En grados CELSIUS serian: "+numero);System.out.println(" grados.");
                            break;
                            case 'k': 
                            res=numero+273.15;
                            System.out.print("En grados KELVINE serian: "+res);System.out.println(" grados.");
                            break;
                            case 'r':
                            res= (numero*9/5)+491.67;
                            System.out.print("En grados RANKINE serian: "+res);System.out.println(" grados.");
                            break;
                            default:
                            System.out.println("No es una opcion valida.");
                            }break;
                        case'k':
                        System.out.println("A que unidad?(mismas opciones con las mismas letras)");
                        letra3=entrada.next().charAt(0);
                        switch (letra3){
                            case 'f': 
                            res= numero-273.15;numero=numero*9/5;numero=numero+32;
                            System.out.print("En grados FAHRENHEIT serian: "+res);System.out.println(" grados.");
                            break;
                            case'c':
                            res= numero-273.15;
                            System.out.print("En grados CELSIUS serian: "+res);System.out.println(" grados.");
                            break;
                            case 'k':
                            System.out.print("En grados KELVINE serian: "+numero);System.out.println(" grados.");
                            break;
                            case 'r':
                            res=numero*1.8;
                            System.out.print("En grados RANKINE serian: "+res);System.out.println(" grados.");
                            break;
                            default:
                            System.out.println("No es una opcion valida.");
                            }break;
                            case'r':
                        System.out.println("A que unidad?(mismas opciones con las mismas letras)");
                        letra3=entrada.next().charAt(0);
                        switch (letra3){
                            case 'f': 
                            res= numero-459.67;
                            System.out.print("En grados FAHRENHEIT serian: "+res);System.out.println(" grados.");
                            break;
                            case'c':
                            res= numero-491.67;res=res*5/9;
                            System.out.print("En grados CELSIUS serian: "+res);System.out.println(" grados.");
                            break;
                            case 'k':
                            res= numero*5/9;
                            System.out.print("En grados KELVINE serian: "+res);System.out.println(" grados.");
                            break;
                            case 'r':
                            System.out.print("En grados RANKINE serian: "+numero);System.out.println(" grados.");
                            break;
                            default:
                            System.out.println("No es una opcion valida.");
                            }break;
                        }break;
                case 4:
                        System.out.println("Introduzca los valores que desee contar(de uno en uno), empiece con el primero: ");
                        numero=entrada.nextFloat();
                        dig=0;edad=0;
                            if (numero>0){
                                dig=dig+1;
                            }else{edad=edad+1;}
                        do{
                            System.out.println("Ingrese el siguiente valor: ");
                        numero2=entrada.nextFloat();
                            if (numero2>0){
                                dig=dig+1;
                            }else{edad=edad+1;}
                            System.out.println("Desea agregar otro numero?(s=Si/n=No)");
                            letra4=entrada.next().charAt(0);
                        }while(letra4=='s');
                        System.out.print("Usted ingreso "+edad);System.out.print(" negativos y "+dig);
                        System.out.println(" positivos.");
                        break;
                    case 5:
                        System.out.println("Cuantos productos desea llevar?(max. 50xPersona)");
                        edad=entrada.nextInt();res=0;
                            if (edad<0||edad>50){System.out.println("Esto no es posible, intente de nuevo.");}
                            else{
                                do{
                                    System.out.println("Que articulo llevo?:");
                                    System.out.println("1-Botella de agua de $10.");
                                    System.out.println("2-Frijoles de $15.");
                                    System.out.println("3-Carne de $50.");
                                    System.out.println("4-Chicles de $1.");
                                    System.out.println("5-Juego de $800.");
                                    dig=entrada.nextInt();
                                    switch(dig){
                                        case 1: res=res+10;edad=edad-1;break;
                                        case 2: res=res+15;edad=edad-1;break;
                                        case 3:res=res+50;edad=edad-1;break;
                                        case 4:res=res+1;edad=edad-1;break;
                                        case 5:res=res+800;edad=edad-1;break;
                                        default:System.out.println("No es una opcion valida.");
                                    }
                                    System.out.println("Usted lleva $"+res);
                                }while(edad!=0);
                                System.out.println("El precio de su compra es de $"+res);
                            }break;
                    case 6:
                            System.out.println("Que figura desea calcular?:");
                            System.out.println("1-Rectangulo (area y perimtro).");
                            System.out.println("2-Triangulo equilatero(area y perimtro).");
                            System.out.println("3-Volumen de una esfera.");
                            System.out.println("4-Volumen de una cilindro.");
                            edad=entrada.nextInt();
                            switch(edad){
                                case 1: System.out.println("Introduzca el valor de la base:");numero=entrada.nextFloat();
                                        System.out.println("Ahora del segundo lado:");numero2=entrada.nextFloat();
                                        res= numero*numero2;bono=(numero*2)+(numero2*2);
                                        System.out.print("Tiene una area de "+res);System.out.print(" y un perimtro de "+bono);
                                        break;
                                case 2: System.out.println("Introduzca el valor de la base:");numero=entrada.nextFloat();
                                        System.out.println("Ahora de la altura");numero2=entrada.nextFloat();
                                        res= (numero*numero2)/2;bono=numero*3;
                                        System.out.print("Tiene una area de "+res);System.out.print(" y un perimtro de "+bono);
                                        break;
                                case 3: System.out.println("Introduzca el radio");numero=entrada.nextFloat();
                                        res= numero*numero*numero;bono=(4/3)*3.1416;res=res*bono;
                                        System.out.println("Tiene un volumen de "+res);
                                        break;
                                case 4: System.out.println("Introduzca el radio");numero=entrada.nextFloat();
                                        System.out.println("Introduzca la altura");numero2=entrada.nextFloat();
                                        res= numero*numero;bono=3.1416*numero2;res=res*bono;
                                        System.out.println("Tiene un volumen de "+res);
                                        break;
                                default:System.out.println("Esta no es una opcion valida.");break;
                            }break;
                    case 7: System.out.println("La tabla es:");
                            System.out.println("\tN\t\t\t");
                            System.out.println("\t1\t10\t100\t1000");
                            System.out.println("\t2\t20\t200\t2000");
                            System.out.println("\t3\t30\t300\t3000");
                            System.out.println("\t4\t40\t400\t4000");
                            System.out.println("\t5\t50\t500\t5000");
                            System.out.println("\t6\t60\t600\t6000");
                            System.out.println("\t7\t70\t700\t7000");
                            System.out.println("\t8\t80\t800\t8000");
                            System.out.println("\t9\t90\t900\t9000");
                            System.out.println("\t10\t100\t1000\t10000");
                            break;
                    case 13: 
                            do{res=0;
                            System.out.println("Ingrese la cantidad: ");cal=entrada.nextDouble();  
                            System.out.println("Que operacion desea realizar?");
                            System.out.println("1-Suma.");
                            System.out.println("2-Resta.");
                            System.out.println("3-Multiplicacion.");
                            System.out.println("4-Division.");
                            System.out.println("5-Salir.");
                            dig=entrada.nextInt();
                            switch(dig){
                                case 1: System.out.println("Ingrese la otra cantidad: ");bono=entrada.nextDouble();
                                        res=cal+bono+res;break;
                                case 2:System.out.println("Ingrese la otra cantidad: ");bono=entrada.nextDouble();
                                        res=cal-bono+res;break;
                                case 3:System.out.println("Ingrese la otra cantidad: ");bono=entrada.nextDouble();
                                        res=cal*bono;break;
                                case 4:System.out.println("Ingrese la otra cantidad: ");bono=entrada.nextDouble();
                                        res=cal/bono;break;
                                case 5:break;
                                default:System.out.println("Esa no es una opcion.");
                            }System.out.println("El resultado es: "+res);System.out.println("Desea operar otra unidad?(s=Si/n=No)");letra5=entrada.next().charAt(0);
                            }while(letra5=='s');
                            
        }  System.out.println("Desea usar otro proceso?(s=Si/n=No): ");
        letra= entrada.next().charAt(0);
        }while (letra== 's');
    }
}