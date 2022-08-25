package bicicleta.app;

import bicicleta.dominio.Bicicleta;

public class Aplicacion {

    public static void main(String[] args) {

        Bicicleta bici = new Bicicleta(654,"Trek","Marlin 7 2021","Blanca",3000000);

        System.out.println(bici.obtenerInformacion());
        bici.acelerar(35.2);
        bici.frenar(17);
        System.out.println(bici.obtenerInformacion());
        System.out.println(bici.cambiarPrecioYColor(35000000,"Esmeralda"));
        System.out.println(bici.obtenerInformacion());
    }
}
