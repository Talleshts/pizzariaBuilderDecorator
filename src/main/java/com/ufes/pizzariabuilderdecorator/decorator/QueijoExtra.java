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
public class QueijoExtra extends IngredienteDecorator {

    public QueijoExtra(Pizza pizzaDecorada) {
        super(pizzaDecorada, "Queijo Extra", 3.50);
    }
}