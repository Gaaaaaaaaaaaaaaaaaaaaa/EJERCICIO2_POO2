
package model;


public class Pedido {
    private Combo combo;
    private String bebida;
    private String acompañamiento;
    private String extra;
    
    public Pedido(Combo combo, String bebida, String acompañamiento, String extra){
        this.combo = combo;
        this.bebida = bebida;
        this.acompañamiento = acompañamiento;
        this.extra = extra;
    }
    public String mostrarResumen(){
        return "===  Resumen de pedido ===\n"+ 
                combo.mostrarDetalles() + "\n"+
                "Bebida: " + bebida + "\n"+
                "Acompañamiento: " + acompañamiento + "\n" +
                "Extra: " + extra + "\n";
                        
    }
}
