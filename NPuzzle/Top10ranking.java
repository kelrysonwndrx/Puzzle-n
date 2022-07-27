package br.com.poli.NPuzzle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;


public class Top10ranking {
    private int[] posi�oes = new int[40];
	private ArrayList<Facilitadorranking> arquivos;
	
	
public Top10ranking() {
	arquivos = new ArrayList<Facilitadorranking>();
}


public ArrayList<Facilitadorranking> getArquivos() {
	return this.arquivos;
}

public static String read(String url) {
	
	String retorno = "";
	
	try {
		FileReader arq = new FileReader(url);
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = "";
		while(linha != null) {
			
				linha = lerArq.readLine();
				retorno += linha;
				linha = lerArq.readLine();
			}
			arq.close();
			
			
			} catch (IOException e) {
				
			retorno = "Erro: N�o foi poss�vel ler o arquivo";
			}
	if(retorno.contains("Erro")) {
		return "";
	}
	else {
		return retorno;
	}

	}

public static boolean write(String url, String text) {
	
	try {
		FileWriter arq = new FileWriter(url);
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.print(text);
		gravarArq.close();
		return true;
		
	}catch(IOException e) {
		System.out.println(e.getMessage());
		return false;
	}
	
	
}
public void salvainforma��es(String url, Puzzle jogador) {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	ArrayList<String> strings = new ArrayList();
	getDelimitadores(url,0,'-');
	String u = "";
	String pontua��o="";
	String dificuldade="";
	String tempo ="";
	Double temporeal = 0.0;
	Double pontua��oreal = 0.0;
	int tamanho = 0;
	for(int x=0;x<posi�oes.length;x++) {
		if(posi�oes[x]!=0) {
			tamanho++;
		}
	}
	for(int x=0;x<tamanho;x++) {
		if(x==0) {
			u = read(url).substring(0, posi�oes[x]);
		}
		else {
			u= read(url).substring(posi�oes[x-1]+1, posi�oes[x]);
		}
		strings.add(u);
	}
	int i=0;
	for(int x=0;x<strings.size();x++) {
		if(x==0 ||x==i*4) {
		 u = strings.get(x);
		} else if (x==1 ||x==i*4+1) {
			pontua��o = strings.get(x);
		} else if (x==2||x==i*4+2) {
			dificuldade = strings.get(x);
		}else {
			tempo= strings.get(x);
			temporeal = Double.valueOf(tempo);
			pontua��oreal = Double.valueOf(pontua��o);
		    Facilitadorranking c1 = new Facilitadorranking(u, pontua��oreal,dificuldade, temporeal);
			arquivos.add(c1);
			i++;
		}
	}
	pontua��oreal = (double) jogador.getPontos();
	temporeal = (double) jogador.getMinutoslevados();
	Facilitadorranking c2 = new Facilitadorranking(jogador.getJogador().getNome(),pontua��oreal,jogador.getDificuldade().toString(),temporeal);
	arquivos.add(c2);
	Collections.sort(arquivos);
	Writer clean;
	try {
		clean = new BufferedWriter(new FileWriter(url));
		clean.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	if(arquivos.size()>10) {
		i=10;
	}
	else {
		i=arquivos.size();
	}
	u="";
	for (int x=0;x<i;x++) {
		if(arquivos.get(x)!=null) {
			u+= arquivos.get(x).getNome()+"-"+arquivos.get(x).getPontua��o()+"-"+arquivos.get(x).getDificuldade()+"-"+arquivos.get(x).getTempoemmin()+"-";
		}
		
		}
	write(url,u);
	}

@SuppressWarnings("unchecked")
public void apenasabriroranking(String url) {
	@SuppressWarnings("rawtypes")
	ArrayList<String> strings = new ArrayList();
	getDelimitadores(url,0,'-');
	String u = "";
	String pontua��o="";
	String dificuldade="";
	String tempo ="";
	Double temporeal = 0.0;
	Double pontua��oreal = 0.0;
	int tamanho = 0;
	for(int x=0;x<posi�oes.length;x++) {
		if(posi�oes[x]!=0) {
			tamanho++;
		}
	}
	for(int x=0;x<tamanho;x++) {
		if(x==0) {
			u = read(url).substring(0, posi�oes[x]);
		}
		else {
			u= read(url).substring(posi�oes[x-1]+1, posi�oes[x]);
		}
		strings.add(u);
	}
	int i=0;
	for(int x=0;x<strings.size();x++) {
		if(x==0 ||x==i*4) {
		 u = strings.get(x);
		} else if (x==1 ||x==i*4+1) {
			pontua��o = strings.get(x);
		} else if (x==2||x==i*4+2) {
			dificuldade = strings.get(x);
		}else {
			tempo= strings.get(x);
			temporeal = Double.valueOf(tempo);
			pontua��oreal = Double.valueOf(pontua��o);
		    Facilitadorranking c1 = new Facilitadorranking(u, pontua��oreal,dificuldade, temporeal);
			arquivos.add(c1);
			i++;
		}
	}
}
public void getDelimitadores(String url, int b, char chs) {
	int c = 0 ;
	for (int i=b;i<read(url).length();i++) {
		if(read(url).charAt(i)== chs) {
			posi�oes [c] = i;
			c++;
		}
	}
}
}

