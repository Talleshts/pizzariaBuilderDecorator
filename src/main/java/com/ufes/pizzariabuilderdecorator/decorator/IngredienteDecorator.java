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
public abstract class IngredienteDecorator extends Pizza {

    protected Pizza pizzaDecorada;

    protected IngredienteDecorator(Pizza pizzaDecorada, String descricao, double preco) {
        super(descricao, preco);
        this.pizzaDecorada = pizzaDecorada;
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao() + ", " + descricao;
    }

    @Override
    public double getPreco() {
        return pizzaDecorada.getPreco() + preco;
    }

    @Override
    public Pizza removerIngrediente() {
        return pizzaDecorada;
    }
}