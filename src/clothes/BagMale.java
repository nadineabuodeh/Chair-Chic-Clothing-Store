package clothes;

import java.io.File;
import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
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

public class BagMale extends Application {
	int j = 0;
	ImageView imageView = null;
	int i = 0;
	int addBag1Clicks = 0;
	int addBag2Clicks = 0;
	int addBag3Clicks = 0;
	int addBag4Clicks = 0;
	int addBag5Clicks = 0;
	@Override
	public void start(Stage bagmale) throws Exception {
		Color c1 = Color.web("#EBEBD7");
		Scene bagMaleScene = null;
		GridPane bagMalePane = new GridPane();
		Image empty = new Image(new File("clothes.png").toURI().toString());
		BackgroundImage backgroundempty = new BackgroundImage(empty, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(250, 250, false, false, false, true));
		bagMalePane.setBackground(new Background(backgroundempty));
		Button rButtonbag = new Button("", new ImageView(new File("arrow.png").toURI().toString()));
		rButtonbag.setBackground(null);
		rButtonbag.setAlignment(Pos.CENTER);
		Button lButtonbag = new Button("", new ImageView(new File("LEFTARROW.png").toURI().toString()));
		lButtonbag.setBackground(null);
		lButtonbag.setAlignment(Pos.CENTER);
		HBox hboxsbag = new HBox();
		hboxsbag.getChildren().addAll(lButtonbag, rButtonbag);
		hboxsbag.setAlignment(Pos.CENTER);
		hboxsbag.setSpacing(10);
		BorderPane borderbag = new BorderPane();
		borderbag.setBottom(hboxsbag);
		borderbag.setAlignment(hboxsbag, Pos.CENTER);
		ArrayList<Button> arrayOfbottonbag = new ArrayList<>();
		Button btbagstart = new Button("", new ImageView(new File("bagstart.png").toURI().toString()));
		btbagstart.setBackground(null);
		Button bt1bag = new Button("", new ImageView(new File("bag1.png").toURI().toString()));
		bt1bag.setBackground(null);
		Button bt2bag = new Button("", new ImageView(new File("bag2.png").toURI().toString()));
		bt2bag.setBackground(null);
		Button bt3bag = new Button("", new ImageView(new File("bag3.png").toURI().toString()));
		bt3bag.setBackground(null);
		Button bt4sbag = new Button("", new ImageView(new File("bag4.png").toURI().toString()));
		bt4sbag.setBackground(null);
		Button bt5bag = new Button("", new ImageView(new File("bag5.png").toURI().toString()));
		bt5bag.setBackground(null);

		arrayOfbottonbag.add(btbagstart);
		arrayOfbottonbag.add(bt1bag);
		arrayOfbottonbag.add(bt2bag);
		arrayOfbottonbag.add(bt3bag);
		arrayOfbottonbag.add(bt4sbag);
		arrayOfbottonbag.add(bt5bag);

		borderbag.setCenter(arrayOfbottonbag.get(j));
		rButtonbag.setOnAction(e -> {
			j = j + 1;
			if (j == arrayOfbottonbag.size()) {
				j = 0;
			}
			borderbag.setCenter(arrayOfbottonbag.get(j));
		});
		lButtonbag.setOnAction(e -> {
			j = j - 1;
			if (j > arrayOfbottonbag.size() + 1 || j == -1) {
				j = arrayOfbottonbag.size() - 1;
			}
			borderbag.setCenter(arrayOfbottonbag.get(j));
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
		bagMalePane.add(borderlogout1, 1000, 1000);
		bag.setOnAction(e -> {
			bagmale.close();
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
		bagMalePane.getChildren().add(borderbag);
		bagMalePane.setAlignment(Pos.CENTER);
		bagMaleScene = new Scene(bagMalePane, 250, 300);
		bagmale.setScene(bagMaleScene);
		back.setOnAction(e -> {
			bagmale.close();
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
		bagmale.setTitle(" bag of male ");
		bagmale.setFullScreen(true);
		bagmale.show();
		Stage bagnum1 = new Stage();
		Stage bagnum2 = new Stage();
		Stage bagnum3 = new Stage();
		Stage bagnum4 = new Stage();
		Stage bagnum5 = new Stage();

		arrayOfbottonbag.get(1).setOnAction(e -> {
			bagnum1.setTitle(" bage of male 1");
			bagnum1.setFullScreen(true);
			bagmale.close();
			bagnum1.show();
			return;
		});
		Scene bagm1 = null;

		GridPane gridmale1 = new GridPane();

		Image bag1 = new Image(new File("bagbg1.png").toURI().toString());
		BackgroundImage bb1 = new BackgroundImage(bag1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridmale1.setBackground(new Background(bb1));

		
		Button backbag1 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backbag1.setBackground(null);
		backbag1.setAlignment(Pos.CENTER_LEFT);
		Button addbag1 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addbag1.setBackground(null);
		addbag1.setAlignment(Pos.CENTER_LEFT);
		Button seebag = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag.setBackground(null);
		seebag.setAlignment(Pos.CENTER_LEFT);
		gridmale1.add(seebag, 20, 40);
		seebag.setOnAction(e -> {
			bagnum1.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backbag1.setOnAction(e -> {
			bagnum1.close();
			bagmale.show();
		});
		Spinner<Integer> spinner = new Spinner<Integer>();
		int initialValue = 1;
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue);
		spinner.setValueFactory(valueFactory);
		gridmale1.add(spinner, 13, 10);
		gridmale1.add(addbag1, 14, 40);
		gridmale1.add(backbag1, 17, 40);

		gridmale1.setAlignment(Pos.TOP_LEFT);
		gridmale1.setPadding(new Insets(20, 30, 40, 50));
		gridmale1.setHgap(25);
		gridmale1.setVgap(20);

		bagm1 = new Scene(gridmale1, 500, 700);
		bagnum1.setScene(bagm1);
		bagnum1.setWidth(450);
		bagnum1.setHeight(450);

		arrayOfbottonbag.get(2).setOnAction(e -> {
			bagnum2.setTitle(" bag of male 2");
			bagnum2.setFullScreen(true);
			bagmale.close();
			bagnum2.show();
			return;
		});
		Scene bagm2 = null;

		GridPane gridmale2 = new GridPane();

		Image bag2 = new Image(new File("bagbg2.png").toURI().toString());
		BackgroundImage bb2 = new BackgroundImage(bag2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridmale2.setBackground(new Background(bb2));

		Button backbag2 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backbag2.setBackground(null);
		backbag2.setAlignment(Pos.CENTER_LEFT);
		Button addbag2 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addbag2.setBackground(null);
		addbag2.setAlignment(Pos.CENTER_LEFT);
		Button seebag1 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag1.setBackground(null);
		seebag1.setAlignment(Pos.CENTER_LEFT);
		gridmale2.add(seebag1, 20, 40);
		seebag1.setOnAction(e -> {
			bagnum2.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		backbag2.setOnAction(e -> {
			bagnum2.close();
			bagmale.show();
		});
		Spinner<Integer> spinner1 = new Spinner<Integer>();
		int initialValue1 = 1;
		SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue1);
		spinner1.setValueFactory(valueFactory1);
		gridmale2.add(spinner1, 13, 10);
		gridmale2.add(addbag2, 14, 40);
		gridmale2.add(backbag2, 17, 40);

		gridmale2.setAlignment(Pos.TOP_LEFT);
		gridmale2.setPadding(new Insets(20, 30, 40, 50));
		gridmale2.setHgap(25);
		gridmale2.setVgap(20);

		bagm2 = new Scene(gridmale2, 500, 700);
		bagnum2.setScene(bagm2);
		bagnum2.setWidth(450);
		bagnum2.setHeight(450);

		arrayOfbottonbag.get(3).setOnAction(e -> {
			bagnum3.setTitle(" bag of male 3");
			bagnum3.setFullScreen(true);
			bagmale.close();
			bagnum3.show();
			return;
		});
		Scene bagm3 = null;

		GridPane gridmale3 = new GridPane();

		Image bag3 = new Image(new File("bagbg3.png").toURI().toString());
		BackgroundImage bb3 = new BackgroundImage(bag3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridmale3.setBackground(new Background(bb3));		

		Button backbag3 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backbag3.setBackground(null);
		backbag3.setAlignment(Pos.CENTER_LEFT);
		Button addbag3 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addbag3.setBackground(null);
		addbag3.setAlignment(Pos.CENTER_LEFT);
		Button seebag2 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag2.setBackground(null);
		seebag2.setAlignment(Pos.CENTER_LEFT);
		gridmale3.add(seebag2, 20, 40);
		seebag2.setOnAction(e -> {
			bagnum3.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		backbag3.setOnAction(e -> {
			bagnum3.close();
			bagmale.show();
		});
		Spinner<Integer> spinner11 = new Spinner<Integer>();
		int initialValue11 = 1;
		SpinnerValueFactory<Integer> valueFactory11 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue11);
		spinner11.setValueFactory(valueFactory11);
		gridmale3.add(spinner11, 13, 10);
		gridmale3.add(addbag3, 14, 40);
		gridmale3.add(backbag3, 17, 40);

		gridmale3.setAlignment(Pos.TOP_LEFT);
		gridmale3.setPadding(new Insets(20, 30, 40, 50));
		gridmale3.setHgap(25);
		gridmale3.setVgap(20);

		bagm3 = new Scene(gridmale3, 500, 700);
		bagnum3.setScene(bagm3);
		bagnum3.setWidth(450);
		bagnum3.setHeight(450);

		arrayOfbottonbag.get(4).setOnAction(e -> {
			bagnum4.setTitle(" bag of male 4");
			bagnum4.setFullScreen(true);
			bagmale.close();
			bagnum4.show();
			return;
		});
		Scene bagm4 = null;

		GridPane gridmale4 = new GridPane();

		Image bag4 = new Image(new File("bagbg4.png").toURI().toString());
		BackgroundImage bb4 = new BackgroundImage(bag4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridmale4.setBackground(new Background(bb4));

		Button backbag4 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backbag4.setBackground(null);
		backbag4.setAlignment(Pos.CENTER_LEFT);
		Button addbag4 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addbag4.setBackground(null);
		addbag4.setAlignment(Pos.CENTER_LEFT);
		Button seebag3 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag3.setBackground(null);
		seebag3.setAlignment(Pos.CENTER_LEFT);
		gridmale4.add(seebag3, 20, 40);
		seebag3.setOnAction(e -> {
			bagnum4.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		backbag4.setOnAction(e -> {
			bagnum4.close();
			bagmale.show();
		});
		Spinner<Integer> spinner4 = new Spinner<Integer>();
		int initialValue4 = 1;
		SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue4);
		spinner4.setValueFactory(valueFactory4);
		gridmale4.add(spinner4, 13, 10);
		gridmale4.add(addbag4, 14, 40);
		gridmale4.add(backbag4, 17, 40);

		gridmale4.setAlignment(Pos.TOP_LEFT);
		gridmale4.setPadding(new Insets(20, 30, 40, 50));
		gridmale4.setHgap(25);
		gridmale4.setVgap(20);

		bagm4 = new Scene(gridmale4, 500, 700);
		bagnum4.setScene(bagm4);
		bagnum4.setWidth(450);
		bagnum4.setHeight(450);

		arrayOfbottonbag.get(5).setOnAction(e -> {
			bagnum5.setTitle(" bag of male 5");
			bagnum5.setFullScreen(true);
			bagmale.close();
			bagnum5.show();
			return;
		});
		Scene bagm5 = null;

		GridPane gridmale5 = new GridPane();

		Image bag5 = new Image(new File("bagbg5.png").toURI().toString());
		BackgroundImage bb5 = new BackgroundImage(bag5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(250, 250, false, false, false, true));

		gridmale5.setBackground(new Background(bb5));


		Button backbag5 = new Button("", new ImageView(new File("back.png").toURI().toString()));
		backbag5.setBackground(null);
		backbag5.setAlignment(Pos.CENTER_LEFT);
		Button addbag5 = new Button("", new ImageView(new File("add.png").toURI().toString()));
		addbag5.setBackground(null);
		addbag5.setAlignment(Pos.CENTER_LEFT);
		Button seebag4 = new Button("", new ImageView(new File("bagbutton.png").toURI().toString()));
		seebag4.setBackground(null);
		seebag4.setAlignment(Pos.CENTER_LEFT);
		gridmale5.add(seebag4, 20, 40);
		seebag4.setOnAction(e -> {
			bagnum5.close();
			Bag b = new Bag();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		backbag5.setOnAction(e -> {
			bagnum5.close();
			bagmale.show();
		});
		Spinner<Integer> spinner5 = new Spinner<Integer>();
		int initialValue5 = 1;
		SpinnerValueFactory<Integer> valueFactory5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
				initialValue5);
		spinner5.setValueFactory(valueFactory5);
		gridmale5.add(spinner5, 13, 10);
		gridmale5.add(addbag5, 14, 40);
		gridmale5.add(backbag5, 17, 40);

		gridmale5.setAlignment(Pos.TOP_LEFT);
		gridmale5.setPadding(new Insets(20, 30, 40, 50));
		gridmale5.setHgap(25);
		gridmale5.setVgap(20);

		bagm5 = new Scene(gridmale5, 500, 700);
		bagnum5.setScene(bagm5);
		bagnum5.setWidth(450);
		bagnum5.setHeight(450);
		/*
		 * get info in ArrayList
		 */
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
			addbag1.setText(" 🛒 ");
			addbag2.setText(" 🛒 ");
			addbag3.setText(" 🛒 ");
			addbag4.setText(" 🛒 ");
			addbag5.setText(" 🛒 ");
		}));
		
		addbag1.setOnAction(e -> {
			addbag1.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem =  new ClassForBagArr("One Size", spinner.getValue(),
					new File("7.png").toURI().toString(), 39.99, "BACKREST BAG");
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
			
			if (!found) {
				array.add(newItem);
			}
			addBag1Clicks++;
		});
		addbag2.setOnAction(e -> {
			addbag2.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem =  new ClassForBagArr("One Size", spinner1.getValue(),
					new File("8.png").toURI().toString(), 39.99, "BACKREST BAG");
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
			
			if (!found) {
				array.add(newItem);
			}
			addBag2Clicks++;
		});
		addbag3.setOnAction(e -> {
			addbag3.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem =  new ClassForBagArr("One Size", spinner11.getValue(),
					new File("9.png").toURI().toString(), 19.99, "RACK PACK ");
			boolean found = false;
			for (ClassForBagArr item : array) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner11.increment(1);
					item.setNum(spinner11.getValue());
					found = true;
					break;
				}
			}
			
			if (!found) {
				array.add(newItem);
			}
			addBag3Clicks++;
		});
		addbag4.setOnAction(e -> {
			addbag4.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem =  new ClassForBagArr("One Size", spinner4.getValue(),
					new File("10.png").toURI().toString(), 24.99, "RACK PACK II");
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
			
			if (!found) {
				array.add(newItem);
			}
			addBag4Clicks++;
		});
		addbag5.setOnAction(e -> {
			addbag5.setText("added");
			Platform.runLater(() -> timeline.play());
			ClassForBagArr newItem =  new ClassForBagArr("One Size", spinner5.getValue(),
					new File("11.png").toURI().toString(), 39.99, "BACKREST COMMUTER PACK");
			boolean found = false;
			for (ClassForBagArr item : array) {
				if (item.getproductname().equals(newItem.getproductname())
						&& item.getSize().equals(newItem.getSize())) {
					spinner5.increment(1);
					item.setNum(spinner5.getValue());
					found = true;
					break;
				}
			}
			
			if (!found) {
				array.add(newItem);
			}
			addBag5Clicks++;
		});
	}

	public static ArrayList<ClassForBagArr> array = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}
}
