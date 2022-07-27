package br.com.poli.NPuzzle;

public class Facilitadorranking implements Comparable<Facilitadorranking>{

	private String nome;
	private Double pontua��o;
	private String Dificuldade;
	private Double tempoemmin;
	public Facilitadorranking(String nome2, Double pontua��oreal, String Dificuldade2, Double temporeal) {
		setNome(nome2);
		setPontua��o(pontua��oreal);
		setDificuldade(Dificuldade2);
		setTempoemmin(temporeal);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPontua��o() {
		return pontua��o;
	}
	public void setPontua��o(Double pontua��oreal) {
		this.pontua��o = pontua��oreal;
	}
	public String getDificuldade() {
		return Dificuldade;
	}
	public void setDificuldade(String dificuldade) {
		Dificuldade = dificuldade;
	}
	public Double getTempoemmin() {
		return tempoemmin;
	}
	public void setTempoemmin(Double temporeal) {
		this.tempoemmin = temporeal;
	}
	@Override
	public int compareTo(Facilitadorranking o) {
		if(this.pontua��o> o.getPontua��o()) {
			return -1;
		}else if(this.pontua��o<o.getPontua��o()) {
			return 1;
		}else {
		return 0;
		}
	}
	
	
}
