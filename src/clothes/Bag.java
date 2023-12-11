package clothes;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Bag extends Application {

	public static ArrayList<ClassForBagArr> products = new ArrayList<ClassForBagArr>();

	double sum = 0.0;
	Label subtotalLabel = new Label();

	public void SetFont(Label L) {

		L.setTextFill(Color.web("#666A4C"));
		L.setFont(Font.font("Arial", FontWeight.BOLD, 25));
	}

	public void SetFont2(Label L) {

		L.setTextFill(Color.web("#666A4C"));
		L.setFont(Font.font("Arial", 25));
	}

	private static double calculateSubtotal(ArrayList<ClassForBagArr> products) {
		double subtotal = 0.0;
		for (ClassForBagArr product : products) {
			subtotal += product.getPrice() * product.getNum();
		}
		return subtotal;
	}

	public void start(Stage shoppingcart) throws Exception {
		// TODO Auto-generated method stub
		products.addAll(JacketMale.arr);
		products.addAll(TopMale.arr);
		products.addAll(BagMale.array);
		products.addAll(PantMale.arr);
		products.addAll(ShoesMale.arr);
		products.addAll(BottomFemale.array);
		products.addAll(DressFemale.arr);
		products.addAll(JacketFemale.arr);
		products.addAll(ShoesFemale.arr);
		products.addAll(TopFemale.arr);

		Stage Cart = new Stage();
		Scene CartScene = null;
		Image background = new Image(new File("backg1.png").toURI().toString());
		ImageView imageView = new ImageView(background);
		imageView.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth());
		imageView.setFitHeight(Screen.getPrimary().getVisualBounds().getHeight());

		// Create an empty VBox to hold the products
		VBox productsBox = new VBox();
		productsBox.setAlignment(Pos.CENTER);
		productsBox.setSpacing(30);
		productsBox.setPadding(new Insets(550, 100, 10, 10));
		int j = 0;
		// Add each product to the VBox using a for loop
		for (ClassForBagArr product : products) {
			// Create an HBox for the product
			HBox productBox = new HBox();
			productBox.setSpacing(50);
			productBox.setPadding(new Insets(10, 100, 10, 10));
			CheckBox checkBox = new CheckBox();
			checkBox.setSelected(true);
			checkBox.selectedProperty().addListener((obs, oldValue, newValue) -> {
				if (!newValue) {
					productsBox.getChildren().remove(productBox);
					products.remove(product);
					subtotalLabel.setText(String.format("Subtotal: %.2f₪‎", calculateSubtotal(products)));
				}
			});
			Image image = new Image(product.getPath());
			ImageView imageView1 = new ImageView(image);
			imageView1.setFitWidth(800);
			imageView1.setFitHeight(400);

			VBox groupBox = new VBox();
			String[] prodsize = { "M", "L", "XL", "XXL", "XXXL", "one size" };
			
			ComboBox<String> sizeBox2 = new ComboBox<>();
			sizeBox2.setPrefWidth(150);
			sizeBox2.setValue(product.getSize());

			ObservableList<String> items2 = FXCollections.observableArrayList(prodsize);
			sizeBox2.getItems().addAll(items2);
			groupBox.getChildren().add(sizeBox2);

			Spinner<Integer> spinner2 = new Spinner<>();
			int initialValue2 = product.getNum();
			SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10,
					initialValue2);
			spinner2.setValueFactory(valueFactory2);

			Label priceLabel = new Label(String.format("%.2f₪‎", initialValue2 * product.getPrice()));
			int index = j;
			spinner2.valueProperty().addListener((obs, oldValue, newValue) -> {
				priceLabel.setText(String.format("%.2f₪‎", newValue * product.getPrice()));
				products.get(index).setNum(newValue);
				products.set(index, product);

				subtotalLabel.setText(String.format("Subtotal: %.2f₪‎", calculateSubtotal(products)));

			});
			SetFont(priceLabel);
			StackPane imagePane2 = new StackPane(imageView1, groupBox);
			StackPane.setMargin(groupBox, new Insets(200, 10, 10, 400));

			productBox.getChildren().addAll(checkBox, imagePane2, spinner2, priceLabel);
			productBox.setAlignment(Pos.CENTER);

			productsBox.getChildren().add(productBox);
			sum += product.getPrice() * product.getNum();
			j++;

		}

		VBox order = new VBox();
		order.setPadding(new Insets(600, 10, 100, 400));
		order.setSpacing(30);
		
		Button backward = new Button("BACK");
		backward.setStyle("-fx-background-color: #666A4C;-fx-background-radius: 25px; ");
		backward.setMinSize(250, 50);
		backward.setTextFill(Color.WHITE);
		backward.setFont(Font.font("Arial", FontWeight.BOLD, 20));
		backward.setMinSize(100, 50); 
		backward.setMaxSize(200, 100);

		
		HBox sub = new HBox();
		sub.setSpacing(330);
		Button Submit = new Button("Submit Order");
		Submit.setMinSize(250, 50);
		Submit.setTextFill(Color.WHITE);
		Submit.setFont(Font.font("Arial", FontWeight.BOLD, 20));
		Submit.setStyle("-fx-background-color: #666A4C;-fx-background-radius: 25px; ");
		double initialSubtotal = calculateSubtotal(products);

		double shippingFee = 20.0;
		if (initialSubtotal > 300) {
			shippingFee = 0.0;
		}
		double initialGrandTotal = initialSubtotal + shippingFee;


	
		Label Shippingfee = new Label("Shipping fee : " + shippingFee + " ₪‎");
		Label grandTotalLabel = new Label(String.format("Grand total: %.2f₪‎ ", initialGrandTotal));

		grandTotalLabel.setText(String.format("Grand total: %.2f₪‎ ", initialGrandTotal));
		sub.getChildren().addAll(grandTotalLabel, Submit);
		subtotalLabel.setText(String.format("Subtotal: %.2f₪‎", initialSubtotal));
		SetFont(subtotalLabel);

		subtotalLabel.textProperty().addListener((observable, oldText, newText) -> {
			double newSubtotal = Double.parseDouble(newText.substring(newText.indexOf(":") + 1, newText.indexOf("₪‎")));
			double newShippingFee = newSubtotal >= 300 ? 0.0 : 20.0;
			double newGrandTotal = newSubtotal + newShippingFee;
			grandTotalLabel.setText(String.format("Grand total: %.2f₪‎ ", newGrandTotal));
			Shippingfee.setText(String.format("Shipping fees: %.2f₪‎ ", newShippingFee));
		});

		SetFont(subtotalLabel);
		SetFont(Shippingfee);
		SetFont(grandTotalLabel);
		order.getChildren().addAll(subtotalLabel, Shippingfee, sub);

		Image tail = new Image(new File("backg2.png").toURI().toString());
		ImageView tailv = new ImageView(tail);
		tailv.setFitWidth(1500);
		tailv.setFitHeight(900);

		StackPane back = new StackPane(imageView, productsBox);
		back.setAlignment(Pos.TOP_LEFT);
		
		

		GridPane GP = new GridPane();
		GP.setStyle("-fx-background-color: #EBEBD7;");
		GP.add(back, 0, 1);
		GP.add(tailv, 0, 2);
		GP.add(order, 0, 2);
		GP.add(backward, 0, 3);

		ScrollPane SP = new ScrollPane();
		SP.setStyle("-fx-background-color: #EBEBD7;");
		SP.setContent(GP);
		SP.pannableProperty().set(true);
		SP.setFitToHeight(true);
		SP.setFitToWidth(true);
		SP.setHbarPolicy(ScrollBarPolicy.NEVER);
		SP.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		backward.setOnAction(e -> {
			Cart.close();
			
			gender g = new gender();
			Stage gg = new Stage();
			products.clear();
			try {
				g.start(gg);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		});
		CartScene = new Scene(SP,500,700);
		Cart.setScene(CartScene);
		Cart.setFullScreen(true);
		Cart.show();

		Submit.setOnAction(e -> {
			Cart.close();
			// Create a new scene for the order confirmation window
		invoice i = new invoice();
		Stage s = new Stage();
		try {
			i.start(s);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		});

	}

	public static void main(String[] args) {
		launch(args);

	}

}
