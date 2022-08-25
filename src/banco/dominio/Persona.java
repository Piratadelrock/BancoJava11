package banco.dominio;

public class Persona {
    public int cedula;
    public String nombre;
    public String estadoCivil;
    public String genero;

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
}
