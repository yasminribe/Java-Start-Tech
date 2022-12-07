package projetoFinal;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        int jogador = 1;
        int vencedor = jogo.verificarVencedor();
        jogo.mostrar();
        while (vencedor == 0){
            System.out.println("Jogador " + jogador);
            System.out.print("Linha: ");
            int linha = teclado.nextInt();
            System.out.print("Coluna: ");
            int coluna = teclado.nextInt();
            if (!jogo.efetuarJogada(jogador, linha-1, coluna-1)){
                System.out.println("Jogada inválida...");
            }else {
                jogador = (jogador == 1) ? 2 : 1;
            }
            jogo.mostrar();
            vencedor = jogo.verificarVencedor();
        }
        switch (vencedor) {
            case 1 -> System.out.println("Vencedor jogador 1");
            case 2 -> System.out.println("Vencedor jogador 2");
            case 3 -> System.out.println("Empate");
        }
    }
    private static final int[][] tabuleiro = new int[3][3];

    public JogoDaVelha() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = 0;
            }
        }
    }

    void mostrar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int verificarVencedor() {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == tabuleiro[i][1]) &&
                    (tabuleiro[i][0] == tabuleiro[i][2])) {
                if (tabuleiro[i][0] != 0) {
                    return tabuleiro[i][0];
                }
            }
        }
        for (int j = 0; j < 3; j++) {
            if ((tabuleiro[0][j] == tabuleiro[1][j]) &&
                    (tabuleiro[0][j] == tabuleiro[2][j]) &&
                    (tabuleiro[0][j] != 0)) {
                return tabuleiro[0][j];
            }
        }
        if ((tabuleiro[0][0] == tabuleiro[1][1]) &&
                (tabuleiro[0][0] == tabuleiro[2][2]) &&
                (tabuleiro[0][0] != 0)) {
            return tabuleiro[0][0];
        }
        if ((tabuleiro[0][2] == tabuleiro[1][1]) &&
                (tabuleiro[0][2] == tabuleiro[2][0]) &&
                (tabuleiro[0][2] != 0)) {
            return tabuleiro[0][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == 0) {
                    return 0;
                }
            }
        }
        return 3;
    }

    public boolean efetuarJogada(int jogador, int linha, int coluna) {
        if ((linha < 0) || (linha > 2)) {
            return false;
        }
        if ((coluna < 0) || (coluna > 2)) {
            return false;
        }
        if (tabuleiro[linha][coluna] != 0) {
            return false;
        }
        tabuleiro[linha][coluna] = jogador;
        return true;
    }
}
