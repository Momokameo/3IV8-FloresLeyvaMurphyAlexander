import java.util.Scanner;//Examen de Flores Leyva Murphy Alexander 3IV8

class Examen1{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in); //Creacion de escaner
        //creacion de variables a utilizar
        int pw=0,id=0,def=0,atk=0,atk2=0,Pk,Pk2,mov;
        float hp=0,hp2=0;
        char P,P2,P3,P4;
        do {// un do para que se repita mientras el usuario lo quiera
            System.out.println("FLORES LEYVA MURPHY ALEXANDER 3IV8");
            System.out.println("Este es el programa del examen, Quieres consultar la Pokedex o realizar un combate pokemon?:");
            System.out.println("1-Pokedex.");
            System.out.println("2-Batalla pokemon.");
            System.out.println("3-Finalizar programa.");
            Pk=entrada.nextInt();//opciones del menu
                switch (Pk){
                    case 1:
                        System.out.println("Esta es la Pokedex, la informacion de que pokemon quieres consultar?.");
                        System.out.println("1-Charmander.");
                        System.out.println("2-Bulbasaur.");
                        System.out.println("3-Squirtle.");
                        System.out.println("4-Salir.");
                        Pk2=entrada.nextInt();
                        switch (Pk2){//un case para cada opcion de la pokedex
                            case 1:
                            do{
                                System.out.println("Escogiste Charmander ID:01.");
                                System.out.println("Charmander es un Pokemon tipo fuego, es uno de los 3 iniciales en Kanto.");
                                System.out.println("Su ficha de combate es:");
                                System.out.println("HP:25    FUERZA:12    DEFENSA:9");
                                System.out.println("Ataques:");
                                System.out.println("1-Arañazo.           2-Ascuas.");
                                System.out.println("Para salir tecle b, de lo contario se repetira la informacion.");
                                P4=entrada.next().charAt(0);
                                }while(P4!='b');P4=' ';
                                break;
                            case 2:
                            do{
                                System.out.println("Escogiste Bulbasaur ID:02.");
                                System.out.println("Bulbasaur es un Pokemon tipo planta, es uno de los 3 iniciales en Kanto.");
                                System.out.println("Su ficha de combate es:");
                                System.out.println("HP:26    FUERZA:11    DEFENSA:8");
                                System.out.println("Ataques:");
                                System.out.println("1-Placaje.           2-Latigo cepa.");
                                System.out.println("Para salir tecle b, de lo contario se repetira la informacion.");
                                P4=entrada.next().charAt(0);
                                }while(P4!='b');P4=' ';
                                break;
                            case 3:
                            do{
                                System.out.println("Escogiste Squirtle ID:03.");
                                System.out.println("Squirtle es un Pokemon tipo agua, es uno de los 3 iniciales en Kanto.");
                                System.out.println("Su ficha de combate es:");
                                System.out.println("HP:23    FUERZA:10    DEFENSA:10");
                                System.out.println("Ataques:");
                                System.out.println("1-Placaje.           2-Pistola agua.");
                                System.out.println("Para salir tecle b, de lo contario se repetira la informacion.");
                                P4=entrada.next().charAt(0);
                                }while(P4!='b');P4=' ';
                                break;
                            case 4:
                                System.out.println("Escogiste salir.");
                                break;
                            default:
                                System.out.println("Esta no es una opcion.");
                                break;
                        }break;
                    case 2://el segundo caso para el modo batalla
                        System.out.println("Escogiste batalla Pokemon, elige tu Pokemon: ");
                        System.out.println("c-Charmander.");
                        System.out.println("b-Bulbasaur.");
                        System.out.println("s-Squirtle.");
                        P=entrada.next().charAt(0);
                        switch (P){//se definiran los stast para la batalla dependiendo la eleccion del usuario
                            case 'c':
                                System.out.println("Escogiste a Charmander.");
                                hp=25;pw=12;id=01;def=9;
                                System.out.println("1-Arañazo.           2-Ascuas.");
                                break;
                            case 'b':
                                System.out.println("Escogiste a Bulbasaur.");
                                hp=26;pw=11;id=02;def=8;
                                System.out.println("1-Placaje.           2-Latigo cepa.");
                                break;
                            case 's':
                                System.out.println("Escogiste a Squirtle.");
                                hp=23;pw=10;id=03;def=10;
                                System.out.println("1-Placaje.           2-Pistola agua.");
                                break;
                            default: System.out.println("Esta no es una opcion.");
                            break;
                        }
                        System.out.println("Ahora pelearas contra Examen-mon:");//se pone un contrincante con stats proporcionales al pokemon del usuario
                        hp2=hp*2;
                        System.out.println("Examen-mon desafiante ha aparecido!");
                        System.out.println("ID:04/Examen-mon/HP:"+hp2);
                        System.out.println("3:D---E");
                        System.out.println("Que ataca vas a usar?");
                        System.out.println("Ataque 1 o ataque 2?");
                        mov=entrada.nextInt();
                            switch(mov){//dependiendo el ataque sera el daño que haga
                                case 1:
                                    System.out.println("Escogiste ataque 1");
                                    atk=(pw+def)/3;
                                    System.out.println("Ataque 1 hizo de daño "+atk);
                                    System.out.println("Considerando la defensa del adversario su nuevo estatus es:");
                                    break;
                                case 2:
                                    System.out.println("Escogiste ataque 2");
                                    atk=(pw+def)/2;
                                    System.out.println("Ataque 2 hizo de daño "+atk);
                                    System.out.println("Considerando la defensa del adversario su nuevo estatus es:");
                                    break;
                                default:System.out.println("No es una opcion.");
                            }
                        hp2= hp-atk;
                        if (hp2<0){// si el daño fue suficiente para vaciar la barra de vida del contrincante, ganas, de lo contrario no
                            System.out.println("ID:04/Examen-mon/HP:"+hp2);
                            System.out.println("3:(---E");
                            System.out.println("ID:04/Examen-mon/HP:"+hp2);
                            System.out.println("3:(---E");
                            break;
                        }else{
                            System.out.println("ID:04/Examen-mon/HP:"+hp2);
                            System.out.println("3:D---E");
                            System.out.println("Examen-mon ha utilizado Reprobado Divino!");
                            atk2= (int) (def * hp / 2);
                            System.out.println("Ha hecho un daño de "+atk2);
                            System.out.print("Tu pokemon de ");System.out.print("ID: "+id);System.out.println(" fue derrotado!!");
                        }
                        
                    case 3:
                    System.out.println("Salir.");
                    hp=0;
                        break;
                    default: 
                        System.out.println("Esa no es una opcion.");break;
                }
                System.out.println("Quieres reintentar?(s=Si/n=No)");//Reinicio del proceso
                P2=entrada.next().charAt(0);
        }while (P2=='s');
    }
}