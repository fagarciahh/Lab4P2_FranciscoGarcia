package lab4p2_franciscogarcia;

import javax.swing.JOptionPane;

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
    
    public void atacar(Soldado soldado){
        double daño = getArma().getDaño();
        if(soldado instanceof InfanteriaLigera){
            daño = daño + daño*0.15;
        }else if(soldado instanceof InfanteriaPesada){
            daño = daño + daño*0.10;
        }
        soldado.setPeleas(soldado.getVida() - daño);
        JOptionPane.showMessageDialog(null,"");
    }
}
