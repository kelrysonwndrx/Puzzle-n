package br.com.poli.NPuzzleInterface;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.poli.NPuzzle.Dificuldade;
import br.com.poli.NPuzzle.Puzzle;
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


public class TeladejogoDificilController implements Initializable{
	@FXML
    private Label Nome;
    private Dificuldade dificuldade=Dificuldade.DIFICIL;
    private static Puzzle puzzlejogador;
    @FXML
    private GridPane GridPane;
    @FXML
    private GridPane gridmovimentos;
    @FXML
    private Button Botão00;
    @FXML
    private Button Botão01;
    @FXML
    private Button Botão02;
    @FXML
    private Button Botão03;
    @FXML
    private Button Botão04;
    @FXML
    private Button Botão10;
    @FXML
    private Button Botão11;
    @FXML
    private Button Botão12;
    @FXML
    private Button Botão13;
    @FXML
    private Button Botão14;
    @FXML
    private Button Botão20;
    @FXML
    private Button Botão21;
    @FXML
    private Button Botão22;
    @FXML
    private Button Botão23;
    @FXML
    private Button Botão24;
    @FXML
    private Button Botão30;
    @FXML
    private Button Botão31;
    @FXML
    private Button Botão32;
    @FXML
    private Button Botão33;
    @FXML
    private Button Botão34;
    @FXML
    private Button Botão40;
    @FXML
    private Button Botão41;
    @FXML
    private Button Botão42;
    @FXML
    private Button Botão43;
    @FXML
    private Button Botão44;
    @FXML
    private Label ndemovimentos;
    @FXML
    private Button Botãofinalizador;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Nome.setText(TeladeinicioController.getNomedojogadorsalvo());
		puzzlejogador = new Puzzle(Nome.getText(),dificuldade);
		puzzlejogador.iniciaPartida();
		printaPuzzle();
		
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
		
		Botão03.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(0,3);
				printaPuzzle();
			}
		});
		Botão04.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(0,4);
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
		Botão13.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(1,3);
				printaPuzzle();
			}
		});
		Botão14.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(1,4);
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
		Botão23.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(2,3);
				printaPuzzle();
			}
		});
		Botão24.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(2,4);
				printaPuzzle();
			}
		});
		Botão30.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(3,0);
				printaPuzzle();
				
			}
			
		});
		Botão31.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(3,1);
				printaPuzzle();
				
			}
			
		});
		Botão32.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(3,2);
				printaPuzzle();
				
			}
			
		});
		Botão33.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(3,3);
				printaPuzzle();
				
			}
			
		});
		Botão34.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(3,4);
				printaPuzzle();
			}
		});
		Botão40.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(4,0);
				printaPuzzle();
			}
		});
		Botão41.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(4,1);
				printaPuzzle();
			}
		});
		Botão42.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(4,2);
				printaPuzzle();
			}
		});
		Botão43.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(4,3);
				printaPuzzle();
			}
		});
		Botão44.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verificaçãomovimentação(4,4);
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
		if(puzzlejogador.getGridPuzzle().getGrid()[0][3].getValor()!=0) {
			Botão03.setVisible(true);
Botão03.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][3].getValor()));
		}else {
			Botão03.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[0][4].getValor()!=0) {
			Botão04.setVisible(true);
			Botão04.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][4].getValor()));
		} else {
			Botão04.setVisible(false);
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
		if(puzzlejogador.getGridPuzzle().getGrid()[1][3].getValor()!=0) {
			Botão13.setVisible(true);
Botão13.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][3].getValor()));
		}else {
			Botão13.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[1][4].getValor()!=0) {
			Botão14.setVisible(true);
			Botão14.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][4].getValor()));
		} else {
			Botão14.setVisible(false);
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
		}if(puzzlejogador.getGridPuzzle().getGrid()[2][3].getValor()!=0) {
			Botão23.setVisible(true);
Botão23.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][3].getValor()));
		}else {
			Botão23.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[2][4].getValor()!=0) {
			Botão24.setVisible(true);
			Botão24.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][4].getValor()));
		} else {
			Botão24.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[3][0].getValor()!=0) {
			Botão30.setVisible(true);
Botão30.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][0].getValor()));
		}else {
			Botão30.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[3][1].getValor()!=0) {
			Botão31.setVisible(true);
Botão31.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][1].getValor()));
		}else {
			Botão31.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[3][2].getValor()!=0) {
			Botão32.setVisible(true);
Botão32.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][2].getValor()));
		}else {
			Botão32.setVisible(false);
		}if(puzzlejogador.getGridPuzzle().getGrid()[3][3].getValor()!=0) {
			Botão33.setVisible(true);
Botão33.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][3].getValor()));
		}else {
			Botão33.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[3][4].getValor()!=0) {
			Botão34.setVisible(true);
			Botão34.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][4].getValor()));
		} else {
			Botão34.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][0].getValor()!=0) {
			Botão40.setVisible(true);
			Botão40.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][0].getValor()));
		} else {
			Botão40.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][1].getValor()!=0) {
			Botão41.setVisible(true);
			Botão41.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][1].getValor()));
		} else {
			Botão41.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][2].getValor()!=0) {
			Botão42.setVisible(true);
			Botão42.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][2].getValor()));
		} else {
			Botão42.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][3].getValor()!=0) {
			Botão43.setVisible(true);
			Botão43.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][3].getValor()));
		} else {
			Botão43.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][4].getValor()!=0) {
			Botão44.setVisible(true);
			Botão44.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][4].getValor()));
		} else {
			Botão44.setVisible(false);
		}
		ndemovimentos.setText(String.valueOf(puzzlejogador.getGridPuzzle().getNdemovimentos()));
	}
	public void finalizaçãodojogo() {
		MaindateladejogoDificil.getStage().close();
		
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

	public static void setPuzzlejogador(Puzzle puzzlejogador) {
		TeladejogoDificilController.puzzlejogador = puzzlejogador;
	}
	
	

}
