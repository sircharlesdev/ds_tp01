package modelo;

import java.util.ArrayList;

public class Orden {
    
    private String Color;
    private String Modelo;

    public Orden() {
    }

    public Orden(String Color, String Modelo) {
        this.Color = Color;
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Orden{" + "Color=" + Color + ", Modelo=" + Modelo + '}';
    }
    
    ArrayList<Orden> ordenes = new ArrayList<>();
    
}
