package selfexercises;

public class HealthProblemEX {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts name,surname, age, weight, height;
		 * Calculates BMI(Body Mass Index) and prints the user’s status like that;
		 * John CARPENTER is 25 years old, his height is 170.5 cm and his weight is 80.24 kg. He is HEALTHY because his BMI=24.7
		 * formula; bmi = weight / (height * height / 10000);
		 * bmi less than or equal 20 is weak,less than or equal 25 is healty,less than or equal 30 is fat, 
		 * the other option is obese
		 */
		String name = "Muhammet";
		
		String lname = " Karakoc";
		
		int age = 29;
		int weight = 100;
		int height = 179;
		double bmi = weight/((height*height)/1000);
		
		
		String bindex ;
		
		if (bmi<=2.0) {
			
		bindex="weak";
		
		} else if (bmi<=2.5) {
			bindex= "healthy";
			
		}else if ( bmi<=3.0) {
			
			bindex= "overweight";
			
		}else {
			
			bindex= "obese";
			
		}
		
			System.out.println(name.concat(lname)+ " is " + age + " years old, his height is " + height + " cm and his weight is " + weight + " kg. He is " + bindex + " because his BMI is " + bmi);
		
		// John CARPENTER is 25 years old, his height is 170.5 cm and his weight is 80.24 kg. He is HEALTHY because his BMI=24.7

	}

}
