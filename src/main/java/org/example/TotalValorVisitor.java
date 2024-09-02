package org.example;

public class TotalValorVisitor implements Visitor {
    private double valorTotal = 0;

    @Override
    public String exibirProduto(Produto produto) {
        if (produto instanceof Eletronico) {
            Eletronico eletronico = (Eletronico) produto;
            valorTotal += eletronico.getPreco() * eletronico.getQuantidade();
        } else if (produto instanceof Vestuario) {
            Vestuario vestuario = (Vestuario) produto;
            valorTotal += vestuario.getPreco() * vestuario.getQuantidade();
        } else if (produto instanceof Moveis) {
            Moveis moveis = (Moveis) produto;
            valorTotal += moveis.getPreco() * moveis.getQuantidade();
        }
        return String.valueOf(valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
