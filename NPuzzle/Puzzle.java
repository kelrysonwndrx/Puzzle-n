package br.com.poli.NPuzzle;
import java.util.Calendar;

public class Puzzle {
       private Jogador jogador;
       private Tabuleiro gridPuzzle;
       private int quantidadeMovimentos;
       private CalculaScore score;
       private boolean venceu;
       private Calendar tempo;
       private Dificuldade dificuldade;
       private int qmm=0;
       private int tamanho;
       private int minutoslevados;
       private int segundoslevados;
       private int pontos;
      
public Puzzle(String nome,Dificuldade dificuldade){         //construtor para Puzzle Facil,Medio,Dificil
	if(dificuldade.getValor()!=0) {
		this.jogador= new Jogador();
		this.jogador.setNome(nome);
		this.dificuldade=dificuldade;
	}
}
public Puzzle(String nome, Dificuldade dificuldade, int tamanho) {          // construtor para Puzzle Insano
	if(tamanho>5 && dificuldade.getValor()==0) {                                           // necessita dizer o tamanho
	if(dificuldade.getValor()==0) {
	this.jogador= new Jogador();
	this.jogador.setNome(nome);
	this.tamanho=tamanho;
	this.dificuldade=dificuldade;
	}
	}
}

public boolean isFimdeJogo() {
	this.quantidadeMovimentos=getGridPuzzle().getNdemovimentos();
	if(getGridPuzzle().isTabuleiroOrdenado()==true) {
		venceu=true;
	}
	if(venceu == true) {
		calculaTempo();
		if(this.dificuldade.equals(Dificuldade.FACIL)) {
			this.score= new CalculaFacil();
			this.pontos= -1*(score.pontos(qmm, quantidadeMovimentos));
		}else if (this.dificuldade.equals(Dificuldade.NORMAL)) {
			this.score= new CalculaMedio();
			this.pontos= -1*(score.pontos(qmm, quantidadeMovimentos));
		}else if (this.dificuldade.equals(Dificuldade.DIFICIL)) {
			this.score= new CalculaDificil();
			this.pontos= -1*(score.pontos(qmm, quantidadeMovimentos));
		}else if (this.dificuldade.equals(Dificuldade.INSANO)) {
			this.score= new CalculaInsano();
			this.pontos= -1*(score.pontos(qmm, quantidadeMovimentos));
		}
		this.pontos=score.pontos(qmm, quantidadeMovimentos);
		return true;
	} else {
	return false;
	}
}
public void iniciaPartida()  {
	this.quantidadeMovimentos = 0;
	tempo = Calendar.getInstance();
	this.venceu = false;
	this.gridPuzzle = new Tabuleiro();
	if(this.dificuldade.getValor()==8) {  //ele ve qual é dificuldade e cria um tabuleiro aleatorio a
                                          // a partir disso
	@SuppressWarnings("unused")
	PuzzleFacil p1 = new PuzzleFacil(this.jogador.getNome(),this.dificuldade,this.gridPuzzle);
	}
	else if (this.dificuldade.getValor()==15) {
	
	@SuppressWarnings("unused")
	PuzzleMedio p1 = new PuzzleMedio(this.jogador.getNome(),this.dificuldade,this.gridPuzzle);
	}
	else if (this.dificuldade.getValor()==24) {
	
	@SuppressWarnings("unused")
	PuzzleDificil p1 = new PuzzleDificil(this.jogador.getNome(),this.dificuldade,this.gridPuzzle);
	}
	else if (this.dificuldade.getValor()==0) {  // por ser insano é necessario indicar o tamanho para
                                               // gerar um tabuleiro aleatorio
	@SuppressWarnings("unused")
	PuzzleInsano p1 = new PuzzleInsano(this.jogador.getNome(),this.dificuldade,this.gridPuzzle,this.tamanho);
	}
}


public Tabuleiro getGridPuzzle() {
	return gridPuzzle;
}


public void setGridPuzzle(Tabuleiro tabuleiro) {
	this.gridPuzzle= tabuleiro;
}
public Dificuldade getDificuldade() {
	return dificuldade;
}
public void setDificuldade(Dificuldade dificuldade) {
	this.dificuldade = dificuldade;
}
public CalculaScore getScore() {
	return score;
}

public Jogador getJogador() {
	return jogador;
}
public void setJogador(Jogador jogador) {
	this.jogador = jogador;
}
public int getPontos() {
	return pontos;
}
public void setPontos(int pontos) {
	this.pontos = pontos;
}

public int getMinutoslevados() {
	return minutoslevados;
}
public void setMinutoslevados(int minutoslevados) {
	this.minutoslevados = minutoslevados;
}
public int getSegundoslevados() {
	return segundoslevados;
}
public void setSegundoslevados(int segundoslevados) {
	this.segundoslevados = segundoslevados;
}
@SuppressWarnings("static-access")
public void calculaTempo() {
	Calendar tempo2 = null;
	tempo2 =tempo2.getInstance();
	setMinutoslevados(calculaMinutos(tempo2));
	setSegundoslevados(calculaSegundos(tempo2));
}
@SuppressWarnings("deprecation")
public int calculaMinutos(Calendar tempo2) {
	return (tempo2.getTime().getHours()*60+tempo2.getTime().getMinutes()-(tempo.getTime().getHours()*60+tempo.getTime().getMinutes()));
	
}
@SuppressWarnings("deprecation")
public int calculaSegundos(Calendar tempo2) {
	if(tempo2.getTime().getSeconds()>tempo.getTime().getSeconds()) {
		return tempo2.getTime().getSeconds() - tempo.getTime().getSeconds();
	}else {
		return (-1)*(tempo2.getTime().getSeconds() - tempo.getTime().getSeconds());
	}
	
}


}
