/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class ComboVegetariano extends Combo {
    public ComboVegetariano() {
        this.nombre = "Combo Vegetariano";
        this.precioBase = 7;
    }

    @Override
    public String mostrarDetalles() {
        return nombre + " - $" + precioBase;
    }
}
