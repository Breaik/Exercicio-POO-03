package com.aula06;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        Lutador l0 = new Lutador("Kratos","Grécia",38,30,0,0,1.98f,100);
        Lutador l1 = new Lutador("Zeus", "Grécia", 150,50,0,0,2.05f,110);
        Lutador l2 = new Lutador("Poseidon","Grécia",98,12,0,0,1.80f,65);
        Lutador l3 = new Lutador("Hercules","Portugal",22,25,1,2,1.75f,61.5f);
        Lutador l4 = new Lutador("Bolsonaro", "Brasil", 65, 0,0,0,1.77f,78);
        Lutador l5 = new Lutador("Lula","Brasil",70,0,0,0,1.65f,79);

//----------------------------------------------------------------------------------------------------------------------

        Luta ufc1 = new Luta();
        ufc1.marcarLuta(l4,l5);
        ufc1.lutar();
        
  //----------------------------------------------------------------------------------------------------------------------

    }
}
