package clothes;

import java.io.File;
import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JacketMale extends Application {
	int j = 0;
	ImageView imageView = null;
	int i = 0;
	int addBag1Clicks = 0;
	int addBag2Clicks = 0;
	int addBag3Clicks = 0;
	int addBag4Clicks = 0;
	int addBag5Clicks = 0;
	int addBag6Clicks = 0;

	@Override
	public void start(Stage jacketmale) throws Exception {
		Color c1 = Color.web("#EBEBD7");
		Scene jacketMaleScene = null;
		GridPane jacketMalePane = new GridPane();
		Image empty = new Image(new File("clothes.png").toURI().toString());
		BackgroundImage backgroundempty = new BackgroundImage(empty, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(250, 250, false, false, false, true));

		jacketMalePane.setBackground(new Background(backgroundempty));
		Button rButton = new Button("", new ImageView(new File("arrow.png").toURI().toString()));
		rButton.setBackground(null);
		rButton.setAlignment(Pos.CENTER);

		Button lButton = new Button("", new ImageView(new File("LEFTARROW.png").toURI().toString()));
		lButton.setBackground(null);
		lButton.setAlignment(Pos.CENTER);
		HBox hbox = new HBox();
		hbox.getChildren().addAll(lButton, rButton);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(10);

		BorderPane boane = new BorderPane();
		boane.setBottom(hbox);
		boane.setAlignment(hbox, Pos.CENTER);

		ArrayList<Button> arrayOfbottonJacket = new ArrayList<>();
		Button btj = new Button("", new ImageView(new File("jacketstart.png").toURI().toString()));
		btj.setBackground(null);
		Button bt1j = new Button("", new ImageView(new File("jacket1.png").toURI().toString()));
		bt1j.setBackground(null);
		Button bt2j = new Button("", new ImageView(new File("jacket2.png").toURI().toString()));
		bt2j.setBackground(null);
		Button bt3j = new Button("", new ImageView(new File("jacket3.png").toURI().toString()));
		bt3j.setBackground(null);
		Button bt4j = new Button("", new ImageView(new File("jacket4.png").toURI().toString()));
		bt4j.setBackground(null);
		Button bt5j = new Button("", new ImageView(new File("jacket5.png").toURI().toString()));
		bt5j.setBackground(null);
		Button bt6j = new Button("", new ImageView(new File("jacket6.png").toURI().toString()));
		bt6j.setBackground(null);

		arrayOfbottonJacket.add(btj);
		arrayOfbottonJacket.add(bt1j);
		arrayOfbottonJacket.add(bt2j);
		arrayOfbottonJacket.add(bt3j);
		arrayOfbottonJacket.add(bt4j);
		arrayOfbottonJacket.add(bt5j);
		arrayOfbottonJacket.add(bt6j);

		boane.setCenter(arrayOfbottonJacket.get(j));

		rButton.setOnAction(e -> {
			j = j + 1;
			if (j == arrayOfbottonJacket.size()) {
				j = 0;
			}
			boane.setCenter(arrayOfbottonJacket.get(j));
		});
		lButton.setOnAction(e -> {
			j = j - 1;
			if (j > arrayOfbottonJacket.size() + 1 || j == -1) {
				j = arrayOfbottonJacket.size() - 1;
			}
			boane.setCenter(arrayOfbottonJacket.get(j));
		});
		BorderPane borderlogout1 = new BorderPane();
		Button back = new Button("", new ImageView(new File("back1.png").toURI().toString()));
		back.setBackground(null);
		back.setAlignment(Pos.CENTER_LEFT);
		Button bag = new Button("", new ImageView(new File("bagbutton2.png").toURI().toString()));
		bag.setBackground(null);
		bag.setAlignment(Pos.CENTER_LEFT);
		HBox h = new HBox();
		h.getChildren().addAll(back, bag);
		h.setSpacing(10);
		jacketMalePane.add(borderlogout1, 1000, 1000);
		bag.setOnAction(e -> {
			jacketmale.close();
			Bag b = new Bag();
			Stage s = new Stage();
			try {
				b.start(s);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		borderlogout1.setCenter(h);

		jacketMalePane.getChildren().add(boane);
		jacketMalePane.setAlignment(Pos.CENTER);
		jacketMaleScene = new Scene(jacketMalePane, 250, 300);
		jacketmale.setScene(jacketMaleScene);
		jacketmale.setTitle(" jecket of male ");
		jacketmale.setFullScreen(true);
		jacketmale.show();

		back.setOnAction(e -> {
			jacketmale.close();
			gender g = new gender();
			try {
				Stage gen = new Stage();
				g.start(gen);
	            g.tabPane.getSelectionModel().select(g.male);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		});

		Stage jacketnum1 = new Stage();
		Stage jacketnum2 = new Stage();
		Stage jacketnum3 = new Stage();
		Stage jacketnum4 = new Stage();
		Stage jacketnum5 = new Stage();
		Stage jacketnum6 = new Stage();

		arrayOfbottonJacket.get(1).setOnAction(e -> {
			jacketnum1.setTitle(" jacket of male 1");
			jacketnum1.setFullScreen(true);
			jacketmale.close();
			jacketnum1.show();
			return;
		});

		Scene jacketn1 = null;

		GridPane gridJacket = new GridPane();

		Image jacket1 = new Image(new File("jacketbg1.png").toURI().toString());
		BackgroundImage bj1 = new BackgroundImage(jacket1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridJacket.setBackground(new Background(bj1));

		String[] s1 = { "M", "L", "XL", "XXL", "XXXL" };
		ComboBox<String> cb1 = new ComboBox<>();
		cb1.setPrefWidth(100);
		cb1.setValue("Size");
		ObservableList<String> items4 = FXCollections.observableArrayList(s1);
		cb1.getItems().addAll(items4);

		Button back2 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		back2.setBackground(null);
		back2.setAlignment(Pos.CENTER_LEFT);
		Button addJ1 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addJ1.setBackground(null);
		addJ1.setAlignment(Pos.CENTER_LEFT);
		Button seebag = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag.setBackground(null);
		seebag.setAlignment(Pos.CENTER_LEFT);
		gridJacket.add(seebag, 20, 40);
		seebag.setOnAction(e -> {
			jacketnum1.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		back2.setOnAction(e -> {
			jacketnum1.close();
			jacketmale.show();
		});
		Spinner<Integer> spinner = new Spinner<Integer>();
		int initialValue = 1;
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue);
		spinner.setValueFactory(valueFactory);
		HBox h1 = new HBox();
		h1.getChildren().addAll(cb1, spinner);
		h1.setAlignment(Pos.CENTER);
		h1.setSpacing(15);

		gridJacket.add(h1, 13, 10);
		gridJacket.add(addJ1, 14, 40);
		gridJacket.add(back2, 17, 40);

		gridJacket.setAlignment(Pos.TOP_LEFT);
		gridJacket.setPadding(new Insets(20, 30, 40, 50));
		gridJacket.setHgap(25);
		gridJacket.setVgap(20);

		jacketn1 = new Scene(gridJacket, 500, 700);
		jacketnum1.setScene(jacketn1);
		jacketnum1.setWidth(450);
		jacketnum1.setHeight(450);

		arrayOfbottonJacket.get(2).setOnAction(e -> {
			jacketnum2.setTitle(" jacket of male 2");
			jacketnum2.setFullScreen(true);
			jacketmale.close();
			jacketnum2.show();
			return;
		});
		Scene jacketn2 = null;

		GridPane gridJacket2 = new GridPane();

		Image jacket2 = new Image(new File("jacketbg2.png").toURI().toString());
		BackgroundImage bj2 = new BackgroundImage(jacket2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridJacket2.setBackground(new Background(bj2));
		ComboBox<String> cb = new ComboBox<>();
		cb.setPrefWidth(100);
		cb.setValue("Size");
		ObservableList<String> items1 = FXCollections.observableArrayList(s1);
		cb.getItems().addAll(items1);

		Button back3 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		back3.setBackground(null);
		back3.setAlignment(Pos.CENTER_LEFT);
		Button addJ2 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addJ2.setBackground(null);
		addJ2.setAlignment(Pos.CENTER_LEFT);
		Button seebag1 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag1.setBackground(null);
		seebag1.setAlignment(Pos.CENTER_LEFT);
		gridJacket2.add(seebag1, 8, 33);
		seebag1.setOnAction(e -> {
			jacketnum2.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		back3.setOnAction(e -> {
			jacketnum2.close();
			jacketmale.show();
		});

		File video = new File("jacket2.mp4");
		String url = video.toURI().toURL().toString();
		Media media = new Media(url);
		MediaPlayer player = new MediaPlayer(media);
		player.play();
		MediaView mediaView = new MediaView(player);
		player.setCycleCount(MediaPlayer.INDEFINITE);
		BorderPane borderVideo = new BorderPane();
		borderVideo.setBottom(mediaView);
		gridJacket2.add(borderVideo, 0, 33);
		Spinner<Integer> spinner1 = new Spinner<Integer>();
		int initialValue1 = 1;
		SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue1);
		spinner1.setValueFactory(valueFactory1);
		HBox h2 = new HBox();
		h2.getChildren().addAll(cb, spinner1);
		h2.setAlignment(Pos.CENTER);
		h2.setSpacing(15);

		gridJacket2.add(h2, 1, 10);
		gridJacket2.add(addJ2, 2, 33);
		gridJacket2.add(back3, 5, 33);

		gridJacket2.setAlignment(Pos.TOP_LEFT);
		gridJacket2.setPadding(new Insets(20, 30, 40, 50));
		gridJacket2.setHgap(25);
		gridJacket2.setVgap(20);

		jacketn2 = new Scene(gridJacket2, 500, 700);
		jacketnum2.setScene(jacketn2);
		jacketnum2.setWidth(450);
		jacketnum2.setHeight(450);

		arrayOfbottonJacket.get(3).setOnAction(e -> {
			jacketnum3.setTitle(" jacket of male 3");
			jacketnum3.setFullScreen(true);
			jacketmale.close();
			jacketnum3.show();
			return;
		});

		Scene jacketn3 = null;

		GridPane gridJacket3 = new GridPane();

		Image jacket3 = new Image(new File("jacketbg3.png").toURI().toString());
		BackgroundImage bj3 = new BackgroundImage(jacket3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridJacket3.setBackground(new Background(bj3));
		ComboBox<String> cb3 = new ComboBox<>();
		cb3.setPrefWidth(100);
		cb3.setValue("Size");
		ObservableList<String> items3 = FXCollections.observableArrayList(s1);
		cb3.getItems().addAll(items3);

		
		Button back4 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		back4.setBackground(null);
		back4.setAlignment(Pos.CENTER_LEFT);
		Button addJ3 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addJ3.setBackground(null);
		addJ3.setAlignment(Pos.CENTER_LEFT);
		Button seebag2 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag2.setBackground(null);
		seebag2.setAlignment(Pos.CENTER_LEFT);
		gridJacket3.add(seebag2, 20, 40);
		seebag2.setOnAction(e -> {
			jacketnum3.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		back4.setOnAction(e -> {
			jacketnum3.close();
			jacketmale.show();
		});
		Spinner<Integer> spinner2 = new Spinner<Integer>();
		int initialValue2 = 1;
		SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue2);
		spinner2.setValueFactory(valueFactory2);
		HBox h3 = new HBox();
		h3.getChildren().addAll(cb3, spinner2);
		h3.setAlignment(Pos.CENTER);
		h3.setSpacing(15);

		gridJacket3.add(h3, 13, 10);
		gridJacket3.add(back4, 17, 40);
		gridJacket3.add(addJ3, 14, 40);

		gridJacket3.setAlignment(Pos.TOP_LEFT);
		gridJacket3.setPadding(new Insets(20, 30, 40, 50));
		gridJacket3.setHgap(25);
		gridJacket3.setVgap(20);

		jacketn3 = new Scene(gridJacket3, 500, 700);
		jacketnum3.setScene(jacketn3);
		jacketnum3.setWidth(450);
		jacketnum3.setHeight(450);

		arrayOfbottonJacket.get(4).setOnAction(e -> {
			jacketnum4.setTitle(" jacket of male 4");
			jacketnum4.setFullScreen(true);
			jacketmale.close();
			jacketnum4.show();
			return;
		});

		Scene jacketn4 = null;

		GridPane gridJacket4 = new GridPane();

		Image jacket4 = new Image(new File("jacketbg4.png").toURI().toString());
		BackgroundImage bj4 = new BackgroundImage(jacket4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridJacket4.setBackground(new Background(bj4));
		ComboBox<String> cb4 = new ComboBox<>();
		cb4.setPrefWidth(100);
		cb4.setValue("Size");
		ObservableList<String> items4a = FXCollections.observableArrayList(s1);
		cb4.getItems().addAll(items4a);

		Button back5 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		back5.setBackground(null);
		back5.setAlignment(Pos.CENTER_LEFT);
		Button addJ4 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addJ4.setBackground(null);
		addJ4.setAlignment(Pos.CENTER_LEFT);
		Button seebag4 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag4.setBackground(null);
		seebag4.setAlignment(Pos.CENTER_LEFT);
		gridJacket4.add(seebag4, 20, 40);
		seebag4.setOnAction(e -> {
			jacketnum4.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		back5.setOnAction(e -> {
			jacketnum4.close();
			jacketmale.show();
		});
		Spinner<Integer> spinner3 = new Spinner<Integer>();
		int initialValue3 = 1;
		SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue3);
		spinner3.setValueFactory(valueFactory3);
		HBox h4 = new HBox();
		h4.getChildren().addAll(cb4, spinner3);
		h4.setAlignment(Pos.CENTER);
		h4.setSpacing(15);

		gridJacket4.add(h4, 13, 10);
		gridJacket4.add(addJ4, 14, 40);
		gridJacket4.add(back5, 17, 40);
		gridJacket4.setAlignment(Pos.TOP_LEFT);
		gridJacket4.setPadding(new Insets(20, 30, 40, 50));
		gridJacket4.setHgap(25);
		gridJacket4.setVgap(20);

		jacketn4 = new Scene(gridJacket4, 500, 700);
		jacketnum4.setScene(jacketn4);
		jacketnum4.setWidth(450);
		jacketnum4.setHeight(450);

		arrayOfbottonJacket.get(5).setOnAction(e -> {
			jacketnum5.setTitle(" jacket of male 5");
			jacketnum5.setFullScreen(true);
			jacketmale.close();
			jacketnum5.show();
			return;
		});

		Scene jacketn5 = null;

		GridPane gridJacket5 = new GridPane();

		Image jacket5 = new Image(new File("jacketbg5.png").toURI().toString());
		BackgroundImage bj5 = new BackgroundImage(jacket5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridJacket5.setBackground(new Background(bj5));
		ComboBox<String> cb5 = new ComboBox<>();
		cb5.setPrefWidth(100);
		cb5.setValue("Size");
		ObservableList<String> items5 = FXCollections.observableArrayList(s1);
		cb5.getItems().addAll(items5);

		Button back6 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		back6.setBackground(null);
		back6.setAlignment(Pos.CENTER_LEFT);
		Button addJ5 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addJ5.setBackground(null);
		addJ5.setAlignment(Pos.CENTER_LEFT);
		Button seebag5 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag5.setBackground(null);
		seebag5.setAlignment(Pos.CENTER_LEFT);
		gridJacket5.add(seebag5, 20, 40);
		seebag5.setOnAction(e -> {
			jacketnum5.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		back6.setOnAction(e -> {
			jacketnum5.close();
			jacketmale.show();
		});
		Spinner<Integer> spinner4 = new Spinner<Integer>();
		int initialValue4 = 1;
		SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue4);
		spinner4.setValueFactory(valueFactory4);
		HBox h5 = new HBox();
		h5.getChildren().addAll(cb5, spinner4);
		h5.setAlignment(Pos.CENTER);
		h5.setSpacing(15);

		gridJacket5.add(h5, 13, 10);
		gridJacket5.add(addJ5, 14, 40);
		gridJacket5.add(back6, 17, 40);

		gridJacket5.setAlignment(Pos.TOP_LEFT);
		gridJacket5.setPadding(new Insets(20, 30, 40, 50));
		gridJacket5.setHgap(25);
		gridJacket5.setVgap(20);

		jacketn5 = new Scene(gridJacket5, 500, 700);
		jacketnum5.setScene(jacketn5);
		jacketnum5.setWidth(450);
		jacketnum5.setHeight(450);

		arrayOfbottonJacket.get(6).setOnAction(e -> {
			jacketnum6.setTitle(" jacket of male 6");
			jacketnum6.setFullScreen(true);
			jacketmale.close();
			jacketnum6.show();
			return;
		});

		Scene jacketn6 = null;

		GridPane gridJacket6 = new GridPane();

		Image jacket6 = new Image(new File("jacketbg6.png").toURI().toString());
		BackgroundImage bj6 = new BackgroundImage(jacket6, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridJacket6.setBackground(new Background(bj6));
		ComboBox<String> cb6 = new ComboBox<>();
		cb6.setPrefWidth(100);
		cb6.setValue("Size");
		ObservableList<String> items6 = FXCollections.observableArrayList(s1);
		cb6.getItems().addAll(items6);

		Button back7 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		back7.setBackground(null);
		back7.setAlignment(Pos.CENTER_LEFT);
		Button addJ6 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addJ6.setBackground(null);
		addJ6.setAlignment(Pos.CENTER_LEFT);
		Button seebag6 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag6.setBackground(null);
		seebag6.setAlignment(Pos.CENTER_LEFT);
		gridJacket6.add(seebag6, 20, 40);
		seebag6.setOnAction(e -> {
			jacketnum6.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		back7.setOnAction(e -> {
			jacketnum6.close();
			jacketmale.show();
		});
		Spinner<Integer> spinner5 = new Spinner<Integer>();
		int initialValue5 = 1;
		SpinnerValueFactory<Integer> valueFactory5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue5);
		spinner5.setValueFactory(valueFactory5);
		HBox h6 = new HBox();
		h6.getChildren().addAll(cb6, spinner5);
		h6.setAlignment(Pos.CENTER);
		h6.setSpacing(15);

		gridJacket6.add(h6, 13, 10);
		gridJacket6.add(addJ6, 14, 40);
		gridJacket6.add(back7, 17, 40);

		gridJacket6.setAlignment(Pos.TOP_LEFT);
		gridJacket6.setPadding(new Insets(20, 30, 40, 50));
		gridJacket6.setHgap(25);
		gridJacket6.setVgap(20);

		jacketn6 = new Scene(gridJacket6, 500, 700);
		jacketnum6.setScene(jacketn6);
		jacketnum6.setWidth(450);
		jacketnum6.setHeight(450);
		/*
		 * get info in ArrayList
		 */
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
			addJ1.setText(" 🛒 ");
			addJ2.setText(" 🛒 ");
			addJ3.setText(" 🛒 ");
			addJ4.setText(" 🛒 ");
			addJ5.setText(" 🛒 ");
			addJ6.setText(" 🛒 ");
		}));
		
		addJ1.setOnAction(e -> {
			addJ1.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cb1.getValue(), spinner.getValue(),
					new File("1.png").toURI().toString(), 19.99,
					"Men's Magnetic-Zipper Hoodie\r\n" + "with Pockets");
			boolean found = false;
			for (ClassForBagArr item : arr) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner.increment(1);
					item.setNum(spinner.getValue());
					found = true;
					break;
				}
			}
			if(cb1.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			addBag1Clicks++;
		});
		
		addJ2.setOnAction(e -> {
			addJ2.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cb.getValue(), spinner1.getValue(),
					new File("2.png").toURI().toString(), 19.99,
					"Men's Magnetic-Zipper Hoodie\r\n" + "with Pockets - Clearance");
			boolean found = false;
			for (ClassForBagArr item : arr) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner1.increment(1);
					item.setNum(spinner1.getValue());
					found = true;
					break;
				}
			}
			if(cb.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			addBag2Clicks++;
		});

		addJ3.setOnAction(e -> {
			addJ3.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cb3.getValue(), spinner2.getValue(),
					new File("3.png").toURI().toString(), 29.99, "Men's Recovery Zip Jacket");
			boolean found = false;
			for (ClassForBagArr item : arr) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner2.increment(1);
					item.setNum(spinner2.getValue());
					found = true;
					break;
				}
			}
			if(cb3.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			addBag3Clicks++;
		});

		addJ4.setOnAction(e -> {
			addJ4.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cb4.getValue(), spinner3.getValue(),
					new File("4.png").toURI().toString(), 24.99, "Men Post-Surgery Recovery Jacket");
			boolean found = false;
			for (ClassForBagArr item : arr) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner3.increment(1);
					item.setNum(spinner3.getValue());
					found = true;
					break;
				}
			}
			if(cb4.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			addBag4Clicks++;
		});
	
		addJ5.setOnAction(e -> {
			addJ5.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cb5.getValue(), spinner4.getValue(),
					new File("5.png").toURI().toString(), 34.99,
					"Men's Self-Dressing Magnetic Closure\r\n" + " Jean Jacket");
			boolean found = false;
			for (ClassForBagArr item : arr) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner4.increment(1);
					item.setNum(spinner4.getValue());
					found = true;
					break;
				}
			}
			if(cb5.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			addBag5Clicks++;
		});
		addJ6.setOnAction(e -> {
			addJ6.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cb6.getValue(), spinner5.getValue(),
					new File("6.png").toURI().toString(), 34.99,
					"Men's Magnetic Closure Sherpa\r\n" + " Lined Shirt Jacket");
			boolean found = false;
			for (ClassForBagArr item : arr) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner5.increment(1);
					item.setNum(spinner5.getValue());
					found = true;
					break;
				}
			}
			if(cb6.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			addBag6Clicks++;
		});
	}

	public static ArrayList<ClassForBagArr> arr = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}
}
