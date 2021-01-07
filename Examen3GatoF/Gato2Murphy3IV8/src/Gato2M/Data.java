package Gato2M;

public class Data{
    private String witaj, mensaje;
    
    public Data(){
    }

    public Data(String witaj, String mensaje){
        this.witaj = witaj;
        this.mensaje = mensaje;
    }
    
    public String getWitaj(){
        return witaj;
    }

    public void setWitaj(String witaj){
        this.witaj = witaj;
    }

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
}
