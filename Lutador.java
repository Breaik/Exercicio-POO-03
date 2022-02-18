package com.aula06;

public class Lutador implements Interface {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empate;
    private float altura, peso;

    public Lutador(String no, String na, int id, int vi, int de, int em, float al, float pe) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empate = em;
        this.altura = al;
        this.setPeso(pe);
    }

    //---------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    //-----------------------------------------------------------------------
    @Override
    public void apresentar() {
        System.out.println("__________________________________________");
        System.out.println("CHEGOU A HORA! Vamos aprensentar o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade() + " anos e " +this.getPeso()+"Kg");
        System.out.println("com Altura de: "+this.getAltura());
        System.out.println(this.getVitorias()+" Vitórias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpate()+ " Empates");
        System.out.println(this.getNome() + " é um peso "+this.getCategoria());
    }

    @Override
    public void status() {
        System.out.println("_____________________________________");
        System.out.println(this.getNome() +" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias() +" vezes");
        System.out.println("Perdeu "+this.getDerrotas() +" vezes");
        System.out.println("Empatou "+this.getEmpate() +" vezes");

    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpate(this.getEmpate()+1);
    }
}
