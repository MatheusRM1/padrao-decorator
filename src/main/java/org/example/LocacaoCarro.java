package org.example;

public class LocacaoCarro implements Locacao{

    public float preco;

    public LocacaoCarro(){}

    public LocacaoCarro(float preco){ this.preco = preco; }

    public float getValor(){ return preco; }

    public String getEstrutura() {
        return "Carro";
    }
}
