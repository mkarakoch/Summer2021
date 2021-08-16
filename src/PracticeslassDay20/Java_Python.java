package PracticeslassDay20;

public class Java_Python {
	
	
	
	static boolean isCountSame(String str){
        int countJava, countPython;
        countJava = countPython = 0;
        for(int i = 0; i < str.length() - 5; i++){
            if(str.substring(i, i + 4).equalsIgnoreCase("java"))
                countJava++;
            if(str.substring(i, i + 6).equalsIgnoreCase("python"))
                countPython++;
        }
        return countJava == countPython;
    }
		


	public static void main(String[] args) {
		System.out.println(isCountSame("javajava"));

	}

}
