import java.util.*;
public class a3
{
     public static void main(String []args)
     {	
    	 int num;
    	 int fact;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the number: "+fact); 
     }  
}