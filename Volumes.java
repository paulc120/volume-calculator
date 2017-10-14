/*
 
 Paul Choh
 CS 120: Computer Programming I 
 Fall 2017
 Volumes.java
 
 */

import java.util.*;
import java.text.DecimalFormat; 

public class Volumes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		
		// ask user to input length of radius
		int radius; 
		System.out.print("Enter the length of the radius"
						+ "(between 0.0 and 10.0): ");
		radius = scan.nextInt(); 
		
		// set random number generator 
		Random generator = new Random(); 
		double num1, num2; 
		num1 = generator.nextDouble() * 10; 
		num2 = generator.nextDouble() * 10; 
		
		// set decimal format for 10's place
		DecimalFormat fmt = new DecimalFormat("0.#"); 
		
		// display the hieght of cylinder and cone
		System.out.print("\nThe height of a cylinder is --> " + fmt.format(num1));
		System.out.print("\nThe height of a cone is ------> " + fmt.format(num2));
		
		
		double volumeOfSphere, volumeOfCylinder, 
		       volumeOfCone, pow1, pow2; 
		
		// set formula for volume of sphere
		pow1 = Math.pow(radius, 3); 
		volumeOfSphere = (1.333333)*(3.14) * (pow1); 
		
		// set formula for volume of cylinder
		pow2 = Math.pow(radius, 2); 
		volumeOfCylinder = (3.14) * (num1) * (pow2); 
		
		// set formula for volume of cone
		volumeOfCone = (3.14) * (num2 / 3) * (pow2); 
		
		// display results
		System.out.print("\n\nThe sphere's volume is ------------> " + fmt.format(volumeOfSphere));
		System.out.print("\nThe cylinder's volume is -----------> " + fmt.format(volumeOfCylinder));
		System.out.print("\nThe cone's volume is -------------> " + fmt.format(volumeOfCone));
	}

}
