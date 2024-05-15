import java.util.*;
class SumOfDigit{
	int sum=0;
        int sumDigit(int n){
                if(n==0)
                        return sum;

		
               return (n%10)+sumDigit(n/10);

        }
        public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
                 SumOfDigit obj=new  SumOfDigit();
                 System.out.println("Enter the number : ");
                 int n=sc.nextInt();
                 System.out.println(obj.sumDigit(n));
        }
}
