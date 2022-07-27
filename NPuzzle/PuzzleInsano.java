package br.com.poli.NPuzzle;

import java.util.Random;

public class PuzzleInsano extends Puzzle{
private int c;
private int d;
private int tamanho;
	public PuzzleInsano(String nome,Dificuldade dificuldade,Tabuleiro tabuleiro,int tamanho)  { // recebe um tamanho
		super(nome,dificuldade,tamanho);                                                // e gera um tabuleiro 
		this.tamanho=tamanho;                                             //aleatorio com o tamanho indicado
	    getDificuldade().setValor(this.tamanho*this.tamanho-1);
		setGridPuzzle(tabuleiro);
		this.getGridPuzzle().geraTabuleiro(dificuldade);
		geraTabuleiro();
	}
	
public void resolveTabuleiro() {
		
	}

public void geraTabuleiro() {
	
Random a = new Random();

  for(int b=0;b<5000;) {
	int q= a.nextInt(4)+1;
    achar0();
	if(q==1) {
		this.c=c+1;
		if(this.c<getGridPuzzle().getK()) {
			getGridPuzzle().executaMovimento(c, d, "cima");
			b++;
		}
		else {
			this.c=c+1;
		}
	}
	if(q==2) {
		this.c=c-1;
		if(this.c>=0) {
			getGridPuzzle().executaMovimento(c, d, "baixo");
			b++;
		}
		else {
			this.c=c-1;
		}
	}
	if(q==3) {
		this.d=d-1;
		if(this.d>=0) {
			getGridPuzzle().executaMovimento(c, d, "direita");
			b++;
		}
		else {
			this.d=d+1;
		}
	}
	if(q==4) {
		this.d=d+1;
		if(this.d<getGridPuzzle().getK()) {
			getGridPuzzle().executaMovimento(c, d, "esquerda");
			b++;
		}
		else {
			this.d=d-1;
		}
	}
}
  while (getGridPuzzle().getGrid()[tamanho-1][tamanho-1].getValor()!=0) {
		achar0();
		if(c<tamanho-1) {
			c=c+1;
			getGridPuzzle().executaMovimento(c, d, "cima");
		} else if(d<tamanho-1) {
			d=d+1;
			getGridPuzzle().executaMovimento(c, d, "esquerda");
		}
	}
getGridPuzzle().setNdemovimentos(0);
	
	
}

public void achar0() {
	for(int x=0;x<getGridPuzzle().getK();x++) {
		for(int y=0;y<getGridPuzzle().getK();y++) {
		    if(getGridPuzzle().getGrid()[x][y].getValor()==0) {
		    	this.c=x;
		    	this.d=y;
		    }
		    else {
		    	
		    }
		}
	}
}

}
