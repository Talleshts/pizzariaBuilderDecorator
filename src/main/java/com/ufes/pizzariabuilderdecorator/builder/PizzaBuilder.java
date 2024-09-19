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
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public abstract void prepararMassa();
    public abstract void adicionarMolho();
    public abstract void adicionarQueijo();
    public abstract Pizza getPizza();
}
