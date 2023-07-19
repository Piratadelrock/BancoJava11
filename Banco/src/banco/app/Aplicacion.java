package banco.app;

import banco.dominio.Banco;
import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class Aplicacion {

    public static void main(String[] args) {

        //instancia de bancos
        Banco bancolombia = new Banco("123897", "Bancolombia S.A");

        // instancia de usuarios
        Persona emmanuelJose = new Persona(1234, "Emmanuel Jose");
        Persona alejandro = new Persona(321564, "Alejandro");

        // instancia de cuentas
        CuentaBancaria miCuenta = new CuentaBancaria(bancolombia, "Ahorros", emmanuelJose, "9875651", 350000);
        CuentaBancaria cuentaAlejandro = new CuentaBancaria(bancolombia, "Ahorros", alejandro, "97898", 985000);

    //hicimos un retiro antes de transferir a la cuenta
        System.out.println("Se hizo retiro de la cuenta: "+ miCuenta.titular.nombre +" con saldo: "+ miCuenta.saldo );
        miCuenta.retirar(3000);

    //consultamos saldos actuales
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());

//se hace transferencia por el valor definido a la cuenta destino
        System.out.println("Se realiza una transferencia de la cuenta: "
                + miCuenta.titular.nombre + " a la cuenta: "
                + cuentaAlejandro.titular.nombre);

        boolean resultadoTransferencia = miCuenta.transferir(216000, cuentaAlejandro);
    //se ha aplicado condicional ternario
        System.out.println(resultadoTransferencia ? "Se a transferido correctamente" : "Fondos insuficientes");

    //consultamos saldos de nuevo
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());


    } //main
} //clase
