package lab4p2_franciscogarcia;


public class ArmaBlanca extends Arma{

    public ArmaBlanca() {
        super();
    }

    public ArmaBlanca(String nombre) {
        super(nombre);
        super.setDaño(50);
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
