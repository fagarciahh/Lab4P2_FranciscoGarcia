package lab4p2_franciscogarcia;

public class Sargento extends Soldado{
    
    private Escopeta arma;

    public Sargento() {
    }

    public Sargento(String nombre, int edad, int años, String rango, int vida, Escopeta arma) throws miExcepcion {
        super(nombre, edad, años, rango, vida);
        this.arma = arma;
    }

    public Escopeta getArma() {
        return arma;
    }

    public void setArma(Escopeta arma) {
        this.arma = arma;
    }
    
}
