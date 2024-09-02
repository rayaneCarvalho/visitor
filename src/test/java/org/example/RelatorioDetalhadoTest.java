package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatorioDetalhadoTest {

    @Test
    public void testRelatorioDetalhadoComEletronicos() {
        Produto[] inventario = {
                new Eletronico("Laptop", 1200.00, 10),
                new Eletronico("Smartphone", 800.00, 25)
        };

        RelatorioDetalhado relatorioDetalhado = new RelatorioDetalhado();
        for (Produto item : inventario) {
            item.aceitar(relatorioDetalhado);
        }

        String relatorioEsperado = "Eletrônico: Nome=Laptop, Preço=1200.0, Quantidade=10\n" +
                "Eletrônico: Nome=Smartphone, Preço=800.0, Quantidade=25\n";
        assertEquals(relatorioEsperado, relatorioDetalhado.getRelatorio());
    }

    @Test
    public void testRelatorioDetalhadoComVestuario() {
        Produto[] inventario = {
                new Vestuario("Camiseta", 25.00, 100),
                new Vestuario("Calça", 50.00, 60)
        };

        RelatorioDetalhado relatorioDetalhado = new RelatorioDetalhado();
        for (Produto item : inventario) {
            item.aceitar(relatorioDetalhado);
        }

        String relatorioEsperado = "Vestuário: Nome=Camiseta, Preço=25.0, Quantidade=100\n" +
                "Vestuário: Nome=Calça, Preço=50.0, Quantidade=60\n";
        assertEquals(relatorioEsperado, relatorioDetalhado.getRelatorio());
    }

    @Test
    public void testRelatorioDetalhadoComMoveis() {
        Produto[] inventario = {
                new Moveis("Cadeira", 150.00, 20),
                new Moveis("Mesa", 300.00, 15)
        };

        RelatorioDetalhado relatorioDetalhado = new RelatorioDetalhado();
        for (Produto item : inventario) {
            item.aceitar(relatorioDetalhado);
        }

        String relatorioEsperado = "Móveis: Nome=Cadeira, Preço=150.0, Quantidade=20\n" +
                "Móveis: Nome=Mesa, Preço=300.0, Quantidade=15\n";
        assertEquals(relatorioEsperado, relatorioDetalhado.getRelatorio());
    }

    @Test
    public void testRelatorioDetalhadoComTodosOsTipos() {
        Produto[] inventario = {
                new Eletronico("Laptop", 1200.00, 10),
                new Vestuario("Camiseta", 25.00, 100),
                new Moveis("Cadeira", 150.00, 20)
        };

        RelatorioDetalhado relatorioDetalhado = new RelatorioDetalhado();
        for (Produto item : inventario) {
            item.aceitar(relatorioDetalhado);
        }

        String relatorioEsperado = "Eletrônico: Nome=Laptop, Preço=1200.0, Quantidade=10\n" +
                "Vestuário: Nome=Camiseta, Preço=25.0, Quantidade=100\n" +
                "Móveis: Nome=Cadeira, Preço=150.0, Quantidade=20\n";
        assertEquals(relatorioEsperado, relatorioDetalhado.getRelatorio());
    }
}
