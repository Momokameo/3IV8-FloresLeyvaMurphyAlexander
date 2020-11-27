import java.util.Scanner;
import javax.swing.JOptionPane;
public class MetoAge{
        //variables
		double year=0,old=0;
		Scanner entrada = new Scanner(System.in);
	public void Age(){
        year = Double.parseDouble(JOptionPane.showInputDialog("En que year naciste?"));
        
        if(year > 2020 || year <= 1930){//en caso de poner datos irreales
			year = Double.parseDouble(JOptionPane.showInputDialog("Los datos no son congruentes."));
        }
        else{ CalcuEdad(); }
    }
    public void CalcuEdad(){//Metodo para saber edad
		old = 2020 - year;
		JOptionPane.showMessageDialog(null, "Usted tiene "+old+" years.");	     
    }
}