
package lab4p2_franciscogarcia;


public class Arma {
    
    protected String nombre;
    protected int daño;

    public Arma() {
    }

    public Arma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    
}
