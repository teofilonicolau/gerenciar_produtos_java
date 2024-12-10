package com.example.gerenciarprodutos;


import com.example.gerenciarprodutos.model.Produto;

import com.example.gerenciarprodutos.model.ProdutoEletronico;

import com.example.gerenciarprodutos.model.ProdutoPerecivel;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 4.50, LocalDate.now().plusDays(2));
        ProdutoEletronico celular = new ProdutoEletronico("Celular", 1200.00, 24);
        Produto arroz = new Produto("Arroz", 20.00);

        produtos.add(leite);
        produtos.add(celular);
        produtos.add(arroz);

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " | Preço Final: R$" + produto.calcularPrecoFinal());
        }
    }
}
