package br.com.poli.NPuzzleInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MaindateladejogoDificil extends Application {
	
	private static  Stage stage;

	@Override
	public void start(Stage arg0) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("TeladejogoDificil.fxml"));
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
		MaindateladejogoDificil.stage = stage;
	}
}
