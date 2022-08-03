package Bicicletas.app;

import Bicicletas.dominio.Bicicleta;

public class Aplicacion {

    public static void main(String[] args) {

        Bicicleta bici1 = new Bicicleta();

        bici1.serial = 654;
        bici1.marca = "Trek";
        bici1.modelo = "Marlin 7 2021";
        bici1.color = "Blanca";
        bici1.precio = 3000000;

        System.out.println(bici1.obtenerInformacion());

        bici1.acelerar(35.2);

        System.out.println(bici1.obtenerInformacion());

        System.out.println(bici1.cambiarColor("Rojo"));
        System.out.println(bici1.cambiarPrecioYColor(35000000,"Esmeralda"));

        System.out.println(bici1.obtenerInformacion());
    }
}
