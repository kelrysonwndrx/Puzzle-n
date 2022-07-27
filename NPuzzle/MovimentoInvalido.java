package br.com.poli.NPuzzle;

@SuppressWarnings("serial")
public class MovimentoInvalido extends Exception {

	public MovimentoInvalido() {
		getMessage();
	}
	
public String getMessage() {
	return "Movimento Invalido";
}
}
