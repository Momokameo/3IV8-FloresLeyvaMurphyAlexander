import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
public class JuegoCatN{//clase publica 
    Scanner entrada = new Scanner(System.in);//scaner para datos
    public char [] [] TableroCat = new char [3][3];//array para tablero
    String nombre1, nombre2;//para guardar los nombres
    char ficha2, ficha1;//para guardar la ficha
    int op = 0;//para la entrada de opcion
    int Victoria = 0;//para decidir victoria
    public void CatitoGame(){//metodo de clase
        JOptionPane.showMessageDialog(null, "Has escogido jugar gato, suerte jugadores...");
        JOptionPane.showMessageDialog(null,"Por ahora presentemonos /(OwO)/");
        J1 J1 =new J1(" ",' '); //datos vacios
        J1.mostrarJ1();//ejecutamos el void mostarJ1
        //Ahora para J2
        JOptionPane.showMessageDialog(null,"Que hay de ti Jugador 2?");
        J2 J2 =new J2(" ",'s'); //datos vacios
        J2.mostrarJ2();//ejecutamos el void mostarJ2
        //Obtencion de datos
        ficha2 = J2.getFichaJ22();//Obtenemos los datos y los guardamos
        ficha1 = J1.getFichaJ11();
        nombre1 = J1.getNombreJ11();
        nombre2 = J2.getNombreJ22();
        juego();//corremos void juego
    }
    
    public void juego(){// metodo juego
        PosicionTableroCat();//llamamos metodo
        do{ 
        ImpCat();
        System.out.println(nombre1+" escoja su casilla sabiamente...");//empieza J1
        ElCasillaJ1();//llamamos metodo
        Victoria1();//metodo para deinir variable victoria
        if(Victoria==0){
        ImpCat();
        System.out.println(nombre2+" escoja su casilla con conviccion!!");//le toca al J2
        ElCasillaJ2();//llamamos metodo
        Victoria2();}//metodo para deinir variable victoria
        }while(Victoria == 0);
        //Cuando alguno gane
        if(Victoria==1){//verificamos si hay victoria de parte del J1
            JOptionPane.showMessageDialog(null,"Enhorabuena "+nombre1+"!!!\nHas ganado la estresante batalla, \n no olvides recordarle por siempre a "+nombre2+" que ha perdido.");
        }
        if(Victoria==2){//verificamos si hay victoria de parte del J2
            JOptionPane.showMessageDialog(null,"INCREIBLE "+nombre2+" HA GANADO!!\n Desde el inicio supe que ganarias. (*v*)");
        }  
    }

            //Tablero
    public void PosicionTableroCat(){
        int posicion=1; 
        for (int i=0; i < TableroCat.length; i++) {//relleneamos el array usando fors
            for (int j=0; j < TableroCat[i].length; j++) {
                
                TableroCat[i][j] = Integer.toString(posicion).charAt(0);
                posicion = posicion+1;}
        }
    }
    //Imprimir tablero
    public void ImpCat(){    
    for (int i=0; i < TableroCat.length; i++) {
            System.out.print("|");
            for (int j=0; j < TableroCat[i].length; j++) { //imprimimos el array en la terminal usando "|" para delimitar
              System.out.print (TableroCat[i][j]);
              if (j!=TableroCat[i].length-1) System.out.print("\t");}// "\t" para tabular
            System.out.println("|");}
        } 

    public void VictoriaVertJ1(){
         //Victoria vertical    Definimos todas las posibles posiciones de victoria vertical del J1
         if(TableroCat[0][0]==TableroCat[0][1]&&TableroCat[0][0]==TableroCat[0][2]){
            Victoria = 1;
        }
        if (TableroCat[1][0]==TableroCat[1][1]&&TableroCat[1][0]==TableroCat[1][2]){
            Victoria = 1;
        }
        if (TableroCat[2][0]==TableroCat[2][1]&&TableroCat[2][0]==TableroCat[2][2]){
            Victoria = 1;
        }

    }
    public void VictoriaHoriJ1(){
         //Victoria horizontal   Definimos todas las posibles posiciones de victoria horizontal del J1
         if (TableroCat[0][0]==TableroCat[1][0]&&TableroCat[0][0]==TableroCat[2][0]){
            Victoria = 1;
        }
        if (TableroCat[0][1]==TableroCat[1][1]&&TableroCat[0][1]==TableroCat[2][1]){
            Victoria = 1;
        }
        if (TableroCat[0][2]==TableroCat[1][2]&&TableroCat[0][2]==TableroCat[2][2]){
            Victoria = 1;
        }

    }
    public void VictoriaDiagJ1(){
         //Victoria diagonal  Definimos todas las posibles posiciones de victoria diagonal del J1
         if(TableroCat[1][1]==TableroCat[0][0]&&TableroCat[1][1]==TableroCat[2][2]){
            Victoria = 1;
           
       }  
       if(TableroCat[1][1]==TableroCat[0][2]&&TableroCat[1][1]==TableroCat[2][0]){
           Victoria =1;
       }
    }

