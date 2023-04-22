import java.io.*;
import java.util.*;
  class Armstrong
  {
	  public static void main(String args[]) throws IOException
	  {
		  int i,n,m,s,add;
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  System.out.println("Enter value of n=");
		  n=Integer.parseInt(br.readLine());
		  for(i=0;i<=n;i++)
		  {
			  m=i;
			  add=0;
			  while(m>0)
			  {
				  s=m%10;
				  add=add+(s*s*s);
				  m=m/10;
			  }
			  if(i==add)
			  {
				  System.out.println(""+i);
			  }
		  }
	  }
  }
				  