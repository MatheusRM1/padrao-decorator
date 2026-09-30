package org.example;

public class Limpeza extends LocacaoDecorator{

    public Limpeza(Locacao locacao) {super(locacao);}

    public float getPercentualValor(){ return 2.0f;}

    public String getNomeEstrutura() {
        return "Limpeza";
    }
}
