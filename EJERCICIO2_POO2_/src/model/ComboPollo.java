
package model;


public class ComboPollo extends Combo {
    public ComboPollo(){
        this.nombre = "Combo Pollo";
        this.precioBase = 3.50;
    }
    @Override
    public String mostrarDetalles(){
        return nombre + " - S/" + "" + precioBase;
    }
}
