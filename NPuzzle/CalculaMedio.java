package br.com.poli.NPuzzle;

public class CalculaMedio implements CalculaScore{

@Override
public int pontos(int qmm, int quantidadedemovimentos) {   // ele recebe a quantidade minima de movimentos
		int x;                                                //do resolveTabuleiro e a quantidade de movimentos
		int i=0;                                            // que o jogador fez durante a partida 
		do {                                               // e faz com que o o valor da pontuação seja 
		x=100-(quantidadedemovimentos-qmm);                // entre 100-0
		if(x<0) {
			i+=10;
			x=100-((quantidadedemovimentos-qmm)/i);
		}
		} while (x<0);
		return x;
	}

}
