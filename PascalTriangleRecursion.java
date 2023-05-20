
  public class ps{

	public static void main(String []args)
	{
		int num=5;
		ptn(num,0,0);
	}
	
	public static int pt(int num,int i,int j)
	{      
			 if(i<=j)
			{ 
				
		        int n=fact(j);
		    	int r=fact(i);
		    	int n_r=fact(j-i);
		    	
		    	int result =n/(n_r*r);
		   
		        System.out.print(result+" ");
		        
		        return pt(num,i+1,j);
		    }
			 else
			{
			    return ptn(num,0,j+1);
			}
		
	}
	public static int ptn(int num,int i,int j)
	{      
		  System.out.println();
			 if(j<=num)
			{ 
			  for(int k=num-j;k>0;k--)
		          System.out.print(" ");  
			  return pt(num,0,j);
		    }
			return 0;
	}
	public static int fact(int f)
	{
		
		
		if(f==0)
			return 1;
		int result=fact(f-1)*f;
		return result;
	}
	
	
}
