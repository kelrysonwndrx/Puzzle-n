package br.com.poli.NPuzzle;

public class Bloco {
    private int valor;
    private boolean valido;
    private int N;
public Bloco(int valor,int valorN){
	    this.N = valorN;
    	setValor(valor);
    }
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		if(valor>=0 && valor<N) {
		if(valor == 0) {
			this.valido = true;
		this.valor = valor;
		} else {
			this.valido = false;
		this.valor = valor;
		}
		}
		
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
}
