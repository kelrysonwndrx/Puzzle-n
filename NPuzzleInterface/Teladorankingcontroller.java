package br.com.poli.NPuzzleInterface;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.poli.NPuzzle.Top10ranking;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Teladorankingcontroller implements Initializable {
    @FXML
	private Button botãomenu;
    private  Top10ranking ranking;
    @FXML
    private Label situação;
    @FXML
    private Label quantosmovimentosfeitos;
    @FXML
    private Label tempo;
    @FXML
    private Label informações;
    @FXML
    private Label pontuação;
    @FXML
    private GridPane GridPaneranking;
    @FXML
    private Label rankingnome0;
    @FXML
    private Label rankingnome1;
    @FXML
    private Label rankingnome2;
    @FXML
    private Label rankingnome3;
    @FXML
    private Label rankingnome4;
    @FXML
    private Label rankingnome5;
    @FXML
    private Label rankingnome6;
    @FXML
    private Label rankingnome7;
    @FXML
    private Label rankingnome8;
    @FXML
    private Label rankingnome9;
    @FXML
    private Label rankingpontos0;
    @FXML
    private Label rankingpontos1;
    @FXML
    private Label rankingpontos2;
    @FXML
    private Label rankingpontos3;
    @FXML
    private Label rankingpontos4;
    @FXML
    private Label rankingpontos5;
    @FXML
    private Label rankingpontos6;
    @FXML
    private Label rankingpontos7;
    @FXML
    private Label rankingpontos8;
    @FXML
    private Label rankingpontos9;
    @FXML
    private Label rankingdificuldade0;
    @FXML
    private Label rankingdificuldade1;
    @FXML
    private Label rankingdificuldade2;
    @FXML
    private Label rankingdificuldade3;
    @FXML
    private Label rankingdificuldade4;
    @FXML
    private Label rankingdificuldade5;
    @FXML
    private Label rankingdificuldade6;
    @FXML
    private Label rankingdificuldade7;
    @FXML
    private Label rankingdificuldade8;
    @FXML
    private Label rankingdificuldade9;
    @FXML
    private Label rankingtempo0;
    @FXML
    private Label rankingtempo1;
    @FXML
    private Label rankingtempo2;
    @FXML
    private Label rankingtempo3;
    @FXML
    private Label rankingtempo4;
    @FXML
    private Label rankingtempo5;
    @FXML
    private Label rankingtempo6;
    @FXML
    private Label rankingtempo7;
    @FXML
    private Label rankingtempo8;
    @FXML
    private Label rankingtempo9;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ranking = new Top10ranking();
		if(TeladeinicioController.getDificuldadeescolhida().equals("")) {
			ranking.apenasabriroranking("ranking.txt");
			imprimirranking();
		}
		else if(TeladeinicioController.getDificuldadeescolhida().equals("FACIL")) {
			if(TeladejogoFacilController.getPuzzlejogador().isFimdeJogo()) {
				situação.setText("Você venceu");
				quantosmovimentosfeitos.setText("Movimentos feitos durante o jogo: "+String.valueOf(TeladejogoFacilController.getPuzzlejogador().getGridPuzzle().getNdemovimentos()));
				tempo.setText("Tempo de duração: "+String.valueOf(TeladejogoFacilController.getPuzzlejogador().getMinutoslevados()+":"+TeladejogoFacilController.getPuzzlejogador().getSegundoslevados()));
				pontuação.setText("Pontuação: "+String.valueOf(TeladejogoFacilController.getPuzzlejogador().getPontos()));
				quantosmovimentosfeitos.setVisible(true);
				tempo.setVisible(true);
				pontuação.setVisible(true);
				ranking.salvainformações("ranking.txt",TeladejogoFacilController.getPuzzlejogador());
				imprimirranking();
				
			} else {
				situação.setText("Você perdeu");
			}
		} else if (TeladeinicioController.getDificuldadeescolhida().equals("NORMAL")) {
			if(TeladejogoNormalController.getPuzzlejogador().isFimdeJogo()) {
				situação.setText("Você venceu");
				quantosmovimentosfeitos.setText("Movimentos feitos durante o jogo: "+String.valueOf(TeladejogoNormalController.getPuzzlejogador().getGridPuzzle().getNdemovimentos()));
				tempo.setText("Tempo de duração: "+String.valueOf(TeladejogoNormalController.getPuzzlejogador().getMinutoslevados()+":"+TeladejogoNormalController.getPuzzlejogador().getSegundoslevados()));
				pontuação.setText("Pontuação: "+String.valueOf(TeladejogoNormalController.getPuzzlejogador().getPontos()));
				quantosmovimentosfeitos.setVisible(true);
				tempo.setVisible(true);
				pontuação.setVisible(true);
				ranking.salvainformações("ranking.txt",TeladejogoNormalController.getPuzzlejogador());
				imprimirranking();
			}else {
				situação.setText("Você perdeu");
			}
		}else if (TeladeinicioController.getDificuldadeescolhida().equals("DIFICIL")) {
			if(TeladejogoDificilController.getPuzzlejogador().isFimdeJogo()) {
				situação.setText("Você venceu");
				quantosmovimentosfeitos.setText("Movimentos feitos durante o jogo: "+String.valueOf(TeladejogoDificilController.getPuzzlejogador().getGridPuzzle().getNdemovimentos()));
				tempo.setText("Tempo de duração: "+String.valueOf(TeladejogoDificilController.getPuzzlejogador().getMinutoslevados()+":"+TeladejogoDificilController.getPuzzlejogador().getSegundoslevados()));
				pontuação.setText("Pontuação: "+String.valueOf(TeladejogoDificilController.getPuzzlejogador().getPontos()));
				quantosmovimentosfeitos.setVisible(true);
				tempo.setVisible(true);
				pontuação.setVisible(true);
				ranking.salvainformações("ranking.txt",TeladejogoDificilController.getPuzzlejogador());
				imprimirranking();
			}else {
				situação.setText("Você perdeu");
			}
		}
		else if (TeladeinicioController.getDificuldadeescolhida().equals("INSANO")) {
			if(TeladejogoInsanoController.getPuzzlejogador().isFimdeJogo()) {
				situação.setText("Você venceu");
				quantosmovimentosfeitos.setText("Movimentos feitos durante o jogo: "+String.valueOf(TeladejogoInsanoController.getPuzzlejogador().getGridPuzzle().getNdemovimentos()));
				tempo.setText("Tempo de duração: "+String.valueOf(TeladejogoInsanoController.getPuzzlejogador().getMinutoslevados()+":"+TeladejogoInsanoController.getPuzzlejogador().getSegundoslevados()));
				pontuação.setText("Pontuação: "+String.valueOf(TeladejogoInsanoController.getPuzzlejogador().getPontos()));
				quantosmovimentosfeitos.setVisible(true);
				quantosmovimentosfeitos.setVisible(true);
				tempo.setVisible(true);
				pontuação.setVisible(true);
				ranking.salvainformações("ranking.txt",TeladejogoInsanoController.getPuzzlejogador());
				imprimirranking();
			}else {
				situação.setText("Você perdeu");
			}
		}
		else {
			situação.setVisible(false);
		}
    botãomenu.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent arg0) {
		Mainteladoranking.getStage().close();
		Main a = new Main();
		try {
			a.start(new Stage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
});



	}
	
	public void imprimirranking() {
		if(ranking.getArquivos().isEmpty()==false) {
			int x=0;
		    int y=ranking.getArquivos().size();
		    if(x<y) {
		if(ranking.getArquivos().get(0).equals(null)) {
			
		}else {
			rankingnome0.setText(ranking.getArquivos().get(0).getNome());
			rankingpontos0.setText(String.valueOf(ranking.getArquivos().get(0).getPontuação()));
			rankingdificuldade0.setText(ranking.getArquivos().get(0).getDificuldade());
			rankingtempo0.setText(String.valueOf(ranking.getArquivos().get(0).getTempoemmin()));
			x++;
		}
		    }
		    if(x<y) {
		 if(ranking.getArquivos().get(1).equals(null)) {
			
		}else {
			rankingnome1.setText(ranking.getArquivos().get(1).getNome());
			rankingpontos1.setText(String.valueOf(ranking.getArquivos().get(1).getPontuação()));
			rankingdificuldade1.setText(ranking.getArquivos().get(1).getDificuldade());
			rankingtempo1.setText(String.valueOf(ranking.getArquivos().get(1).getTempoemmin()));
			x++;
		}
		    }
		    if(x<y) {
		 if(ranking.getArquivos().get(2).equals(null)) {
			 
		 }else {
		rankingnome2.setText(ranking.getArquivos().get(2).getNome());
	    rankingpontos2.setText(String.valueOf(ranking.getArquivos().get(2).getPontuação()));
	    rankingdificuldade2.setText(ranking.getArquivos().get(2).getDificuldade());
	    rankingtempo2.setText(String.valueOf(ranking.getArquivos().get(2).getTempoemmin()));
	        x++;
			}
		   }
		
		if(x<y) {
		if(ranking.getArquivos().get(3).equals(null)) {
			 rankingnome3.setText("vazio");
			 rankingpontos3.setText("vazio");
			 rankingdificuldade3.setText("vazio");
			 rankingtempo3.setText("vazio");
		 }else {
		rankingnome3.setText(ranking.getArquivos().get(3).getNome());
	    rankingpontos3.setText(String.valueOf(ranking.getArquivos().get(3).getPontuação()));
	   rankingdificuldade3.setText(ranking.getArquivos().get(3).getDificuldade());
	   rankingtempo3.setText(String.valueOf(ranking.getArquivos().get(3).getTempoemmin()));
	   x++;
			}
		}
		if(x<y) {
		if(ranking.getArquivos().get(4).equals(null)) {
			 
		 }else {
		rankingnome4.setText(ranking.getArquivos().get(4).getNome());
	    rankingpontos4.setText(String.valueOf(ranking.getArquivos().get(4).getPontuação()));
	    rankingdificuldade4.setText(ranking.getArquivos().get(4).getDificuldade());
	    rankingtempo4.setText(String.valueOf(ranking.getArquivos().get(4).getTempoemmin()));
	    x++;
			}
		}
		if(x<y) {
		if(ranking.getArquivos().get(5).equals(null)) {
			 
		 }else {
		rankingnome5.setText(ranking.getArquivos().get(5).getNome());
	    rankingpontos5.setText(String.valueOf(ranking.getArquivos().get(5).getPontuação()));
	    rankingdificuldade5.setText(ranking.getArquivos().get(5).getDificuldade());
		rankingtempo5.setText(String.valueOf(ranking.getArquivos().get(5).getTempoemmin()));
		x++;
			}
		}
		if(x<y) {
		if(ranking.getArquivos().get(6).equals(null)) {
			 
		 }else {
		rankingnome6.setText(ranking.getArquivos().get(6).getNome());
	    rankingpontos6.setText(String.valueOf(ranking.getArquivos().get(6).getPontuação()));
	    rankingdificuldade6.setText(ranking.getArquivos().get(6).getDificuldade());
	    rankingtempo6.setText(String.valueOf(ranking.getArquivos().get(6).getTempoemmin()));
	    x++;
			}
		}
		if(x<y) {
		if(ranking.getArquivos().get(7).equals(null)) {
			 
		 }else {
		rankingnome7.setText(ranking.getArquivos().get(7).getNome());
	    rankingpontos7.setText(String.valueOf(ranking.getArquivos().get(7).getPontuação()));
	    rankingdificuldade7.setText(ranking.getArquivos().get(7).getDificuldade());
		rankingtempo7.setText(String.valueOf(ranking.getArquivos().get(7).getTempoemmin()));
		x++;
			}
		}
		if(x<y) {
		if(ranking.getArquivos().get(8).equals(null)) {
			 
		 }else {
		rankingnome8.setText(ranking.getArquivos().get(8).getNome());
	    rankingpontos8.setText(String.valueOf(ranking.getArquivos().get(8).getPontuação()));
	    rankingdificuldade8.setText(ranking.getArquivos().get(8).getDificuldade());
		rankingtempo8.setText(String.valueOf(ranking.getArquivos().get(8).getTempoemmin()));
		x++;
			}
		} 
		if(x<y) {
		if(ranking.getArquivos().get(9).equals(null)) {
			 
		 }else {
		rankingnome9.setText(ranking.getArquivos().get(9).getNome());
	    rankingpontos9.setText(String.valueOf(ranking.getArquivos().get(9).getPontuação()));
	    rankingdificuldade9.setText(ranking.getArquivos().get(9).getDificuldade());
		rankingtempo9.setText(String.valueOf(ranking.getArquivos().get(9).getTempoemmin()));
		x++;
			}
		}
	}
	}

}
