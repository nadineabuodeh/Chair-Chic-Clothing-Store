package clothes;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class gender extends Application {
	Tab male = null;
	Tab female = null;
	TabPane tabPane = new TabPane();

	ScrollPane malescroll = new ScrollPane();
	ScrollPane femalescroll = new ScrollPane();

	@Override
	public void start(Stage genderStage) throws Exception {
		Color c1 = Color.web("#EBEBD7");
		/*
		 * gender Scene
		 */
		Scene genderScene = null;
		BorderPane genderPane = new BorderPane();
		genderPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		// set an image to the background
		Button topfemalebutton = new Button("", new ImageView(new File("tops.png").toURI().toString()));
		topfemalebutton.setBackground(null);
		Button bottomfemalebutton = new Button("", new ImageView(new File("bottom.png").toURI().toString()));
		bottomfemalebutton.setBackground(null);
		Button dressfemalebutton = new Button("", new ImageView(new File("dress.png").toURI().toString()));
		dressfemalebutton.setBackground(null);
		Button jacketfemalebutton = new Button("", new ImageView(new File("jacket.png").toURI().toString()));
		jacketfemalebutton.setBackground(null);
		Button shoesfemalebutton = new Button("", new ImageView(new File("shoes.png").toURI().toString()));
		shoesfemalebutton.setBackground(null);
		HBox femalerow1 = new HBox();
		femalerow1.getChildren().addAll(topfemalebutton, bottomfemalebutton);
		femalerow1.setAlignment(Pos.CENTER);
		HBox femalerow2 = new HBox();
		femalerow2.getChildren().addAll(dressfemalebutton, jacketfemalebutton);
		femalerow2.setAlignment(Pos.CENTER);
		HBox femalerow3 = new HBox();
		femalerow3.getChildren().addAll(shoesfemalebutton);
		femalerow3.setAlignment(Pos.CENTER);
		VBox femaleVBox = new VBox();

		femaleVBox.setBorder(
				new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(0))));
		femalescroll.setContent(femaleVBox);
		femalescroll.pannableProperty().set(true);
		femalescroll.setFitToHeight(true);
		femalescroll.setFitToWidth(true);
		femalescroll.setHbarPolicy(ScrollBarPolicy.NEVER);
		femalescroll.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		Image gender = new Image(new File("gender.png").toURI().toString());
		BackgroundImage backgroundgender = new BackgroundImage(gender, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(250, 250, false, false, false, true));
		femaleVBox.setBackground(new Background(backgroundgender));
		// male
		Button bagmalebutton = new Button("", new ImageView(new File("bag.png").toURI().toString()));
		bagmalebutton.setBackground(null);
		Button shoesmalebutton = new Button("", new ImageView(new File("Shoe.png").toURI().toString()));
		shoesmalebutton.setBackground(null);
		Button jacketsmalebutton = new Button("", new ImageView(new File("Jackets.png").toURI().toString()));
		jacketsmalebutton.setBackground(null);
		Button paintmalebutton = new Button("", new ImageView(new File("Pants.png").toURI().toString()));
		paintmalebutton.setBackground(null);
		Button topmalebutton = new Button("", new ImageView(new File("Tops1.png").toURI().toString()));
		topmalebutton.setBackground(null);
		HBox malerow1 = new HBox();
		malerow1.getChildren().addAll(jacketsmalebutton, bagmalebutton);
		malerow1.setAlignment(Pos.CENTER);
		HBox malerow2 = new HBox();
		malerow2.getChildren().addAll(shoesmalebutton, paintmalebutton);
		malerow2.setAlignment(Pos.CENTER);
		HBox malerow3 = new HBox();
		malerow3.getChildren().addAll(topmalebutton);
		malerow3.setAlignment(Pos.CENTER);
		VBox maleVBox = new VBox();
		maleVBox.setBorder(
				new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(0))));
		malescroll.setContent(maleVBox);
		malescroll.pannableProperty().set(true);
		malescroll.setFitToHeight(true);
		malescroll.setFitToWidth(true);
		malescroll.setHbarPolicy(ScrollBarPolicy.NEVER);
		malescroll.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		maleVBox.setBackground(new Background(backgroundgender));
		male = new Tab("Male", malescroll);
		female = new Tab("Female", femalescroll);
		BorderPane borderlogout1 = new BorderPane();
		Button logout = new Button("", new ImageView(new File("logout1.png").toURI().toString()));
		logout.setBackground(null);
		logout.setAlignment(Pos.CENTER_LEFT);
		Button bag = new Button("", new ImageView(new File("bagbutton1.png").toURI().toString()));
		bag.setBackground(null);
		bag.setAlignment(Pos.CENTER_LEFT);
		HBox h = new HBox();
		h.getChildren().addAll(logout, bag);
		h.setSpacing(10);
		borderlogout1.setRight(h);
		maleVBox.getChildren().add(borderlogout1);
		maleVBox.getChildren().addAll(malerow1, malerow2, malerow3);
		maleVBox.setSpacing(45);
		BorderPane borderfemale = new BorderPane();
		Button logout1 = new Button("", new ImageView(new File("logout1.png").toURI().toString()));
		logout1.setBackground(null);
		logout1.setAlignment(Pos.CENTER_LEFT);
		Button bag1 = new Button("", new ImageView(new File("bagbutton1.png").toURI().toString()));
		bag1.setBackground(null);
		bag1.setAlignment(Pos.CENTER_LEFT);
		HBox h1 = new HBox();
		h1.getChildren().addAll(logout1, bag1);
		h1.setSpacing(10);
		borderfemale.setRight(h1);
		femaleVBox.getChildren().add(borderfemale);
		femaleVBox.getChildren().addAll(femalerow1, femalerow2, femalerow3);
		tabPane.getTabs().add(male);
		tabPane.getTabs().add(female);
		tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		genderPane.setCenter(tabPane);
		genderScene = new Scene(genderPane, 250, 250);
		genderStage.setScene(genderScene);
		genderStage.setTitle(" Gender ");
		genderStage.setFullScreen(true);
		genderStage.show();

		logout1.setOnAction(e -> {
			genderStage.close();
			login log = new login();
			Stage login = new Stage();
			try {
				log.start(login);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		});
		bag1.setOnAction(e -> {
			genderStage.close();
			Bag b = new Bag();
			Stage bs = new Stage();
			try {
				b.start(bs);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		logout.setOnAction(e -> {
			genderStage.close();
			login log = new login();
			Stage login = new Stage();
			try {
				log.start(login);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		});
		bag.setOnAction(e -> {
			genderStage.close();
			Bag b = new Bag();
			Stage bs = new Stage();
			try {
				b.start(bs);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		topfemalebutton.setOnAction(e -> {
			TopFemale t = new TopFemale();
			Stage tt = new Stage();
			try {
				t.start(tt);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			genderStage.close();

			return;
		});
		bottomfemalebutton.setOnAction(e -> {
			BottomFemale b = new BottomFemale();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			genderStage.close();
		});
		dressfemalebutton.setOnAction(e -> {
			DressFemale d = new DressFemale();
			Stage dd = new Stage();
			try {
				d.start(dd);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			genderStage.close();
			return;
		});

		jacketfemalebutton.setOnAction(e -> {
			JacketFemale j = new JacketFemale();
			Stage jj = new Stage();
			try {
				j.start(jj);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			genderStage.close();
			return;
		});
		jacketsmalebutton.setOnAction(e -> {
			JacketMale j = new JacketMale();
			try {
				Stage jj = new Stage();
				j.start(jj);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			genderStage.close();
			return;
		});
		paintmalebutton.setOnAction(e -> {
			PantMale p = new PantMale();
			Stage pp = new Stage();
			try {
				p.start(pp);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			genderStage.close();
			return;
		});
		shoesmalebutton.setOnAction(e -> {
			ShoesMale s = new ShoesMale();
			Stage ss = new Stage();
			try {
				s.start(ss);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			genderStage.close();
			return;
		});
		shoesfemalebutton.setOnAction(e -> {
			ShoesFemale s = new ShoesFemale();
			Stage ss = new Stage();
			try {
				s.start(ss);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			genderStage.close();
			return;
		});
		bagmalebutton.setOnAction(e -> {
			BagMale b = new BagMale();
			Stage bb = new Stage();
			try {
				b.start(bb);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			genderStage.close();
			return;
		});

		topmalebutton.setOnAction(e -> {
			TopMale t = new TopMale();
			Stage tt = new Stage();
			try {
				t.start(tt);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			genderStage.close();
			return;
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
