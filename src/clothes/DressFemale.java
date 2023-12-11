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

public class DressFemale extends Application {
	int j = 0;
	ImageView imageView = null;
	int i = 0;

	int adddress1 = 0;
	int adddress2 = 0;
	int adddress3 = 0;
	int adddress4 = 0;

	@Override
	public void start(Stage dressfemale) throws Exception {
		Color c1 = Color.web("#EBEBD7");
		Scene Scene = null;
		GridPane Pane = new GridPane();
		Image empty = new Image(new File("clothes.png").toURI().toString());
		BackgroundImage backgroundempty = new BackgroundImage(empty, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(250, 250, false, false, false, true));
		Pane.setBackground(new Background(backgroundempty));
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

		ArrayList<Button> array = new ArrayList<>();
		Button bttopstart = new Button("", new ImageView(new File("dressstartfemale.png").toURI().toString()));
		bttopstart.setBackground(null);
		Button bt1 = new Button("", new ImageView(new File("fdress1.png").toURI().toString()));
		bt1.setBackground(null);
		Button bt2 = new Button("", new ImageView(new File("fdress2.png").toURI().toString()));
		bt2.setBackground(null);
		Button bt3 = new Button("", new ImageView(new File("fdress3.png").toURI().toString()));
		bt3.setBackground(null);
		Button bt4 = new Button("", new ImageView(new File("fdress4.png").toURI().toString()));
		bt4.setBackground(null);

		array.add(bttopstart);
		array.add(bt1);
		array.add(bt2);
		array.add(bt3);
		array.add(bt4);

		bordertop.setCenter(array.get(j));

		rButton.setOnAction(e -> {
			j = j + 1;
			if (j == array.size()) {
				j = 0;
			}
			bordertop.setCenter(array.get(j));
		});
		lButton.setOnAction(e -> {
			j = j - 1;
			if (j > array.size() + 1 || j == -1) {
				j = array.size() - 1;
			}
			bordertop.setCenter(array.get(j));
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
		Pane.add(borderlogout1, 1000, 1000);
		bag.setOnAction(e -> {
			dressfemale.close();
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
		Pane.getChildren().add(bordertop);
		Pane.setAlignment(Pos.CENTER);
		Scene = new Scene(Pane, 250, 300);
		dressfemale.setScene(Scene);
		back.setOnAction(e -> {
			dressfemale.close();
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
		dressfemale.setTitle(" top of female ");
		dressfemale.setFullScreen(true);
		dressfemale.show();

		Stage num1 = new Stage();
		Stage num2 = new Stage();
		Stage num3 = new Stage();
		Stage num4 = new Stage();

		array.get(1).setOnAction(e -> {
			num1.setTitle(" top of female 1");
			num1.setFullScreen(true);
			dressfemale.close();
			num1.show();
			return;
		});

		Scene n1 = null;

		GridPane grid1 = new GridPane();

		Image top1 = new Image(new File("dressfbg1.png").toURI().toString());
		BackgroundImage btop1 = new BackgroundImage(top1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		grid1.setBackground(new Background(btop1));

		String[] size = { "M", "L", "XL", "XXL", "XXXL" };
		ComboBox<String> cbtop1 = new ComboBox<>();
		cbtop1.setPrefWidth(100);
		cbtop1.setValue("Size");
		ObservableList<String> itemstop1 = FXCollections.observableArrayList(size);
		cbtop1.getItems().addAll(itemstop1);
		Spinner<Integer> spinner2 = new Spinner<Integer>();
		int initialValue2 = 1;
		SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue2);
		spinner2.setValueFactory(valueFactory2);
		HBox h1 = new HBox();
		h1.getChildren().addAll(cbtop1, spinner2);
		h1.setAlignment(Pos.CENTER);
		h1.setSpacing(15);
		
		Button back1 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		back1.setBackground(null);
		back1.setAlignment(Pos.CENTER_LEFT);
		Button add1 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		add1.setBackground(null);
		add1.setAlignment(Pos.CENTER_LEFT);
		Button seebag = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag.setBackground(null);
		seebag.setAlignment(Pos.CENTER_LEFT);
		grid1.add(seebag, 20, 40);
		seebag.setOnAction(e -> {
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
		
		back1.setOnAction(e -> {
			num1.close();
			dressfemale.show();
		});

		grid1.add(h1, 13, 10);
		grid1.add(add1, 14, 40);
		grid1.add(back1, 17, 40);

		grid1.setAlignment(Pos.TOP_LEFT);
		grid1.setPadding(new Insets(20, 30, 40, 50));
		grid1.setHgap(25);
		grid1.setVgap(20);

		n1 = new Scene(grid1, 500, 700);
		num1.setScene(n1);
		num1.setWidth(450);
		num1.setHeight(450);

		array.get(2).setOnAction(e -> {
			num2.setTitle(" top of female");
			num2.setFullScreen(true);
			dressfemale.close();
			num2.show();
			return;
		});
		Scene n2 = null;

		GridPane grid2 = new GridPane();

		Image top2 = new Image(new File("dressfbg2.png").toURI().toString());
		BackgroundImage bjtop2 = new BackgroundImage(top2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		grid2.setBackground(new Background(bjtop2));

		ComboBox<String> cbtop2 = new ComboBox<>();
		cbtop2.setPrefWidth(100);
		cbtop2.setValue("Size");
		ObservableList<String> itemstop2 = FXCollections.observableArrayList(size);
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
		grid2.add(seebag1, 20, 40);
		seebag1.setOnAction(e -> {
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
			dressfemale.show();
		});
		Spinner<Integer> spinner = new Spinner<Integer>();
		int initialValue = 1;
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue);
		spinner.setValueFactory(valueFactory);
		HBox h15 = new HBox();
		h15.getChildren().addAll(cbtop2, spinner);
		h15.setAlignment(Pos.CENTER);
		h15.setSpacing(15);

		grid2.add(h15, 13, 10);
		grid2.add(addtop2, 14, 40);
		grid2.add(backtop2, 17, 40);

		grid2.setAlignment(Pos.TOP_LEFT);
		grid2.setPadding(new Insets(20, 30, 40, 50));
		grid2.setHgap(25);
		grid2.setVgap(20);

		n2 = new Scene(grid2, 500, 700);
		num2.setScene(n2);
		num2.setWidth(450);
		num2.setHeight(450);

		array.get(3).setOnAction(e -> {
			num3.setTitle(" top of female 3");
			num3.setFullScreen(true);
			dressfemale.close();
			num3.show();
			return;
		});

		Scene topn3 = null;

		GridPane gridtop3 = new GridPane();

		Image top3 = new Image(new File("dressfbg3.png").toURI().toString());
		BackgroundImage btop3 = new BackgroundImage(top3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridtop3.setBackground(new Background(btop3));

		ComboBox<String> cbtop3 = new ComboBox<>();
		cbtop3.setPrefWidth(100);
		cbtop3.setValue("Size");
		ObservableList<String> itemstop3 = FXCollections.observableArrayList(size);
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
			dressfemale.show();
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

		array.get(4).setOnAction(e -> {
			num4.setTitle(" bottom of female 4");
			num4.setFullScreen(true);
			dressfemale.close();
			num4.show();
			return;
		});

		Scene topn4 = null;

		GridPane gridtop4 = new GridPane();

		Image top4 = new Image(new File("dressfbg4.png").toURI().toString());
		BackgroundImage btop4 = new BackgroundImage(top4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridtop4.setBackground(new Background(btop4));

		ComboBox<String> cbtop4 = new ComboBox<>();
		cbtop4.setPrefWidth(100);
		cbtop4.setValue("Size");
		ObservableList<String> itemstop4 = FXCollections.observableArrayList(size);
		cbtop4.getItems().addAll(itemstop4);

		Button backtop4 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backtop4.setBackground(null);
		backtop4.setAlignment(Pos.CENTER_LEFT);
		Button addtop4 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addtop4.setBackground(null);
		addtop4.setAlignment(Pos.CENTER_LEFT);
		Button seebag3 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag3.setBackground(null);
		seebag3.setAlignment(Pos.CENTER_LEFT);
		gridtop4.add(seebag3, 20, 40);
		seebag3.setOnAction(e -> {
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
			dressfemale.show();
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
			add1.setText(" 🛒 ");
			addtop2.setText(" 🛒 ");
			addtop3.setText(" 🛒 ");
			addtop4.setText(" 🛒 ");
		}));
		add1.setOnAction(e -> {
			add1.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop1.getValue(), spinner2.getValue(),
					new File("44.png").toURI().toString(), 29.99, "STRIPE CREWNECK DRESS");

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
			if(cbtop1.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			adddress1++;
		});
		addtop2.setOnAction(e -> {
			addtop2.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop2.getValue(), spinner.getValue(),
					new File("45.png").toURI().toString(), 29.99, "SEATED FIT BELTED SHIFT DRESS");

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
			if(cbtop2.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			adddress2++;
		});
	
		addtop3.setOnAction(e -> {
			addtop3.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop3.getValue(), spinner3.getValue(),
					new File("46.png").toURI().toString(), 39.99, "FLORAL SHIRTDRESS");

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
			if(cbtop3.getValue().equalsIgnoreCase("Size")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Please select a value of size.");
                alert.showAndWait();
			}
			else if (!found) {
				arr.add(newItem);
			}
			adddress3++;
		});

		addtop4.setOnAction(e -> {
			addtop4.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem = new ClassForBagArr(cbtop4.getValue(), spinner4.getValue(),
					new File("47.png").toURI().toString(), 39.99, "SOLID BELTED SHIRTDRESS");

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
			adddress4++;
		});
	}

	public static ArrayList<ClassForBagArr> arr = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}
}
