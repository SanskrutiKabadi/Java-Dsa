import java.util.*;
class Recursion7{
        int rec(int n){
                if(n==1)
                        return 1;


               return rec(--n)+3;

        }
        public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
                 Recursion7 obj=new  Recursion7();
                 System.out.println("Enter the number : ");
                 int n=sc.nextInt();
                 System.out.println(obj.rec(n));
        }
}
