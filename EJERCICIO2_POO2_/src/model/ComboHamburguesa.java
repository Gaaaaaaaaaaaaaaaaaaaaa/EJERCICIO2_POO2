/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class ComboHamburguesa extends Combo{
    public ComboHamburguesa(){
        this.nombre = "Combo Hamburguesa";
        this.precioBase = 5.00;
    }
    
@Override
 
 public String mostrarDetalles(){
 return nombre + " - S/" + precioBase;
  }
}