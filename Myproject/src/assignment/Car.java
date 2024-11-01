package assignment;

	public class Car {
	    String model;
	    double price;
	    public Car() {
	        model = "BMW";  
	        price = 50000;      
	    }
	    public void displayDetails() {
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Price: $" + price);
	    }


	public static void main(String[] args) {
		 Car car1 = new Car();
	        
	        car1.displayDetails();

	}

	}


