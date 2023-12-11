package clothes;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class login extends Application {

	public static ArrayList<User> user = new ArrayList<User>();

	public void start(Stage loginStage) throws Exception {
		Scene loginScene = null;
		String[] cities = { "Bethlehem", "Aldouha", "Jerusalem", "Ramallah", "Nablus", "Jericho", "BeitSahour",
				"Hebron" };
		ComboBox<String> cbo = new ComboBox<>();
		cbo.setPrefWidth(400);
		cbo.setValue("Select City");
		ObservableList<String> items = FXCollections.observableArrayList(cities);
		cbo.getItems().addAll(items); // Add items to combo box
		File f = new File("users1.txt");
		Scanner sc = new Scanner(f);
		String username = null;
		String pass = null;
		String city = null;
		while (sc.hasNext()) {
			String line = sc.nextLine();
			String[] spl = line.split(" ");
			username = spl[0];
			pass = spl[1];
			city = spl[2];
			User user1 = new User(username, pass, city);
			user.add(user1);
		}
		sc.close();
		// the beige color
		Color c1 = Color.web("#EBEBD7");
		Label userName = new Label("Username");
		userName.setFont(Font.font("Arial Black", FontWeight.BOLD, 35));
		userName.setTextFill(c1);
		TextField usertxt = new TextField();
		usertxt.setStyle("-fx-border-color: #EBEBD7");
		Label password = new Label("Password");
		password.setFont(Font.font("Arial Black", FontWeight.BOLD, 35));
		password.setTextFill(c1);
		PasswordField pf = new PasswordField();
		pf.setStyle("-fx-border-color: #EBEBD7");
		Label message = new Label();
		message.setFont(Font.font("Arial Black", FontWeight.BOLD, 35));
		Label city1 = new Label("City");
		city1.setFont(Font.font("Arial Black", FontWeight.BOLD, 35));
		city1.setTextFill(c1);
		Button login = new Button("Login");
		login.setFont(Font.font("Arial Black", FontWeight.BOLD, 20));
		login.setTextFill(c1);
		login.setStyle("-fx-background-color:#666A4C");
		Button back = new Button("Back");
		back.setFont(Font.font("Arial Black", FontWeight.BOLD, 20));
		back.setTextFill(c1);
		back.setStyle("-fx-background-color:#666A4C");
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(15.5, 22.5, 26.5, 26.5));
		gp.setHgap(3);
		gp.setVgap(30);
		gp.add(userName, 0, 5);
		gp.add(usertxt, 2, 5);
		gp.add(password, 0, 8);
		gp.add(pf, 2, 8);
		gp.add(city1, 0, 11);
		gp.add(cbo, 2, 11);
		gp.add(login, 3, 14);
		gp.add(back, 0, 14);
		gp.add(message, 1, 15);
		gp.setAlignment(Pos.BOTTOM_CENTER);
		Image background = new Image(new File("background.png").toURI().toString());
		BackgroundImage bImg2 = new BackgroundImage(background, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));
		gp.setBackground(new Background(bImg2));
		loginScene = new Scene(gp, 500, 700);
		loginStage.setScene(loginScene);
		loginStage.setWidth(500);
		loginStage.setHeight(700);
		loginStage.setTitle(" THE LOGIN SCREEN ");
		loginStage.setFullScreen(true);
		loginStage.show();
		back.setOnAction(e -> {
			loginStage.close();
			Stage primaryStage = new Stage();
			start s = new start();
			try {
				s.start(primaryStage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			return;
		});

		login.setOnAction(e -> {

			String user2 = usertxt.getText().toString();
			String pass2 = pf.getText().toString();
			String city2 = cbo.getValue();
			a.add(city2);
			for (int i = 0; i < 10; i++) {
				if (user2.equalsIgnoreCase(user.get(i).getUsername()) && pass2.equals(user.get(i).getPassword())
						&& city2.equalsIgnoreCase(user.get(i).getCity())) {

					loginStage.close();
					gender gen = new gender();
					try {
						gen.start(loginStage);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					return;
				}
				message.setText("Try again!");
				message.setTextFill(Color.RED);

			}

		});
	}
	public static ArrayList<String> a = new ArrayList<>();
	public static void main(String[] args) {
		launch(args);
	}
}
