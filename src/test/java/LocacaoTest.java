import org.example.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LocacaoTest {

    @Test
    void deveRetornarValorLocacao() {
        Locacao locacao = new LocacaoCarro(500.0f);

        assertEquals(500.0f, locacao.getValor());
    }

    @Test
    void deveRetornarValorLocacaoComLimpeza() {
        Locacao locacao = new Limpeza(new LocacaoCarro(500.0f));

        assertEquals(510.0f, locacao.getValor());
    }

    @Test
    void deveRetornarValorLocacaoComServico() {
        Locacao locacao = new Servico(new LocacaoCarro(500.0f));

        assertEquals(525.0f, locacao.getValor());
    }

    @Test
    void deveRetornarValorLocacaoComSeguro() {
        Locacao locacao = new Seguro(new LocacaoCarro(500.0f));

        assertEquals(550.0f, locacao.getValor());
    }

    @Test
    void deveRetornarValorLocacaoComLimpezaMaisServico() {
        Locacao locacao = new Limpeza(new Servico(new LocacaoCarro(500.0f)));

        assertEquals(535.5f, locacao.getValor());
    }

    @Test
    void deveRetornarValorLocacaoComLimpezaMaisSeguro() {
        Locacao locacao = new Limpeza(new Seguro(new LocacaoCarro(500.0f)));

        assertEquals(561.0f, locacao.getValor());
    }

    @Test
    void deveRetornarValorLocacaoComServicoMaisSeguro() {
        Locacao locacao = new Servico(new Seguro(new LocacaoCarro(500.0f)));

        assertEquals(577.5f, locacao.getValor());
    }

    @Test
    void deveRetornarValorLocacaoComLimpezaMaisServicoMaisSeguro() {
        Locacao locacao = new Limpeza(new Servico(new Seguro(new LocacaoCarro(500.0f))));

        assertEquals(589.05f, locacao.getValor());
    }

    @Test
    void deveRetornarEstruturaLocacao() {
        Locacao locacao = new LocacaoCarro();

        assertEquals("Carro", locacao.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaLocacaoComLimpeza() {
        Locacao locacao = new Limpeza(new LocacaoCarro());

        assertEquals("Carro/Limpeza", locacao.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaLocacaoComServico() {
        Locacao locacao = new Servico(new LocacaoCarro());

        assertEquals("Carro/Servico", locacao.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaLocacaoComSeguro() {
        Locacao locacao = new Seguro(new LocacaoCarro());

        assertEquals("Carro/Seguro", locacao.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaLocacaoComLimpezaMaisServico() {
        Locacao locacao = new Limpeza(new Servico(new LocacaoCarro()));

        assertEquals("Carro/Servico/Limpeza", locacao.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaLocacaoComLimpezaMaisSeguro() {
        Locacao locacao = new Limpeza(new Seguro(new LocacaoCarro()));

        assertEquals("Carro/Seguro/Limpeza", locacao.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaLocacaoComServicoMaisSeguro() {
        Locacao locacao = new Servico(new Seguro(new LocacaoCarro()));

        assertEquals("Carro/Seguro/Servico", locacao.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaLocacaoComLimpezaMaisServicoMaisSeguro() {
        Locacao locacao = new Limpeza(new Servico(new Seguro(new LocacaoCarro())));

        assertEquals("Carro/Seguro/Servico/Limpeza", locacao.getEstrutura());
    }
}
