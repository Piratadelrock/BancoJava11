package DispensadorDePapel.app;

import DispensadorDePapel.domain.DispensadorDePapel;

public class AppDispensador {
    public static void main(String[] args) {
        DispensadorDePapel dispensador = new DispensadorDePapel("Familia", "Toallas de baño", 50);

        System.out.println("El color es: " + dispensador.color);
        dispensador.llenar();
        dispensador.dispensar();
        dispensador.dispensar();
        dispensador.dispensar();
        dispensador.dispensar();

        System.out.println("El dispensador tiene " + dispensador.cantidadActual + "toallas.");

        dispensador.recargar(4);

        System.out.println("El dispensador tiene " + dispensador.cantidadActual + "toallas.");
    }
}
