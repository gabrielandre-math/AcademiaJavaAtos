package com.projetofinaljava.model;

public class Eletronico extends ProdutoBase {
    private int garantiaMeses;

    //Construtores
    public Eletronico() {
    }
    public Eletronico(String nome, double preco, int garantiaMeses, int quantidade) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    //Métodos Getters
    public int getGarantiaMeses() {
        return garantiaMeses;
    }
    @Override
    public String getTipo() {
        return "Eletrônico";
    }

    //Métodos Setters
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = verificarCampoInt(garantiaMeses);
    }

    @Override
    public String exibirDetalhes() {
        return "Nome: \n" +
                this.getNome() + "Preco: \n" +
                this.getPreco() + "Quantidade: \n" +
                this.getQuantidade() +
                "Garantia Meses: \n" + this.getGarantiaMeses();
    }
}
