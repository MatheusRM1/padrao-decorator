package org.example;

public class Seguro extends LocacaoDecorator{

    public Seguro(Locacao locacao) {super(locacao);}

    public float getPercentualValor(){ return 10.0f;}

    public String getNomeEstrutura() {
        return "Seguro";
    }
}
