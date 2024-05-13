import java.util.*;
class Factorial{
        int fact(int n){
                if(n==1)
                        return 1;


               return n*fact(--n);

        }
        public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
                 Factorial obj=new  Factorial();
                 System.out.println("Enter the number : ");
                 int n=sc.nextInt();
                 System.out.println(obj.fact(n));
        }
}
