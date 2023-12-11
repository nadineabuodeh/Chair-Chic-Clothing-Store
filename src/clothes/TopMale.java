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

public class TopMale extends Application {
	int j = 0;
	ImageView imageView = null;
	int i = 0;
	int addBag1Clicks = 0;
	int addBag2Clicks = 0;
	int addBag3Clicks = 0;
	int addBag4Clicks = 0;
	int addBag5Clicks = 0;

	@Override
	public void start(Stage topsmale) throws Exception {
		Color c5 = Color.web("#666A4C");
		Color c1 = Color.web("#EBEBD7");
		Scene topMaleScene = null;
		GridPane topMalePane = new GridPane();
		Image empty = new Image(new File("clothes.png").toURI().toString());
		BackgroundImage backgroundempty = new BackgroundImage(empty, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(250, 250, false, false, false, true));
		topMalePane.setBackground(new Background(backgroundempty));
		Button rButtontop = new Button("", new ImageView(new File("arrow.png").toURI().toString()));
		rButtontop.setBackground(null);
		rButtontop.setAlignment(Pos.CENTER);

		Button lButtontop = new Button("", new ImageView(new File("LEFTARROW.png").toURI().toString()));
		lButtontop.setBackground(null);
		lButtontop.setAlignment(Pos.CENTER);
		HBox hboxtop = new HBox();
		hboxtop.getChildren().addAll(lButtontop, rButtontop);
		hboxtop.setAlignment(Pos.CENTER);
		hboxtop.setSpacing(10);

		BorderPane bordertop = new BorderPane();
		bordertop.setBottom(hboxtop);
		bordertop.setAlignment(hboxtop, Pos.CENTER);

		ArrayList<Button> arrayOfbottontop = new ArrayList<>();
		Button bttopstart = new Button("", new ImageView(new File("topstart.png").toURI().toString()));
		bttopstart.setBackground(null);
		Button bt1top = new Button("", new ImageView(new File("top1.png").toURI().toString()));
		bt1top.setBackground(null);
		Button bt2top = new Button("", new ImageView(new File("top2.png").toURI().toString()));
		bt2top.setBackground(null);
		Button bt3top = new Button("", new ImageView(new File("top3.png").toURI().toString()));
		bt3top.setBackground(null);
		Button bt4top = new Button("", new ImageView(new File("top4.png").toURI().toString()));
		bt4top.setBackground(null);
		Button bt5top = new Button("", new ImageView(new File("top5.png").toURI().toString()));
		bt5top.setBackground(null);

		arrayOfbottontop.add(bttopstart);
		arrayOfbottontop.add(bt1top);
		arrayOfbottontop.add(bt2top);
		arrayOfbottontop.add(bt3top);
		arrayOfbottontop.add(bt4top);
		arrayOfbottontop.add(bt5top);

		bordertop.setCenter(arrayOfbottontop.get(j));

		rButtontop.setOnAction(e -> {
			j = j + 1;
			if (j == arrayOfbottontop.size()) {
				j = 0;
			}
			bordertop.setCenter(arrayOfbottontop.get(j));
		});
		lButtontop.setOnAction(e -> {
			j = j - 1;
			if (j > arrayOfbottontop.size() + 1 || j == -1) {
				j = arrayOfbottontop.size() - 1;
			}
			bordertop.setCenter(arrayOfbottontop.get(j));
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
		topMalePane.add(borderlogout1, 1000, 1000);
		bag.setOnAction(e -> {
			topsmale.close();
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
		topMalePane.getChildren().add(bordertop);
		topMalePane.setAlignment(Pos.CENTER);

		topMaleScene = new Scene(topMalePane, 250, 300);
		topsmale.setScene(topMaleScene);
		back.setOnAction(e -> {
			topsmale.close();
			gender g = new gender();
			Stage gg = new Stage();
			try {
				g.start(gg);
	            g.tabPane.getSelectionModel().select(g.male);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		});
		topsmale.setTitle(" top of male ");
		topsmale.setFullScreen(true);
		topsmale.show();

		Stage topnum1 = new Stage();
		Stage topnum2 = new Stage();
		Stage topnum3 = new Stage();
		Stage topnum4 = new Stage();
		Stage topnum5 = new Stage();

		arrayOfbottontop.get(1).setOnAction(e -> {
			topnum1.setTitle(" top of male 1");
			topnum1.setFullScreen(true);
			topsmale.close();
			topnum1.show();
			return;
		});

		Scene topn1 = null;

		GridPane gridtop1 = new GridPane();

		Image top1 = new Image(new File("topbg1.png").toURI().toString());
		BackgroundImage btop1 = new BackgroundImage(top1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridtop1.setBackground(new Background(btop1));

		String[] topsize = { "M", "L", "XL", "XXL", "XXXL" };
		ComboBox<String> cbtop1 = new ComboBox<>();
		cbtop1.setPrefWidth(100);
		cbtop1.setValue("Size");
		ObservableList<String> itemstop1 = FXCollections.observableArrayList(topsize);
		cbtop1.getItems().addAll(itemstop1);

		Button backtop1 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backtop1.setBackground(null);
		backtop1.setAlignment(Pos.CENTER_LEFT);
		Button addtop1 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addtop1.setBackground(null);
		addtop1.setAlignment(Pos.CENTER_LEFT);
		Button seebag = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag.setBackground(null);
		seebag.setAlignment(Pos.CENTER_LEFT);
		gridtop1.add(seebag, 20, 40);
		seebag.setOnAction(e -> {
			topnum1.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backtop1.setOnAction(e -> {
			topnum1.close();
			topsmale.show();
		});
		Spinner<Integer> spinner = new Spinner<Integer>();
		int initialValue = 1;
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue);
		spinner.setValueFactory(valueFactory);
		HBox h1 = new HBox();
		h1.getChildren().addAll(cbtop1, spinner);
		h1.setAlignment(Pos.CENTER);
		h1.setSpacing(15);

		gridtop1.add(h1, 13, 10);
		gridtop1.add(addtop1, 14, 40);
		gridtop1.add(backtop1, 17, 40);

		gridtop1.setAlignment(Pos.TOP_LEFT);
		gridtop1.setPadding(new Insets(20, 30, 40, 50));
		gridtop1.setHgap(25);
		gridtop1.setVgap(20);

		topn1 = new Scene(gridtop1, 500, 700);
		topnum1.setScene(topn1);
		topnum1.setWidth(450);
		topnum1.setHeight(450);

		arrayOfbottontop.get(2).setOnAction(e -> {
			topnum2.setTitle(" top of male 2");
			topnum2.setFullScreen(true);
			topsmale.close();
			topnum2.show();
			return;
		});
		Scene topn2 = null;

		GridPane gridtop2 = new GridPane();

		Image top2 = new Image(new File("topbg2.png").toURI().toString());
		BackgroundImage bjtop2 = new BackgroundImage(top2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridtop2.setBackground(new Background(bjtop2));

		ComboBox<String> cbtop2 = new ComboBox<>();
		cbtop2.setPrefWidth(100);
		cbtop2.setValue("Size");
		ObservableList<String> itemstop2 = FXCollections.observableArrayList(topsize);
		cbtop2.getItems().addAll(itemstop2);

		Button backtop2 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backtop2.setBackground(null);
		backtop2.setAlignment(Pos.CENTER_LEFT);
		Button addtop2 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addtop2.setBackground(null);
		addtop2.setAlignment(Pos.CENTER_LEFT);
		Button seebag1 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag1.setBackground(null);
		seebag1.setAlignment(Pos.CENTER_LEFT);
		gridtop2.add(seebag1, 20, 40);
		seebag1.setOnAction(e -> {
			topnum2.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backtop2.setOnAction(e -> {
			topnum2.close();
			topsmale.show();
		});
		Spinner<Integer> spinner3 = new Spinner<Integer>();
		int initialValue3 = 1;
		SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue3);
		spinner3.setValueFactory(valueFactory3);
		HBox h3 = new HBox();
		h3.getChildren().addAll(cbtop2, spinner3);
		h3.setAlignment(Pos.CENTER);
		h3.setSpacing(15);

		gridtop2.add(h3, 13, 10);
		gridtop2.add(addtop2, 14, 40);
		gridtop2.add(backtop2, 17, 40);

		gridtop2.setAlignment(Pos.TOP_LEFT);
		gridtop2.setPadding(new Insets(20, 30, 40, 50));
		gridtop2.setHgap(25);
		gridtop2.setVgap(20);

		topn2 = new Scene(gridtop2, 500, 700);
		topnum2.setScene(topn2);
		topnum2.setWidth(450);
		topnum2.setHeight(450);

		arrayOfbottontop.get(3).setOnAction(e -> {
			topnum3.setTitle(" top of male 3");
			topnum3.setFullScreen(true);
			topsmale.close();
			topnum3.show();
			return;
		});

		Scene topn3 = null;

		GridPane gridtop3 = new GridPane();

		Image top3 = new Image(new File("topbg3.png").toURI().toString());
		BackgroundImage btop3 = new BackgroundImage(top3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridtop3.setBackground(new Background(btop3));

		ComboBox<String> cbtop3 = new ComboBox<>();
		cbtop3.setPrefWidth(100);
		cbtop3.setValue("Size");
		ObservableList<String> itemstop3 = FXCollections.observableArrayList(topsize);
		cbtop3.getItems().addAll(itemstop3);

		Button backtop3 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backtop3.setBackground(null);
		backtop3.setAlignment(Pos.CENTER_LEFT);
		Button addtop3 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addtop3.setBackground(null);
		addtop3.setAlignment(Pos.CENTER_LEFT);
		Button seebag2 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag2.setBackground(null);
		seebag2.setAlignment(Pos.CENTER_LEFT);
		gridtop3.add(seebag2, 20, 40);
		seebag2.setOnAction(e -> {
			topnum3.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backtop3.setOnAction(e -> {
			topnum3.close();
			topsmale.show();
		});
		Spinner<Integer> spinner2 = new Spinner<Integer>();
		int initialValue2 = 1;
		SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue2);
		spinner2.setValueFactory(valueFactory2);
		HBox h4 = new HBox();
		h4.getChildren().addAll(cbtop3, spinner2);
		h4.setAlignment(Pos.CENTER);
		h4.setSpacing(15);

		gridtop3.add(h4, 13, 10);
		gridtop3.add(addtop3, 14, 40);
		gridtop3.add(backtop3, 17, 40);

		gridtop3.setAlignment(Pos.TOP_LEFT);
		gridtop3.setPadding(new Insets(20, 30, 40, 50));
		gridtop3.setHgap(25);
		gridtop3.setVgap(20);

		topn3 = new Scene(gridtop3, 500, 700);
		topnum3.setScene(topn3);
		topnum3.setWidth(450);
		topnum3.setHeight(450);

		arrayOfbottontop.get(4).setOnAction(e -> {
			topnum4.setTitle(" top of male 4");
			topnum4.setFullScreen(true);
			topsmale.close();
			topnum4.show();
			return;
		});

		Scene topn4 = null;

		GridPane gridtop4 = new GridPane();

		Image top4 = new Image(new File("topbg4.png").toURI().toString());
		BackgroundImage btop4 = new BackgroundImage(top4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridtop4.setBackground(new Background(btop4));

		ComboBox<String> cbtop4 = new ComboBox<>();
		cbtop4.setPrefWidth(100);
		cbtop4.setValue("Size");
		ObservableList<String> itemstop4 = FXCollections.observableArrayList(topsize);
		cbtop4.getItems().addAll(itemstop4);

		Button backtop4 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backtop4.setBackground(null);
		backtop4.setAlignment(Pos.CENTER_LEFT);
		Button addtop4 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addtop4.setBackground(null);
		addtop4.setAlignment(Pos.CENTER_LEFT);
		Button seebag4 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag4.setBackground(null);
		seebag4.setAlignment(Pos.CENTER_LEFT);
		gridtop4.add(seebag4, 20, 40);
		seebag4.setOnAction(e -> {
			topnum4.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backtop4.setOnAction(e -> {
			topnum4.close();
			topsmale.show();
		});
		Spinner<Integer> spinner4 = new Spinner<Integer>();
		int initialValue4 = 1;
		SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue4);
		spinner4.setValueFactory(valueFactory4);
		HBox h5 = new HBox();
		h5.getChildren().addAll(cbtop4, spinner4);
		h5.setAlignment(Pos.CENTER);
		h5.setSpacing(15);

		gridtop4.add(h5, 13, 10);
		gridtop4.add(addtop4, 14, 40);
		gridtop4.add(backtop4, 17, 40);
		gridtop4.setAlignment(Pos.TOP_LEFT);
		gridtop4.setPadding(new Insets(20, 30, 40, 50));
		gridtop4.setHgap(25);
		gridtop4.setVgap(20);

		topn4 = new Scene(gridtop4, 500, 700);
		topnum4.setScene(topn4);
		topnum4.setWidth(450);
		topnum4.setHeight(450);

		arrayOfbottontop.get(5).setOnAction(e -> {
			topnum5.setTitle(" top of male 5");
			topnum5.setFullScreen(true);
			topsmale.close();
			topnum5.show();
			return;
		});

		Scene topn5 = null;

		GridPane gridtop5 = new GridPane();

		Image top5 = new Image(new File("topbg5.png").toURI().toString());
		BackgroundImage btop5 = new BackgroundImage(top5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridtop5.setBackground(new Background(btop5));

		ComboBox<String> cbtop5 = new ComboBox<>();
		cbtop5.setPrefWidth(100);
		cbtop5.setValue("Size");
		ObservableList<String> itemstop5 = FXCollections.observableArrayList(topsize);
		cbtop5.getItems().addAll(itemstop5);

		Button backtop5 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backtop5.setBackground(null);
		backtop5.setAlignment(Pos.CENTER_LEFT);
		Button addtop5 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addtop5.setBackground(null);
		addtop5.setAlignment(Pos.CENTER_LEFT);
		Button seebag5 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag5.setBackground(null);
		seebag5.setAlignment(Pos.CENTER_LEFT);
		gridtop5.add(seebag5, 20, 40);
		seebag5.setOnAction(e -> {
			topnum5.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backtop5.setOnAction(e -> {
			topnum5.close();
			topsmale.show();
		});
		Spinner<Integer> spinner5 = new Spinner<Integer>();
		int initialValue5 = 1;
		SpinnerValueFactory<Integer> valueFactory5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue5);
		spinner5.setValueFactory(valueFactory5);
		HBox h6 = new HBox();
		h6.getChildren().addAll(cbtop5, spinner5);
		h6.setAlignment(Pos.CENTER);
		h6.setSpacing(15);

		gridtop5.add(h6, 13, 10);
		gridtop5.add(addtop5, 14, 40);
		gridtop5.add(backtop5, 17, 40);

		gridtop5.setAlignment(Pos.TOP_LEFT);
		gridtop5.setPadding(new Insets(20, 30, 40, 50));
		gridtop5.setHgap(25);
		gridtop5.setVgap(20);

		topn5 = new Scene(gridtop5, 500, 700);
		topnum5.setScene(topn5);
		topnum5.setWidth(450);
		topnum5.setHeight(450);
		/*
		 * get info in ArrayList
		 */
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
			addtop1.setText(" 🛒 ");
			addtop2.setText(" 🛒 ");
			addtop3.setText(" 🛒 ");
			addtop4.setText(" 🛒 ");
			addtop5.setText(" 🛒 ");
		}));
		
		addtop1.setOnAction(e -> {
			addtop1.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop1.getValue(), spinner.getValue(),
					new File("23.png").toURI().toString(), 29.99, "Men's Open Back Henley T-Shirt");

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
			if(cbtop1.getValue().equalsIgnoreCase("Size")) {
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
		
		addtop2.setOnAction(e -> {
			addtop2.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop2.getValue(), spinner3.getValue(),
					new File("24.png").toURI().toString(), 24.99, "Men's Open Back Polo Shirt \r\n" + " with Zip");
			
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
			if(cbtop2.getValue().equalsIgnoreCase("Size")) {
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
		
		addtop3.setOnAction(e -> {
			addtop3.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop3.getValue(), spinner2.getValue(),
					new File("25.png").toURI().toString(), 29.99, "Men's Open Back Active T-Shirt");
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
			if(cbtop3.getValue().equalsIgnoreCase("Size")) {
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

		addtop4.setOnAction(e -> {
			addtop4.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop4.getValue(), spinner4.getValue(),
					new File("26.png").toURI().toString(), 29.99,
					"Men's Adaptive Open-Back Polo\r\n" + " Shirt with Long Sleeves");
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
			if(cbtop4.getValue().equalsIgnoreCase("Size")) {
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
		
		addtop5.setOnAction(e -> {
			addtop5.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop5.getValue(), spinner5.getValue(),
					new File("27.png").toURI().toString(), 29.99,
					"Men's Open Back Classic Short\r\n " + "Sleeve Shirt");
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
			if(cbtop5.getValue().equalsIgnoreCase("Size")) {
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
