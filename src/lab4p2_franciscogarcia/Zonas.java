package lab4p2_franciscogarcia;

public class Zonas {
    
    private String nombre;
    private int tamaño;
    private int X;
    private int Y;

    public Zonas() {
    }

    public Zonas(String nombre, int tamaño, int X, int Y) throws miExcepcion{
        this.nombre = nombre;
        this.setTamaño(tamaño);
        this.setY(Y);
        this.setX(X);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) throws miExcepcion{
        if(tamaño < 100 || tamaño > 300 ){
            throw new miExcepcion("Tamaño fuera de rango");
        }
        this.tamaño = tamaño;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) throws miExcepcion{
        if(X < 0 || X > 100 ){
            throw new miExcepcion("Coordenadas en X fuera de rango");
        }
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) throws miExcepcion{
        if(Y < 0 || Y > 100 ){
            throw new miExcepcion("Coordenadas en Y fuera de rango");
        }
        this.Y = Y;
    }
    
    
}
