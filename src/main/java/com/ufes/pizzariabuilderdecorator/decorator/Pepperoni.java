/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pizzariabuilderdecorator.decorator;

import com.ufes.pizzariabuilderdecorator.componente.Pizza;

/**
 *
 * @author talle
 */
public class Pepperoni extends IngredienteDecorator {

    public Pepperoni(Pizza pizzaDecorada) {
        super(pizzaDecorada, "Pepperoni", 4.00);
    }
}
