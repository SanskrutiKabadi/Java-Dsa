import java.util.*;
class Recursion1{
	void printNum(int n){
		if(n==0)
			return;

		printNum(n-1);
		System.out.println(n);
	
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		 Recursion1 obj=new  Recursion1();
		 System.out.println("Enter the number : ");
		int n=sc.nextInt();
		obj.printNum(n);
	
	
	}






}
