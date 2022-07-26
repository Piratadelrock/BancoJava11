package banco.dominio;

import java.util.Date;

public class CuentaBancaria {
    public Banco banco;
    public String tipo; // si es de ahorros o corriente
    public Persona titular;
    public String numero;
    public double saldo;
    public Date fechaApertura;
    public String contrasena;

}
