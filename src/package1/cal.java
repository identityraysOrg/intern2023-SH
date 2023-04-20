package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 class SecondClass1 {
	private int a;
	private int b;
public SecondClass1(int a,int b) {
this.a=a;
this.b=b;
}

	

	public void add(int a,int b) {
	System.out.println("addition of numbers: "+(a+b));
	}
	public void sub(int a,int b){
		System.out.println("subtraction of numbers: "+(a-b));
	}
	public void mul(double a,double b) {
		System.out.println("multiplication: "+(a*b));
	}
	public void Div(double a,double b){
		  if (b == 0) {// you should check j instead of i
		        throw new ArithmeticException("cannot Divide By 0");
		    }
		System.out.println("Division: "+(a/b));
	}
}

public class cal {

		  
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
	      try {
	    	  int num1;
		      int  num2;
		      int numberInteger;
		    
				BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		      System.out.print("Enter two numbers: ");
		      num1 = Integer.parseInt(bReader.readLine());
		      num2 =Integer.parseInt(bReader.readLine());
		  	System.out.println("enter your choice");
			System.out.println("1.addition");
			System.out.println("2.Subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.division");
			String name=bReader.readLine();
			  numberInteger=Integer.parseInt(name);
			  SecondClass1 secondClass=new SecondClass1(num1, num2);
		      switch(numberInteger) {
		         case 1: 
		        	 secondClass.add(num1, num2);
		            break;
		         case 2:
		 			secondClass.sub(num1, num2);
//		 			secondClass.add(secondClass.a,secondClass.b);
		 			
		 				
		 				break;
		 		case 3:
		 			secondClass.mul(num1, num2);
//		 			secondClass.add(secondClass.a,secondClass.b);
		 			
		 				
		 				break;
		 		case 4:
		 			secondClass.Div(num1, num2);
//		 			secondClass.add(secondClass.a,secondClass.b);
		 			
		 				
		 				break;
		 		case 5:
		 			System.out.println("exited................");
		 			System.exit(0);
		 			
		      default: System.out.printf("Error! Enter correct operator");
		         return;
		      }
		      System.out.print("The result is given as follows:	");
		     
			
		} catch (Exception e) {
		System.out.println("exception "+e);
		}
	   }
		}
