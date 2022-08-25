package DispensadorDePapel.domain;

public class DispensadorDePapel {
    public String marca;
    public String tipo;
    public int capacidadMaxima;
    public int cantidadActual;
    public String color;

    public DispensadorDePapel(String marca) {
        this.marca = marca;
        this.color = "Blanco";
    }

    public DispensadorDePapel(String marca, String Tipo) {
        this(marca);
        this.tipo = tipo;
        this.capacidadMaxima = 100;
    }
    public DispensadorDePapel(String marca, String tipo, int capacidadMaxima) {
        this(marca, tipo);
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    public boolean dispensar() {
        if (!estaVacio()) {
            this.cantidadActual--;
            return true;
        }
        return false;
    }

    public void llenar() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Se lleno el dispensador");
    }

    public boolean recargar(int cantidadARecargar) {
        if((this.cantidadActual + cantidadARecargar) <= capacidadMaxima) {
            this.cantidadActual += cantidadARecargar;
            return true;
        }
        return false;
    }

    public boolean estaVacio() {
        return this.cantidadActual == 0;
    }
}
