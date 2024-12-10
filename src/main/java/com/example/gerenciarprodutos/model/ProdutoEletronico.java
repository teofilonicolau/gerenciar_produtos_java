package com.example.gerenciarprodutos.model;


public class ProdutoEletronico extends Produto {
    private int garantiaEmMeses;

    public ProdutoEletronico(String nome, double preco, int garantiaEmMeses) {
        super(nome, preco);
        this.garantiaEmMeses = garantiaEmMeses;
    }

    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }

    public void setGarantiaEmMeses(int garantiaEmMeses) {
        this.garantiaEmMeses = garantiaEmMeses;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;  // Aplica taxa de garantia de 5%
    }
}
