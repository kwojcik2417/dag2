

public class Product {
	
public String name;

public boolean soldOut;

public int price;

public void incresePrice(int price) {
	this.price = this.price + price;
	
}
public void print() {
	System.out.println("Product: Naam is" + name + "en prijs is" + price);
}

public boolean isCheap() {
	return price < 20;
}

//Constructor
public Product() {
	System.out.println("In constructor");
	price = 100;
	soldOut = false;
}
public Product(int price) {
	this.price = price;
}
public Product (String name, int price) {
	
}
}
