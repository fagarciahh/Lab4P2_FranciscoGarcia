package lab4p2_franciscogarcia;

public class InfanteriaLigera extends Soldado{
    
    private ArmaBlanca arma;

    public InfanteriaLigera() {
    }

    public InfanteriaLigera(String nombre, int edad, int años, String rango, int vida, ArmaBlanca arma) throws miExcepcion {
        super(nombre, edad, años, rango, vida);
        this.arma = arma;
    }

    public ArmaBlanca getArma() {
        return arma;
    }

    public void setArma(ArmaBlanca arma) {
        this.arma = arma;
    }   
        
}
