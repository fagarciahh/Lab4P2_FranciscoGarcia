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
                        
                    }
                    default ->{
                        
                    }
                } 
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }

    }

}
