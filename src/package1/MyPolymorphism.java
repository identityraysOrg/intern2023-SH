package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Customer{
	String nameString;
	String adressString;
	int age;
	double accNoString;
	public Customer(double accNoString,String nameString,String adreString,int age) {

		// TODO Auto-generated constructor stub
		this.accNoString=accNoString;
		this.nameString=nameString;
		this.adressString=adreString;
		this.age=age;
	}
	public void display() {
		System.out.println("your account no is "+accNoString);
	}
}

class Bank extends Customer {

	double desposit=0;
	double balance=0;
	double withdrawAmt=0;
	Bank(double accNoString,String nameString,String adressString,int age,double desposit,double balance,double withdrawAmt) {
		super(accNoString, nameString,adressString , age);
		this.desposit=desposit;
		this.balance=balance;
		this.withdrawAmt=withdrawAmt;
		
	}
	public void Desposit() {
		System.out.println("please enter amount you want to desposit");
		balance=balance+desposit;
		System.out.println("your balance is "+balance);
	}
	public void Balance() {
		System.out.println("your Balance is: "+balance);
		
	}
	public void withdraw(double amount) {
		if (balance>1000) {
		balance=balance-amount;
		System.out.println("your Current balance after withdraw is "+balance);
		}
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("your name is "+nameString);
		System.out.println("your age is "+age);
		System.out.println("your amount desposited is recently is "+desposit);
		System.out.println("your balance is "+balance);
	
		
		
	}
	
}

public class MyPolymorphism {
public static void main(String[] args) throws NumberFormatException, IOException {
	int opt  ;
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
//System.out.println("select option 0 for new user 1 for existing user");
opt=Integer.parseInt(bufferedReader.readLine());
//if (opt==0) {
//System.out.println("enter your account number");
//	
//    double accno=Double.parseDouble(bufferedReader.readLine());
//    
//    System.out.println("enter your name");
//    String nameString=bufferedReader.readLine();
//    System.out.println("enter your adress");
//    String adreString=bufferedReader.readLine();
//    System.out.println("enter your age");
//    int age=Integer.parseInt(bufferedReader.readLine());
//    System.out.println("enter your option");
//    System.out.println("1.Balance");
//    System.out.println("2.deposit");
//    System.out.println("3.Profile");
//    int option=Integer.parseInt(bufferedReader.readLine());
//    Bank bank=new Bank(accno, nameString, adreString, age, 0, 0, 0);
//}else if (opt==1) {
	try{
		System.out.println("enter your account number");
	
    double accno=Double.parseDouble(bufferedReader.readLine());
    
    System.out.println("enter your name");
    String nameString=bufferedReader.readLine();
    System.out.println("enter your adress");
    String adreString=bufferedReader.readLine();
    System.out.println("enter your age");
    int age=Integer.parseInt(bufferedReader.readLine());
    System.out.println("enter your option");
    System.out.println("2.deposit");
    System.out.println("3.Profile");
    int option=Integer.parseInt(bufferedReader.readLine());
    Bank bank=new Bank(accno, nameString, adreString, age, 0, 0, 0);
    switch (option) {	
	
	case 2:
		bank.Desposit();
		break;
	case 3:
		bank.display();
		break;
		
	
	
		
	}
	}catch (Exception e) {
		System.out.println(e);
	}
//}
	
	
	
}
}
