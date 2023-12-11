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

public class ShoesMale extends Application {
	int j = 0;
	ImageView imageView = null;
	int i = 0;
	public static ArrayList<ClassForBagArr> arr = new ArrayList<>();
	int addBag1Clicks = 0;
	int addBag2Clicks = 0;
	int addBag3Clicks = 0;
	int addBag4Clicks = 0;
	int addBag5Clicks = 0;
	int addBag6Clicks = 0;

	@Override
	public void start(Stage shoesmale) throws Exception {
		Color c5 = Color.web("#666A4C");
		Color c1 = Color.web("#EBEBD7");
		// shoes of male
		Scene shoesMaleScene = null;
		GridPane shoesMalePane = new GridPane();
		Image empty = new Image(new File("clothes.png").toURI().toString());
		BackgroundImage backgroundempty = new BackgroundImage(empty, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(250, 250, false, false, false, true));
		shoesMalePane.setBackground(new Background(backgroundempty));
		Button rButtonshoes = new Button("", new ImageView(new File("arrow.png").toURI().toString()));
		rButtonshoes.setBackground(null);
		rButtonshoes.setAlignment(Pos.CENTER);

		Button lButtonshoes = new Button("", new ImageView(new File("LEFTARROW.png").toURI().toString()));
		lButtonshoes.setBackground(null);
		lButtonshoes.setAlignment(Pos.CENTER);
		HBox hboxshoes = new HBox();
		hboxshoes.getChildren().addAll(lButtonshoes, rButtonshoes);
		hboxshoes.setAlignment(Pos.CENTER);
		hboxshoes.setSpacing(10);

		BorderPane bordershoes = new BorderPane();
		bordershoes.setBottom(hboxshoes);
		bordershoes.setAlignment(hboxshoes, Pos.CENTER);

		ArrayList<Button> arrayOfbottonshoes = new ArrayList<>();
		Button btshoesstart = new Button("", new ImageView(new File("shoesstart.png").toURI().toString()));
		btshoesstart.setBackground(null);
		Button bt1shoes = new Button("", new ImageView(new File("shoes1.png").toURI().toString()));
		bt1shoes.setBackground(null);
		Button bt2shoes = new Button("", new ImageView(new File("shoes2.png").toURI().toString()));
		bt2shoes.setBackground(null);
		Button bt3shoes = new Button("", new ImageView(new File("shoes3.png").toURI().toString()));
		bt3shoes.setBackground(null);
		Button bt4shoes = new Button("", new ImageView(new File("shoes4.png").toURI().toString()));
		bt4shoes.setBackground(null);
		Button bt5shoes = new Button("", new ImageView(new File("shoes5.png").toURI().toString()));
		bt5shoes.setBackground(null);
		Button bt6shoes = new Button("", new ImageView(new File("shoes6.png").toURI().toString()));
		bt6shoes.setBackground(null);

		arrayOfbottonshoes.add(btshoesstart);
		arrayOfbottonshoes.add(bt1shoes);
		arrayOfbottonshoes.add(bt2shoes);
		arrayOfbottonshoes.add(bt3shoes);
		arrayOfbottonshoes.add(bt4shoes);
		arrayOfbottonshoes.add(bt5shoes);
		arrayOfbottonshoes.add(bt6shoes);

		bordershoes.setCenter(arrayOfbottonshoes.get(j));

		rButtonshoes.setOnAction(e -> {
			j = j + 1;
			if (j == arrayOfbottonshoes.size()) {
				j = 0;
			}
			bordershoes.setCenter(arrayOfbottonshoes.get(j));
		});
		lButtonshoes.setOnAction(e -> {
			j = j - 1;
			if (j > arrayOfbottonshoes.size() + 1 || j == -1) {
				j = arrayOfbottonshoes.size() - 1;
			}
			bordershoes.setCenter(arrayOfbottonshoes.get(j));
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
		shoesMalePane.add(borderlogout1, 1000, 1000);
		bag.setOnAction(e -> {
			shoesmale.close();
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
		shoesMalePane.getChildren().add(bordershoes);
		shoesMalePane.setAlignment(Pos.CENTER);
		shoesMaleScene = new Scene(shoesMalePane, 250, 300);
		shoesmale.setScene(shoesMaleScene);
		back.setOnAction(e -> {
			shoesmale.close();
			gender g = new gender();
			Stage gg = new Stage();
			try {
				g.start(gg);
	            g.tabPane.getSelectionModel().select(g.male);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			return;
		});
		shoesmale.setTitle(" shoes of male ");
		shoesmale.setFullScreen(true);
		shoesmale.show();

		Stage shoesnum1 = new Stage();
		Stage shoesnum2 = new Stage();
		Stage shoesnum3 = new Stage();
		Stage shoesnum4 = new Stage();
		Stage shoesnum5 = new Stage();
		Stage shoesnum6 = new Stage();

		arrayOfbottonshoes.get(1).setOnAction(e -> {
			shoesnum1.setTitle(" shoes of male 1");
			shoesnum1.setFullScreen(true);
			shoesmale.close();
			shoesnum1.show();
			return;
		});

		Scene shoesn1 = null;

		GridPane gridshoes = new GridPane();

		Image shoes1 = new Image(new File("shoesbg1.png").toURI().toString());
		BackgroundImage bshoes1 = new BackgroundImage(shoes1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridshoes.setBackground(new Background(bshoes1));

		String[] sizeshoes = { "M", "L", "XL", "XXL", "XXXL" };
		ComboBox<String> cbshoes1 = new ComboBox<>();
		cbshoes1.setPrefWidth(100);
		cbshoes1.setValue("Size");
		ObservableList<String> itemsshoes1 = FXCollections.observableArrayList(sizeshoes);
		cbshoes1.getItems().addAll(itemsshoes1);

		Button backshoes1 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backshoes1.setBackground(null);
		backshoes1.setAlignment(Pos.CENTER_LEFT);
		Button addshoes1 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addshoes1.setBackground(null);
		addshoes1.setAlignment(Pos.CENTER_LEFT);
		Button seebag = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag.setBackground(null);
		seebag.setAlignment(Pos.CENTER_LEFT);
		gridshoes.add(seebag, 20, 40);
		seebag.setOnAction(e -> {
			shoesnum1.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backshoes1.setOnAction(e -> {
			shoesnum1.close();
			shoesmale.show();
		});
		Spinner<Integer> spinner = new Spinner<Integer>();
		int initialValue = 1;
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue);
		spinner.setValueFactory(valueFactory);
		HBox h1 = new HBox();
		h1.getChildren().addAll(cbshoes1, spinner);
		h1.setAlignment(Pos.CENTER);
		h1.setSpacing(15);

		gridshoes.add(h1, 13, 10);
		gridshoes.add(addshoes1, 14, 40);
		gridshoes.add(backshoes1, 17, 40);

		gridshoes.setAlignment(Pos.TOP_LEFT);
		gridshoes.setPadding(new Insets(20, 30, 40, 50));
		gridshoes.setHgap(25);
		gridshoes.setVgap(20);

		shoesn1 = new Scene(gridshoes, 500, 700);
		shoesnum1.setScene(shoesn1);
		shoesnum1.setWidth(450);
		shoesnum1.setHeight(450);

		arrayOfbottonshoes.get(2).setOnAction(e -> {
			shoesnum2.setTitle(" shoes of male 2");
			shoesnum2.setFullScreen(true);
			shoesmale.close();
			shoesnum2.show();
			return;
		});
		Scene shoesn2 = null;

		GridPane gridshoes2 = new GridPane();

		Image shoes2 = new Image(new File("shoesbg2.png").toURI().toString());
		BackgroundImage bjshoes2 = new BackgroundImage(shoes2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridshoes2.setBackground(new Background(bjshoes2));

		ComboBox<String> cbshoes2 = new ComboBox<>();
		cbshoes2.setPrefWidth(100);
		cbshoes2.setValue("Size");
		ObservableList<String> itemsshoes2 = FXCollections.observableArrayList(sizeshoes);
		cbshoes2.getItems().addAll(itemsshoes2);

		Button backshoes2 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backshoes2.setBackground(null);
		backshoes2.setAlignment(Pos.CENTER_LEFT);
		Button addshoes2 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addshoes2.setBackground(null);
		addshoes2.setAlignment(Pos.CENTER_LEFT);
		Button seebag1 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag1.setBackground(null);
		seebag1.setAlignment(Pos.CENTER_LEFT);
		gridshoes2.add(seebag1, 8, 33);
		seebag1.setOnAction(e -> {
			shoesnum2.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backshoes2.setOnAction(e -> {
			shoesnum2.close();
			shoesmale.show();
		});

		File videoshoes2 = new File("shoes2.mp4");
		String urlshoes2 = videoshoes2.toURI().toURL().toString();
		Media mediashoes2 = new Media(urlshoes2);
		MediaPlayer playershoes2 = new MediaPlayer(mediashoes2);
		playershoes2.play();
		MediaView mediaViewshoes2 = new MediaView(playershoes2);
		playershoes2.setCycleCount(MediaPlayer.INDEFINITE);
		BorderPane borderVideoshoes2 = new BorderPane();
		borderVideoshoes2.setBottom(mediaViewshoes2);
		gridshoes2.add(borderVideoshoes2, 0, 33);
		Spinner<Integer> spinner1 = new Spinner<Integer>();
		int initialValue1 = 1;
		SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue1);
		spinner1.setValueFactory(valueFactory1);
		HBox h2 = new HBox();
		h2.getChildren().addAll(cbshoes2, spinner1);
		h2.setAlignment(Pos.CENTER);
		h2.setSpacing(15);

		gridshoes2.add(h2, 1, 10);
		gridshoes2.add(addshoes2, 2, 33);
		gridshoes2.add(backshoes2, 5, 33);

		gridshoes2.setAlignment(Pos.TOP_LEFT);
		gridshoes2.setPadding(new Insets(20, 30, 40, 50));
		gridshoes2.setHgap(25);
		gridshoes2.setVgap(20);

		shoesn2 = new Scene(gridshoes2, 500, 700);
		shoesnum2.setScene(shoesn2);
		shoesnum2.setWidth(450);
		shoesnum2.setHeight(450);

		arrayOfbottonshoes.get(3).setOnAction(e -> {
			shoesnum3.setTitle(" shoes of male 3");
			shoesnum3.setFullScreen(true);
			shoesmale.close();
			shoesnum3.show();
			return;
		});

		Scene shoesn3 = null;

		GridPane gridshoes3 = new GridPane();

		Image shoes3 = new Image(new File("shoesbg3.png").toURI().toString());
		BackgroundImage bshoes3 = new BackgroundImage(shoes3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridshoes3.setBackground(new Background(bshoes3));

		ComboBox<String> cbshoes3 = new ComboBox<>();
		cbshoes3.setPrefWidth(100);
		cbshoes3.setValue("Size");
		ObservableList<String> itemsshoes3 = FXCollections.observableArrayList(sizeshoes);
		cbshoes3.getItems().addAll(itemsshoes3);

		Button backshoes3 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backshoes3.setBackground(null);
		backshoes3.setAlignment(Pos.CENTER_LEFT);
		Button addshoes3 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addshoes3.setBackground(null);
		addshoes3.setAlignment(Pos.CENTER_LEFT);
		Button seebag2 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag2.setBackground(null);
		seebag2.setAlignment(Pos.CENTER_LEFT);
		gridshoes3.add(seebag2, 20, 40);
		seebag2.setOnAction(e -> {
			shoesnum3.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backshoes3.setOnAction(e -> {
			shoesnum3.close();
			shoesmale.show();
		});
		Spinner<Integer> spinner3 = new Spinner<Integer>();
		int initialValue3 = 1;
		SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue3);
		spinner3.setValueFactory(valueFactory3);
		HBox h3 = new HBox();
		h3.getChildren().addAll(cbshoes3, spinner3);
		h3.setAlignment(Pos.CENTER);
		h3.setSpacing(15);

		gridshoes3.add(h3, 13, 10);
		gridshoes3.add(addshoes3, 14, 40);
		gridshoes3.add(backshoes3, 17, 40);

		gridshoes3.setAlignment(Pos.TOP_LEFT);
		gridshoes3.setPadding(new Insets(20, 30, 40, 50));
		gridshoes3.setHgap(25);
		gridshoes3.setVgap(20);

		shoesn3 = new Scene(gridshoes3, 500, 700);
		shoesnum3.setScene(shoesn3);
		shoesnum3.setWidth(450);
		shoesnum3.setHeight(450);

		arrayOfbottonshoes.get(4).setOnAction(e -> {
			shoesnum4.setTitle(" shoes of male 4");
			shoesnum4.setFullScreen(true);
			shoesmale.close();
			shoesnum4.show();
			return;
		});

		Scene shoesn4 = null;

		GridPane gridshoes4 = new GridPane();

		Image shoes4 = new Image(new File("shoesbg4.png").toURI().toString());
		BackgroundImage bshoes4 = new BackgroundImage(shoes4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridshoes4.setBackground(new Background(bshoes4));

		ComboBox<String> cbshoes4 = new ComboBox<>();
		cbshoes4.setPrefWidth(100);
		cbshoes4.setValue("Size");
		ObservableList<String> itemsshoes4 = FXCollections.observableArrayList(sizeshoes);
		cbshoes4.getItems().addAll(itemsshoes4);

		Button backshoes4 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backshoes4.setBackground(null);
		backshoes4.setAlignment(Pos.CENTER_LEFT);
		Button addshoes4 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addshoes4.setBackground(null);
		addshoes4.setAlignment(Pos.CENTER_LEFT);
		Button seebag3 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag3.setBackground(null);
		seebag3.setAlignment(Pos.CENTER_LEFT);
		gridshoes4.add(seebag3, 20, 40);
		seebag3.setOnAction(e -> {
			shoesnum4.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backshoes4.setOnAction(e -> {
			shoesnum4.close();
			shoesmale.show();
		});
		Spinner<Integer> spinner2 = new Spinner<Integer>();
		int initialValue2 = 1;
		SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue2);
		spinner2.setValueFactory(valueFactory2);
		HBox h4 = new HBox();
		h4.getChildren().addAll(cbshoes4, spinner2);
		h4.setAlignment(Pos.CENTER);
		h4.setSpacing(15);

		gridshoes4.add(h4, 13, 10);
		gridshoes4.add(addshoes4, 14, 40);
		gridshoes4.add(backshoes4, 17, 40);
		gridshoes4.setAlignment(Pos.TOP_LEFT);
		gridshoes4.setPadding(new Insets(20, 30, 40, 50));
		gridshoes4.setHgap(25);
		gridshoes4.setVgap(20);

		shoesn4 = new Scene(gridshoes4, 500, 700);
		shoesnum4.setScene(shoesn4);
		shoesnum4.setWidth(450);
		shoesnum4.setHeight(450);

		arrayOfbottonshoes.get(5).setOnAction(e -> {
			shoesnum5.setTitle(" shoes of male 5");
			shoesnum5.setFullScreen(true);
			shoesmale.close();
			shoesnum5.show();
			return;
		});

		Scene shoesn5 = null;

		GridPane gridshoes5 = new GridPane();

		Image shoes5 = new Image(new File("shoesbg5.png").toURI().toString());
		BackgroundImage bshoes5 = new BackgroundImage(shoes5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridshoes5.setBackground(new Background(bshoes5));

		ComboBox<String> cbshoes5 = new ComboBox<>();
		cbshoes5.setPrefWidth(100);
		cbshoes5.setValue("Size");
		ObservableList<String> itemsshoes5 = FXCollections.observableArrayList(sizeshoes);
		cbshoes5.getItems().addAll(itemsshoes5);

		Button backshoes5 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backshoes5.setBackground(null);
		backshoes5.setAlignment(Pos.CENTER_LEFT);
		Button addshoes5 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addshoes5.setBackground(null);
		addshoes5.setAlignment(Pos.CENTER_LEFT);
		Button seebag5 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag5.setBackground(null);
		seebag5.setAlignment(Pos.CENTER_LEFT);
		gridshoes5.add(seebag5, 20, 40);
		seebag5.setOnAction(e -> {
			shoesnum5.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backshoes5.setOnAction(e -> {
			shoesnum5.close();
			shoesmale.show();
		});
		Spinner<Integer> spinner4 = new Spinner<Integer>();
		int initialValue4 = 1;
		SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue4);
		spinner4.setValueFactory(valueFactory4);
		HBox h5 = new HBox();
		h5.getChildren().addAll(cbshoes5, spinner4);
		h5.setAlignment(Pos.CENTER);
		h5.setSpacing(15);

		gridshoes5.add(h5, 13, 10);
		gridshoes5.add(addshoes5, 14, 40);
		gridshoes5.add(backshoes5, 17, 40);

		gridshoes5.setAlignment(Pos.TOP_LEFT);
		gridshoes5.setPadding(new Insets(20, 30, 40, 50));
		gridshoes5.setHgap(25);
		gridshoes5.setVgap(20);

		shoesn5 = new Scene(gridshoes5, 500, 700);
		shoesnum5.setScene(shoesn5);
		shoesnum5.setWidth(450);
		shoesnum5.setHeight(450);

		arrayOfbottonshoes.get(6).setOnAction(e -> {
			shoesnum6.setTitle(" shoes of male 6");
			shoesnum6.setFullScreen(true);
			shoesmale.close();
			shoesnum6.show();
			return;
		});

		Scene shoesn6 = null;

		GridPane gridshoes6 = new GridPane();

		Image shoes6 = new Image(new File("shoesbg6.png").toURI().toString());
		BackgroundImage bshoes6 = new BackgroundImage(shoes6, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridshoes6.setBackground(new Background(bshoes6));

		ComboBox<String> cbshoes6 = new ComboBox<>();
		cbshoes6.setPrefWidth(100);
		cbshoes6.setValue("Size");
		ObservableList<String> itemsshoes6 = FXCollections.observableArrayList(sizeshoes);
		cbshoes6.getItems().addAll(itemsshoes6);

		Button backshoes6 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backshoes6.setBackground(null);
		backshoes6.setAlignment(Pos.CENTER_LEFT);
		Button addshoes6 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addshoes6.setBackground(null);
		addshoes6.setAlignment(Pos.CENTER_LEFT);
		Button seebag6 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag6.setBackground(null);
		seebag6.setAlignment(Pos.CENTER_LEFT);
		gridshoes6.add(seebag6, 20, 40);
		seebag6.setOnAction(e -> {
			shoesnum6.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backshoes6.setOnAction(e -> {
			shoesnum6.close();
			shoesmale.show();
		});
		Spinner<Integer> spinner5 = new Spinner<Integer>();
		int initialValue5 = 1;
		SpinnerValueFactory<Integer> valueFactory5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue5);
		spinner5.setValueFactory(valueFactory5);
		HBox h6 = new HBox();
		h6.getChildren().addAll(cbshoes6, spinner5);
		h6.setAlignment(Pos.CENTER);
		h6.setSpacing(15);

		gridshoes6.add(h6, 13, 10);
		gridshoes6.add(addshoes6, 14, 40);
		gridshoes6.add(backshoes6, 17, 40);

		gridshoes6.setAlignment(Pos.TOP_LEFT);
		gridshoes6.setPadding(new Insets(20, 30, 40, 50));
		gridshoes6.setHgap(25);
		gridshoes6.setVgap(20);

		shoesn6 = new Scene(gridshoes6, 500, 700);
		shoesnum6.setScene(shoesn6);
		shoesnum6.setWidth(450);
		shoesnum6.setHeight(450);
		/*
		 * get info in ArrayList
		 */
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
			addshoes1.setText(" 🛒 ");
			addshoes2.setText(" 🛒 ");
			addshoes3.setText(" 🛒 ");
			addshoes4.setText(" 🛒 ");
			addshoes5.setText(" 🛒 ");
			addshoes6.setText(" 🛒 ");
		}));
		
		addshoes1.setOnAction(e -> {
			addshoes1.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbshoes1.getValue(), spinner.getValue(),
					new File("12.png").toURI().toString(), 59.99, "Men's Extra Wide Shoes");

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
			if(cbshoes1.getValue().equalsIgnoreCase("Size")) {
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
		
		addshoes2.setOnAction(e -> {
			addshoes2.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbshoes2.getValue(), spinner1.getValue(),
					new File("13.png").toURI().toString(), 49.99,
					"Men's Wide Ultra Lightweight\r\n" + " Walking Shoes");

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
			if(cbshoes2.getValue().equalsIgnoreCase("Size")) {
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

		addshoes3.setOnAction(e -> {
			addshoes3.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbshoes3.getValue(), spinner3.getValue(),
					new File("14.png").toURI().toString(), 59.99, "Extra Wide Comfort Shoes\r\n" + " for Men");
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
			if(cbshoes3.getValue().equalsIgnoreCase("Size")) {
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
		addshoes4.setOnAction(e -> {
			addshoes4.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbshoes4.getValue(), spinner2.getValue(),
					new File("15.png").toURI().toString(), 69.99,
					"Easy Wear Extra Wide Comfortable\r\n" + "Walking Shoes for Men");
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
			if(cbshoes4.getValue().equalsIgnoreCase("Size")) {
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
		addshoes5.setOnAction(e -> {
			addshoes5.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbshoes5.getValue(), spinner4.getValue(),
					new File("16.png").toURI().toString(), 49.99,
					"Men's Extra Wide Comfort Shoes\r\n" + "with Easy Touch Closures");
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
			if(cbshoes5.getValue().equalsIgnoreCase("Size")) {
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
		addshoes6.setOnAction(e -> {
			addshoes6.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbshoes6.getValue(), spinner5.getValue(),
					new File("17.png").toURI().toString(), 59.99,
					"Men's Extra Wide Comfortable\r\n" + "Slip-On Sneakers Without Laces");
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
			if(cbshoes6.getValue().equalsIgnoreCase("Size")) {
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

	public static void main(String[] args) {
		launch(args);
	}
}
