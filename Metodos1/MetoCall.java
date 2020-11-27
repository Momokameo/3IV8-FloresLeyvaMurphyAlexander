import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetoCall {
    Scanner entrada = new Scanner(System.in);
    char letra;
    int numero=0;
    int op;
    double credito = 100.00,llamadasint=0.0,llamadasints=0.0,celulares=0.0,llamadasnacs=0.0,celularess=0.0,totals=0.00,llamadasnac=0.0,total=0.0;
    public void Call(){
        numero = Integer.parseInt(JOptionPane.showInputDialog("Con que numero desea proceder?(55 ya considerado)"));
   if(9999999>=numero || numero>=99999999){
   do{
    numero = Integer.parseInt(JOptionPane.showInputDialog("El numero que marco no es valido. Ingrese otro:"));
   }while(9999999>=numero || numero>=99999999);
}         
do{
    JOptionPane.showMessageDialog(null, "El numero que ingreso es "+numero);
    op = Integer.parseInt(JOptionPane.showInputDialog("Que operacion desea realizar?\n 1.-Llamada.\n2.-Revisar su credito."));
  
      
   switch(op){
        case 1:
            Llamnum();break;
        case 2:
            Credit();break;
   }
   letra = JOptionPane.showInputDialog("Quiere repetir el programa?\n (s=Si/n=No)").charAt(0);
 
}while(letra == 's'); }
    public void Llamnum(){
        llamadasnac = Double.parseDouble(JOptionPane.showInputDialog("Cuantas llamadas a numeros locales\n nacionales quiere realizar?"));
        llamadasint = Double.parseDouble(JOptionPane.showInputDialog("Cuantas llamadas anumeros locales\n internacionales quiere realizar? "));
        celulares = Double.parseDouble(JOptionPane.showInputDialog("Cuantas llamadas a numeros celulares quiere realizar?"));
        sumllam();
    JOptionPane.showMessageDialog(null, "De #"+llamadasnac+" llamadas nacionales usted debera pagar: "+llamadasnacs+"\nDe #"+celulares+" llamadas a celulares usted debera pagar "+celularess+"\nDe #"+llamadasint+" llamadas internacionales usted debera pagar "+llamadasints+"\nPor un total de #"+total+" llamadas usted debera pagar: "+totals);
    }
    public void sumllam(){
        llamadasnacs = llamadasnac*0.5; llamadasints = llamadasint*0.6;
        celularess = celulares*0.2; total = celulares+llamadasint+llamadasnac;
        totals=celularess+llamadasints+llamadasnacs; credito= credito - totals;
    }
    public void Credit(){
        JOptionPane.showMessageDialog(null, "Cuenta con "+credito+" de credito restante.");   
    }

}