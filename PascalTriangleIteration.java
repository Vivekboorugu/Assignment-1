public class PascalTriangleIteration{
	public static void main(String []args)
	{
		int num=5;
		pt(num);
	}
	
	public static void pt(int num)
	{  
		for(int j=0;j<=num;j++)
	    {
			
           	for(int k=num-j;k>0;k--)
           		System.out.print(" ");    
			for(int i=0;i<=j;i++)
		    {
		    	int n=fact(j);
		    	int r=fact(i);
		    	int n_r=fact(j-i);
		    	
		    	int result =n/(n_r*r);
		   
		        System.out.print(result+" ");
		    }
			System.out.println();
	    }
	}
	
	public static int fact(int f)
	{
		int fact=1;
		for(int i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	
}
