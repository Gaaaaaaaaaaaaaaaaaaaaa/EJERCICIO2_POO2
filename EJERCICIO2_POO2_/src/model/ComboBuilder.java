
package model;


public class ComboBuilder {
    private Combo combo;
    private String bebida;
    private String acompañamiento;
    private String extra;
    
    public ComboBuilder setCombo(Combo combo){
        this.combo = combo;
        return this;
    }
    public ComboBuilder setBebida(String bebida){
        this.bebida = bebida;
        return this;
    }
    public ComboBuilder setAcompañamiento(String acompañamiento){
        this.acompañamiento = acompañamiento;
        return this;
    }
    public ComboBuilder setExtra (String extra){
        this.extra = extra;
        return this;
    }
    
      public Pedido build(){
          return new Pedido(combo,bebida, acompañamiento, extra);
      }
}
