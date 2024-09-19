/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pizzariabuilderdecorator.componente;

/**
 *
 * @author talle
 */
public abstract class Pizza {

    protected String descricao;
    protected double preco;

    public Pizza(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public abstract String getDescricao();
    public abstract double getPreco();
    public abstract Pizza removerIngrediente();

    @Override
    public String toString() {
        return "Pizza: " + getDescricao() + "\nPreço: R$ " + getPreco();
    }
}
