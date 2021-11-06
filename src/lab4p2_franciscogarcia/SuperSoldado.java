package lab4p2_franciscogarcia;

import javax.swing.JOptionPane;
import java.util.Random;

public class SuperSoldado extends Soldado{
    
    private Bomba bomba;
    private ArmaBlanca armab;
    private Lanzallamas lanza;
    private Escopeta escopeta;

    public SuperSoldado() {
    }

    public SuperSoldado(Bomba bomba, ArmaBlanca armab, Lanzallamas lanza, Escopeta escopeta, String nombre, int edad, int años, String rango, double vida) throws miExcepcion {
        super(nombre, edad, años, rango, vida);
        this.bomba = bomba;
        this.armab = armab;
        this.lanza = lanza;
        this.escopeta = escopeta;
    }

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    public ArmaBlanca getArmab() {
        return armab;
    }

    public void setArmab(ArmaBlanca armab) {
        this.armab = armab;
    }

    public Lanzallamas getLanza() {
        return lanza;
    }

    public void setLanza(Lanzallamas lanza) {
        this.lanza = lanza;
    }

    public Escopeta getEscopeta() {
        return escopeta;
    }

    public void setEscopeta(Escopeta escopeta) {
        this.escopeta = escopeta;
    }

    public void atacar(Soldado soldado){
        Random rd = new Random();
        Arma arma = new Arma();
        int ran = rd.nextInt(4)+1;
        switch(ran){
            case 1->{
                arma = bomba;
            }
            case 2->{
                arma = armab;
            }
            case 3->{
                arma = escopeta;
            }
            case 4->{
                arma = lanza;
            }
        }
        double daño = arma.getDaño();
        if(soldado instanceof InfanteriaLigera){
            daño = daño + daño*0.50;
        }else if(soldado instanceof InfanteriaPesada){
            daño = daño + daño*0.40;
        }else if(soldado instanceof Sargento){
            daño = daño + daño*0.35;
        }else if(soldado instanceof Capitan){
            daño = daño + daño*0.30;
        }
        soldado.setPeleas(soldado.getVida() - daño);
        JOptionPane.showMessageDialog(null,"");
    }
    
    
    
}
