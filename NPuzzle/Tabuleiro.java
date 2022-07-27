package br.com.poli.NPuzzle;

public class Tabuleiro {
        private int k;
		private Bloco grid[][];
		private int N;
		private int Ndemovimentos=0;
public Tabuleiro () {
	     
	       }
		public void printaTabuleiro () {
			for(int x=0;x<k;x++) {
				for(int y=0;y<k;y++) {
					if(grid[x][y].getValor()==0) {
						System.out.print("_"+ "|");
					} else {
					System.out.print(grid[x][y].getValor()+"|");
					}
				}
				System.out.println(" ");
			}
			System.out.println("_____________________________\n");
			
		}
		
		public void executaMovimento(int x, int y, String movimento)  { 
		      if(isMovimentoValido(x,y,movimento)==true) {// se o metodo for verdade ele altera o valor
			if(movimento.equals("cima")) {               
					grid[x-1][y].setValor(grid[x][y].getValor());
					grid[x][y].setValor(0);
					this.Ndemovimentos++;
			} else if(movimento.equals("baixo")) {
				grid[x+1][y].setValor(grid[x][y].getValor());
				grid[x][y].setValor(0);
				this.Ndemovimentos++;
			} else if (movimento.equals("esquerda")) {
				grid[x][y-1].setValor(grid[x][y].getValor());
				grid[x][y].setValor(0);
				this.Ndemovimentos++;
			} else if (movimento.equals("direita")) {
				grid[x][y+1].setValor(grid[x][y].getValor());
				grid[x][y].setValor(0);
				this.Ndemovimentos++;
			}
			
			}else {
				try {
					throw new MovimentoInvalido();
				} catch (MovimentoInvalido e) {
					
					e.printStackTrace();
				}
				printaTabuleiro();
			}
	
	   }
		public boolean isTabuleiroOrdenado() {
			int z = 1;
			boolean ordenação = true;
			for(int x=0;x<k;x++) {
				for(int y=0;y<k;y++) {
					if(grid[x][y].getValor()== z ) {
						ordenação = true;
					} else if (x==k-1 && y==k-1) {
						if(grid[x][y].getValor()==0) {
							return true;
						}
					}else {
						return false;
					}
					z++;
					}
				}
			return ordenação;
			}
		public boolean isMovimentoValido(int x, int y, String movimento) {
			if(x>=0 && x<k && y>=0 && y<k) {
			if(movimento.equals("cima")) {            //ve se o parametro recibido de executamovimento
	    	if(x==0) {                               // se ele é valido na premissa jogo   
	    		       // se não for ele lança a exceção do tipo movimento
	    	}                                        // invalido
	    	else if(grid[x-1][y].getValor()==0) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
	    else if (movimento.equals("baixo")) {
	    	if(x==k-1) {
	    		return false;
	    	}
	    	else if (grid[x+1][y].getValor()==0) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
	    else if (movimento.equals("esquerda")) {
	    	if(y==0) {
	    		return false;
	    	}
	    	else if (grid[x][y-1].getValor()==0) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
	    else if (movimento.equals("direita")) {
	    	if(y==k-1) {
	    		return false;
	    	}
	    	else if(grid[x][y+1].getValor()==0) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
	    
			}
	    return false;
			
		}
		public void geraTabuleiro(Dificuldade Dificuldade) {
			if(Dificuldade.getValor()==8) {
				this.k=3;
				this.N=9;
			}
			else if (Dificuldade.getValor()==15) {
				this.k=4;
				this.N=16;
			}
			else if (Dificuldade.getValor()==24) {
				this.k=5;
				this.N=25;
			}
			else if (Dificuldade.getValor()>24) {
				this.N=Dificuldade.getValor()+1;
				this.k=(int) Math.pow(Dificuldade.getValor()+1,0.5);
			}
			int valor = 1;
			grid=new Bloco[k][k];
			for(int x=0;x<k;x++) {
				for(int y=0;y<k;y++) {
					grid[x][y]= new Bloco(valor,N);
					valor++;
				}
			}
		}
		public int getK() {
			return k;
		}
		public void setK(int k) {
			this.k = k;
		}
		public Bloco[][] getGrid() {
			return grid;
		}
		public int getNdemovimentos() {
			return Ndemovimentos;
		}
		public void setNdemovimentos(int ndemovimentos) {
			Ndemovimentos = ndemovimentos;
		}
		
		
		
}
