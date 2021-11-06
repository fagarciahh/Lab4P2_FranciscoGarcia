package lab4p2_franciscogarcia;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    
    public void atacar(Soldado soldado){
        double daño = getArma().getDaño();
        if(soldado instanceof InfanteriaLigera){
            daño = daño + daño*0.05;
        }
        soldado.setPeleas(soldado.getVida() - daño);
        JOptionPane.showMessageDialog(null,"");
    }
}
