package com.example.ia2.IA2;

import java.util.Scanner;

public class InteligencaArtificial {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Determine um numero qualquer para criar o labirinto: ");
        Labirinto labirinto = new Labirinto(sc.nextInt());
        labirinto.exibirLabirinto();

        AgenteLabirinto agente = new AgenteLabirinto(labirinto);
        int a, b;
        System.out.println("Se ouver x posições pode pegar apartir de 0 ,0 ou 0 e última posição na linha....: ");
        System.out.println("Entre com a posição x o correto é sempre a primeira posição do array = 0: ");

        a = sc.nextInt();
        System.out.println("Entre com a posição y se não for 0 legal que seja a ultima posição da linha  : ");
        b = sc.nextInt();

        agente.setPosicao(new PosicaoXY(a, b));
        sc.close();

        while (agente.isAindaLimpando()) {
            agente.zerarPilha();
            agente.movimentar();
            labirinto.exibirLabirinto();
            Thread.sleep(1000);
        }
        return;
    }
}
