package br.com.poli.NPuzzle;

public class Facilitadorranking implements Comparable<Facilitadorranking>{

	private String nome;
	private Double pontuação;
	private String Dificuldade;
	private Double tempoemmin;
	public Facilitadorranking(String nome2, Double pontuaçãoreal, String Dificuldade2, Double temporeal) {
		setNome(nome2);
		setPontuação(pontuaçãoreal);
		setDificuldade(Dificuldade2);
		setTempoemmin(temporeal);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPontuação() {
		return pontuação;
	}
	public void setPontuação(Double pontuaçãoreal) {
		this.pontuação = pontuaçãoreal;
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
		if(this.pontuação> o.getPontuação()) {
			return -1;
		}else if(this.pontuação<o.getPontuação()) {
			return 1;
		}else {
		return 0;
		}
	}
	
	
}
