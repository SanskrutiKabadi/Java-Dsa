import java.util.*;
class Recursion5{
        int rec(int n){
                if(n==1)
                        return 1;


               return n+rec(--n);

        }
        public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
                 Recursion5 obj=new  Recursion5();
                 System.out.println("Enter the number : ");
                 int n=sc.nextInt();
                 System.out.println(obj.rec(n));
        }
}
