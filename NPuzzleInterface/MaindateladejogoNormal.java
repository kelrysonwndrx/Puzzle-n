package br.com.poli.NPuzzleInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MaindateladejogoNormal extends Application{

	private static  Stage stage;
	

	@Override
	public void start(Stage arg0) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("TeladejogoNormal.fxml"));
			Scene scene = new Scene(root);
			arg0.setScene(scene);
			arg0.show();
			setStage(arg0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		MaindateladejogoNormal.stage = stage;
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
