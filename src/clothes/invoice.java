package clothes;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class invoice extends Application{
	static ArrayList<ClassForBagArr> products = new ArrayList<ClassForBagArr>();
	static ArrayList<String> arraa = new ArrayList<>();
	
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

	private double calculateSubtotal(ArrayList<ClassForBagArr> products) {
		double subtotal = 0.0;
		for (ClassForBagArr product : products) {
			subtotal += product.getPrice() * product.getNum();
		}
		return subtotal;
	}
@Override
public void start(Stage primaryStage) throws Exception {
	products.addAll(Bag.products);
	login l = new login();
	arraa.addAll(l.a);
	Image invoicebackground = new Image(new File("invoiceee.png").toURI().toString());
	ImageView invoceview = new ImageView(invoicebackground);

	invoceview.setFitWidth(1250);
	invoceview.setFitHeight(750);

	Image invoicetail = new Image(new File("invitaill.png").toURI().toString());
	ImageView invoview = new ImageView(invoicetail);

	invoview.setFitWidth(1250);
	invoview.setFitHeight(750);

	HBox userrr = new HBox();
	userrr.setPadding(new Insets(500, 50, 70, 70));
	userrr.setSpacing(720);

	SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Calendar c = Calendar.getInstance();
	String s = arraa.get(0).toUpperCase();
	Label incity = new Label(s);
	incity.setPrefWidth(200);

	Label indate = new Label(DateFormat.format(c.getTime()));
	SetFont(incity);
	SetFont(indate);

	userrr.getChildren().addAll(incity, indate);
	Double total = 0.0;

	VBox vbox = new VBox();
	vbox.setPadding(new Insets(35, 50, 50, 50));
	vbox.setSpacing(30);
	

	

	for (int i = 0; i < products.size(); i++) {
		HBox info = new HBox();
		info.setSpacing(50);
		Double Amount = products.get(i).getPrice() * products.get(i).getNum();
		Label nameinfo = new Label("" + products.get(i).getproductname());
		nameinfo.setPrefWidth(430);
		nameinfo.setAlignment(Pos.CENTER_LEFT);
		Label numtinfo = new Label("" + products.get(i).getNum());
		numtinfo.setPrefWidth(170);
		int oop = i;
		numtinfo.textProperty().addListener((obs, oldValue, newValue) -> {
			try {
				int newNum = Integer.parseInt(newValue);
				products.get(oop).setNum(newNum);
			} catch (NumberFormatException e) {
				numtinfo.setText(oldValue);
			}
		});
		Label priceinfo = new Label("" + products.get(i).getPrice() + " ₪‎");
		priceinfo.setPrefWidth(220);
		Label Amountinfo = new Label("" + Amount + " ₪‎");
		SetFont2(nameinfo);
		SetFont2(numtinfo);
		SetFont2(priceinfo);
		SetFont2(Amountinfo);

		info.getChildren().addAll(nameinfo, numtinfo, priceinfo, Amountinfo);
		vbox.getChildren().addAll(info);
	}

	VBox numbers = new VBox();
	numbers.setPadding(new Insets(12, 10, 10, 50));
	numbers.setSpacing(50);
	Label subbtotall = new Label(String.format("%.2f₪‎ ", calculateSubtotal(products)));
	SetFont(subbtotall);
	numbers.setMargin(subbtotall, new Insets(0, 0, 0, 850));
	double initialSubtotal = calculateSubtotal(products);

	double shippingFee = 20.0;
	if (initialSubtotal > 300) {
		shippingFee = 0.0;
	}
	double initialGrandTotal = initialSubtotal + shippingFee;
	total = total + shippingFee;
	Label finaltotal = new Label(String.format("%.2f₪‎ ", initialGrandTotal));
	SetFont(finaltotal);
	numbers.setMargin(finaltotal, new Insets(0, 0, 0, 850));

	Label payment = new Label("\r \rCash on delivery ");
	SetFont2(payment);
	numbers.setMargin(payment, new Insets(40, 10, 0, 60));

	subtotalLabel.textProperty().addListener((observable, oldText, newText) -> {
		double newSubtotal = Double.parseDouble(newText.substring(newText.indexOf(":") + 1, newText.indexOf("₪‎")));
		double newShippingFee = newSubtotal >= 300 ? 0.0 : 20.0;
		double newGrandTotal = newSubtotal + newShippingFee;
		finaltotal.setText(String.format(" %.2f₪‎ ", newGrandTotal));
		subbtotall.setText(String.format(" %.2f₪‎ ", newSubtotal));
	});
	numbers.getChildren().addAll(subbtotall, finaltotal, payment);

	GridPane invoice = new GridPane();
	invoice.setAlignment(Pos.CENTER);
	GridPane.setValignment(invoceview, VPos.CENTER);
	GridPane.setValignment(invoview, VPos.CENTER);

	invoice.setStyle("-fx-background-color: #EBEBD7;");
	invoice.add(invoceview, 0, 0);
	invoice.add(userrr, 0, 0);
	invoice.add(vbox, 0, 1);
	invoice.add(invoview, 0, 2);
	invoice.add(numbers, 0, 2);

	ScrollPane SP2 = new ScrollPane();
	SP2.setStyle("-fx-background-color: #EBEBD7;");
	SP2.setContent(invoice);
	SP2.pannableProperty().set(true);
	SP2.setFitToHeight(true);
	SP2.setFitToWidth(true);
	SP2.setHbarPolicy(ScrollBarPolicy.NEVER);
	SP2.setVbarPolicy(ScrollBarPolicy.ALWAYS);

	Scene confirmationScene = new Scene(SP2, 500, 700);
	Stage orderConfirmation = new Stage();
	
	
	// Create a new scene for the order confirmation window
	orderConfirmation.setScene(confirmationScene);
	orderConfirmation.setFullScreen(true);
	orderConfirmation.show();
}
public static void main(String[] args) {
	launch(args);
}
}
