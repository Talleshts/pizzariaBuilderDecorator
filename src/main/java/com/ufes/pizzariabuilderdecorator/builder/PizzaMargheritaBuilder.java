/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pizzariabuilderdecorator.builder;

import com.ufes.pizzariabuilderdecorator.componente.Pizza;
import com.ufes.pizzariabuilderdecorator.componente.PizzaSimples;
import com.ufes.pizzariabuilderdecorator.decorator.IngredienteDecorator;

/**
 *
 * @author talle
 */
public class PizzaMargheritaBuilder extends PizzaBuilder {

    @Override
    public void prepararMassa() {
        pizza = new PizzaSimples("Massa de Margherita", 5.00);
    }

    @Override
    public void adicionarMolho() {
        pizza = new IngredienteDecorator(pizza, "Molho de Tomate", 1.00) {};
    }

    @Override
    public void adicionarQueijo() {
        pizza = new IngredienteDecorator(pizza, "Queijo", 2.00) {};
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
