package br.com.poli.NPuzzleInterface;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TeladeinicioController implements Initializable{
	
	@FXML
	private ComboBox<String> combobox;
	@FXML
    private TextField Nomedojogador;
	@FXML
	private Button iniciarjogo;
	@FXML
	private Button Botãoranking;
	private static String nomedojogadorsalvo;
	private static String dificuldadeescolhida;
	
	
	ObservableList<String> List = FXCollections.observableArrayList("FACIL","NORMAL","DIFICIL","INSANO");

	@Override
public void initialize(URL arg0, ResourceBundle arg1) {
		combobox.setItems(List);

iniciarjogo.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent arg0) {
		dificuldadeescolhida = (String) combobox.getValue();
		if(Nomedojogador.getText().equals("")){
		   Alert erro = new Alert(AlertType.WARNING);
		       erro.setContentText("nome inválido");
		       erro.setTitle("Aviso");
		       erro.show();
		}
		else if (combobox.getValue()==null) {
			Alert erro = new Alert(AlertType.WARNING);
			erro.setContentText("dificuldade inválida");
			erro.setTitle("Aviso");
			erro.show();
		}
		else {
			if(dificuldadeescolhida.equals("FACIL")) {
				setNomedojogadorsalvo(Nomedojogador.getText());
				Main.getStage().close();
				MaindateladejogoFacil a = new MaindateladejogoFacil();
				try {
					a.start(new Stage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(dificuldadeescolhida.equals("NORMAL")) {
				setNomedojogadorsalvo(Nomedojogador.getText());
				Main.getStage().close();
				MaindateladejogoNormal a = new MaindateladejogoNormal();
				try {
					a.start(new Stage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if(dificuldadeescolhida.equals("DIFICIL")) {
				setNomedojogadorsalvo(Nomedojogador.getText());
				Main.getStage().close();
				MaindateladejogoDificil a = new MaindateladejogoDificil();
				try {
					a.start(new Stage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if (dificuldadeescolhida.equals("INSANO")) {
				setNomedojogadorsalvo(Nomedojogador.getText());
				Maindateladotamanho a = new Maindateladotamanho();
				try {
					a.start(new Stage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		}
		
	}
			
		});
Botãoranking.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent arg0) {
		dificuldadeescolhida="";
		Main.getStage().close();
		Mainteladoranking a = new Mainteladoranking();
		try {
			a.start(new Stage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
});
		
	}

	public static String getNomedojogadorsalvo() {
		return nomedojogadorsalvo;
	}

	@SuppressWarnings("static-access")
	public void setNomedojogadorsalvo(String nomedojogadorsalvo) {
		this.nomedojogadorsalvo = nomedojogadorsalvo;
	}

	public static String getDificuldadeescolhida() {
		return dificuldadeescolhida;
	}

	public static void setDificuldadeescolhida(String dificuldadeescolhida) {
		TeladeinicioController.dificuldadeescolhida = dificuldadeescolhida;
	}
	
	

}
