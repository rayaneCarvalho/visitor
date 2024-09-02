package org.example;

public class RelatorioDetalhado implements Visitor {
    private StringBuilder relatorio = new StringBuilder();

    @Override
    public String exibirProduto(Produto produto) {
        if (produto instanceof Eletronico) {
            Eletronico eletronico = (Eletronico) produto;
            relatorio.append("Eletrônico: ")
                    .append("Nome=").append(eletronico.getNome())
                    .append(", Preço=").append(eletronico.getPreco())
                    .append(", Quantidade=").append(eletronico.getQuantidade())
                    .append("\n");
        } else if (produto instanceof Vestuario) {
            Vestuario vestuario = (Vestuario) produto;
            relatorio.append("Vestuário: ")
                    .append("Nome=").append(vestuario.getNome())
                    .append(", Preço=").append(vestuario.getPreco())
                    .append(", Quantidade=").append(vestuario.getQuantidade())
                    .append("\n");
        } else if (produto instanceof Moveis) {
            Moveis moveis = (Moveis) produto;
            relatorio.append("Móveis: ")
                    .append("Nome=").append(moveis.getNome())
                    .append(", Preço=").append(moveis.getPreco())
                    .append(", Quantidade=").append(moveis.getQuantidade())
                    .append("\n");
        }
        return relatorio.toString();
    }

    public String getRelatorio() {
        return relatorio.toString();
    }
}

