package lab4p2_franciscogarcia;

import javax.swing.JOptionPane;

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
    
    public void atacar(Soldado soldado){
        double daño = getArma().getDaño();
        if(soldado instanceof InfanteriaLigera){
            daño = daño + daño*0.25;
        }else if(soldado instanceof InfanteriaPesada){
            daño = daño + daño*0.20;
        }else if(soldado instanceof Sargento){
            daño = daño + daño*0.15;
        }
        soldado.setPeleas(soldado.getVida() - daño);
        JOptionPane.showMessageDialog(null,"");
    }
    
}
