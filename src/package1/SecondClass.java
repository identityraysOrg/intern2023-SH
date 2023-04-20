package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass  {
	private int a;
	private int b;
public SecondClass(int a,int b) {
this.a=a;
this.b=b;
}
//	public void Input() throws NumberFormatException, IOException {
//		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("enter first number");
//		int a=Integer.parseInt(bReader.readLine());
//		System.out.println("enter second number");
//		int b=Integer.parseInt(bReader.readLine());
//		
//	}
	

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
	class InvalidAgeException  extends Exception  
	{  
	    public InvalidAgeException (String str)  
	    {  
	        // calling the constructor of parent Exception  
	        super(str);  
	    }  
	}  
	
	
public static void main(String[] args)throws NumberFormatException, IOException{
	try {
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your choice");
		System.out.println("1.addition");
		System.out.println("2.Subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
//		System.out.println("5.exit");
		String name=bReader.readLine();
		 Integer numberInteger=Integer.parseInt(name);
		
			
	
//		 while (numberInteger <=5 && numberInteger!=0){
			 
			 System.out.println("enter first number");
				int a=Integer.parseInt(bReader.readLine());
				System.out.println("enter second number");
				int b=Integer.parseInt(bReader.readLine());
				 SecondClass secondClass=new SecondClass(a,b);
		switch (numberInteger) {
		case 1:
		secondClass.add(a, b);
//		secondClass.add(secondClass.a,secondClass.b);
		
			
			break;
		case 2:
			secondClass.sub(a, b);
//			secondClass.add(secondClass.a,secondClass.b);
			
				
				break;
		case 3:
			secondClass.mul(a, b);
//			secondClass.add(secondClass.a,secondClass.b);
			
				
				break;
		case 4:
			secondClass.Div(a, b);
//			secondClass.add(secondClass.a,secondClass.b);
			
				
				break;
	
		default :
			System.out.println("Invalid input");
			 return;
		
			
		}
//		 } 
		 System.out.println("Invalid Inpppput");
		
	
		
	}
	
	catch (Exception e) {
		System.out.println("Exception: "+e);
	}
}
}
