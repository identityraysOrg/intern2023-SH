package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Exception1 extends  Exception{
//    public Exception1(String string) {
//		// TODO Auto-generated constructor stub
//    	super(string);
//	}

	
}
class Student{
	String nameString;
	int RollNo;
	Student(String nameString,int RollNo){
		this.nameString=nameString;
		this.RollNo=RollNo;
	}
	public void name() {
		System.out.println("student name is: "+nameString);
		System.out.println("student rollno is: "+RollNo);
	}
	
}
class Marks extends Student{
     int Marks1=0;
     int Marks2=0;
	Marks(String nameString, int RollNo,int Marks1,int Marks2) {
		super(nameString, RollNo);
		this.Marks1=Marks1;
		this.Marks2=Marks2;

	}
	public void display() {
		super.name();
		System.out.println("Marks in Subject1 : "+Marks1);
		System.out.println("Marks in Subject2 : "+Marks2);
	}
	
	 
}
interface Records{

	public void print();
	
}
class Marksheets extends Marks implements Records{
	int Marks3=0;
Marksheets(String nameString, int RollNo, int Marks1, int Marks2,int Marks3) {
		super(nameString, RollNo, Marks1, Marks2);
		// TODO Auto-generated constructor stub
		this.Marks3=Marks3;
	}
	@Override
	public void print() {
		if (Marks3==0) {
	
			System.out.println("marks in sports is "+Marks3);
		} else {
			Marks3=Marks3+9;
			System.out.println("marks in sports is "+Marks3);
		
		}
	}
	public void Mean() {
		float mean=0.0f;
		mean=(Marks1+Marks2+Marks3/2);
		System.out.println("mean of marks: "+mean);
	}
	@Override
	public void display() {
		
		super.display();
		print();
		Mean();
	}
	
	}
	
	


public class InheritanceJava {
public static void main(String[] args) throws Exception1  {
//	System.out.println("Hello");
	try {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter your name"); 
	String nameString=br.readLine();
	System.out.println("enter your RollNo");
	int RollNo=Integer.parseInt(br.readLine());
	System.out.println("enter marks obtain in subject1 ");
	int Marks1=Integer.parseInt(br.readLine());
	if (Marks1>100) {
		throw new Exception1();
	}
//	check(Marks1);
	System.out.println("enter marks obtain in subject2 ");	
	int Marks2=Integer.parseInt(br.readLine());
	if (Marks2>100) {
		throw new Exception1();
	}
//	check(Marks2);
	System.out.println("your parcipitated in sports press 1(yes) or 0(no)");
	int Marks3=Integer.parseInt(br.readLine());
	Marksheets marksheets=new Marksheets(nameString, RollNo, Marks1, Marks2,Marks3);
	marksheets.display();
	}  catch (NumberFormatException | IOException   e) {
	    System.out.println("Invalid Input please give valid input................");
	}catch (Exception1 e) {
		System.out.println("please enter marks between 0 to 100.............");
	}
}
//static void check(int Marks1) throws Exception1 {
//	try {
//		if (Marks1>100) {
//			throw new Exception1();
//		}	
//	} catch (Exception1 e) {
//		// TODO: handle exception
//		System.out.println("please enter marks between 0 to 100.............");
//		
//	}
//	
//}
}




