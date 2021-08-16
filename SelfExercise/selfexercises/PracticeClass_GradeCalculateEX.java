package selfexercises;

import java.util.Scanner;

public class PracticeClass_GradeCalculateEX {

	public static void main(String[] args) {
		
		
		/*
		  
		 Write a program and calculate grade of three exams with the given values
	 * A==>90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59 EXAMPLE: INPUT : Math=70
	 * Science=60 Chemistry=89 A==> 90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59
	 * OUTPUT : Math Grade = C Science Grade = D Chemistry Grade = B
		  
		 */

		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your grade");
		
		int MG = scan.nextInt();
		System.out.println( MG>=90 && MG <=100 ? "MG = A" : MG>=80 && MG<=89 ? "MG = B" : MG>=70 && MG<=79 ? "MG=C" : MG>=60 && MG<=69 ? "MG = D" : MG>=0 && MG<=59 ? "MG = F" : "Wrong Grade");
		
		
		int SG = scan.nextInt();
		System.out.println( SG>=90 && SG <=100 ? "SG = A" : SG>=80 && SG<=89 ? "SG = B" : SG>=70 && SG<=79 ? "SG=C" : SG>=60 && SG<=69 ? "SG = D" : SG>=0 && SG<=59 ? "SG = F" : "Wrong Grade");
		
		int CG = scan.nextInt();
		System.out.println( CG>=90 && CG <=100 ? "CG = A" : CG>=80 && CG<=89 ? "CG = B" : CG>=70 && CG<=79 ? "CG=C" : CG>=60 && CG<=69 ? "CG = D" : CG>=0 && CG<=59 ? "CG = F" : "Wrong Grade");
		
scan.close();
	}
}