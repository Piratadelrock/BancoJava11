package Television.dominio;

public class Televisor {
    public short tamaño;
    public String marca;
    public String referencia;
    public boolean encendido;
    public short canalSintonizado;
    public byte volumenActual;

    public void encender(){
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }
    public boolean cambiarCanal(short nuevoCanal){
        if (this.encendido){
            this.canalSintonizado = nuevoCanal;
            return true;
        }
        return false;
    }
    public void subirVolumen(){
        if (this.encendido){
            this.volumenActual++;
        }
    }
    public void bajarVolumen(){
        if (this.encendido){
            this.volumenActual--;
        }
    }

}
