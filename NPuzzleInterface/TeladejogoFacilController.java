package br.com.poli.NPuzzleInterface;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.poli.NPuzzle.Dificuldade;
import br.com.poli.NPuzzle.Puzzle;
import br.com.poli.NPuzzle.PuzzleFacil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TeladejogoFacilController implements Initializable {
    @FXML
    private Label Nome;
    private Dificuldade dificuldade=Dificuldade.FACIL;
    private static Puzzle puzzlejogador;
    @FXML
    private GridPane gridmovimento;
    @FXML
    private GridPane GridPanejogo;
    @FXML
    private Button Bot�o00;
    @FXML
    private Button Bot�o01;
    @FXML
    private Button Bot�o02;
    @FXML
    private Button Bot�o10;
    @FXML
    private Button Bot�o11;
    @FXML
    private Button Bot�o12;
    @FXML
    private Button Bot�o20;
    @FXML
    private Button Bot�o21;
    @FXML
    private Button Bot�o22;
    @FXML
    private Label ndemovimentos;
    @FXML
    private Button Bot�ofinalizador;
    @FXML
    private Button Bot�oIA;
    
    private PuzzleFacil puzzlefacil;
   
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Nome.setText(TeladeinicioController.getNomedojogadorsalvo());
		puzzlejogador = new Puzzle(Nome.getText(),dificuldade);
		puzzlejogador.iniciaPartida();
		puzzlefacil = new PuzzleFacil(puzzlejogador.getJogador().getNome(),puzzlejogador.getGridPuzzle(),puzzlejogador.getDificuldade());
		printaPuzzle();
		
    Bot�oIA.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				puzzlefacil.resolveTabuleiro();
				puzzlejogador.setGridPuzzle(puzzlefacil.getGridPuzzle());
				puzzlejogador.getGridPuzzle().printaTabuleiro();
			}
		});
		
	Bot�o00.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(0,0); 
				printaPuzzle();
			}
		});
		Bot�o01.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(0,1); 
				printaPuzzle();
			}
		});
		Bot�o02.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(0,2); 
				printaPuzzle();
			}
		});
		
		Bot�o10.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(1,0); 
				printaPuzzle();
			}
		});
		Bot�o11.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(1,1); 
				printaPuzzle();
			}
		});
		Bot�o12.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(1,2); 
				printaPuzzle();
			}
		});
		Bot�o20.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(2,0); 
				printaPuzzle();
			}
		});
		Bot�o21.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(2,1); 
				printaPuzzle();
			}
		});
		Bot�o22.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(2,2); 
				printaPuzzle();
			}
		});
		
	    Bot�ofinalizador.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	    	public void handle (ActionEvent event) {
	    		puzzlejogador.isFimdeJogo();
	    		finaliza��odojogo();
	
	    	}
	    });
	}
	
	public void printaPuzzle() {
		if(puzzlejogador.getGridPuzzle().getGrid()[0][0].getValor()!=0) {
			Bot�o00.setVisible(true);
Bot�o00.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][0].getValor()));
		} else {
			Bot�o00.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[0][1].getValor()!=0) {
			Bot�o01.setVisible(true);
Bot�o01.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][1].getValor()));
		}else {
			Bot�o01.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[0][2].getValor()!=0) {
			Bot�o02.setVisible(true);
Bot�o02.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][2].getValor()));
		}else {
			Bot�o02.setVisible(false);
		}	
		if(puzzlejogador.getGridPuzzle().getGrid()[1][0].getValor()!=0) {
			Bot�o10.setVisible(true);
Bot�o10.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][0].getValor()));
		}else {
			Bot�o10.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[1][1].getValor()!=0) {
			Bot�o11.setVisible(true);
Bot�o11.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][1].getValor()));
		}else {
			Bot�o11.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[1][2].getValor()!=0) {
			Bot�o12.setVisible(true);
Bot�o12.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][2].getValor()));
		}else {
			Bot�o12.setVisible(false);
		}	
		if(puzzlejogador.getGridPuzzle().getGrid()[2][0].getValor()!=0) {
			Bot�o20.setVisible(true);
Bot�o20.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][0].getValor()));
		}else {
			Bot�o20.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[2][1].getValor()!=0) {
			Bot�o21.setVisible(true);
Bot�o21.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][1].getValor()));
		}else {
			Bot�o21.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[2][2].getValor()!=0) {
			Bot�o22.setVisible(true);
Bot�o22.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][2].getValor()));
		}else {
			Bot�o22.setVisible(false);
		}
		ndemovimentos.setText(String.valueOf(puzzlejogador.getGridPuzzle().getNdemovimentos()));
		
	}
	public void finaliza��odojogo() {
		MaindateladejogoFacil.getStage().close();
		
		Mainteladoranking a = new Mainteladoranking();
		try {
			a.start(new Stage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void movimentoinvalido() {
		Alert erro = new Alert(AlertType.WARNING);
	       erro.setContentText("Movimento inv�lido");
	       erro.setTitle("Aviso");
	       erro.show();
	}
	
	
	public void verifica��omovimenta��o(int x, int y) {
			if(puzzlejogador.getGridPuzzle().isMovimentoValido(x, y, "cima")==true) {
				puzzlejogador.getGridPuzzle().executaMovimento(x, y, "cima");
			}
			else if (puzzlejogador.getGridPuzzle().isMovimentoValido(x, y, "esquerda")==true) {
				puzzlejogador.getGridPuzzle().executaMovimento(x, y, "esquerda");
			}	
			else if (puzzlejogador.getGridPuzzle().isMovimentoValido(x, y, "direita")==true) {
				puzzlejogador.getGridPuzzle().executaMovimento(x, y, "direita");
			}
			else if (puzzlejogador.getGridPuzzle().isMovimentoValido(x, y, "baixo")==true) {
				puzzlejogador.getGridPuzzle().executaMovimento(x, y, "baixo");
			}
		     else {
			movimentoinvalido();
		}
	}

	public static Puzzle getPuzzlejogador() {
		return puzzlejogador;
	}
	
	

}
