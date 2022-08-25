package banco.dominio;

public class Banco {
    public String nit;
    public String nombre;
    public Persona gerente;

    public Banco(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }
}
