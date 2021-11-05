package lab4p2_franciscogarcia;

public class Bomba extends Arma{

    public Bomba() {
        super();
    }

    public Bomba(String nombre) {
        super(nombre);
        super.setDaño(140);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getDaño() {
        return daño;
    }

    @Override
    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    
    
    
}
