package starting;

public class Strong {
	
	    public static void main(String s[])
	    {
	        int num = 145;
	        
	        int temp, rem, sum = 0;
	    
	        temp = num;
	    
	        while(num > 0)
	        {
	            rem = num % 10;
	    
	            sum=sum + fact (rem);
	    
	            num  = num /10;
	                    
	        }
	        if(temp == sum)
	        {
	            System.out.println(temp +" is a strong number");
	        }
	        else
	        {
	            System.out.println(temp +" is not a strong number");
	        }
	    }
	    public static int fact(int num)
	    {
	        int fact=1;
	    
	        for(int i = 1; i <= num; i++)
	        {
	            fact *= i;
	        }
	        return fact;
	    }
	        
	}
