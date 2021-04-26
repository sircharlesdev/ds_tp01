package modelo;

public class Modelo {
    
    int sku;
    String denominacion;

    public Modelo() {
    }

    public Modelo(String denominacion) {
        this.denominacion = denominacion;
    }

    public Modelo(int sku, String denominacion) {
        this.sku = sku;
        this.denominacion = denominacion;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return  denominacion;
    }
    
    
    
}
