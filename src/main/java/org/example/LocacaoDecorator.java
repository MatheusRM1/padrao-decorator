package org.example;

public abstract class LocacaoDecorator implements Locacao{

    private Locacao locacao;
    public String estrutura;

    public LocacaoDecorator(Locacao locacao) {this.locacao = locacao;}

    public Locacao getLocacao(){ return locacao;}

    public void setLocacao(Locacao locacao) {this.locacao = locacao; }

    public abstract float getPercentualValor();

    public float getValor(){
        return this.locacao.getValor() * (1 + (this.getPercentualValor() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura(){ return this.locacao.getEstrutura() + "/" + this.getNomeEstrutura(); }

    public void setEstrutura(String estrutura) {this.estrutura = estrutura; }
}
