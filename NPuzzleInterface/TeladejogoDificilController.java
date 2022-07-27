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
    private Button Bot�o00;
    @FXML
    private Button Bot�o01;
    @FXML
    private Button Bot�o02;
    @FXML
    private Button Bot�o03;
    @FXML
    private Button Bot�o04;
    @FXML
    private Button Bot�o10;
    @FXML
    private Button Bot�o11;
    @FXML
    private Button Bot�o12;
    @FXML
    private Button Bot�o13;
    @FXML
    private Button Bot�o14;
    @FXML
    private Button Bot�o20;
    @FXML
    private Button Bot�o21;
    @FXML
    private Button Bot�o22;
    @FXML
    private Button Bot�o23;
    @FXML
    private Button Bot�o24;
    @FXML
    private Button Bot�o30;
    @FXML
    private Button Bot�o31;
    @FXML
    private Button Bot�o32;
    @FXML
    private Button Bot�o33;
    @FXML
    private Button Bot�o34;
    @FXML
    private Button Bot�o40;
    @FXML
    private Button Bot�o41;
    @FXML
    private Button Bot�o42;
    @FXML
    private Button Bot�o43;
    @FXML
    private Button Bot�o44;
    @FXML
    private Label ndemovimentos;
    @FXML
    private Button Bot�ofinalizador;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Nome.setText(TeladeinicioController.getNomedojogadorsalvo());
		puzzlejogador = new Puzzle(Nome.getText(),dificuldade);
		puzzlejogador.iniciaPartida();
		printaPuzzle();
		
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
		
		Bot�o03.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(0,3);
				printaPuzzle();
			}
		});
		Bot�o04.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(0,4);
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
		Bot�o13.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(1,3);
				printaPuzzle();
			}
		});
		Bot�o14.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(1,4);
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
		Bot�o23.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(2,3);
				printaPuzzle();
			}
		});
		Bot�o24.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(2,4);
				printaPuzzle();
			}
		});
		Bot�o30.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(3,0);
				printaPuzzle();
				
			}
			
		});
		Bot�o31.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(3,1);
				printaPuzzle();
				
			}
			
		});
		Bot�o32.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(3,2);
				printaPuzzle();
				
			}
			
		});
		Bot�o33.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(3,3);
				printaPuzzle();
				
			}
			
		});
		Bot�o34.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(3,4);
				printaPuzzle();
			}
		});
		Bot�o40.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(4,0);
				printaPuzzle();
			}
		});
		Bot�o41.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(4,1);
				printaPuzzle();
			}
		});
		Bot�o42.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(4,2);
				printaPuzzle();
			}
		});
		Bot�o43.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(4,3);
				printaPuzzle();
			}
		});
		Bot�o44.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				verifica��omovimenta��o(4,4);
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
		if(puzzlejogador.getGridPuzzle().getGrid()[0][3].getValor()!=0) {
			Bot�o03.setVisible(true);
Bot�o03.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][3].getValor()));
		}else {
			Bot�o03.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[0][4].getValor()!=0) {
			Bot�o04.setVisible(true);
			Bot�o04.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[0][4].getValor()));
		} else {
			Bot�o04.setVisible(false);
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
		if(puzzlejogador.getGridPuzzle().getGrid()[1][3].getValor()!=0) {
			Bot�o13.setVisible(true);
Bot�o13.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][3].getValor()));
		}else {
			Bot�o13.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[1][4].getValor()!=0) {
			Bot�o14.setVisible(true);
			Bot�o14.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[1][4].getValor()));
		} else {
			Bot�o14.setVisible(false);
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
		}if(puzzlejogador.getGridPuzzle().getGrid()[2][3].getValor()!=0) {
			Bot�o23.setVisible(true);
Bot�o23.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][3].getValor()));
		}else {
			Bot�o23.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[2][4].getValor()!=0) {
			Bot�o24.setVisible(true);
			Bot�o24.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[2][4].getValor()));
		} else {
			Bot�o24.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[3][0].getValor()!=0) {
			Bot�o30.setVisible(true);
Bot�o30.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][0].getValor()));
		}else {
			Bot�o30.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[3][1].getValor()!=0) {
			Bot�o31.setVisible(true);
Bot�o31.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][1].getValor()));
		}else {
			Bot�o31.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[3][2].getValor()!=0) {
			Bot�o32.setVisible(true);
Bot�o32.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][2].getValor()));
		}else {
			Bot�o32.setVisible(false);
		}if(puzzlejogador.getGridPuzzle().getGrid()[3][3].getValor()!=0) {
			Bot�o33.setVisible(true);
Bot�o33.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][3].getValor()));
		}else {
			Bot�o33.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[3][4].getValor()!=0) {
			Bot�o34.setVisible(true);
			Bot�o34.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[3][4].getValor()));
		} else {
			Bot�o34.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][0].getValor()!=0) {
			Bot�o40.setVisible(true);
			Bot�o40.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][0].getValor()));
		} else {
			Bot�o40.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][1].getValor()!=0) {
			Bot�o41.setVisible(true);
			Bot�o41.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][1].getValor()));
		} else {
			Bot�o41.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][2].getValor()!=0) {
			Bot�o42.setVisible(true);
			Bot�o42.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][2].getValor()));
		} else {
			Bot�o42.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][3].getValor()!=0) {
			Bot�o43.setVisible(true);
			Bot�o43.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][3].getValor()));
		} else {
			Bot�o43.setVisible(false);
		}
		if(puzzlejogador.getGridPuzzle().getGrid()[4][4].getValor()!=0) {
			Bot�o44.setVisible(true);
			Bot�o44.setText(String.valueOf(puzzlejogador.getGridPuzzle().getGrid()[4][4].getValor()));
		} else {
			Bot�o44.setVisible(false);
		}
		ndemovimentos.setText(String.valueOf(puzzlejogador.getGridPuzzle().getNdemovimentos()));
	}
	public void finaliza��odojogo() {
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

	public static void setPuzzlejogador(Puzzle puzzlejogador) {
		TeladejogoDificilController.puzzlejogador = puzzlejogador;
	}
	
	

}
