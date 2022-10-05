package com.example.ia2.IA2;

import java.lang.reflect.Array;
import java.util.Random;

public class Labirinto {

    private int tamanhoLabirinto;

    private String[][] labirinto;

    private AgenteLabirinto agente;

    /* Valores
     * H - H20 - Agua
     * P - Poeira
     * S - Sujo
     * L - Limpo
     * *A* - Agente
     */

    public Labirinto(int tamanhoLabirinto) {
        this.tamanhoLabirinto = tamanhoLabirinto;
        this.construirNovoLabirinto();
    }

    // Construir o labirinto
    private void construirNovoLabirinto() {
        labirinto = new String[this.tamanhoLabirinto][this.tamanhoLabirinto];
        Random random = new Random();

        random.setSeed(4);

        for (int i = 0; i < this.tamanhoLabirinto; i++) {

            for (int j = 0; j < this.tamanhoLabirinto; j++) {
                char letra = (char) ('A' + Math.abs(random.nextInt() % 2));

                this.labirinto[i][j] = String.valueOf(letra);
            }
        }
    }

    public void exibirLabirinto() {
        atualizarPosicaoAgente();
        for (int i = 0; i < tamanhoLabirinto; i++) {
            for (int j = 0; j < tamanhoLabirinto; j++) {
                if (labirinto[i][j].equals("*R*")) {
                    System.out.print("|" + labirinto[i][j] + "|");
                } else {
                    System.out.print("| " + labirinto[i][j] + " |");
                }

            }
            System.out.println("");
        }
        System.out.println("");
    }

    private void atualizarPosicaoAgente() {
        if (this.agente != null) {
            PosicaoXY posAgente = this.agente.getPosicao();
            labirinto[posAgente.getPosX()][posAgente.getPosY()] = "*R*";
        }
    }

    public int getTamanhoLabirinto() {

        return this.tamanhoLabirinto;
    }

    public String retornarValorPosicaoLabirinto(PosicaoXY posicao) {
        return this.labirinto[posicao.getPosX()][posicao.getPosY()];
    }

    public void setAgente(AgenteLabirinto agente) {
        this.agente = agente;
    }

    public void limpar() {
        PosicaoXY posicao = this.agente.getPosicao();
        labirinto[posicao.getPosX()][posicao.getPosY()] = "L";
    }
}
