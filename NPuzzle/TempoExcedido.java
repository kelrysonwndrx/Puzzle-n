package br.com.poli.NPuzzle;

@SuppressWarnings("serial")
public class TempoExcedido extends RuntimeException {

	public String getMessage() {
		return "N alto demais! Muito processamento necessário para estas interações :(";
	}
}
