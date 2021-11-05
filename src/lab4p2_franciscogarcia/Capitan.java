package lab4p2_franciscogarcia;

public class Capitan extends Soldado{
    
    private Lanzallamas arma;

    public Capitan() {
        super();
    }

    public Capitan(String nombre, int edad, int años, String rango, int vida, Lanzallamas arma) throws miExcepcion {
        super(nombre, edad, años, rango, vida);
        this.arma = arma; 
    }

    public Lanzallamas getArma() {
        return arma;
    }

    public void setArma(Lanzallamas arma) {
        this.arma = arma;
    }
    
    void Ataque(){
        
    }
    
}
