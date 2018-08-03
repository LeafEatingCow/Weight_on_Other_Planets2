import java.util.Scanner; // planetWeight 

public class planetWeight { 

public static void main(String[] args ) { 

Scanner input = new Scanner(System.in); 

System.out.print("How many pounds (lbs) do you weigh? (example: 155): ") ; 

double weight = input.nextDouble(); 

// compute weights on other planets 

double mercury = (weight * .38); 
double venus = (weight * .91); 
double earth = (weight * 1); 
double mars = (weight * .38); 
double jupiter = (weight * 2.34); 
double saturn = (weight * 1.06); 
double uranus = (weight * .92); 
double neptune = (weight * 1.19); 

// display results 

System.out.print("You weigh " + mercury + " lbs on Mercury \n"); 
System.out.print("You weigh " + venus + " lbs on Venus \n"); 
System.out.print("You weigh " + earth + " lbs on Earth \n"); 
System.out.print("You weigh " + mars + " lbs on Mars \n"); 
System.out.print("You weigh " + jupiter + " lbs on Jupiter \n"); 
System.out.print("You weigh " + saturn + " lbs on Saturn \n"); 
System.out.print("You weigh " + uranus + " lbs on Uranus \n"); 
System.out.print("You weigh " + neptune + " lbs on Neptune \n"); 

} // end of main method 

} // end of class planetWeight
