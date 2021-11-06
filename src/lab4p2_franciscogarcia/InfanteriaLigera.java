package lab4p2_franciscogarcia;

import javax.swing.JOptionPane;

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
        
    public void atacar(Soldado soldado){
        double daño = getArma().getDaño();
        soldado.setPeleas(soldado.getVida() - daño);
        JOptionPane.showMessageDialog(null,"");
    }
}
