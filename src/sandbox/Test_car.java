package sandbox;
/*
public class Test_car {

	// Do not modify the code below
	public static void main(String[] args) {
	    Car defaultCar = new Car();
	    defaultCar.printCarDetails();
	}
}

class Car {
	   String color;
	   String brand;
	   int price;

	 //Declared the String color, String brand, int price;
	   public Car(String color, String brand, int price) {
	           this.color = color;
	           this.brand = brand;
	           this.price = price;
	    }

	//Assigned the Constructor parameters
	   public Car() {
	        this("Black", "Tesla", 9000);
	    }

	   void printCarDetails() {
	       this.print();
	   }

	//Changed the 'System.out.println' format to print each variable in one after the other with spaces.
	   private void print() {
	       System.out.println(color+ " " +brand+ " " +price);
	   }   
	 
	//Changed the 'return' format to do the same as the 'System.out.println' format.
	    public String toString() {
	        return color + " " + brand + " " + price;
	    }

	}

/*
class Car { 
	String color; 
	String brand; 
	int price;


	public Car(String color, String brand, int price) {
	       this.color = color;
	       this.brand = brand;
	       this.price = price;
	   }

	   public Car() {
		// TODO Auto-generated constructor stub
	}

	void printCarDetails() {
	       this.print();
	   }

	   private void print() {
	       System.out.println(color+ " " +brand+ " " +price);
	   }
	@Override
	public String toString() {
		return color + " " + brand + " " + price;
	}
	   
	}

*/











/*
 * 
 * public class ParameterizedConstructor {
                int num;
                String str;
 
                ParameterizedConstructor (int n, String s){
                      System.out.println("Parameterized Constructor called.");
                      num = n;
                      str = s;
                }
 
                public static void main(String args[]){
                     //constructor call
                     ParameterizedConstructor object = new ParameterizedConstructor (10, "W3spoint");
 
                     //print values of object properties
                     System.out.println("num = " + object.num);
                     System.out.println("str = " + object.str);
                }
}
 */












//Working this Car Code 
/*

public class Test_car {

public static void main(String args[]) {
	
    Car car1 = new Car("white", "BMW", 70000); 

    Car car2 = new Car("Red", "Audi", 80000); 

    car1.printCarDetails(); 

    car2.printCarDetails(); 
}
}
    
class Car { 
	//Declare String color; String brand; int price; in Car Class.    
	String color; String brand; int price;
	//Create a constructor and pass String color; String brand; int price
	public Car(String color, String brand, int price) {
	    //Assign constructor arguments to Car class instance variables with this keyword
	    this.color = color; 
	    this.brand = brand; 
	    this.price = price; 
		}	
	    //Create a function printCarDetails to print the value of Class instance variables
	void printCarDetails() {
	    System.out.println("Car{" +
	            "color='" + color + '\'' +
	            ", brand='" + brand + '\'' +
	            ", price=" + price +
	            '}');
	}	
    public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", price=" + price + "]";
}
}
*/