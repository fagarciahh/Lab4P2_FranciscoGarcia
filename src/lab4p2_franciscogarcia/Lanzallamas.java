package lab4p2_franciscogarcia;

public class Lanzallamas extends Arma{

    public Lanzallamas() {
    }

    public Lanzallamas(String nombre) {
        super(nombre);
        super.setDaño(110);
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
