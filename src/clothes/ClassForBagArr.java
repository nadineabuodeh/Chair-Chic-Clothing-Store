package clothes;

public class ClassForBagArr {
	String size;
	int num;
	String path;
	double price;
	String prodname;

	public ClassForBagArr(String size, int num, String path) {
		this.size = size;
		this.num = num;
		this.path = path;
	}

	public ClassForBagArr(String size, int num, String path, double price, String prodname) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.num = num;
		this.path = path;
		this.price = price;
		this.prodname = prodname;

	}

	public String getSize() {
		return size;
	}

	public String getproductname() {
		return prodname;
	}

	public double getPrice() {
		return price;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
