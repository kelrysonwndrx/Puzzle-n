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
    private Button Botão00;
    @FXML
    private Button Botão01;
    @FXML
    private Button Botão02;
    @FXML
    private Button Botão10;
    @FXML
    private Button Botão11;
    @FXML
    private Button Botão12;
    @FXML
    private Button Botão20;
    @FXML
    private Button Botão21;
    @FXML
    private Button Botão22;
    @FXML
    private Label ndemovimentos;
    @FXML
    private Button Botãofinalizador;
    @FXML
    private Button BotãoIA;
    
    private PuzzleFacil puzzlefacil;
   
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Nome.setText(TeladeinicioController.getNomedojogadorsalvo());
		puzzlejogador = new Puzzle(Nome.getText(),dificuldade);
		puzzlejogador.iniciaPartida();
		puzzlefacil = new PuzzleFacil(puzzlejogador.getJogador().getNome(),puzzlejogador.getGridPuzzle(),puzzlejogador.getDificuldade());
		printaPuzzle();
		
    BotãoIA.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				puzzlefacil.resolveTabuleiro();
				puzzlejogador.setGridPuzzle(puzzlefacil.getGridPuzzle());
				puzzlejogador.getGridPuzzle().printaTabuleiro();
			}
		});
		
	Botão00.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(0,0); 
				printaPuzzle();
			}
		});
		Botão01.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(0,1); 
				printaPuzzle();
			}
		});
		Botão02.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(0,2); 
				printaPuzzle();
			}
		});
		
		Botão10.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(1,0); 
				printaPuzzle();
			}
		});
		Botão11.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(1,1); 
				printaPuzzle();
			}
		});
		Botão12.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(1,2); 
				printaPuzzle();
			}
		});
		Botão20.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(2,0); 
				printaPuzzle();
			}
		});
		Botão21.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(2,1); 
				printaPuzzle();
			}
		});
		Botão22.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(2,2); 
				printaPuzzle();
			}
		});
		
	    Botãofinalizador.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	    	public void handle (ActionEvent event) {
	    		puzzlejogador.isFimdeJogo();
	    		finalizaçãodojogo();
	
	    	}
	    });
	}
	
	public void printaPuzzle() {
		if(puzzlejogador.getGridPuzzle().getGrid()[0][0].getValor()!=0) {
			Botão00.setVisible(true);
Botão00.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][0].getValor()));
		} else {
			Botão00.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[0][1].getValor()!=0) {
			Botão01.setVisible(true);
Botão01.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][1].getValor()));
		}else {
			Botão01.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[0][2].getValor()!=0) {
			Botão02.setVisible(true);
Botão02.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][2].getValor()));
		}else {
			Botão02.setVisible(false);
		}	
		if(puzzlejogador.getGridPuzzle().getGrid()[1][0].getValor()!=0) {
			Botão10.setVisible(true);
Botão10.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][0].getValor()));
		}else {
			Botão10.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[1][1].getValor()!=0) {
			Botão11.setVisible(true);
Botão11.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][1].getValor()));
		}else {
			Botão11.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[1][2].getValor()!=0) {
			Botão12.setVisible(true);
Botão12.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][2].getValor()));
		}else {
			Botão12.setVisible(false);
		}	
		if(puzzlejogador.getGridPuzzle().getGrid()[2][0].getValor()!=0) {
			Botão20.setVisible(true);
Botão20.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][0].getValor()));
		}else {
			Botão20.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[2][1].getValor()!=0) {
			Botão21.setVisible(true);
Botão21.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][1].getValor()));
		}else {
			Botão21.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[2][2].getValor()!=0) {
			Botão22.setVisible(true);
Botão22.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][2].getValor()));
		}else {
			Botão22.setVisible(false);
		}
		ndemovimentos.setText(String.valueOf(puzzlejogador.getGridPuzzle().getNdemovimentos()));
		
	}
	public void finalizaçãodojogo() {
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
	       erro.setContentText("Movimento inválido");
	       erro.setTitle("Aviso");
	       erro.show();
	}
	
	
	public void verificaçãomovimentação(int x, int y) {
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
