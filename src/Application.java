
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello world!");

// product1 is een variable
Product product1 = new Product();
product1.name="TV";
product1.soldOut = false;
product1.price =12;
boolean          uitkomst = product1.isCheap();
// Declaration //Assinment

product1.incresePrice(1000);

System.out.println(product1.price);

Product Product2= new Product ();
Product2.price = 119;
Product2.name = "Laptop";

Product2.print();

new Product (12);



Car car1 = new Car();
car1.brand = "Volvo";
car1.amountOfDoors = 5;
car1.isElectric = false;
car1.maxSpeed = 300;
car1.engineBrand = "whatEver";

System.out.println("---------------");

car1.printMaxSpeed();

System.out.println("---------------");

car1.printAllProperties();

System.out.println("---------------");

car1.updateBrand("tesla");
car1.updateMaxSpeed(400);
car1.printAllProperties();

System.out.println("---------------");

System.out.println(car1.isFast());
System.out.println(car1.isSmall());
	}
	
}
