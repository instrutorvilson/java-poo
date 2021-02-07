/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2401;

/**
 *
 * @author vilson.moro
 */
public class Pedido {
   private String produto;
   private double preco;
   private int quantidade;
   private float desconto;
   private float acrescimo;

   public double getTotal(){
       double desconto = this.preco * (this.desconto/100);
       double acrescimo = this.preco * (this.acrescimo/100);
       return (this.preco + acrescimo - desconto) * this.quantidade;
   }
   
    public Pedido() {
    }

    public Pedido(String produto, double preco, int quantidade, float desconto, float acrescimo) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.acrescimo = acrescimo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(float acrescimo) {
        this.acrescimo = acrescimo;
    }
   
   
}
