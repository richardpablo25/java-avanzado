import java.util.ArrayList;

public class Mascota {
    //definimos los atributos privados para que no se modifiquen desde otra clase

    //toma valor null por defecto porque es objeto, no tiene referencia a memoria
    private String estado;

    // toma valor 0 por defecto porque es primitivo
    private int nivel;


    public void comer(){
        switch (estado){
            case "hambienta":
                estado = "contenta";
                System.out.println("de hambrienta a contenta");
                break;
            case "contenta":
                nivel+=1;
                break;
            case "aburrida":
                estado ="contenta";
                System.out.println("de aburrida a contenta");
                break;
            default:
                break;
        }
    }

    public void jugar() {


    }

    private boolean puedeJugar(){
        if (estado.equals("hambrienta"))
            return false;
        return true;
    }


    public Mascota(){

    }


