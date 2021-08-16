package Do_While;

public class Do_While {

	public static void main(String[] args) {
		/* 
		  For dongusu ile while arasindaki fark
		  		for loop ta yineleme sayisi bilindiginde for kullaniyoruz
		  		 -	Başlatma, döngüde bir kez gerçekleşir.
		  		
		  While da yineleme sayisi bilinmediginde kullaniyoruz. 
		  		- Baslatma dongusunde basatma ifadesi while in icinde ise 
		  			dongu her yinelendiginde yeniden baslatir
		 */
		
		
		int m = 0;
		do { 
			System.out.println(m);
			m++;
		}while (m <=10);
		
		
	System.out.println("**********" );
	
		int n  = 10;
		do { 
			System.out.println(n);
			n--;
		}while (n>=0);
		
	System.out.println("**********");	
	
	
		int c=0;
		
		do {
			System.out.println(c);
			c--;
			
		}while (c>=10);
		

	}

}
