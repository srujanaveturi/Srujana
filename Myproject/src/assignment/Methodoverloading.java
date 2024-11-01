package assignment;

public class Methodoverloading {
	public void display(int num) {
        System.out.println("Displaying an integer: " + num);
    }

    public void display(double num) {
        System.out.println("Displaying a double: " + num);
    }

	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading();
        
      
        obj.display(30);
        
        
        obj.display(50.5);
	}

}
