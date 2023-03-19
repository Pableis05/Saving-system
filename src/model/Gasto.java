package model;

public class Gasto {


    /* Atributos
        - nombreGasto(String): Nombre del Gasto
        - costoGasto(double): Costo del Gasto
    */    

    private String nombreGasto;
    private double costoGasto;

    //metodos

    public Gasto(String nombreGasto, double costoGasto) {
        this.nombreGasto = nombreGasto;
        this.costoGasto = costoGasto;
    }

    public String getNombreGasto() {
        return nombreGasto;
    }

    public void setNombreGasto(String nombreGasto) {
        this.nombreGasto = nombreGasto;
    }

    public double getCostoGasto() {
        return costoGasto;
    }

    public void setCostoGasto(double costoGasto) {
        this.costoGasto = costoGasto;
    }    

    
}
