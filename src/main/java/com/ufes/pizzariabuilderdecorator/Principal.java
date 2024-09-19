/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pizzariabuilderdecorator;

import com.ufes.pizzariabuilderdecorator.builder.PizzaBuilder;
import com.ufes.pizzariabuilderdecorator.builder.PizzaCalabresaBuilder;
import com.ufes.pizzariabuilderdecorator.builder.PizzaMargheritaBuilder;
import com.ufes.pizzariabuilderdecorator.builder.Pizzaiolo;
import com.ufes.pizzariabuilderdecorator.componente.Pizza;
import com.ufes.pizzariabuilderdecorator.decorator.Cebola;
import com.ufes.pizzariabuilderdecorator.decorator.Pepperoni;
import com.ufes.pizzariabuilderdecorator.decorator.QueijoExtra;

/**
 *
 * @author talle
 */
public class Principal {

    public static void main(String[] args) {
        Pizzaiolo pizzaiolo = new Pizzaiolo();

        // Construindo uma Pizza Margherita básica
        PizzaBuilder margheritaBuilder = new PizzaMargheritaBuilder();
        Pizza pizzaMargherita = pizzaiolo.prepararPizza(margheritaBuilder);

        // Adicionando ingredientes extras
        pizzaMargherita = new QueijoExtra(pizzaMargherita);
        pizzaMargherita = new Cebola(pizzaMargherita);

        System.out.println(pizzaMargherita);

        // Construindo uma Pizza Calabresa básica
        PizzaBuilder calabresaBuilder = new PizzaCalabresaBuilder();
        Pizza pizzaCalabresa = pizzaiolo.prepararPizza(calabresaBuilder);

        // Adicionando ingredientes extras
        pizzaCalabresa = new Pepperoni(pizzaCalabresa);

        System.out.println(pizzaCalabresa);
    }
}
