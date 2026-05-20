package br.com.fiap.loja.model;

import java.util.Objects;

public class Produto {
    private int id;
    private double preco;
    private String nome;

    public Produto(int id, double preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calculardesconto(int porcentagem){

        return preco - (preco*porcentagem/100);

    }

    public double calcularDesconto(String cupom){
      int porcentagem = 0;
       if (Objects.equals(cupom, "FIAP15")){

            porcentagem = 15;

       } else if (Objects.equals(cupom, "FIAP30")){
            porcentagem = 30;

       }

        return preco;
    }
}
