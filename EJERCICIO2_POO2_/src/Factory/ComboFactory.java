/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;
import model.*;    // IMPORTAMOS TODAS LAS CLASES DENTRO DEL PAQUETE MODEL
import java.util.Map; // IMPORTAMOS PORQUE REPRESENTA UNA COLLECION DE PARES DE CLAVE-VALOR
import java.util.Set;  //IMPORTAMOS COLECCION DE ELEMENTOS UNICOS ( NO DUPLICADOS)
import java.util.concurrent.ConcurrentHashMap; //IMPLEMENTACION DE MAP, BUENA PARA MULTIHILO
import java.util.function.Supplier; // SE USA PARA GUARDAR REFERENCIAS A CONSTRUCTORES DE COMBOS
import java.util.Collections; //PARA USAR LIST, SET,ETC


  public class ComboFactory {
   private static final Map<String, Supplier<Combo>> combosDisponibles = new ConcurrentHashMap<>();
   
   static {
        register("hamburguesa", ComboHamburguesa::new);
        register("pollo", ComboPollo::new);
        register("vegetariano", ComboVegetariano::new);
    }
   public static void register(String key, Supplier<Combo> supplier){
       combosDisponibles.put(key.toLowerCase(), supplier);
   }
   public static Set<String> tiposDisponibles(){
       return Collections.unmodifiableSet(combosDisponibles.keySet());
   }
   public static Combo crearCombo(String tipo){
       if (tipo==null) throw new IllegalArgumentException("Tipo no puede ser null");
       Supplier<Combo> supplier = combosDisponibles.get(tipo.toLowerCase());
       if (supplier == null) throw new IllegalArgumentException("Tipo de combo no valido: " + tipo);
       return supplier.get();
   }

   
}
