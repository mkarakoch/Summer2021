package selfexercises;

import java.util.ArrayList;

public class ozgurabininsorusu {

	public static void main(String[] args) {
 // Which prime, below one-million, can be written as the sum of the most consecutive primes?
        
        ArrayList<Long>list2=new ArrayList<>();
        
        list2.add( (long) 0);
        long sum=0;
        long consum=0;
        int maxconsec=0;
        long prime=2;
        for(int i=2; i<1000000;i++) {
            if(isPrime(i)) {
                
                sum+=i;
                list2.add(sum);
            }
        }   
        
        for(int i=0; i<list2.size();i++) {
            for(int j=list2.size()-1;j>i;j--) {
                consum=list2.get(j)-list2.get(i);
                if(isPrime(consum)&&consum<1000000) {
                    if(j-i>maxconsec) {
                        maxconsec=j-i;
                        prime=consum;
                        
                    }
                    
                    
                }
                
            }
        }System.out.println(prime);
        System.out.println(maxconsec);
            
            
        
        
        
        
        
    }
    public static boolean isPrime(long n) {
        boolean isPrime=true;
        if(n<2) {isPrime=false;
            
        }for(int i=2;i*i<n+1;i++) {
            if(n%i==0) {isPrime=false;
            break;              
            }
        }return isPrime;

	}

}
