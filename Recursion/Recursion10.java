import java.util.*;
class CountDigit{
        int count=0;
        int countDigit(int n){
                if(n==0){
                        return count;
			
		}
		count++;

               return countDigit(n/10);

        }
        public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
                 CountDigit obj=new  CountDigit();
                 System.out.println("Enter the number : ");
                 int n=sc.nextInt();
                 System.out.println(obj.countDigit(n));
        }
}
