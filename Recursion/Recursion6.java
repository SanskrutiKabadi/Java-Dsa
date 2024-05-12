
import java.util.*;
class Recursion6{
        int rec(int n){
                if(n==0)
                        return 1;


               return 5+rec(--n);

        }
        public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
                 Recursion6 obj=new  Recursion6();
                 System.out.println("Enter the number : ");
                 int n=sc.nextInt();
		 System.out.println(obj.rec(n));
	}
}

