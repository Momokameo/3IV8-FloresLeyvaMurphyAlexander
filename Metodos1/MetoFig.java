import java.util.Scanner;
import javax.swing.JOptionPane;
public class MetoFig {
    Scanner entrada = new Scanner(System.in);
    double res, peri;
    int altura,base, op;
    
    public void Figs(){
       
        op = Integer.parseInt(JOptionPane.showInputDialog("Con que figura quieres trabajar?\n1.-Cuadrado.\n2.-Triangulo isoceles.\n3.-Rectangulo.\n4.-Circulo."));
             
    switch(op){
        case 1:
            Cuad(); break;
        case 2:
            Triangulo(); break;
        case 3:
            Rectan(); break;
        case 4:
            Circulo(); break;
    }
}
    public void Cuad(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide un lado?"));
        CuadCal();
        JOptionPane.showMessageDialog(null, "El cuadrado tiene un area de: "+res+" y el perimetro es de: "+peri);
    }
    public void CuadCal(){
        res = base*base;
        peri = base * 4;  
    }
    public void Triangulo(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide la base?"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Y la altura?"));
        TriCal();
        JOptionPane.showMessageDialog(null, "El Triangulo tiene un area de: "+res+" y un perimetro de: "+peri);
    }
    public void TriCal(){
        res = (base*altura)/2;
        peri = (altura*2)+base;
    }
    public void Rectan(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Cuanto vale la base?"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Y la altura?"));
        RectanCal();
        JOptionPane.showMessageDialog(null, "El Rectangulo tiene un area de: "+res+" y un perimetro de: "+peri);   
    }
    public void RectanCal(){
        res = (base*altura);
        peri = (2*base)+(2*altura);
    }
    public void Circulo(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Cuanto vale el radio?"));
        CirCal();
        JOptionPane.showMessageDialog(null, "El Circulo tiene un area de: "+res+" y un perimetro de: "+peri);
    }
    public void CirCal(){
        res = 3.1416*base*base;
        peri = 3.1416 * (2*base);    
    } 
}