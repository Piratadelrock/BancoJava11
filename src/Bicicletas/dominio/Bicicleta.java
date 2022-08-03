package Bicicletas.dominio;

public class Bicicleta {
    public long serial;
    public String marca;
    public String modelo;
    public String color;
    public long precio;
    public double velocidad;

    public void cambiarPrecio(long nuevoPrecio){
        this.precio = nuevoPrecio;
    }
    public boolean cambiarColor(String nuevoColor){
        this.color = nuevoColor;
        return true;
    }
    public boolean cambiarPrecioYColor(long nuevoPrecio, String nuevoColor){
        this.cambiarPrecio(nuevoPrecio);
        this.cambiarColor(nuevoColor);
        return false;
    }

    public String obtenerInformacion(){

        return "Serial: " + this.serial + "\n Marca: " + this.marca +
                "\n Modelo: " + this.modelo + "\n Color: " + this.color + "\n Precio: " + this.precio + "\n Velocidad: "
                + Math.round(this.velocidad) + "km/h";

    }

    public void acelerar(double incremento){
        this.velocidad += incremento;
    }
    public boolean frenado(double decremento){

        if ((decremento + this.velocidad) > 0 ){
            this.velocidad -= decremento;
            return true;
        }
        return false;

    }
}
