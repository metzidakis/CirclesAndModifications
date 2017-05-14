public class Circle {

	/* exercise 1

	Step 1: Create a class that represents a circle shape. The class should be named as Circle and include the following three integer fields:
	        x : the x coordinate
	        y : the y coordinate
	        r : the radius
    Choose appropriate access modifiers for the fields so that they cannot be accessed by other classes.

    Step 2: Create methods that provide access and modification (getters and setters) to the x, y and r fields.
	        Choose appropriate names that briefly describe the functionality of each method
	        Choose appropriately the return type and access modifiers of your methods

	Step 3: Create a default constructor that initializes a Circle to x=y=0 and r=5
    Step 3.1: Create an overloaded constructor that initializes all three instance variables

    Step 4: Create a method printCircleDetails that prints the details of your circle in the following message
	        * I'm a circle at point (x,y) with radius r
            Where x,y and r are the values of the current circle

    Step 6: Create an overloaded constructor which will initialize the x & y instance variables. The r instance variable should be initialized by calling the constructor from Step 3

    Step 7: Extend the functionality of your class by adding the following two methods:
	        the calculateArea which will calculates and returns the area (ð*radius*radius, ð=3.14) and
	        the calculatePerimeter which will calculates and returns the perimeter (2*ð*radius, ð=3.14)
	        Choose the appropriate return types for your methods

	Step 8: Add to your class a static and final field name pi (for ð).
	        Initialize its value upon declaring the field.
	        Then, modify your calculateArea and calculatePerimeter methods of Step 7 so that they make use of the new pi field.

	Step 9: Create a copy constructor for your Circle class.
	        Change the values of the first circle and print again their details
	        What do you observe? Explain your findings according to the memory allocation in slide #17

	Step 10: Create a method name cocentric that checks if two circles share the same centre (co-centric circles). The method should return true if circles are co-centric,
	         or false if circles have different centres.
	         What is the return type of the method?
	         What type of argument should your method have?
	Step 11: Declare a field named numberOfCreatedCircles that is common to all instances of class Circle and counts the number of the created circles. Think carefully of:
	         the type of your numberOfCreatedCircles field,any special modifiers that might need and, the place/places that the value of the field should be incremented
    */

    //variables (step 1)
    private int x;
    private int y;
	private int r;
	private static final double ð = 3.14;

	//Declare a field named numberOfCreatedCircles that is common to all instances of class Circle and counts the number of the created circles (Step 11)
	private static int numberOfCreatedCircles;

    //methods to set and get (step 2) + (Step 11)
    public int getX() { return x; }
    public int getY() { return y; }
	public int getRad() { return r; }
	public void setX( int x ) { this.x = x; }
	public void setY( int y ) { this.y = y; }
	public void setRad( int r ) { this.r = r; }
	public static int getNumberOfCreatedCircles() { return numberOfCreatedCircles; }

	//default constructor that initializes a Circle to x=y=0 and r=5 (Step 3)
    Circle() {
		this.x = 0;
		this.y = 0;
		this.r = 5;
		numberOfCreatedCircles++;
	}

	//overloaded constructor that initializes all three instance variables (Step 3.1)
	Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		numberOfCreatedCircles++;
	}

	//Overloaded constructor which will initialize the x & y instance variables. The r instance variable should be initialized by calling the constructor from Step 3 (Step 6)
	Circle(int x, int y) {
		this(); //initialize x,y,r from the "step 3" constructor
		this.x = x;
		this.y = y;
		numberOfCreatedCircles++;
	}

	//Create a copy constructor for your Circle class. (Step 9)
	Circle( Circle original ) {
		this( original.x, original.y, original.r);
	}

	//Create a method printCircleDetails that prints the details of your circle (Step 4)
	public void printCircleDetails() {
		System.out.println("I'm a circle at point (" + this.x+"," + this.y + ") with radius " + this.r);

	}

	//Create a method calculateArea which will calculates and returns the area (ð*radius*radius, ð=3.14)
	public double calculateArea() {
		double area;
		area = ð*r*r;
		return area;
	}

	//Create a method the calculatePerimeter which will calculates and returns the perimeter (2*ð*radius, ð=3.14)
	public double calculatePerimeter() {
		double perimeter;
		perimeter = 2*ð*r;
		return perimeter;
	}

	//Create a method name cocentric that checks if two circles share the same centre (Step 10)
	public boolean coCentrics(Circle proxy ) {
		boolean a=( this.x == proxy.getX() ) && ( this.y == proxy.getY() );
		return a;
	}







}