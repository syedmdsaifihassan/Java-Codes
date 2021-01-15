class primenumber
{
	public static void main(String[] a)
	{
		int i,n=7,check=0;
		int m=n/2;
		if(n==0||n==1)
		{
			System.out.println("this "+n+" number is not prime");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime");
					check=1;
					break;
				}
			}
			if(check==0)
					{System.out.println(n+" is prime number");}

		}

	}
}
/*public class primenumber{    
 public static void main(String args[]){    
  int i,m=0,flag=0;      
  int n=3;    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }  
}    
}   */