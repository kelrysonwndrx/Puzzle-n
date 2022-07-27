package br.com.poli.NPuzzle;
import java.util.Random;
public class PuzzleFacil extends Puzzle{
private int c;
private int d;

public PuzzleFacil(String nome,Dificuldade dificuldade, Tabuleiro tabuleiro)  {     // ele altera o tabuleiro grid
		super(nome, dificuldade);                                            // de Puzzle
		setGridPuzzle(tabuleiro);
		this.getGridPuzzle().geraTabuleiro(dificuldade);
		geraTabuleiro();
	}
public PuzzleFacil(String nome,Tabuleiro tabuleiro,Dificuldade dificuldade) {
	super(nome,dificuldade);
	setGridPuzzle(tabuleiro);
}
	
public void resolveTabuleiro() throws TempoExcedido {                        // resolve tabuleiro
		
	while(acharnumero(1)[0]!=0 || acharnumero(1)[1]!=0) {
			achar0();
		if(acharnumero(1)[0]==0 && acharnumero(1)[1]==0) {
			
		}
		else {
			if(acharnumero(1)[0]==1 && acharnumero(1)[1]==0) {
				if(d>acharnumero(1)[1]) {
					while(c!=acharnumero(1)[0]-1) {
						getGridPuzzle().executaMovimento(c-1, d, "baixo");
						achar0();
					}
					while(d!=acharnumero(1)[1]) {
						getGridPuzzle().executaMovimento(c,d-1,"direita");
						achar0();
					}
					getGridPuzzle().executaMovimento(acharnumero(1)[0],acharnumero(1)[1], "cima");
				}
				else {
					while(d!=acharnumero(1)[1]+1) {
						getGridPuzzle().executaMovimento(c, d+1,"esquerda");
						achar0();
					}
					while (c!=acharnumero(1)[0]-1) {
						getGridPuzzle().executaMovimento(c-1, d, "baixo");
						achar0();
					}
					while(d!=acharnumero(1)[1]) {
						getGridPuzzle().executaMovimento(c, d-1, "direita");
						achar0();
					}
					getGridPuzzle().executaMovimento(acharnumero(1)[0], acharnumero(1)[1],"cima");
				}
			}
			else if (acharnumero(1)[0]==0 && acharnumero(1)[1]==1) {
				if(c!=acharnumero(1)[0]) {
				while(d!=acharnumero(1)[1]-1) {
					getGridPuzzle().executaMovimento(c, d-1, "direita");
					achar0();
				}
				while(c!=acharnumero(1)[0]) {
					getGridPuzzle().executaMovimento(c-1, d, "baixo");
					achar0();
				}
				getGridPuzzle().executaMovimento(acharnumero(1)[0],acharnumero(1)[1], "esquerda");
				}
				else {
					while(c!=acharnumero(1)[0]+1) {
						getGridPuzzle().executaMovimento(c+1,d, "cima");
						achar0();
					}
					while(d!=acharnumero(1)[1]-1) {
						getGridPuzzle().executaMovimento(c, d-1, "direita");
						achar0();
					}
					while(c!=acharnumero(1)[0]) {
						getGridPuzzle().executaMovimento(c-1, d, "baixo");
						achar0();
					}
					getGridPuzzle().executaMovimento(acharnumero(1)[0], acharnumero(1)[1], "esquerda");
				}
				}
			else if (acharnumero(1)[0]==0 && acharnumero(1)[1]==2) {
				while(d!=acharnumero(1)[1]-1) {
					getGridPuzzle().executaMovimento(c, d-1, "direita");
					achar0();
				}
				while (c!=acharnumero(1)[0]) {
					getGridPuzzle().executaMovimento(c-1, d, "baixo");
					achar0();
				}
				getGridPuzzle().executaMovimento(acharnumero(1)[0], acharnumero(1)[1], "esquerda");
			}
			else if (acharnumero(1)[0]==2 && acharnumero(1)[1]==0) {
				while(c!=acharnumero(1)[0]-1) {
					getGridPuzzle().executaMovimento(c-1, d, "baixo");
					achar0();
				}
				while(d!=acharnumero(1)[1]) {
					getGridPuzzle().executaMovimento(c, d-1, "direita");
					achar0();
				}
				getGridPuzzle().executaMovimento(acharnumero(1)[0],acharnumero(1)[1], "cima");
			}
			else if (acharnumero(1)[0]==acharnumero(1)[1]) {
				if(c>acharnumero(1)[0]) {
					while(d!=acharnumero(1)[1]-1) {
						getGridPuzzle().executaMovimento(c, d-1, "direita");
						achar0();
					}
					while(c!=acharnumero(1)[0]) {
						getGridPuzzle().executaMovimento(c-1, d, "baixo");
						achar0();
					}
					getGridPuzzle().executaMovimento(acharnumero(1)[0],acharnumero(1)[0], "esquerda");
				}
				else {
					while(c!=acharnumero(1)[0]-1) {
					getGridPuzzle().executaMovimento(c-1, d, "baixo");
					achar0();
				}
				while(d!=acharnumero(1)[1]) {
					getGridPuzzle().executaMovimento(c, d-1, "direita");
					achar0();
				}
				getGridPuzzle().executaMovimento(acharnumero(1)[0],acharnumero(1)[1],"cima");
				}
			}
			else if (acharnumero(1)[0]==1 && acharnumero(1)[1]==2) {
				while(d!=acharnumero(1)[1]-1) {
					getGridPuzzle().executaMovimento(c, d-1, "direita");
					achar0();
				}
				while(c!=acharnumero(1)[0]) {
					getGridPuzzle().executaMovimento(c-1, d, "baixo");
					achar0();
				}
				getGridPuzzle().executaMovimento(acharnumero(1)[0],acharnumero(1)[1],"esquerda");
			}
			else if (acharnumero(1)[0]==2 && acharnumero(1)[1]==1) {
				while (c!=acharnumero(1)[0]-1) {
					getGridPuzzle().executaMovimento(c-1, d, "baixo");
					achar0();
				}
				while(d!=acharnumero(1)[1]) {
					getGridPuzzle().executaMovimento(c, d-1, "direita");
					achar0();
				}
				getGridPuzzle().executaMovimento(acharnumero(1)[0], acharnumero(1)[1], "cima");
			}
		}
		achar0();
		}
	if(acharnumero(3)[0]!=0 || acharnumero(3)[1]!=2 ) {
		achar0();
		if(acharnumero(3)[0]==0 && acharnumero(3)[1]==2) {
			
		}
		else if(d == acharnumero(3)[1]) {
			if(acharnumero(3)[0] == 0 && acharnumero(3)[1] ==1) {
				while(d-1!=acharnumero(3)[1]) {
					getGridPuzzle().executaMovimento(c, d+1, "esquerda");
					achar0();
				}
			}
			
			
			
			
			
		}
		
		
	
		}
	
		
	}
	

public void geraTabuleiro()  {                                   // ele faz determinada quantidade  
	                                                           // de movimentos
Random a = new Random();

  for(int b=0;b<200;) {
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
  while (getGridPuzzle().getGrid()[2][2].getValor()!=0) {
		achar0();
		if(c<2) {
			c=c+1;
			getGridPuzzle().executaMovimento(c, d, "cima");
		} else if(d<2) {
			d=d+1;
			getGridPuzzle().executaMovimento(c, d, "esquerda");
		}
	}
	getGridPuzzle().setNdemovimentos(0);	
	
}

public void achar0() {                                     // ele pega a abscissa e a ordenada da posição
	for(int x=0;x<getGridPuzzle().getK();x++) {           // do zero para usar no geratabuleiro
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
public int[] acharnumero(int num) {
	int[] posicao = new int[2];
	for(int x=0;x<getGridPuzzle().getK();x++) {                 // do zero para usar no geratabuleiro
		for(int y=0;y<getGridPuzzle().getK();y++) {
		    if(getGridPuzzle().getGrid()[x][y].getValor()==num) {
		    	posicao[0] = x;
		    	posicao[1] = y;
		    	return posicao;
		    }
		    else {
		    	
		    }
		}
	}
	return null;
}

}
