package banco.app;

import banco.dominio.Banco;
import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacion {

    public static void main(String[] args) {

        Banco bancolombia = new Banco("123897", "Bancolombia S.A");
// instancia de usuarios
        Persona emmanuelJose = new Persona(1234,"Emmanuel Jose");
        Persona alejandro = new Persona(321564,"alejandro");
// instancia de cuentas
        CuentaBancaria miCuenta = new CuentaBancaria( bancolombia,"Ahorros",emmanuelJose,"9875651",350000);
        CuentaBancaria cuentaAlejandro = new CuentaBancaria(bancolombia,"Ahorros", alejandro, "97898",985000);

// procesos creando la cuenta y dando los valores de la cuenta
        emmanuelJose.nombre = "";
        miCuenta.titular = emmanuelJose;
        miCuenta.saldo = 316000;
        miCuenta.estado = "ACTIVA";

        alejandro.nombre = "Alejandro";
        cuentaAlejandro.titular = alejandro;
        cuentaAlejandro.saldo = 0;
        cuentaAlejandro.estado = "ACTIVA";

//        miCuenta.retirar(300000);

        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());

        boolean resultadoTransferencia = miCuenta.transferir(216000, cuentaAlejandro);

        System.out.println(resultadoTransferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());


    } //main
} //clase