    public void Victoria1(){//metodo para verificar cada posibilidad de victoria para el J1
        VictoriaDiagJ1();
        VictoriaHoriJ1();
        VictoriaVertJ1();
        
    }
    public void VictoriaVertJ2(){
        //Victoria vertical Definimos todas las posibles posiciones de victoria vertical del J2

        if(TableroCat[0][0]==TableroCat[0][1]&&TableroCat[0][0]==TableroCat[0][2]){
           Victoria = 2;
       }
       if (TableroCat[1][0]==TableroCat[1][1]&&TableroCat[1][0]==TableroCat[1][2]){
           Victoria = 2;
       }
       if (TableroCat[2][0]==TableroCat[2][1]&&TableroCat[2][0]==TableroCat[2][2]){
           Victoria = 2;
       }
   }
   public void VictoriaHoriJ2(){
        //Victoria horizontal  Definimos todas las posibles posiciones de victoria horizontal del J2
        if (TableroCat[0][0]==TableroCat[1][0]&&TableroCat[0][0]==TableroCat[2][0]){
           Victoria = 2;
       }
       if (TableroCat[0][1]==TableroCat[1][1]&&TableroCat[0][1]==TableroCat[2][1]){
           Victoria = 2;
       }
       if (TableroCat[0][2]==TableroCat[1][2]&&TableroCat[0][2]==TableroCat[2][2]){
           Victoria = 2;
       }
   }
   public void VictoriaDiagJ2(){
        //Victoria diagonal  Definimos todas las posibles posiciones de victoria diagonal del J2
        if(TableroCat[1][1]==TableroCat[0][0]&&TableroCat[1][1]==TableroCat[2][2]){
           Victoria = 2;
          
      }  
      if(TableroCat[1][1]==TableroCat[0][2]&&TableroCat[1][1]==TableroCat[2][0]){
          Victoria =2;
      }
   }

   public void Victoria2(){//metodo para verificar cada posibilidad de victoria para el J2
       VictoriaDiagJ2();
       VictoriaHoriJ2();
       VictoriaVertJ2();
   }

    public void ElCasillaJ1(){//metodo para la eleccion de casillas
        op = entrada.nextInt();
        if(op<1){
            System.out.println("Escoja la casilla que desea ocupar con su ficha(1-9):");
            ImpCat();
            ElCasillaJ1();
        }    
        switch(op){
            case 1: ElCasilla1J1(); break;//llamamos a cada posibilidad, dependiendo lo que elija
            case 2: ElCasilla2J1(); break;
            case 3: ElCasilla3J1(); break;
            case 4: ElCasilla4J1(); break;
            case 5: ElCasilla5J1(); break;
            case 6: ElCasilla6J1(); break;
            case 7: ElCasilla7J1(); break;
            case 8: ElCasilla8J1(); break;
            case 9: ElCasilla9J1();break;
            default: System.out.println("porfavor escoja un numero entre el 1 y el 9");
            ImpCat();
            ElCasillaJ1(); break;}     
    }
    
      public void ElCasilla1J1(){//determinamos que valor del array se rellena dependiendo de la eleccion del jugador
            if(TableroCat[0][0]==ficha1){//si la casilla ya esta ocupada por si mismo, no la puede usar
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();//se repite
            }else{ 
                if(TableroCat[0][0]==ficha2){//si le pertenece al jugador contrario, no la puede usa
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ1();}// se repite
            }
            TableroCat[0][0]= ficha1;//si ninguna de las anteriores se cumplio, esto quiere decir que si la puede ocupar
      }
      public void ElCasilla2J1(){
            if(TableroCat[0][1]==ficha1){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();
            }else{            
                if(TableroCat[0][1]==ficha2){
                    System.out.println("Esta casilla ya es de"+nombre2+".");        
                    ElCasillaJ1();}
            }                     
        TableroCat[0][1]= ficha1;
      }
      public void ElCasilla3J1(){
            if(TableroCat[0][2]==ficha1){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();
            }else{ 
                if(TableroCat[0][2]==ficha2){
                    System.out.println("Esta casilla ya es de"+nombre2+".");     
                    ElCasillaJ1();}                   
            }
        TableroCat[0][2]= ficha1;
      }
      public void ElCasilla4J1(){
            if(TableroCat[1][0]==ficha1){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();
            }else{ 
                if(TableroCat[1][0]==ficha2){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ1();}
            }                     
        TableroCat[1][0]= ficha1;
      }
      public void ElCasilla5J1(){
            if(TableroCat[1][1]==ficha1){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();
            }else{ 
                if(TableroCat[1][1]==ficha2){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ1(); }               
            }
        TableroCat[1][1]= ficha1;
      }
      public void ElCasilla6J1(){
            if(TableroCat[1][2]==ficha1){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();
            }else{   
                if(TableroCat[1][2]==ficha2){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ1();}          
            }
        TableroCat[1][2]= ficha1;
      }
      public void ElCasilla7J1(){
            if(TableroCat[2][0]==ficha1){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();
            }else{ 
                if(TableroCat[2][0]==ficha2){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ1();}                 
            }
        TableroCat[2][0]= ficha1;
      }
      public void ElCasilla8J1(){
            if(TableroCat[2][1]==ficha1){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();
            }else{  
                if(TableroCat[2][1]==ficha2){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ1();}          
            }
        TableroCat[2][1]= ficha1;
      }
      public void ElCasilla9J1(){
            if(TableroCat[2][2]==ficha1){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ1();
            }else{   
                if(TableroCat[2][2]==ficha2){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ1();}          
            }
        TableroCat[2][2]= ficha1;
        if (Victoria==0){//revisamos si aun nadie ha ganado
            JOptionPane.showMessageDialog(null, "Ha sido un empate :(.\nGracias por jugar!");//Si nadie gano, es empate
            System.exit(0);//terminamos la programacion
        }
      }

