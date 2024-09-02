package org.example;

public class Eletronico implements Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Eletronico(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProduto(this);
    }
}
