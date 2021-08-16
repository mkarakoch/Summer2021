package Day07_InterviewQuestions;

import java.util.Scanner;

public class HeallthyProblem {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program that accepts name,surname, age, weight, height;
		 * Calculates BMI(Body Mass Index) and prints the user’s status like that;
		 * John CARPENTER is 25 years old, his height is 170.5 cm and his weight is 80.24 kg. He is HEALTHY because his BMI=24.7
		 * formula; bmi = weight / (height * height / 10000);
		 * bmi less than or equal 20 is weak,less than or equal 25 is healty,less than or equal 30 is fat, 
		 * the other option is obese
		 */
		String name ="John";
		String surname = "CARPENTER";
		int years=29;
		double height=179;
		double weight=100;
		double bmi=weight / (height*height/1000);
		
		
		String status;
		
		if(bmi<=2.0)	{
			
			status="weak";
			
		}else if(bmi<=2.5) {
			status = "healthy";
			
		}else if (bmi<=3.0) {
			
			status="fat";
			
		}else
			status="obese";
		
		System.out.println(name + " " + surname + " is " + years + " years old, his height is " + height + " and his weight is "+ weight + " kg. He is " + status + " because his BMI " + bmi );
////		
//		String name2 = "Muhammet";
//		String lname = " Karakoc";
//		int age = 29; ... devam et 
		
		
////		
		
		
		
		
		
		
	}

}
