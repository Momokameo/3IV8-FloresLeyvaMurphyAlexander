import javax.swing.JOptionPane;//Este java sirve para obtener, guardar y regresar los datos del Jugador 2
//herencias pues esta conectado y compartiendo datos con "JuegoCatN"
public class J2 extends JuegoCatN{   //clase conectada
    private String nombreJ2;//variables de instancia a usar
    private char fichaJ2;
    char fichaJ22;
    String nombreJ22;

    public J2(String nombreJ2, char fichaJ2){//herencias
        this.nombreJ2 = nombreJ2;
        this.fichaJ2 = fichaJ2;}

    public String getNombreJ2(){//encapsulamiento
        nombreJ2 = JOptionPane.showInputDialog("Cual es tu nombre J2?");
        return nombreJ2;}
 
    public void setNombreJ2(String nombreJ2){
        this.nombreJ2 = nombreJ2;}

    public char getFichaJ2() {//encapsulamiento
        fichaJ2= JOptionPane.showInputDialog(null,"Ingrese la letra la cual sera tu ficha:").charAt(0);
        return fichaJ2;}
        
    public String getNombreJ22(){//encapsulamiento
        nombreJ22 = nombreJ2;
        return nombreJ22;}
    public char getFichaJ22() {//encapsulamiento
        fichaJ22 = fichaJ2;
        return fichaJ22;}

    public void setfichaJ2(char fichaJ2){//encapsulamiento
        this.fichaJ2 = fichaJ2;}

    public void mostrarJ2(){
        JOptionPane.showMessageDialog(null, "El nombre del J2: "+getNombreJ2()+"\nY la ficha que usaras es: "+getFichaJ2());}
}