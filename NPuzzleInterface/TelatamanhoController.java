package br.com.poli.NPuzzleInterface;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class TelatamanhoController implements Initializable{

	@FXML
	private Button iniciarinsano;
	@FXML
	private TextField valordoinsano;
	private static int tamanho;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		iniciarinsano.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if(ehInteiro(valordoinsano.getText())==true && (int)Double.parseDouble(valordoinsano.getText())>5) {
				tamanho = (int) Double.parseDouble(valordoinsano.getText());
				
				Main.getStage().close();
				Maindateladotamanho.getStage().close();
				MaindateladejogoInsano a = new MaindateladejogoInsano();
				try {
					a.start(new Stage());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			} else {
				Alert erro = new Alert(AlertType.WARNING);
				erro.setContentText("tamanho do insano invalido");
				erro.setTitle("Aviso");
				erro.show();
			}
			
		}});
		
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
	public static int getTamanho() {
		return tamanho;
	}
	public static void setTamanho(int tamanho) {
		TelatamanhoController.tamanho = tamanho;
	}
	
}
