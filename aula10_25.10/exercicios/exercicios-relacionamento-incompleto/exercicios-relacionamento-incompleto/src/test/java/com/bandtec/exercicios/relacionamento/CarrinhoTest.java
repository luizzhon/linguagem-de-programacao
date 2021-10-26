package com.bandtec.exercicios.relacionamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author diego
 */
public class CarrinhoTest {

    private List<Produto> produtos;

    public CarrinhoTest() {
        this.produtos = new ArrayList<>(Arrays.asList(
                new Produto("Monitor LG 29", "Eletrônicos", 1_200.0),
                new Produto("Monitor LG 22", "Eletrônicos", 878.0),
                new Produto("Playstation 5", "Eletrônicos", 5_000.0),
                new Produto("Doritos", "Alimentação", 6.50),
                new Produto("Dell G5 15.6", "Notebooks", 8_785.0)
        ));
    }

    @Test
    public void testAdicionarQuandoAcionadoComArgumentoNuloTamanhoDaListaNaoAumenta() {
        Carrinho instance = new Carrinho("Bandtec");
        instance.adicionar(null);

        assertEquals(0, instance.getQuantidade());
    }

    @Test
    public void testAdicionarQuandoAcionadoComArgumentoValidoTamanhoDaListaAumenta() {
        Carrinho instance = new Carrinho("Bandtec");

        instance.adicionar(new Produto("Teste", "Teste", 250.0));

        assertEquals(1, instance.getQuantidade());
    }

    @Test
    public void testAdicionarQuandoAcionadoComArgumentoValidoRepetidoTamanhoDaListaNaoAumenta() {
        Carrinho instance = new Carrinho("Bandtec");

        instance.adicionar(new Produto("Teste", "Teste", 250.0));
        instance.adicionar(new Produto("teste", "x", 10.0));

        assertEquals(1, instance.getQuantidade());
    }

    @Test
    public void testExistsPorNomeQuandoAcionadoComArgumentoNuloDeveRetornarFalse() {
        Carrinho instance = new Carrinho("Bandtec");
        assertFalse(instance.existsPorNome(null));
    }

    @Test
    public void testExistsPorNomeQuandoAcionadoComArgumentoNaoExistenteDeveRetornarFalse() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        assertFalse(instance.existsPorNome("Gilberto"));
    }

    @Test
    public void testExistsPorNomeQuandoAcionadoComArgumentoExistenteDeveRetornarTrue() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        assertFalse(instance.existsPorNome("diego"));
    }

    @Test
    public void testGetQuantidadePorCategoriaQuandoAcionadoEListaEstaVaziaDeveRetornar0() {
        Carrinho instance = new Carrinho("Bandtec");
        assertEquals(0, instance.getQuantidadePorCategoria("Eletronicos"));
    }

    @Test
    public void testGetQuantidadePorCategoriaQuandoAcionadoEListaPossui3ProdutosComCategoriaDeveRetornar3() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        assertEquals(3, instance.getQuantidadePorCategoria("eletrônicos"));
    }

    @Test
    public void testGetQuantidadePorCategoriaQuandoAcionadoComArgumentoNuloDeveRetornar0() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        assertEquals(0, instance.getQuantidadePorCategoria(null));
    }

    @Test
    public void testGetQuantidadeQuandoAcionadoEListaPossui5ItensDeveRetornar5() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        assertEquals(5, instance.getQuantidade());
    }

    @Test
    public void testGetQuantidadeQuandoAcionadoEListaEstaVaziaDeveRetornar0() {
        Carrinho instance = new Carrinho("Bandtec");
        assertEquals(0, instance.getQuantidade());
    }

    @Test
    public void testLimparQuandoAcionadoEListaEstaVaziaDeveRetornar0() {
        Carrinho instance = new Carrinho("Bandtec");
        instance.limpar();
        assertEquals(0, instance.getQuantidade());
    }

    @Test
    public void testLimparQuandoAcionadoEListaContem5ProdutosDeveRetornar0() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        instance.limpar();
        assertEquals(0, instance.getQuantidade());
    }

    @Test
    public void testRemoverPorNomeQuandoAcionadoComNomeNuloNaoDeveAlterarTamanhoDaLista() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        instance.removerPorNome(null);
        assertEquals(5, instance.getQuantidade());
    }

    @Test
    public void testRemoverPorNomeQuandoAcionadoComNomeNaoExistenteNaoDeveAlterarTamanhoDaLista() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        instance.removerPorNome("Wellington");
        assertEquals(5, instance.getQuantidade());
    }

    @Test
    public void testRemoverPorNomeQuandoAcionadoComNomeExistenteDeveAlterarTamanhoDaLista() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        instance.removerPorNome("playstation 5");
        assertEquals((this.produtos.size() - 1), instance.getQuantidade());
    }

    @Test
    public void testGetPorNomeQuandoAcionadoEExisteProdutoComNomeInformadoDeveRetornarObjeto() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        assertEquals(this.produtos.get(4), instance.getPorNome("dell G5 15.6"));
    }
    
    @Test
    public void testGetPorNomeQuandoAcionadoENaoExisteProdutoComNomeInformadoDeveRetornarNulo() {
        Carrinho instance = new Carrinho("Bandtec");
        assertNull(instance.getPorNome("Televisor philco"));
    }
    
    @Test
    public void testGetPorNomeQuandoAcionadoComArgumentoNuloDeveRetornarNulo() {
        Carrinho instance = new Carrinho("Bandtec");
        assertNull(instance.getPorNome(null));
    }

    @Test
    public void testGetValorTotalQuandoAcionadoEListaEstaVaziaDeveRetorna0() {
        Carrinho instance = new Carrinho("Bandtec");
        assertEquals(0, instance.getValorTotal());
    }
    
    @Test
    public void testGetValorTotalQuandoAcionadoEListaTemTotalDe158695Deve158695() {
        Carrinho instance = new Carrinho("Bandtec");
        this.popularCarrinho(instance);
        assertEquals(15_869.5, instance.getValorTotal());
    }
    
    private void popularCarrinho(Carrinho carrinho) {
        produtos.forEach(produto -> {
            carrinho.adicionar(produto);
        });
    }
}
