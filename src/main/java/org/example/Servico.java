package org.example;

public class Servico extends LocacaoDecorator{

    public Servico(Locacao locacao) {super(locacao);}

    public float getPercentualValor(){ return 5.0f;}

    public String getNomeEstrutura() {
        return "Servico";
    }
}
