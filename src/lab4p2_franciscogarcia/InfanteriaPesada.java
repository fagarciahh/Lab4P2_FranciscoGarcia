package lab4p2_franciscogarcia;

public class InfanteriaPesada extends Soldado{
    
    private Bomba arma;

    public InfanteriaPesada() {
    }

    public InfanteriaPesada(String nombre, int edad, int años, String rango, int vida, Bomba arma) throws miExcepcion {
        super(nombre, edad, años, rango, vida);
        this.arma = arma;
    }

    public Bomba getArma() {
        return arma;
    }

    public void setArma(Bomba arma) {
        this.arma = arma;
    }   
    
}