      //J2
      public void ElCasillaJ2(){//para la eleccion de casillas
        op = entrada.nextInt();
        if(op<1){
            System.out.println("Escoja la casilla que desea ocupar con su ficha(1-9):");
            ImpCat();//imprimimos el tablero
            ElCasillaJ2();
        }    
        switch(op){
            case 1: ElCasilla1J2(); break;//cada posible eleccion
            case 2: ElCasilla2J2(); break;
            case 3: ElCasilla3J2(); break;
            case 4: ElCasilla4J2(); break;
            case 5: ElCasilla5J2(); break;
            case 6: ElCasilla6J2(); break;
            case 7: ElCasilla7J2(); break;
            case 8: ElCasilla8J2(); break;
            case 9: ElCasilla9J2();break;
            default:System.out.println("Solo entre 1-9.");//por si ecoge uno que no sea opcion
            ImpCat();//volvemos a imprimir tablero
            ElCasillaJ2();
            break;}          
      } 
    
      public void ElCasilla1J2(){
            if(TableroCat[0][0]==ficha2){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{ 
                if(TableroCat[0][0]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre1+".");
                    ElCasillaJ2();}                    
            }
        TableroCat[0][0]= ficha2;
      }
      public void ElCasilla2J2(){//determinamos que valor del array se rellena dependiendo de la eleccion del jugador
            if(TableroCat[0][1]==ficha2){//si la casilla ya esta ocupada por el mismo, no la puede ocupar
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{  
                if(TableroCat[0][1]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre2+".");//si la casilla ya esta ocupada por el contrario, no la puede ocupar
                    ElCasillaJ2();} //se repite   
            }
        TableroCat[0][1]= ficha2;//si ninguna de las anteriores de cumple, si la puede ocupar
      }
      public void ElCasilla3J2(){
            if(TableroCat[0][2]==ficha2){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{  
                if(TableroCat[0][2]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ2();}            
            }
        TableroCat[0][2]= ficha2;
      }
      public void ElCasilla4J2(){
            if(TableroCat[1][0]==ficha2){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{  
                if(TableroCat[1][0]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ2();}        
            }
        TableroCat[1][0]= ficha2;
      }
      public void ElCasilla5J2(){
            if(TableroCat[1][1]==ficha2){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{ 
               if(TableroCat[1][1]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ2();}     
            }
        TableroCat[1][1]= ficha2;
      }
      public void ElCasilla6J2(){
            if(TableroCat[1][2]==ficha2){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{ 
                if(TableroCat[1][2]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ2();}       
            }
        TableroCat[1][2]= ficha2;
      }
      public void ElCasilla7J2(){
            if(TableroCat[2][0]==ficha2){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{ 
                if(TableroCat[2][0]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ2();}     
            }
        TableroCat[2][0]= ficha2;
      }
      public void ElCasilla8J2(){
            if(TableroCat[2][1]==ficha2){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{ 
                if(TableroCat[2][1]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ2();}        
            }
        TableroCat[2][1]= ficha2;
      }
      public void ElCasilla9J2(){
            if(TableroCat[2][2]==ficha2){
                System.out.println("Esta casilla ya te pertenece, escoje otra.");
                ElCasillaJ2();
            }else{ 
                if(TableroCat[2][2]==ficha1){
                    System.out.println("Esta casilla ya es de"+nombre2+".");
                    ElCasillaJ2();}        
            }
        TableroCat[2][2]= ficha2;
        if (Victoria==0){//si aun con la ficha no gana nadie, es un empate
            JOptionPane.showMessageDialog(null, "Ha sido un empate :(.\n Gracias por jugar!");//mensaje final
            System.exit(0);//finalizamos programa
        }
      }
    }