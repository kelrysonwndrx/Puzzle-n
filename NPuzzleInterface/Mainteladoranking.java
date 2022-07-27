package br.com.poli.NPuzzleInterface;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Mainteladoranking extends Application{
	@FXML
	private static  Stage stageranking;
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Teladoranking.fxml"));
			Scene scene = new Scene(root);
			arg0.setScene(scene);
			arg0.show();
			setStage(arg0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Stage getStage() {
		return stageranking;
	}

	public static void setStage(Stage stage) {
		Mainteladoranking.stageranking = stage;
	}
	
	
	public static void Main(String[]args) {
		launch(args);
	}

}
