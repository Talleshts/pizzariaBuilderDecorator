/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pizzariabuilderdecorator.builder;

import com.ufes.pizzariabuilderdecorator.componente.Pizza;

/**
 *
 * @author talle
 */
public class Pizzaiolo {
    public Pizza prepararPizza(PizzaBuilder builder) {
       builder.prepararMassa();
       builder.adicionarMolho();
       builder.adicionarQueijo();
       return builder.getPizza();
   }   
}
