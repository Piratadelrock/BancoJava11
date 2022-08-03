package Dispensador.domain;

public class DispensadorDeAgua {
    public long serial;
    public String marca;
    public double cantidadMaxima;
    public double cantidadActual;
    public double temperatura;


    public void llenar(){
        this.cantidadActual = this.cantidadMaxima;
    }
    public void vaciar(){
        this.cantidadActual = 0;

    }

    public boolean calentar(double grados){
        if((temperatura + grados) >= 100){
            return false;
        }
        else {
            this.temperatura += grados;
            return true;
        }
    }
    public boolean servir(boolean caliente, double cantidadAServir){
        if ((this.cantidadActual - cantidadAServir) >= 0){
            cantidadActual -= cantidadAServir;
            if (caliente){
                System.out.println("Se sirvio agua caliente a " + temperatura + "Cº");
            }
            else {
                System.out.println("Se sirvio agua al clima");
            }

            return true;
        } else
        {
            return false;
        }

    }
}
