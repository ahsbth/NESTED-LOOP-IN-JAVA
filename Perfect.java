import java.io.*;
import java.util.*;
  class Perfect
  {
	  public static void main(String args[])
	  {
		int i,n,x,add,m;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter value n=");
		  n=sc.nextInt();
		  for(i=1;i<=n;i++)
		  {
			  
			  m=i;
			  add=0;
			  x=1;
			  while(x<=i/2)
			  {
				  
				  if(i%x==0)
				  {
					  add=add+x;
				  }
				  x++;
			  }
			  if(m==add)
			  {
				  System.out.println(""+m);
			  }
		  }
	  }
  }
		  
				  
				  