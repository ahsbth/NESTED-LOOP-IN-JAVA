import java.util.*;
import java.io.*;
 class Reverse
 {
	 public static void main(String srgs[])
	 {
		 int i,n,r,rev,m;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value of n=");
		 n=sc.nextInt();
		 for(i=1;i<=n;i++)
		 {
			 m=i;
			 rev=0;
			 while(m>0)
			 {
				 r=m%10;
				 rev=rev*10+r;
				 m=m/10;
			 }
			 System.out.println(""+rev);
		 }
	 }
 }