package lab4p2_franciscogarcia;


public abstract class Soldado {
    
    protected String nombre;
    protected int edad;
    protected int años;
    protected String rango;
    protected int vida;

    public Soldado() {
    }

    public Soldado(String nombre, int edad, int años, String rango, int vida) throws miExcepcion{
        this.nombre = nombre;
        this.setEdad(edad);
        this.setAños(años);
        this.rango = rango;
        this.setVida(vida);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws miExcepcion{
        if(edad < 18){
            throw new miExcepcion("Tiene que ser mayor de 18");
        }
        this.edad = edad;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) throws miExcepcion{
        if(años < 0){
            throw new miExcepcion("Tiempo de trabajo inexistente");
        }
        this.años = años;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida)throws miExcepcion {
        if(vida < 100 || vida > 400){
            throw new miExcepcion("Vida fuera de rango");
        }
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Soldado:\n" + 
                "Nombre: \n" + nombre + 
                "Edad: \n" + edad + 
                "Tiempos en ejercito: \n" + años + 
                "Rango: \n" + rango + 
                "Vida: \n" + vida;
    }
    
    
}
