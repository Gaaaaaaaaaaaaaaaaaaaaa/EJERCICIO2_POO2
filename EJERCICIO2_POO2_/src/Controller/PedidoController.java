/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Factory.ComboFactory;
import model.Combo; 
import java.util.Set;

public class PedidoController {
    public Combo crearCombo(String tipoCombo){
        return ComboFactory.crearCombo(tipoCombo);
    }
    public Set<String> obtenerTiposDisponibles(){
        return ComboFactory.tiposDisponibles();
    }
}
