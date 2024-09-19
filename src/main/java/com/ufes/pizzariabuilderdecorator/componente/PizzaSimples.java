/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pizzariabuilderdecorator.componente;

/**
 *
 * @author talle
 */
public class PizzaSimples extends Pizza {

    public PizzaSimples(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public Pizza removerIngrediente() {
        return this;
    }
}

