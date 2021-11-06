package lab4p2_franciscogarcia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab4P2_FranciscoGarcia {
    
    public static ArrayList<Escuadrones> escuadrones = new ArrayList();

    public static void main(String[] args) throws miExcepcion {
        int op = -1;
        while (op != 0) {
            try {                
                op = Integer.parseInt(JOptionPane.showInputDialog("MENU \n"
                        + "        0- Salida \n"
                        + "        1- Crear zona\n"
                        + "        2- Listar zonas\n"
                        + "        3- Crear Escuadron\n"
                        + "        4- Listar escuadrones\n"
                        + "        5- Listar escuadron\n"
                        + "        6- Eliminar escuadron\n"
                        + "        7- Añadir Soldado a escuadron\n"
                        + "        8- Listar Soldados de escuadron\n"
                        + "        9- Listar Soldados de escuadron por tipo\n"
                        + "        10- Eliminar Soldados de Escuadron\n"
                        + "        11- Pelear\n"));

                switch (op){
                    case 1->{
                        //METODO DE CREACION DE ZONA
                        int opc;
                        if (escuadrones.size() > 1) {
                            try {
                                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a que escuadron agregara la zona"));
                                while(opc < 0 || opc > escuadrones.size()){
                                    opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un escuadron que exista"));
                                }
                                crearZona(opc);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puede utilizar esta opcion todavia");
                        }

                    }
                    case 2 -> {
                        
                        //LISTAMOS ZONAS
                        int opc;
                        if (escuadrones.size() > 1) {
                            try {
                                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de que escuadron quiere listar las zonas"));
                                while(opc < 0 || opc > escuadrones.size()){
                                    opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un escuadron que exista"));
                                }
                                crearZona(opc);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puede utilizar esta opcion todavia");
                        }
                    }
                    case 3->{
                        
                        //CREAMOS ESCUADRON
                        String n = JOptionPane.showInputDialog("Ingrese el nombre del escuadron");
                        
                        
                    }
                    case 4->{
                        if (escuadrones.size() > 1) {
                            JOptionPane.showInputDialog(escuadrones.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puede utilizar esta opcion todavia");
                        }
                    }
                    case 5->{
                        int opc;
                        if (escuadrones.size() > 1) {
                            try {
                                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que escuadron va a imprimir"));
                                while (opc < 0 || opc > escuadrones.size()) {
                                    opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un escuadron que exista"));
                                }
                                JOptionPane.showInputDialog(escuadrones.get(opc).toString());
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puede utilizar esta opcion todavia");
                        }
                    }
                    case 6->{
                        int opc;
                        if (escuadrones.size() > 1) {
                            try {
                                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que escuadron va a eliminar"));
                                while (opc < 0 || opc > escuadrones.size()) {
                                    opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un escuadron que exista"));
                                }
                                escuadrones.remove(opc);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puede utilizar esta opcion todavia");
                        }
                    }
                    case 7->{
                        
                    }
                    case 8->{
                        
                    }
                    case 9->{
                        
                    }
                    case 10->{
                        
                    }
                    case 11->{
                        
                    }
                    default ->{
                        
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }
    
    public static void crearZona(int i){
        String n;
        int tamaño, x, y;

        n = JOptionPane.showInputDialog("Ingrese el nombre de la zona");
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la zona (100 - 300)"));
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las coordenadas en X (0 - 100)"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las coordenadas en Y (0 - 100)"));

        //CREACION DE ZONA
        try {
            Zonas zona = new Zonas(n, tamaño, x, y);

        } catch (miExcepcion ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public static void crearEscuadron(){
        String n;
        ArrayList<Zonas> ZonazConquistadas = new ArrayList();
        ArrayList<Soldado> Soldados = new ArrayList();
        
        n = JOptionPane.showInputDialog("Ingese el nombre del escuadron");
        
    }
    
    public static void crearSoldado(){
        String n, rango;
        int edad, año, tipo; 
        double vida; 
        
        n = JOptionPane.showInputDialog("Ingrese el nombre del soldado");
        rango = JOptionPane.showInputDialog("Ingrese el rango del soldado");
        try{
            try{
                edad = Integer.parseInt("Ingrese la edad del soldado (edad > 0)");
                año = Integer.parseInt("Ingrese cuantos años a estado el soldado (años >= 0)");
                vida = Integer.parseInt("Ingrese la vida del soldado");
                tipo = Integer.parseInt("Tipo de Soldado:\n"
                        + "1 - SuperSoldado\n"
                        + "2 - Capitan\n"
                        + "3 - Sargento\n"
                        + "4 - Infanteria ligera\n"
                        + "5 - Infanteria Pesada\n");
                switch(tipo){
                    case 1->{
                        String esco, ab, bom, la;
                        ab = JOptionPane.showInputDialog("Ingrese el nombre del arma Blanca");
                        esco = JOptionPane.showInputDialog("Ingrese el nombre de la Escopeta");
                        bom = JOptionPane.showInputDialog("Ingrese el nombre de la bomba");
                        la = JOptionPane.showInputDialog("Ingrese el nombre del lanzallamas");
                        
                        ArmaBlanca armab = new ArmaBlanca(ab);
                        Bomba bomb = new  Bomba(bom);
                        Escopeta escop = new Escopeta(esco);
                        Lanzallamas lanza = new Lanzallamas(la); 
                        Soldado soldado = new SuperSoldado(bomb,armab,lanza,escop,n,edad,año,rango, (int) vida);
                        
                        
                    }
                    case 2->{
                        String ll;
                        ll = JOptionPane.showInputDialog("Ingrese el nombre del lanzallamas");
                        Lanzallamas lanza = new Lanzallamas(ll);
                        Soldado soldado = new Capitan(n,edad,año,rango, (int) vida,lanza);
                    }
                    case 3->{
                        String esco;
                        esco = JOptionPane.showInputDialog("Ingrese el nombre de la Escopeta");
                        Escopeta escop = new Escopeta(esco);
                        Soldado soldado = new Sargento(n,edad,año,rango, (int) vida,escop);
                    }
                    case 4->{
                        String ab; 
                        ab = JOptionPane.showInputDialog("Ingrese el nombre del arma Blanca");
                        ArmaBlanca bomb = new ArmaBlanca(ab);
                        Soldado soldado = new InfanteriaLigera(n,edad,año,rango, (int) vida,bomb);
                    }
                    case 5->{
                        String bo; 
                        bo = JOptionPane.showInputDialog("Ingrese el nombre de la bomba");
                        Bomba bomb = new Bomba(bo);
                        Soldado soldado = new InfanteriaPesada(n,edad,año,rango, (int) vida,bomb);
                    }
                }
                
            }catch(miExcepcion ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
}
