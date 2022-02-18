package com.aula06;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
//______________________________________________________________________________________
    public void marcarLuta(Lutador p1, Lutador p2 ){
        if (p1.getCategoria().equals(p2.getCategoria()) && p1 != p2){
            this.aprovada = true;
            this.desafiado = p1;
            this.desafiante = p2;
        }
        else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada) {
            System.out.println("#### DESAFIADO ####");
            this.desafiado.apresentar();
            System.out.println("#### DESAFIANTE ####");
            this.desafiante.apresentar();
            System.out.println("==========================================");
        }
        else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    public void venceu(){
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        System.out.println("===== Resultado da Luta ====");
        switch (vencedor){
            case 0:
                System.out.println("Empatou!");
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
                break;
            case 1:
                System.out.println("Venceu o lutador "+this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                System.out.println("Venceu o lutador "+ this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }
    }
//______________________________________________________________________________________
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
