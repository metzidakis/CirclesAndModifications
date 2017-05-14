public class TestCircles{

	/*                   Exercise 1 (continued)
	Step 5: Create a new class named TestCircles in the same package (directory) as your Circle class.
		    Create a main method in your TestCircles class. In the main method:
		    create a circle object,
		    assign values (of your preference) to the object using the setter methods from Step 2 and
		    print the details of your circle using the printCircleDetails method from Step 3
		    Compile and run your program!

	Step 6: (continued):In your main method, create objects using each one of the (now three) available constructors and print (using the print method) your objects

	Step 7: Test the functionality of the two new methods with the Circles that you created earlier in your main method

	Step 9: Create two circles where the second one will be a copy of the first one
	        Print their details
	        Change the values of the first circle and print again their details
	        What do you observe? Explain your findings according to the memory allocation

	*/

	public static void main(String []args) {

	//Step 5
	Circle circle0 = new Circle();
	circle0.setX(16);
	circle0.printCircleDetails();

	//3 circles created (Step 6)
	Circle circle1 = new Circle();
	Circle circle2 = new Circle(12,14,17);
	Circle circle3 = new Circle(15,19);

	//print their details (Step 6)
	circle1.printCircleDetails();
	circle2.printCircleDetails();
	circle3.printCircleDetails();

	//Test the functionality of the methods (calculateArea,calculatePerimeter) with the Circles (Step 7)
	System.out.println("The area for circle 1 is: " + circle1.calculateArea());
	System.out.println("The area for circle 2 is: " + circle2.calculateArea());
	System.out.println("The area for circle 3 is: " + circle3.calculateArea());
	System.out.println("The perimeter for circle 1 is: " + circle1.calculatePerimeter());
	System.out.println("The perimeter for circle 2 is: " + circle2.calculatePerimeter());
	System.out.println("The perimeter for circle 3 is: " + circle3.calculatePerimeter());

	//Create two circles where the second one will be a copy of the first one (Step 9)
	Circle circle4 = new Circle(14,15,16);
	Circle circlecopyof4 = new Circle(circle4);

	//print details of circle 4 and copy of circle 4
	circle4.printCircleDetails();
	circlecopyof4.printCircleDetails();

	//Change the values of the first circle and print again their details
	circle4.setX( 2 );
	circle4.setY( 3 );
	circle4.setRad( 4 );
	circle4.printCircleDetails();
	circlecopyof4.printCircleDetails();

	//---------------------------------------example of wrong copy (they point to the same memory location)-----------------------------------------------------------------------------------------

    Circle circle5 = new Circle(11,12,19);
	Circle circlecopyof5 =  circle5;
	circle5.printCircleDetails();
	circlecopyof5.printCircleDetails();

	//Change the values of the first circle and print again their details
	circle5.setX( 2 );
	circle5.setY( 3 );
	circle5.setRad( 4 );
	circle5.printCircleDetails();
	circlecopyof5.printCircleDetails();
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	//test coCentrics method
	circle5.coCentrics(circle1);
	circle5.coCentrics(circle4);
	System.out.println("Circle5 is cocentric with circle1: " + circle5.coCentrics(circle1));
	System.out.println("Circle5 is cocentric with circle4: " + circle5.coCentrics(circle4));

	//number Of Created Circles
	System.out.println("You have created: " + Circle.getNumberOfCreatedCircles() +" circles !!!");




	}

}