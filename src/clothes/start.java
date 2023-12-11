package clothes;

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class start extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene introScene = null;
		Button click = new Button("SHOP NOW!");
		click.setFont(Font.font("League Spartan", FontWeight.BOLD, 30));
		Color c3 = Color.web("#EBEBD7");
		click.setTextFill(c3);
		click.setStyle("-fx-background-color:#666A4C");
		click.setShape(new Circle(400));
		click.setAlignment(Pos.BOTTOM_CENTER);
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		gridPane.setHgap(3.5);
		gridPane.setVgap(3.5);
		gridPane.setAlignment(Pos.CENTER_LEFT);
		gridPane.add(click, 154, 180);
		// set an image to the background
		Image introduction = new Image(new File("login.png").toURI().toString());
		BackgroundImage bImg = new BackgroundImage(introduction, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));
		gridPane.setBackground(new Background(bImg));
		introScene = new Scene(gridPane, 250, 250);
		primaryStage.setTitle("Welcome");
		primaryStage.setScene(introScene);
		primaryStage.show();
		primaryStage.setFullScreen(true);
		click.setOnAction(e -> {
			login l = new login();
			Stage login = new Stage();
			try {
				l.start(login);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			primaryStage.close();
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
