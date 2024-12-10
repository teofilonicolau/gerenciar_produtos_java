package com.example.gerenciarprodutos.model;


import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, LocalDate dataDeValidade) {
        super(nome, preco);
        this.dataDeValidade = dataDeValidade;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public double calcularPrecoFinal() {
        LocalDate hoje = LocalDate.now();
        if (dataDeValidade.isBefore(hoje.plusDays(3))) {
            return getPreco() * 0.9;  // Aplica 10% de desconto
        } else {
            return getPreco();
        }
    }
}
