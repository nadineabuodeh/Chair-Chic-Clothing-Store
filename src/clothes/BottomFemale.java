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

public class BottomFemale extends Application {
	int j = 0;
	ImageView imageView = null;
	int i = 0;
	int addtop1Clicks = 0;
	int addtop2Clicks = 0;
	int addtop3Clicks = 0;
	int addtop4Clicks = 0;

	@Override
	public void start(Stage bottomsfemale) throws Exception {
		Color c1 = Color.web("#EBEBD7");
		Scene BottomFemaleScene = null;
		GridPane BottomFemalePane = new GridPane();
		Image empty = new Image(new File("clothes.png").toURI().toString());
		BackgroundImage backgroundempty = new BackgroundImage(empty, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(250, 250, false, false, false, true));
		BottomFemalePane.setBackground(new Background(backgroundempty));
		Button rButton = new Button("", new ImageView(new File("arrow.png").toURI().toString()));
		rButton.setBackground(null);
		rButton.setAlignment(Pos.CENTER);

		Button lButton = new Button("", new ImageView(new File("LEFTARROW.png").toURI().toString()));
		lButton.setBackground(null);
		lButton.setAlignment(Pos.CENTER);
		HBox hboxtop = new HBox();
		hboxtop.getChildren().addAll(lButton, rButton);
		hboxtop.setAlignment(Pos.CENTER);
		hboxtop.setSpacing(10);

		BorderPane bordertop = new BorderPane();
		bordertop.setBottom(hboxtop);
		bordertop.setAlignment(hboxtop, Pos.CENTER);

		ArrayList<Button> arrayOfbottom = new ArrayList<>();
		Button bttopstart = new Button("", new ImageView(new File("bottomstartfemale.png").toURI().toString()));
		bttopstart.setBackground(null);
		Button bt1top = new Button("", new ImageView(new File("fbottom1.png").toURI().toString()));
		bt1top.setBackground(null);
		Button bt2top = new Button("", new ImageView(new File("fbottom2.png").toURI().toString()));
		bt2top.setBackground(null);
		Button bt3top = new Button("", new ImageView(new File("fbottom3.png").toURI().toString()));
		bt3top.setBackground(null);
		Button bt4top = new Button("", new ImageView(new File("fbottom4.png").toURI().toString()));
		bt4top.setBackground(null);

		arrayOfbottom.add(bttopstart);
		arrayOfbottom.add(bt1top);
		arrayOfbottom.add(bt2top);
		arrayOfbottom.add(bt3top);
		arrayOfbottom.add(bt4top);

		bordertop.setCenter(arrayOfbottom.get(j));

		rButton.setOnAction(e -> {
			j = j + 1;
			if (j == arrayOfbottom.size()) {
				j = 0;
			}
			bordertop.setCenter(arrayOfbottom.get(j));
		});
		lButton.setOnAction(e -> {
			j = j - 1;
			if (j > arrayOfbottom.size() + 1 || j == -1) {
				j = arrayOfbottom.size() - 1;
			}
			bordertop.setCenter(arrayOfbottom.get(j));
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
		BottomFemalePane.add(borderlogout1, 1000, 1000);
		bag.setOnAction(e -> {
			bottomsfemale.close();
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
		BottomFemalePane.getChildren().add(bordertop);
		BottomFemalePane.setAlignment(Pos.CENTER);
		BottomFemaleScene = new Scene(BottomFemalePane, 250, 300);
		bottomsfemale.setScene(BottomFemaleScene);
		back.setOnAction(e -> {
			bottomsfemale.close();
			gender g = new gender();
			Stage gg = new Stage();
			try {
				g.start(gg);
	            g.tabPane.getSelectionModel().select(g.female);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		});
		bottomsfemale.setTitle(" bottom of female ");
		bottomsfemale.setFullScreen(true);
		bottomsfemale.show();

		Stage num1 = new Stage();
		Stage num2 = new Stage();
		Stage num3 = new Stage();
		Stage num4 = new Stage();
		arrayOfbottom.get(1).setOnAction(e -> {
			num1.setTitle(" bottom of female 1");
			num1.setFullScreen(true);
			bottomsfemale.close();
			num1.show();
			return;
		});

		Scene topn1 = null;

		GridPane gridtop1 = new GridPane();

		Image top1 = new Image(new File("bottomfbg1.png").toURI().toString());
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
		Button seetop = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seetop.setBackground(null);
		seetop.setAlignment(Pos.CENTER_LEFT);
		gridtop1.add(seetop, 20, 40);
		seetop.setOnAction(e -> {
			num1.close();
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
			num1.close();
			bottomsfemale.show();
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
		num1.setScene(topn1);
		num1.setWidth(450);
		num1.setHeight(450);

		arrayOfbottom.get(2).setOnAction(e -> {
			num2.setTitle(" bottom of female");
			num2.setFullScreen(true);
			bottomsfemale.close();
			num2.show();
			return;
		});
		Scene topn2 = null;

		GridPane gridtop2 = new GridPane();

		Image top2 = new Image(new File("bottomfbg2.png").toURI().toString());
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
		Button seetop1 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seetop1.setBackground(null);
		seetop1.setAlignment(Pos.CENTER_LEFT);
		gridtop2.add(seetop1, 20, 40);
		seetop1.setOnAction(e -> {
			num2.close();
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
			num2.close();
			bottomsfemale.show();
		});
		Spinner<Integer> spinner1 = new Spinner<Integer>();
		int initialValue1 = 1;
		SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue1);
		spinner1.setValueFactory(valueFactory1);
		HBox h2 = new HBox();
		h2.getChildren().addAll(cbtop2, spinner1);
		h2.setAlignment(Pos.CENTER);
		h2.setSpacing(15);
		gridtop2.add(h2, 13, 10);
		gridtop2.add(addtop2, 14, 40);
		gridtop2.add(backtop2, 17, 40);

		gridtop2.setAlignment(Pos.TOP_LEFT);
		gridtop2.setPadding(new Insets(20, 30, 40, 50));
		gridtop2.setHgap(25);
		gridtop2.setVgap(20);

		topn2 = new Scene(gridtop2, 500, 700);
		num2.setScene(topn2);
		num2.setWidth(450);
		num2.setHeight(450);

		arrayOfbottom.get(3).setOnAction(e -> {
			num3.setTitle(" bottom of female");
			num3.setFullScreen(true);
			bottomsfemale.close();
			num3.show();
			return;
		});

		Scene topn3 = null;

		GridPane gridtop3 = new GridPane();

		Image top3 = new Image(new File("bottomfbg3.png").toURI().toString());
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
		Button seetop2 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seetop2.setBackground(null);
		seetop2.setAlignment(Pos.CENTER_LEFT);
		gridtop3.add(seetop2, 20, 40);
		seetop2.setOnAction(e -> {
			num3.close();
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
			num3.close();
			bottomsfemale.show();
		});
		Spinner<Integer> spinner3 = new Spinner<Integer>();
		int initialValue3 = 1;
		SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue3);
		spinner3.setValueFactory(valueFactory3);
		HBox h3 = new HBox();
		h3.getChildren().addAll(cbtop3, spinner3);
		h3.setAlignment(Pos.CENTER);
		h3.setSpacing(15);
		gridtop3.add(h3, 13, 10);
		gridtop3.add(addtop3, 14, 40);
		gridtop3.add(backtop3, 17, 40);

		gridtop3.setAlignment(Pos.TOP_LEFT);
		gridtop3.setPadding(new Insets(20, 30, 40, 50));
		gridtop3.setHgap(25);
		gridtop3.setVgap(20);

		topn3 = new Scene(gridtop3, 500, 700);
		num3.setScene(topn3);
		num3.setWidth(450);
		num3.setHeight(450);

		arrayOfbottom.get(4).setOnAction(e -> {
			num4.setTitle(" bottom of female 4");
			num4.setFullScreen(true);
			bottomsfemale.close();
			num4.show();
			return;
		});

		Scene topn4 = null;

		GridPane gridtop4 = new GridPane();

		Image top4 = new Image(new File("bottomfbg4.png").toURI().toString());
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
		Button seetop3 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seetop3.setBackground(null);
		seetop3.setAlignment(Pos.CENTER_LEFT);
		gridtop4.add(seetop3, 20, 40);
		seetop3.setOnAction(e -> {
			num4.close();
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
			num4.close();
			bottomsfemale.show();
		});
		Spinner<Integer> spinner4 = new Spinner<Integer>();
		int initialValue4 = 1;
		SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue4);
		spinner4.setValueFactory(valueFactory4);
		HBox h4 = new HBox();
		h4.getChildren().addAll(cbtop4, spinner4);
		h4.setAlignment(Pos.CENTER);
		h4.setSpacing(15);
		gridtop4.add(h4, 13, 10);
		gridtop4.add(addtop4, 14, 40);
		gridtop4.add(backtop4, 17, 40);
		gridtop4.setAlignment(Pos.TOP_LEFT);
		gridtop4.setPadding(new Insets(20, 30, 40, 50));
		gridtop4.setHgap(25);
		gridtop4.setVgap(20);

		topn4 = new Scene(gridtop4, 500, 700);
		num4.setScene(topn4);
		num4.setWidth(450);
		num4.setHeight(450);
		/*
		 * get info in ArrayList
		 */
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
			addtop1.setText(" 🛒 ");
			addtop2.setText(" 🛒 ");
			addtop3.setText(" 🛒 ");
			addtop4.setText(" 🛒 ");
		}));

		addtop1.setOnAction(e -> {
			addtop1.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop1.getValue(), spinner.getValue(),
					new File("33.png").toURI().toString(), 59.99, "Faux Leather Adaptive Leggings");
			boolean found = false;
			for (ClassForBagArr item : array) {
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
				array.add(newItem);
			}
			addtop1Clicks++;
		});
		
		addtop2.setOnAction(e -> {
			addtop2.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop2.getValue(), spinner1.getValue(),
					new File("34.png").toURI().toString(), 39.99, "Game Changer Seamless Back\r\n" + "lggings");
			
			boolean found = false;
			for (ClassForBagArr item : array) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner1.increment(1);
					item.setNum(spinner1.getValue());
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
				array.add(newItem);
			}
			addtop2Clicks++;
		});
		
		addtop3.setOnAction(e -> {
			addtop3.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop3.getValue(), spinner3.getValue(),
					new File("35.png").toURI().toString(), 49.99, "Seated Dress Pant Yoga Waist");
			boolean found = false;
			for (ClassForBagArr item : array) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner3.increment(1);
					item.setNum(spinner3.getValue());
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
				array.add(newItem);
			}
			addtop3Clicks++;
		});
		
		addtop4.setOnAction(e -> {
			addtop4.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop4.getValue(), spinner4.getValue(),
					new File("36.png").toURI().toString(), 29.99,
					"Game Changer Seamless Back Jeans\r\n" + " for Women");
			boolean found = false;
			for (ClassForBagArr item : array) {
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
				array.add(newItem);
			}
			addtop4Clicks++;
		});
	}

	public static ArrayList<ClassForBagArr> array = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}
}
