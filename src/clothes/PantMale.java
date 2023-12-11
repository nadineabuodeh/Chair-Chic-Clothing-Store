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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PantMale extends Application {
	int j = 0;
	ImageView imageView = null;
	int i = 0;
	int addBag1Clicks = 0;
	int addBag2Clicks = 0;
	int addBag3Clicks = 0;
	int addBag4Clicks = 0;
	int addBag5Clicks = 0;

	@Override
	public void start(Stage pantsmale) throws Exception {
		Color c5 = Color.web("#666A4C");
		Color c1 = Color.web("#EBEBD7");
		Scene pantMaleScene = null;
		GridPane pantMalePane = new GridPane();
		Image empty = new Image(new File("clothes.png").toURI().toString());
		BackgroundImage backgroundempty = new BackgroundImage(empty, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(250, 250, false, false, false, true));
		pantMalePane.setBackground(new Background(backgroundempty));
		Button rButtonpant = new Button("", new ImageView(new File("arrow.png").toURI().toString()));
		rButtonpant.setBackground(null);
		rButtonpant.setAlignment(Pos.CENTER);

		Button lButtonpant = new Button("", new ImageView(new File("LEFTARROW.png").toURI().toString()));
		lButtonpant.setBackground(null);
		lButtonpant.setAlignment(Pos.CENTER);
		HBox hboxpant = new HBox();
		hboxpant.getChildren().addAll(lButtonpant, rButtonpant);
		hboxpant.setAlignment(Pos.CENTER);
		hboxpant.setSpacing(10);

		BorderPane borderpant = new BorderPane();
		borderpant.setBottom(hboxpant);
		borderpant.setAlignment(hboxpant, Pos.CENTER);

		ArrayList<Button> arrayOfbottonpant = new ArrayList<>();
		Button btpantstart = new Button("", new ImageView(new File("pantstart.png").toURI().toString()));
		btpantstart.setBackground(null);
		Button bt1pant = new Button("", new ImageView(new File("pant1.png").toURI().toString()));
		bt1pant.setBackground(null);
		Button bt2pant = new Button("", new ImageView(new File("pant2.png").toURI().toString()));
		bt2pant.setBackground(null);
		Button bt3pant = new Button("", new ImageView(new File("pant3.png").toURI().toString()));
		bt3pant.setBackground(null);
		Button bt4pant = new Button("", new ImageView(new File("pant4.png").toURI().toString()));
		bt4pant.setBackground(null);
		Button bt5pant = new Button("", new ImageView(new File("pant5.png").toURI().toString()));
		bt5pant.setBackground(null);

		arrayOfbottonpant.add(btpantstart);
		arrayOfbottonpant.add(bt1pant);
		arrayOfbottonpant.add(bt2pant);
		arrayOfbottonpant.add(bt3pant);
		arrayOfbottonpant.add(bt4pant);
		arrayOfbottonpant.add(bt5pant);

		borderpant.setCenter(arrayOfbottonpant.get(j));

		rButtonpant.setOnAction(e -> {
			j = j + 1;
			if (j == arrayOfbottonpant.size()) {
				j = 0;
			}
			borderpant.setCenter(arrayOfbottonpant.get(j));
		});
		lButtonpant.setOnAction(e -> {
			j = j - 1;
			if (j > arrayOfbottonpant.size() + 1 || j == -1) {
				j = arrayOfbottonpant.size() - 1;
			}
			borderpant.setCenter(arrayOfbottonpant.get(j));
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
		pantMalePane.add(borderlogout1, 1000, 1000);
		bag.setOnAction(e -> {
			pantsmale.close();
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
		pantMalePane.getChildren().add(borderpant);
		pantMalePane.setAlignment(Pos.CENTER);
		pantMaleScene = new Scene(pantMalePane, 250, 300);
		pantsmale.setScene(pantMaleScene);
		back.setOnAction(e -> {
			pantsmale.close();
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
		pantsmale.setTitle(" pants of male ");
		pantsmale.setFullScreen(true);
		pantsmale.show();

		Stage pantnum1 = new Stage();
		Stage pantnum2 = new Stage();
		Stage pantnum3 = new Stage();
		Stage pantnum4 = new Stage();
		Stage pantnum5 = new Stage();

		arrayOfbottonpant.get(1).setOnAction(e -> {
			pantnum1.setTitle(" pant of male 1");
			pantnum1.setFullScreen(true);
			pantsmale.close();
			pantnum1.show();
			return;
		});

		Scene pantn1 = null;

		GridPane gridpant1 = new GridPane();

		Image pant1 = new Image(new File("pantbg1.png").toURI().toString());
		BackgroundImage bpant1 = new BackgroundImage(pant1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridpant1.setBackground(new Background(bpant1));

		String[] pantsize = { "M", "L", "XL", "XXL", "XXXL" };
		ComboBox<String> cbpant1 = new ComboBox<>();
		cbpant1.setPrefWidth(100);
		cbpant1.setValue("Size");
		ObservableList<String> itemspant1 = FXCollections.observableArrayList(pantsize);
		cbpant1.getItems().addAll(itemspant1);

		Button backpant1 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backpant1.setBackground(null);
		backpant1.setAlignment(Pos.CENTER_LEFT);
		Button addpant1 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addpant1.setBackground(null);
		addpant1.setAlignment(Pos.CENTER_LEFT);
		Button seebag = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag.setBackground(null);
		seebag.setAlignment(Pos.CENTER_LEFT);
		gridpant1.add(seebag, 20, 40);
		seebag.setOnAction(e -> {
			pantnum1.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backpant1.setOnAction(e -> {
			pantnum1.close();
			pantsmale.show();
		});
		Spinner<Integer> spinner = new Spinner<Integer>();
		int initialValue = 1;
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue);
		spinner.setValueFactory(valueFactory);
		HBox h1 = new HBox();
		h1.getChildren().addAll(cbpant1, spinner);
		h1.setAlignment(Pos.CENTER);
		h1.setSpacing(15);

		gridpant1.add(h1, 13, 10);
		gridpant1.add(addpant1, 14, 40);
		gridpant1.add(backpant1, 17, 40);

		gridpant1.setAlignment(Pos.TOP_LEFT);
		gridpant1.setPadding(new Insets(20, 30, 40, 50));
		gridpant1.setHgap(25);
		gridpant1.setVgap(20);

		pantn1 = new Scene(gridpant1, 500, 700);
		pantnum1.setScene(pantn1);
		pantnum1.setWidth(450);
		pantnum1.setHeight(450);

		arrayOfbottonpant.get(2).setOnAction(e -> {
			pantnum2.setTitle(" pant of male 2");
			pantnum2.setFullScreen(true);
			pantsmale.close();
			pantnum2.show();
			return;
		});
		Scene pantn2 = null;

		GridPane gridpant2 = new GridPane();

		Image pant2 = new Image(new File("pantbg2.png").toURI().toString());
		BackgroundImage bjpant2 = new BackgroundImage(pant2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridpant2.setBackground(new Background(bjpant2));

		ComboBox<String> cbpant2 = new ComboBox<>();
		cbpant2.setPrefWidth(100);
		cbpant2.setValue("Size");
		ObservableList<String> itemspant2 = FXCollections.observableArrayList(pantsize);
		cbpant2.getItems().addAll(itemspant2);

		Button backpant2 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backpant2.setBackground(null);
		backpant2.setAlignment(Pos.CENTER_LEFT);
		Button addpant2 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addpant2.setBackground(null);
		addpant2.setAlignment(Pos.CENTER_LEFT);
		Button seebag1 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag1.setBackground(null);
		seebag1.setAlignment(Pos.CENTER_LEFT);
		gridpant2.add(seebag1, 20, 40);
		seebag1.setOnAction(e -> {
			pantnum2.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backpant2.setOnAction(e -> {
			pantnum2.close();
			pantsmale.show();
		});
		Spinner<Integer> spinner1 = new Spinner<Integer>();
		int initialValue1 = 1;
		SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue1);
		spinner1.setValueFactory(valueFactory1);
		HBox h2 = new HBox();
		h2.getChildren().addAll(cbpant2, spinner1);
		h2.setAlignment(Pos.CENTER);
		h2.setSpacing(15);

		gridpant2.add(h2, 13, 10);
		gridpant2.add(addpant2, 14, 40);
		gridpant2.add(backpant2, 17, 40);

		gridpant2.setAlignment(Pos.TOP_LEFT);
		gridpant2.setPadding(new Insets(20, 30, 40, 50));
		gridpant2.setHgap(25);
		gridpant2.setVgap(20);

		pantn2 = new Scene(gridpant2, 500, 700);
		pantnum2.setScene(pantn2);
		pantnum2.setWidth(450);
		pantnum2.setHeight(450);

		arrayOfbottonpant.get(3).setOnAction(e -> {
			pantnum3.setTitle(" pant of male 3");
			pantnum3.setFullScreen(true);
			pantsmale.close();
			pantnum3.show();
			return;
		});

		Scene pantn3 = null;

		GridPane gridpant3 = new GridPane();

		Image pant3 = new Image(new File("pantbg3.png").toURI().toString());
		BackgroundImage bpant3 = new BackgroundImage(pant3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridpant3.setBackground(new Background(bpant3));

		ComboBox<String> cbpant3 = new ComboBox<>();
		cbpant3.setPrefWidth(100);
		cbpant3.setValue("Size");
		ObservableList<String> itemspant3 = FXCollections.observableArrayList(pantsize);
		cbpant3.getItems().addAll(itemspant3);
		
		Button backpant3 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backpant3.setBackground(null);
		backpant3.setAlignment(Pos.CENTER_LEFT);
		Button addpant3 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addpant3.setBackground(null);
		addpant3.setAlignment(Pos.CENTER_LEFT);
		Button seebag2 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag2.setBackground(null);
		seebag2.setAlignment(Pos.CENTER_LEFT);
		gridpant3.add(seebag2, 20, 40);
		seebag2.setOnAction(e -> {
			pantnum3.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backpant3.setOnAction(e -> {
			pantnum3.close();
			pantsmale.show();
		});
		Spinner<Integer> spinner2 = new Spinner<Integer>();
		int initialValue2 = 1;
		SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue2);
		spinner2.setValueFactory(valueFactory2);
		HBox h3 = new HBox();
		h3.getChildren().addAll(cbpant3, spinner2);
		h3.setAlignment(Pos.CENTER);
		h3.setSpacing(15);

		gridpant3.add(h3, 13, 10);
		gridpant3.add(addpant3, 14, 40);
		gridpant3.add(backpant3, 17, 40);

		gridpant3.setAlignment(Pos.TOP_LEFT);
		gridpant3.setPadding(new Insets(20, 30, 40, 50));
		gridpant3.setHgap(25);
		gridpant3.setVgap(20);

		pantn3 = new Scene(gridpant3, 500, 700);
		pantnum3.setScene(pantn3);
		pantnum3.setWidth(450);
		pantnum3.setHeight(450);

		arrayOfbottonpant.get(4).setOnAction(e -> {
			pantnum4.setTitle(" pant of male 4");
			pantnum4.setFullScreen(true);
			pantsmale.close();
			pantnum4.show();
			return;
		});

		Scene pantn4 = null;

		GridPane gridpant4 = new GridPane();

		Image pant4 = new Image(new File("pantbg4.png").toURI().toString());
		BackgroundImage bpant4 = new BackgroundImage(pant4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridpant4.setBackground(new Background(bpant4));

		ComboBox<String> cbpant4 = new ComboBox<>();
		cbpant4.setPrefWidth(100);
		cbpant4.setValue("Size");
		ObservableList<String> itemspant4 = FXCollections.observableArrayList(pantsize);
		cbpant4.getItems().addAll(itemspant4);

		Button backpant4 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backpant4.setBackground(null);
		backpant4.setAlignment(Pos.CENTER_LEFT);
		Button addpant4 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addpant4.setBackground(null);
		addpant4.setAlignment(Pos.CENTER_LEFT);
		Button seebag4 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag4.setBackground(null);
		seebag4.setAlignment(Pos.CENTER_LEFT);
		gridpant4.add(seebag4, 20, 40);
		seebag4.setOnAction(e -> {
			pantnum4.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backpant4.setOnAction(e -> {
			pantnum4.close();
			pantsmale.show();
		});
		Spinner<Integer> spinner3 = new Spinner<Integer>();
		int initialValue3 = 1;
		SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue3);
		spinner3.setValueFactory(valueFactory3);
		HBox h4 = new HBox();
		h4.getChildren().addAll(cbpant4, spinner3);
		h4.setAlignment(Pos.CENTER);
		h4.setSpacing(15);

		gridpant4.add(h4, 13, 10);
		gridpant4.add(addpant4, 14, 40);
		gridpant4.add(backpant4, 17, 40);
		gridpant4.setAlignment(Pos.TOP_LEFT);
		gridpant4.setPadding(new Insets(20, 30, 40, 50));
		gridpant4.setHgap(25);
		gridpant4.setVgap(20);

		pantn4 = new Scene(gridpant4, 500, 700);
		pantnum4.setScene(pantn4);
		pantnum4.setWidth(450);
		pantnum4.setHeight(450);

		arrayOfbottonpant.get(5).setOnAction(e -> {
			pantnum5.setTitle(" pant of male 5");
			pantnum5.setFullScreen(true);
			pantsmale.close();
			pantnum5.show();
			return;
		});

		Scene pantn5 = null;

		GridPane gridpant5 = new GridPane();

		Image pant5 = new Image(new File("pantbg5.png").toURI().toString());
		BackgroundImage bpant5 = new BackgroundImage(pant5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridpant5.setBackground(new Background(bpant5));

		ComboBox<String> cbpant5 = new ComboBox<>();
		cbpant5.setPrefWidth(100);
		cbpant5.setValue("Size");
		ObservableList<String> itemspant5 = FXCollections.observableArrayList(pantsize);
		cbpant5.getItems().addAll(itemspant5);

		Button backpant5 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backpant5.setBackground(null);
		backpant5.setAlignment(Pos.CENTER_LEFT);
		Button addpant5 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addpant5.setBackground(null);
		addpant5.setAlignment(Pos.CENTER_LEFT);
		Button seebag5 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag5.setBackground(null);
		seebag5.setAlignment(Pos.CENTER_LEFT);
		gridpant5.add(seebag5, 20, 40);
		seebag5.setOnAction(e -> {
			pantnum5.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backpant5.setOnAction(e -> {
			pantnum5.close();
			pantsmale.show();
		});
		Spinner<Integer> spinner4 = new Spinner<Integer>();
		int initialValue4 = 1;
		SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue4);
		spinner4.setValueFactory(valueFactory4);
		HBox h5 = new HBox();
		h5.getChildren().addAll(cbpant5, spinner4);
		h5.setAlignment(Pos.CENTER);
		h5.setSpacing(15);

		gridpant5.add(h5, 13, 10);
		gridpant5.add(addpant5, 14, 40);
		gridpant5.add(backpant5, 17, 40);

		gridpant5.setAlignment(Pos.TOP_LEFT);
		gridpant5.setPadding(new Insets(20, 30, 40, 50));
		gridpant5.setHgap(25);
		gridpant5.setVgap(20);

		pantn5 = new Scene(gridpant5, 500, 700);
		pantnum5.setScene(pantn5);
		pantnum5.setWidth(450);
		pantnum5.setHeight(450);
		/*
		 * get info in ArrayList
		 */
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
			addpant1.setText(" 🛒 ");
			addpant2.setText(" 🛒 ");
			addpant3.setText(" 🛒 ");
			addpant4.setText(" 🛒 ");
			addpant5.setText(" 🛒 ");
		}));
		addpant1.setOnAction(e -> {
			addpant1.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbpant1.getValue(), spinner.getValue(),
					new File("18.png").toURI().toString(), 69.99, "REGULAR FIT JEANS | MAGNETIC\r\n" + "CLOSURE");

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
			if(cbpant1.getValue().equalsIgnoreCase("Size")) {
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
	
		addpant2.setOnAction(e -> {
			addpant2.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbpant2.getValue(), spinner1.getValue(),
					new File("19.png").toURI().toString(), 49.99, "REGULAR FIT JEANS ");
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
			if(cbpant2.getValue().equalsIgnoreCase("Size")) {
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

		addpant3.setOnAction(e -> {
			addpant3.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbpant3.getValue(), spinner2.getValue(),
					new File("20.png").toURI().toString(), 54.99,
					"Senior Men's Open Back\r\n" + "Adaptive Cargo Pant");
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
			if(cbpant3.getValue().equalsIgnoreCase("Size")) {
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
		addpant4.setOnAction(e -> {
			addpant4.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbpant4.getValue(), spinner3.getValue(),
					new File("21.png").toURI().toString(), 59.99, "Men's Open-Back Jeans");
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
			if(cbpant4.getValue().equalsIgnoreCase("Size")) {
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
	
		addpant5.setOnAction(e -> {
			addpant5.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbpant5.getValue(), spinner4.getValue(),
					new File("22.png").toURI().toString(), 49.99, "Men's Easy Grip Pull-On Cargo Pants");
			
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
			if(cbpant5.getValue().equalsIgnoreCase("Size")) {
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
	}

	public static ArrayList<ClassForBagArr> arr = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}
}
