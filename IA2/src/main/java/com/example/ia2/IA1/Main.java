package com.example.ia2.IA1;

public class Main {
    public static void main(String[] args) throws InterruptedException	 {
        Labirinto labirinto = new Labirinto(5);
        labirinto.exibirLabirinto();

        AgenteLabirinto agente = new AgenteLabirinto(labirinto);
        agente.setPosicao(new PosicaoXY(1,1
        ));

        while(agente.isAindaLimpando()) {
            agente.zerarPilha();
            agente.movimentar();
            labirinto.exibirLabirinto();
            Thread.sleep(1000);
        }
        return;
    }
}
