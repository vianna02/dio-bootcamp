package com.petshop.model;

public class Pet {
    final String nome;
    private boolean limpo;

    public Pet(String nome){
        this.nome = nome;
        this.limpo = false;
    }

    public String obterNome() {
        return nome;
    }

    public boolean estaLimpo(){
        return limpo;
    }

    public void limpar(){
        this.limpo = true;
    }

}
