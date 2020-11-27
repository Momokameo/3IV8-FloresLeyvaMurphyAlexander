import javax.swing.JOptionPane;
public class CatPrincipal{// esta es la principal donde se inicia
    public static void main(String[] args){
        JuegoCatN obj = new JuegoCatN();//objeto  para invocar metodo
        obj.CatitoGame();
        JOptionPane.showMessageDialog(null, "Gracias por jugar!");//mensaje final
    }
}