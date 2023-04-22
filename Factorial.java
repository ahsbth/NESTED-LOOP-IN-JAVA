import java.util.*;
import java.io.*;
 class Factorial
 {
	 public static void main(String args[]) throws IOException
	 {
		 int i,n,m;
		 long fact;
		 InputStreamReader isr=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(isr);
		 System.out.println("Enter the value of n=");
		 n=Integer.parseInt(br.readLine());
		 for(i=1;i<n;i++)
		 {
			 m=i;
			 fact=1;
			 while(m>0)
			 {
				 fact=fact*m;
				 m--;
			 }
			 System.out.println(""+fact);
		 }
	 }
 }
 