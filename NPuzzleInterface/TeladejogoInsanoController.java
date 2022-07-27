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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class TeladejogoInsanoController implements Initializable {
	
	@FXML
    private Label Nome;
    private Dificuldade dificuldade=Dificuldade.INSANO;
    private static Puzzle puzzlejogador;
	@FXML
	private Button Botãofinalizador;
	@FXML
	private Button BotãodeMovimento;
	@FXML
	private TextField FieldordenadaX;
	@FXML
	private TextField FieldordenadaY;
	@FXML
	private TextField TextMovimento;
	@FXML
	private Label ndemovimentos;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Nome.setText(TeladeinicioController.getNomedojogadorsalvo());
		System.out.println(TelatamanhoController.getTamanho());
		System.out.println(TeladeinicioController.getNomedojogadorsalvo());
		puzzlejogador = new Puzzle(Nome.getText(),this.dificuldade,TelatamanhoController.getTamanho());
		puzzlejogador.iniciaPartida();
		printaPuzzle();
		
	BotãodeMovimento.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent arg0) {
			if(ehInteiro(FieldordenadaX.getText())==true && ehInteiro(FieldordenadaY.getText())==true && TextMovimento.getText()!=null) {
			  if(puzzlejogador.getGridPuzzle().isMovimentoValido((int)Double.parseDouble(FieldordenadaX.getText()),(int)Double.parseDouble(FieldordenadaY.getText()),TextMovimento.getText())) {
			puzzlejogador.getGridPuzzle().executaMovimento((int)Double.parseDouble(FieldordenadaX.getText()),(int)Double.parseDouble(FieldordenadaY.getText()), TextMovimento.getText());
			for (int i = 0; i < 50; ++i)
			    System.out.println ();
			printaPuzzle();
			  }
			  else {
				  movimentoinvalido();
			  }
			}
			else {
				movimentoinvalido();
			}
			
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
	
	public void finalizaçãodojogo() {
		MaindateladejogoInsano.getStage().close();
		
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
	public boolean ehInteiro( String s ) {
	    char[] c = s.toCharArray();
	    boolean d = true;
	    for ( int i = 0; i < c.length; i++) {      
	        if ( !Character.isDigit( c[ i ] ) ) {
	            d = false;
	            break;
	        }
	    }
	    return d;
	}
	public void printaPuzzle() {
		puzzlejogador.getGridPuzzle().printaTabuleiro();
		ndemovimentos.setText("quantidade de movimentos:"+String.valueOf(puzzlejogador.getGridPuzzle().getNdemovimentos()));
	}

	public static Puzzle getPuzzlejogador() {
		return puzzlejogador;
	}

	public static void setPuzzlejogador(Puzzle puzzlejogador) {
		TeladejogoInsanoController.puzzlejogador = puzzlejogador;
	}
	
}
