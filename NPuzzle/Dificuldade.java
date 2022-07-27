package br.com.poli.NPuzzle;

public enum Dificuldade {
         FACIL(8), NORMAL(15), DIFICIL(24),INSANO(0);
         private int dificuldade;
Dificuldade(int valor) {
     setValor(valor);
}
public int getValor() {
	return dificuldade;
}
public void setValor(int valor) {
	this.dificuldade = valor;
}

}
