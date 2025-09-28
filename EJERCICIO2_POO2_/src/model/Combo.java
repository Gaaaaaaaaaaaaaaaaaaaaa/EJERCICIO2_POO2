/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public abstract class Combo {
    protected String nombre;
    protected double precioBase;

  public String getNombre(){
      return nombre;
  }
public double getPrecioBase(){
    return precioBase;
}
public abstract String mostrarDetalles();
}
