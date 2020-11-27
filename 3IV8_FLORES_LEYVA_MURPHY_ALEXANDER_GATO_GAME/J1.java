import javax.swing.JOptionPane;//Este java sirve para obtener, guardar y regresar los datos del Jugador 1
//herencias pues esta conectado y compartiendo datos con "JuegoCatN"
public class J1 extends JuegoCatN{//clase conectada 
    private String nombreJ1;//variables de instancia a usar
    private char fichaJ1;
    char fichaJ11;
    String nombreJ11;

    public J1(String nombreJ1, char fichaJ1){//herencias
        this.nombreJ1 = nombreJ1;
        this.fichaJ1 = fichaJ1;}

    public String getNombreJ1(){//encapsulamiento
        nombreJ1 = JOptionPane.showInputDialog("Cual es tu nombre J1?");
        return nombreJ1;}
    
    public void setNombreJ1(String nombreJ1){//encapsulamiento
        this.nombreJ1 = nombreJ1;}

    public char getFichaJ1() {//encapsulamiento
    fichaJ1= JOptionPane.showInputDialog(null,"Ingrese la letra la cual sera su ficha:").charAt(0);
        return fichaJ1;}

    public char getFichaJ11() {//encapsulamiento
    fichaJ11 = fichaJ1;
    return fichaJ1;}

    public String getNombreJ11(){//encapsulamiento
        nombreJ11 = nombreJ1;
        return nombreJ11;}
    
    public void setfichaJ1(char fichaJ1){//encapsulamiento
        this.fichaJ1 = fichaJ1;
    }
    public void mostrarJ1(){
        JOptionPane.showMessageDialog(null, "El nombre del J1: "+getNombreJ1()+"\nY la ficha que usaras es: "+getFichaJ1());}
}